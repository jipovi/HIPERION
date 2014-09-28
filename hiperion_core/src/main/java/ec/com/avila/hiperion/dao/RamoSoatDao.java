/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;
import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoSoat;

/**
 * <b> Interface local de la tabla RamoSoat que permite realizar las operaciones necesarias </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoSoatDao {

	/**
	 * 
	 * <b> Permite guardar los registros de la tabla RamoSoat </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoSoat
	 * @throws HiperionException
	 */
	public void guardarRamoSoat(RamoSoat ramoSoat) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener la lista de RamoSoat que se encuantran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoSoat> consultarRamoSoat() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros de la tabla RamoSoat </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoSoat
	 * @throws HiperionException
	 */
	public void modificarRamoSoat(RamoSoat ramoSoat) throws HiperionException;
	
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
