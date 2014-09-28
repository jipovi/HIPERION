/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */

package ec.com.avila.hiperion.dao;

import java.util.List;
import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoResponsabilidadCivil;

/**
 * <b> Interfaz loca de la tabla RamoResponsabilidadCivil para realizar las operaciones necesarias </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,05/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoResponsabilidadCivilDao {
	/**
	 * 
	 * <b> Permite guardar registros en la tabla RamoResponsabilidadCivil </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 05/01/2014]
	 * </p>
	 * 
	 * @param ramoResponsabilidadCivil
	 * @throws HiperionException
	 */
	public void guardarRamoResponsabilidadCivil(RamoResponsabilidadCivil ramoResponsabilidadCivil) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener la lista de RamoResponsabilidadCivil que se encuentran en la base de datos </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 05/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoResponsabilidadCivil> consultarRamoResponsabilidadCivil() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros de la tabla RamoResponsabilidaCivil </b>
	 * <p>
	 * [Author: Franklin, Date: 05/01/2014]
	 * </p>
	 * 
	 * @param ramoResponsabilidadCivil
	 * @throws HiperionException
	 */
	public void modificarRamoResponsabilidadCivil(RamoResponsabilidadCivil ramoResponsabilidadCivil) throws HiperionException;

	/**
	 * 
	 * <b> Permite guardar archivos en la base de datos </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 03/08/2014]
	 * </p>
	 * 
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException;
}
