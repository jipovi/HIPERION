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
import ec.com.avila.hiperion.dao.RamoVehiculoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoVehiculo;

/**
 * <b> Permite implementar las operaciones en la tabla RamoVehiculo </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,29/12/2013
 * @since JDK1.6
 */
@Stateless
public class RamoVehiculoDaoImpl implements RamoVehiculoDao {

	Logger log = Logger.getLogger(RamoVehiculoDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoVehiculo(RamoVehiculo ramoVehiculo) throws HiperionException {
		try {

			em.persist(ramoVehiculo);

		} catch (Exception e) {
			log.error("Error no se pudo guardar ramoVehiculo ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoVehiculo> consultarRamoVehiculo() throws HiperionException {

		try {

			return em.createNamedQuery("RamoVehiculo.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar ramoVehiculo ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoVehiculo(RamoVehiculo ramoVehiculo) throws HiperionException {

		try {

			em.merge(ramoVehiculo);

		} catch (Exception e) {
			log.error("Error no se pudo modicar ramoVehiculo ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoVehiculoDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("No se puede guardar el archivo en el Ramo Vehiculo",e);
			throw new HiperionException(e);
		}
		
	}

}
