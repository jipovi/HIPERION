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

import ec.com.avila.hiperion.dao.RamoRoturaMaquinariaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoRoturaMaquinaria;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoRoturaMaquinaria </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoRoturaMaquinariaDaoImpl implements RamoRoturaMaquinariaDao {

	Logger log = Logger.getLogger(RamoRoturaMaquinariaDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoRoturaMaquinaria(RamoRoturaMaquinaria ramoRoturaMaquinaria) throws HiperionException {
		try {

			em.persist(ramoRoturaMaquinaria);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoRoturaMaquinaria ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoRoturaMaquinaria> consultarRamoRoturaMaquinaria() throws HiperionException {

		try {

			return em.createNamedQuery("RamoRoturaMaquinaria.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoRoturaMaquinaria ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoRoturaMaquinaria(RamoRoturaMaquinaria ramoRoturaMaquinaria) throws HiperionException {

		try {

			em.merge(ramoRoturaMaquinaria);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoRoturaMaquinaria ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoRoturaMaquinariaDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch (Exception e){
			log.error("No se puede guardar el archivo en el Ramo Rotura de maquinaria",e);
			throw new HiperionException(e);
		}
		
	}

}
