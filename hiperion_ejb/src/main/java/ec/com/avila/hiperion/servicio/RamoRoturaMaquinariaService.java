/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio;

import java.util.List;

import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoRoturaMaquinaria;

/**
 * <b> Servicio de interface local para realizar las operaciones sobre la tabla RamoRoturaMaquinaria</b>
 * 
 * @author Susana Diaz
 * @version 1.0,16/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoRoturaMaquinariaService {
	/**
	 * 
	 * <b> Permite guardar los registros en la tabla RamoRoturaMaquinaria. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoRoturaMaquinaria
	 * @throws HiperionException
	 */

	public void guardarRamoRoturaMaquinaria(RamoRoturaMaquinaria ramoRoturaMaquinaria) throws HiperionException;

	/**
	 * 
	 * <b> Permite Obtener la lista de RamoRoturaMaquinaria que se encuentran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoRoturaMaquinaria> consultarRamoRoturaMaquinaria() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros en la tabla RamoRoturaMaquinaria. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoRoturaMaquinaria
	 * @throws HiperionException
	 */
	public void modificarRamoRoturaMaquinaria(RamoRoturaMaquinaria ramoRoturaMaquinaria) throws HiperionException;

	/**
	 * 
	 * <b>
	 * Permite guardar un archivo .
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 04/08/2014]</p>
	 *
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file)throws HiperionException;
}
