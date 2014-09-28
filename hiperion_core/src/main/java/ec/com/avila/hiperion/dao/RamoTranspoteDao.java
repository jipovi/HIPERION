/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;

import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoTransporte;

/**
 * <b> Interfaz local de la tabla RamoTransporte para realizar las operaciones necesarias en la base de datos </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,30/12/2013
 * @since JDK1.6
 */
@Local
public interface RamoTranspoteDao {
	/**
	 * 
	 * <b> Permirte guardar los registros en la tabla RamoTransporte</b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 30/12/2013]
	 * </p>
	 * 
	 * @param transporte
	 * @throws HiperionException
	 */
	public void guardarRamoTransporte(RamoTransporte ramoTransporte) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener las listas de la tabla RamoTransporte de la base de datos </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 30/12/2013]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoTransporte> consultarRamoTransporte() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar registros de la tabla RamoTransporte. </b>
	 * <p>
	 * [Author: Franklin, Date: 30/12/2013]
	 * </p>
	 * 
	 * @param transporte
	 * @throws HiperionException
	 */
	public void modificarRamoTransporte(RamoTransporte ramoTransporte) throws HiperionException;

	/**
	 * 
	 * <b> Permite guardar archivos en la base de datos </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 04/08/2014]
	 * </p>
	 * 
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarRamoArchivo(ArchivoBase file) throws HiperionException;

}
