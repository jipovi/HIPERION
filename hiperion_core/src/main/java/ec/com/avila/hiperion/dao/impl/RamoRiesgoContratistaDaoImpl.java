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

import ec.com.avila.hiperion.dao.RamoRiesgoContratistaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoRiesgoContratista;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoRiesgoContratista </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoRiesgoContratistaDaoImpl implements RamoRiesgoContratistaDao {

	Logger log = Logger.getLogger(RamoRiesgoContratistaDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoRiesgoContratista(RamoRiesgoContratista ramoRiesgoContratista) throws HiperionException {
		try {

			em.persist(ramoRiesgoContratista);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoRiesgoContratista ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoRiesgoContratista> consultarRamoRiesgoContratista() throws HiperionException {

		try {

			return em.createNamedQuery("RamoRiesgoContratista.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoRiesgoContratista ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoRiesgoContratista(RamoRiesgoContratista ramoRiesgoContratista) throws HiperionException {

		try {

			em.merge(ramoRiesgoContratista);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoRiesgoContratista ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoRiesgoContratistaDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("No se puede guardar el archivo en el Ramo Todo Riesgo Contratista",e);
			throw new HiperionException(e);
		}
		
	}

}
