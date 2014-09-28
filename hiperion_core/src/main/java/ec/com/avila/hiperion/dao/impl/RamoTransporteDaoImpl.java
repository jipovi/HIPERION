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

import ec.com.avila.hiperion.dao.RamoTranspoteDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoTransporte;

/**
 * <b> Permite implementar las operaciones en la tabla RamoVehiculos </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,30/12/2013
 * @since JDK1.6
 */
@Stateless
public class RamoTransporteDaoImpl implements RamoTranspoteDao {

	Logger log = Logger.getLogger(RamoTransporteDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoTransporte(RamoTransporte ramoTransporte) throws HiperionException {
		try {

			em.persist(ramoTransporte);

		} catch (Exception e) {
			log.error("Error no se pudo guardar ramoTransporte ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoTransporte> consultarRamoTransporte() throws HiperionException {

		try {

			return em.createNamedQuery("transporte.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar ramoTransporte ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoTransporte(RamoTransporte ramoTransporte) throws HiperionException {

		try {

			em.merge(ramoTransporte);

		} catch (Exception e) {
			log.error("Error no se pudo modicar ramoTransporte", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoTranspoteDao#guardarRamoArchivo(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarRamoArchivo(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("No se puede guardar el archivo en el Ramo Transporte",e);
			throw new HiperionException();
		}
		
	}

}
