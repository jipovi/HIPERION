/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */

package ec.com.avila.hiperion.dao;

import java.util.List;

import javax.ejb.Local;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.entities.Ramo;

/**
 * <b> Interfaz local de la tabla RAMO para realizar las operaciones necesarias</b>
 * 
 * @author Franklin Pozo
 * @version 1.0,21/12/2013
 * @since JDK1.6
 */
@Local
public interface RamoDao {
	/**
	 * <b>Permite guardar los registros de la tabla Ramo</b>
	 * <p>
	 * [Author: Franklin Pozo, Date: Dec 21, 2013]
	 * </p>
	 * 
	 * @param ramo
	 * @throws HiperionException
	 */
	public void guardarRamo(Ramo ramo) throws HiperionException;

	/**
	 * <b> Permite obtener la lista de ramos que se encuantran en la base de datos. </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: Dec 20, 2013]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<Ramo> consultarRamo() throws HiperionException;

	/**
	 * 
	 * <b> Permite buscar los ramos por medio del codigo de ramo. </b>
	 * <p>
	 * [Author: Dario Vinueza, Date: 09/03/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public Ramo consultarRamoPorCodigo(String codigoRamo) throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los objetos de la tabla Ramo. </b>
	 * <p>
	 * [Author: Franklin, Date: 29/12/2013]
	 * </p>
	 * 
	 * @param ramo
	 * @throws HiperionException
	 */
	public void modificarRamo(Ramo ramo) throws HiperionException;
}
