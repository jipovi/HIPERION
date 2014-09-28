/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio;

import java.util.List;

import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoEquipoElectronico;

/**
 * <b> Servicio de interface local para realizar las operaciones sobre la tabla RamoEquipoElectronico</b>
 * 
 * @author Susana Diaz
 * @version 1.0,16/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoEquipoElectronicoService {
	/**
	 * 
	 * <b> Permite guardar los registros en la tabla RamoEquipoElectronico. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoEquipoElectronico
	 * @throws HiperionException
	 */

	public void guardarRamoEquipoElectronico(RamoEquipoElectronico ramoEquipoElectronico) throws HiperionException;

	/**
	 * 
	 * <b> Permite Obtener la lista de RamoEquipoElectronico que se encuentran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoEquipoElectronico> consultarRamoEquipoElectronico() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros en la tabla RamoEquipoElectronico. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoEquipoElectronico
	 * @throws HiperionException
	 */
	public void modificarRamoEquipoElectronico(RamoEquipoElectronico ramoEquipoElectronico) throws HiperionException;

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
