/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;

import javax.ejb.Local;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoIncendioLineasAliada;

/**
 * <b> Interface local de la tabla RamoIncendioLineasAliada que permite realizar las operaciones necesarias </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoIncendioLineasAliadaDao {

	/**
	 * 
	 * <b> Permite guardar los registros de la tabla RamoIncendioLineasAliada </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoIncendioLineasAliada
	 * @throws HiperionException
	 */
	public void guardarRamoIncendioLineasAliada(RamoIncendioLineasAliada ramoIncendioLineasAliada) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener la lista de RamoIncendioLineasAliada que se encuantran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoIncendioLineasAliada> consultarRamoIncendioLineasAliada() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros de la tabla RamoIncendioLineasAliada </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoIncendioLineasAliada
	 * @throws HiperionException
	 */
	public void modificarRamoIncendioLineasAliada(RamoIncendioLineasAliada ramoIncendioLineasAliada) throws HiperionException;

	/**
	 * 
	 * <b>
	 * Permite guardar un archivo en la base de datos
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 03/08/2014]</p>
	 *
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file)throws HiperionException;
}
