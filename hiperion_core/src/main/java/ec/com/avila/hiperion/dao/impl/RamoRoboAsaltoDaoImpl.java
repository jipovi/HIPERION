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

import ec.com.avila.hiperion.dao.RamoRoboAsaltoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoRoboAsalto;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoRoboAsalto </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoRoboAsaltoDaoImpl implements RamoRoboAsaltoDao {

	Logger log = Logger.getLogger(RamoRoboAsaltoDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoRoboAsalto(RamoRoboAsalto ramoRoboAsalto) throws HiperionException {
		try {

			em.persist(ramoRoboAsalto);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoRoboAsalto ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoRoboAsalto> consultarRamoRoboAsalto() throws HiperionException {

		try {

			return em.createNamedQuery("RamoRoboAsalto.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoRoboAsalto ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoRoboAsalto(RamoRoboAsalto ramoRoboAsalto) throws HiperionException {

		try {

			em.merge(ramoRoboAsalto);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoRoboAsalto ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoRoboAsaltoDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("No se puede guardar el archivo del ramo Rabo y/o Asalto",e);
			throw new HiperionException(e);
		}
		
	}

}
