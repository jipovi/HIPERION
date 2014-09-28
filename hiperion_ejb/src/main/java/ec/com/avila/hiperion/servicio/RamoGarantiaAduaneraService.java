/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio;

import java.util.List;

import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoGarantiaAduanera;

/**
 * <b> Servicio de interface local para realizar las operaciones sobre la tabla RamoGarantiaAduanera</b>
 * 
 * @author Susana Diaz
 * @version 1.0,16/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoGarantiaAduaneraService {
	/**
	 * 
	 * <b> Permite guardar los registros en la tabla RamoGarantiaAduanera. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoGarantiaAduanera
	 * @throws HiperionException
	 */

	public void guardarRamoGarantiaAduanera(RamoGarantiaAduanera ramoGarantiaAduanera) throws HiperionException;

	/**
	 * 
	 * <b> Permite Obtener la lista de RamoGarantiaAduanera que se encuentran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoGarantiaAduanera> consultarRamoGarantiaAduanera() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros en la tabla RamoGarantiaAduanera. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoGarantiaAduanera
	 * @throws HiperionException
	 */
	public void modificarRamoGarantiaAduanera(RamoGarantiaAduanera ramoGarantiaAduanera) throws HiperionException;

	/**
	 * 
	 * <b> Permite guardar un archivo en la base de datos </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 03/08/2014]
	 * </p>
	 * 
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException;

}
