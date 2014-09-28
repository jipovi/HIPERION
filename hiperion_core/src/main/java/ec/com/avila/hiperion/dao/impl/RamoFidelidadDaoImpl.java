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

import ec.com.avila.hiperion.dao.RamoFidelidadDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoFidelidad;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoFidelidad </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoFidelidadDaoImpl implements RamoFidelidadDao {

	Logger log = Logger.getLogger(RamoFidelidadDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoFidelidad(RamoFidelidad ramoFidelidad) throws HiperionException {
		try {

			em.persist(ramoFidelidad);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoFidelidad ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoFidelidad> consultarRamoFidelidad() throws HiperionException {

		try {

			return em.createNamedQuery("RamoFidelidad.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoFidelidad ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoFidelidad(RamoFidelidad ramoFidelidad) throws HiperionException {

		try {

			em.merge(ramoFidelidad);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoFidelidad ", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoFidelidadDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try {
			em.persist(file);
		} catch (Exception e) {
			log.error("No se puede guardar el archivo en el Ramo Fidelidad", e);
			throw new HiperionException(e);
		}

	}

}
