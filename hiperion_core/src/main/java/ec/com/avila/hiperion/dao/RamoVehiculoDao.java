/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;

import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoVehiculo;

/**
 * <b> Interfaz local de la tabla RamoVehiculos para realizar las operaciones necesarias </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,29/12/2013
 * @since JDK1.6
 */
@Local
public interface RamoVehiculoDao {
	/**
	 * 
	 * <b> Permite guardar los registros en la tabla RamoVehiculo </b>
	 * <p>
	 * [Author: Franklin, Date: 29/12/2013]
	 * </p>
	 * 
	 * @param vehiculo
	 * @throws HiperionException
	 */
	public void guardarRamoVehiculo(RamoVehiculo ramoVehiculo) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener la lista de RamoVehiculos que se encuentra en la base de datos </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 29/12/2013]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoVehiculo> consultarRamoVehiculo() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros de la tabla RamoVehiculo </b>
	 * <p>
	 * [Author: Franklin, Date: 29/12/2013]
	 * </p>
	 * 
	 * @param vehiculo
	 * @throws HiperionException
	 */
	public void modificarRamoVehiculo(RamoVehiculo ramoVehiculo) throws HiperionException;

	/**
	 * 
	 * <b> Permite guardar un archivo en la base de datos </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 04/08/2014]
	 * </p>
	 * 
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException;

}
