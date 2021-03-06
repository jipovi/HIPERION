/*
\ * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.AseguradoraDao;
import ec.com.avila.hiperion.entities.Aseguradora;
import ec.com.avila.hiperion.entities.Persona;
import ec.com.avila.hiperion.entities.PersonaAseguradora;
import ec.com.avila.hiperion.entities.PersonaAseguradoraPK;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla Aseguradora </b>
 * 
 * @author Dario Vinueza
 * @version 1.0,21/12/2013
 * @since JDK1.6
 */
@Stateless
public class AseguradoraDaoImpl implements AseguradoraDao {

	Logger log = Logger.getLogger(AseguradoraDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarAseguradora(Aseguradora aseguradora, List<Persona> personas) throws HiperionException {
		try {

			em.persist(aseguradora);

			for (Persona persona : personas) {

				PersonaAseguradoraPK aseguradoraPK = new PersonaAseguradoraPK();
				aseguradoraPK.setIdAseguradora(aseguradora.getIdAseguradora());

				em.persist(persona);
				aseguradoraPK.setIdPersona(persona.getIdPersona());

				PersonaAseguradora personaAseguradora = new PersonaAseguradora();

				personaAseguradora.setId(aseguradoraPK);

				em.persist(personaAseguradora);
			}
		} catch (Exception e) {
			log.error("Error no se pudo guardar la aseguradora ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<Aseguradora> consultarAseguradoras() throws HiperionException {

		try {

			return em.createNamedQuery("Aseguradora.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar la aseguradora ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarAseguradora(Aseguradora aseguradora) throws HiperionException {

		try {

			em.merge(aseguradora);

		} catch (Exception e) {
			log.error("Error no se pudo modicar la aseguradora ", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.AseguradoraDao#consultarAseguradora(java.lang.String, java.lang.Integer)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Aseguradora> consultarAseguradora(String ruc, Integer aseguradora) throws HiperionException {
		Query query = null;

		try {
			if (!ruc.equals("") && aseguradora != 0) {
				query = em.createNamedQuery("Aseguradora.find");
				query.setParameter("ruc", ruc);
				query.setParameter("aseguradora", aseguradora);
			}
			if (!ruc.equals("") && aseguradora == 0) {
				query = em.createNamedQuery("Aseguradora.findByRuc");
				query.setParameter("ruc", ruc);
			}
			if (ruc.equals("") && aseguradora != 0) {
				query = em.createNamedQuery("Aseguradora.findByAseguradora");
				query.setParameter("aseguradora", aseguradora);
			}
			if (ruc.equals("") && aseguradora == 0) {
				query = em.createNamedQuery("Aseguradora.findAll");
			}

			List<Aseguradora> aseguradoras = query.getResultList();

			return aseguradoras;

		} catch (Exception e) {
			log.error("Error no se pudo consultar la aseguradora ", e);
			throw new HiperionException(e);
		}
	}

}
