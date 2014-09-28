/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import ec.com.avila.hiperion.comun.HiperionException;

import ec.com.avila.hiperion.dao.RamoResponsabilidadCivilDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoResponsabilidadCivil;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoResponsabilidadCivil </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoResponsabilidadCivilDaoImpl implements RamoResponsabilidadCivilDao {

	Logger log = Logger.getLogger(RamoResponsabilidadCivilDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoResponsabilidadCivil(RamoResponsabilidadCivil ramoResponsabilidadCivil) throws HiperionException {
		try {

			em.persist(ramoResponsabilidadCivil);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoResponsabilidadCivil ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoResponsabilidadCivil> consultarRamoResponsabilidadCivil() throws HiperionException {

		try {

			return em.createNamedQuery("RamoResponsabilidadCivil.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoResponsabilidadCivil ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoResponsabilidadCivil(RamoResponsabilidadCivil ramoResponsabilidadCivil) throws HiperionException {

		try {

			em.merge(ramoResponsabilidadCivil);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoResponsabilidadCivil ", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoResponsabilidadCivilDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try {
			em.persist(file);
		} catch (Exception e) {
			log.error("No se puede guardar el archivo de Ramo Responsabilidad Civil", e);
			throw new HiperionException(e);
		}

	}
}
