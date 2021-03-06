/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoVehiculoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoVehiculo;
import ec.com.avila.hiperion.servicio.RamoVehiculoService;
import ec.com.avila.hiperion.servicio.RamoVehiculoServiceRemote;

/**
 * <b> Servicio que implementa las operaciones de la tabla RamoVehiculo. </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,29/12/2013
 * @since JDK1.6
 */
@Stateless
public class RamoVehiculoServiceImpl implements RamoVehiculoService, RamoVehiculoServiceRemote {

	@EJB
	private RamoVehiculoDao ramoVehiculoDao;

	public void guardarRamoVehiculo(RamoVehiculo vehiculo) throws HiperionException {
		ramoVehiculoDao.guardarRamoVehiculo(vehiculo);

	}

	public List<RamoVehiculo> consultarRamoVehiculo() throws HiperionException {
		return ramoVehiculoDao.consultarRamoVehiculo();
	}

	public void modificarRamoVehiculo(RamoVehiculo vehiculo) throws HiperionException {
		ramoVehiculoDao.modificarRamoVehiculo(vehiculo);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoVehiculoService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoVehiculoDao.guardarArchivoPoliza(file);

	}

}
