/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;
import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoEquipoMaquinaria;

/**
 * <b> Interface local de la tabla RamoEquipoMaquinaria que permite realizar las operaciones necesarias </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoEquipoMaquinariaDao {

	/**
	 * 
	 * <b> Permite guardar los registros de la tabla RamoEquipoMaquinaria </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoEquipoMaquinaria
	 * @throws HiperionException
	 */
	public void guardarRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener la lista de RamoEquipoMaquinaria que se encuantran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoEquipoMaquinaria> consultarRamoEquipoMaquinaria() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros de la tabla RamoEquipoMaquinaria </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoEquipoMaquinaria
	 * @throws HiperionException
	 */
	public void modificarRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) throws HiperionException;

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
