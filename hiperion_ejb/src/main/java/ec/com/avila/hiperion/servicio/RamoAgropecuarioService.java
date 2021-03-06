/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio;

import javax.ejb.Local;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoAsistenciaMedicaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoAgropecuario;

/**
 * <b> Servicio de Interfaz local que realiza las operaciones sobre la tabla RamoAccidentesPersonales </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,31/12/2013
 * @since JDK1.6
 */
@Local
public interface RamoAgropecuarioService {
	
	/**
	 * 
	 * <b> Permite guardar informacion en la tabla RamoAgropecuario </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: Jul 15, 2014]
	 * </p>
	 * 
	 * @param ramoAgropecuario
	 * @throws HiperionException
	 */
	public Integer guardarAgropecuario(RamoAgropecuario ramoAgropecuario) throws HiperionException;
	
	/**
	 * 
	 * <b> Permite guardar un archivo en la base de datos </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: Jul 19, 2014]
	 * </p>
	 * 
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException;

}
