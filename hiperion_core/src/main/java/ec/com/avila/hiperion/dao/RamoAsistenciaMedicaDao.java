/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;

import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoAsistenciaMedica;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Franklin
 * @version 1.0,30/12/2013
 * @since JDK1.6
 */
@Local
public interface RamoAsistenciaMedicaDao {

	/**
	 * 
	 * <b> Permite guardar registros en la tabla RamoAsistenciaMedica </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 31/12/2013]
	 * </p>
	 * 
	 * @param ramoAsistenciaMedica
	 * @throws HiperionException
	 */
	public void guardarRamoAsistenciaMedica(RamoAsistenciaMedica ramoAsistenciaMedica) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener la lista de RamoAsistenciaMedica de la base de datos </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 31/12/2013]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoAsistenciaMedica> consultarRamoAsistenciaMedica() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros de la tabla RamosAstMedica </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 31/12/2013]
	 * </p>
	 * 
	 * @param ramoAsistenciaMedica
	 * @throws HiperionException
	 */
	public void modificarRamoAsistenciaMedica(RamoAsistenciaMedica ramoAsistenciaMedica) throws HiperionException;
	
	/**
	 * 
	 * <b>
	 * Permite guardar un archivo en la base de datos
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 02/08/2014]</p>
	 *
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file)throws HiperionException;
}
