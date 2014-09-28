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

import ec.com.avila.hiperion.dao.RamoSoatDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoSoat;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoSoat </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoSoatDaoImpl implements RamoSoatDao {

	Logger log = Logger.getLogger(RamoSoatDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoSoat(RamoSoat ramoSoat) throws HiperionException {
		try {

			em.persist(ramoSoat);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoSoat ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoSoat> consultarRamoSoat() throws HiperionException {

		try {

			return em.createNamedQuery("RamoSoat.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoSoat ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoSoat(RamoSoat ramoSoat) throws HiperionException {

		try {

			em.merge(ramoSoat);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoSoat ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoSoatDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("No se puede guardar el archivo en Ramo Soat",e);
			throw new HiperionException(e);
		}
		
	}

}
