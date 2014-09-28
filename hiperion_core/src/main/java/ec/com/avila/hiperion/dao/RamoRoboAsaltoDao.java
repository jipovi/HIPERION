/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;
import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoRoboAsalto;

/**
 * <b> Interface local de la tabla RamoRoboAsalto que permite realizar las operaciones necesarias </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoRoboAsaltoDao {

	/**
	 * 
	 * <b> Permite guardar los registros de la tabla RamoRoboAsalto </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoRoboAsalto
	 * @throws HiperionException
	 */
	public void guardarRamoRoboAsalto(RamoRoboAsalto ramoRoboAsalto) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener la lista de RamoRoboAsalto que se encuantran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoRoboAsalto> consultarRamoRoboAsalto() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros de la tabla RamoRoboAsalto </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoRoboAsalto
	 * @throws HiperionException
	 */
	public void modificarRamoRoboAsalto(RamoRoboAsalto ramoRoboAsalto) throws HiperionException;

	/**
	 * 
	 * <b>
	 * Permite guardar un archivo en la base de datos
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 04/08/2014]</p>
	 *
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file)throws HiperionException;
}
