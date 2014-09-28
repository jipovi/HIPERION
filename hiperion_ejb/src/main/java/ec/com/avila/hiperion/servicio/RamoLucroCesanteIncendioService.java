/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio;

import java.util.List;

import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoLucroCesanteIncendio;

/**
 * <b> Servicio de interface local para realizar las operaciones sobre la tabla RamoLucroCesanteIncendio</b>
 * 
 * @author Susana Diaz
 * @version 1.0,16/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoLucroCesanteIncendioService {
	/**
	 * 
	 * <b> Permite guardar los registros en la tabla RamoLucroCesanteIncendio. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoLucroCesanteIncendio
	 * @throws HiperionException
	 */

	public void guardarRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) throws HiperionException;

	/**
	 * 
	 * <b> Permite Obtener la lista de RamoLucroCesanteIncendio que se encuentran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoLucroCesanteIncendio> consultarRamoLucroCesanteIncendio() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros en la tabla RamoLucroCesanteIncendio. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoLucroCesanteIncendio
	 * @throws HiperionException
	 */
	public void modificarRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) throws HiperionException;

	/**
	 * 
	 * <b> Permite guardar un archivo en la base de datos </b>
	 * <p>
	 * [Author: Avila Sistemas, Date: 03/08/2014]
	 * </p>
	 * 
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException;

}
