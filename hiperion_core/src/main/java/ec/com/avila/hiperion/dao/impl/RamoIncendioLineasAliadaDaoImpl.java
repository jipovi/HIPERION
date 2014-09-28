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

import ec.com.avila.hiperion.dao.RamoIncendioLineasAliadaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoIncendioLineasAliada;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoIncendioLineasAliadas </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoIncendioLineasAliadaDaoImpl implements RamoIncendioLineasAliadaDao {

	Logger log = Logger.getLogger(RamoIncendioLineasAliadaDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoIncendioLineasAliada(RamoIncendioLineasAliada ramoIncendioLineasAliada) throws HiperionException {
		try {

			em.persist(ramoIncendioLineasAliada);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoIncendioLineasAliada ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoIncendioLineasAliada> consultarRamoIncendioLineasAliada() throws HiperionException {

		try {

			return em.createNamedQuery("RamoIncendioLineasAliada.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoIncendioLineasAliada ", e);
			throw new HiperionException(e);
		}
	}

	
	public void modificarRamoIncendioLineasAliada(RamoIncendioLineasAliada ramoIncendioLineasAliada) throws HiperionException {

		try {

			em.merge(ramoIncendioLineasAliada);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoIncendioLineasAliada ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoIncendioLineasAliadaDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("No se puede guardar el archivo en el Ramo Incendio y lineas aliadas",e);
			throw new HiperionException(e);
		}
		
	}
	
}
