/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;
import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoLucroCesanteIncendio;

/**
 * <b> Interface local de la tabla RamoLucroCesanteIncendio que permite realizar las operaciones necesarias </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoLucroCesanteIncendioDao {

	/**
	 * 
	 * <b> Permite guardar los registros de la tabla RamoLucroCesanteIncendio </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoLucroCesanteIncendio
	 * @throws HiperionException
	 */
	public void guardarRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener la lista de RamoLucroCesanteIncendio que se encuantran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoLucroCesanteIncendio> consultarRamoLucroCesanteIncendio() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros de la tabla RamoLucroCesanteIncendio </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoLucroCesanteIncendio
	 * @throws HiperionException
	 */
	public void modificarRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) throws HiperionException;
	
	/**
	 * 
	 * <b>
	 * Permite guardar archivos en la base de datos
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 03/08/2014]</p>
	 *
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file)throws HiperionException;
	
}
