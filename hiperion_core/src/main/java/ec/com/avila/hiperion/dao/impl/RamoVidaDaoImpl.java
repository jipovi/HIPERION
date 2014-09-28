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

import ec.com.avila.hiperion.dao.RamoVidaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoVida;

/**
 * <b> Permite implementar las operaciones en la tabla RamoVida </b>
 * 
 * @author Franklin
 * @version 1.0,30/12/2013
 * @since JDK1.6
 */
@Stateless
public class RamoVidaDaoImpl implements RamoVidaDao {

	Logger log = Logger.getLogger(RamoVidaDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoVida(RamoVida ramoVida) throws HiperionException {
		try {

			em.persist(ramoVida);

		} catch (Exception e) {
			log.error("Error no se pudo guardar ramoVida ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoVida> consultarRamoVida() throws HiperionException {

		try {

			return em.createNamedQuery("RamoVida.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar RamoVida ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoVida(RamoVida ramoVida) throws HiperionException {

		try {

			em.merge(ramoVida);

		} catch (Exception e) {
			log.error("Error no se pudo modicar ramoVida ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoVidaDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("No se puede guardar el archivo en el Ramo Vida",e);
			throw new HiperionException(e);
		}
		
	}

}
