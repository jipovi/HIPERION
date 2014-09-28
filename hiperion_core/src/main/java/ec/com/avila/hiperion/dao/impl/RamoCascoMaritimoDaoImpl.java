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

import ec.com.avila.hiperion.dao.RamoCascoMaritimoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoCascoMaritimo;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoCascoMaritimo </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoCascoMaritimoDaoImpl implements RamoCascoMaritimoDao {

	Logger log = Logger.getLogger(RamoCascoMaritimoDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoCascoMaritimo(RamoCascoMaritimo ramoCascoMaritimo) throws HiperionException {
		try {

			em.persist(ramoCascoMaritimo);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoCascoMaritimo ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoCascoMaritimo> consultarRamoCascoMaritimo() throws HiperionException {

		try {

			return em.createNamedQuery("RamoCascoMaritimo.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoCascoMaritimo ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoCascoMaritimo(RamoCascoMaritimo ramoCascoMaritimo) throws HiperionException {

		try {

			em.merge(ramoCascoMaritimo);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoCascoMaritimo ", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoCascoMaritimoDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try {
			em.persist(file);
		} catch (Exception e) {
			log.error("No se puede grabar el archivo en el Ramo Casco Maritiom", e);
			throw new HiperionException(e);
		}

	}

}
