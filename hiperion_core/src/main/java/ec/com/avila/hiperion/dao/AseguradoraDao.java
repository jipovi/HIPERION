/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;

import javax.ejb.Local;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.entities.Aseguradora;
import ec.com.avila.hiperion.entities.Persona;

/**
 * <b> Interfaz local de la tabla Aseguradora para realizar las operaciones necesarias</b>
 * 
 * @author Dario Vinueza
 * @version 1.0, 20/10/2013
 * @since JDK1.6
 */
@Local
public interface AseguradoraDao {

	/**
	 * 
	 * <b> permite guardar los registros en la tabla Aseguradora </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: Aug 11, 2014]
	 * </p>
	 * 
	 * @param aseguradora
	 * @param contactos
	 * @throws HiperionException
	 */
	public void guardarAseguradora(Aseguradora aseguradora, List<Persona> contactos) throws HiperionException;

	/**
	 * 
	 * <b> Permite buscar las asegurdoras por medio del nombre o ruc </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: Aug 23, 2014]
	 * </p>
	 * 
	 * @param ruc
	 * @param aseguradora
	 * @return
	 * @throws HiperionException
	 */
	public List<Aseguradora> consultarAseguradora(String ruc, Integer aseguradora) throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar un objeto de tipo aseguradora </b>
	 * <p>
	 * [Author: Franklin Pozo, Date: 29/12/2013]
	 * </p>
	 * 
	 * @param aseguradora
	 * @throws HiperionException
	 */
	public void modificarAseguradora(Aseguradora aseguradora) throws HiperionException;

}
