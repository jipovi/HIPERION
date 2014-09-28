/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio;

import java.util.List;

import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoCesanteRoturaMaq;

/**
 * <b> Servicio de interface local para realizar las operaciones sobre la tabla RamoCesanteRoturaMaq</b>
 * 
 * @author Susana Diaz
 * @version 1.0,16/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoCesanteRoturaMaqService {
	/**
	 * 
	 * <b> Permite guardar los registros en la tabla RamoCesanteRoturaMaq. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoCesanteRoturaMaq
	 * @throws HiperionException
	 */

	public void guardarRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) throws HiperionException;

	/**
	 * 
	 * <b> Permite Obtener la lista de RamoCesanteRoturaMaq que se encuentran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoCesanteRoturaMaq> consultarRamoCesanteRoturaMaq() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros en la tabla RamoCesanteRoturaMaq. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoCesanteRoturaMaq
	 * @throws HiperionException
	 */
	public void modificarRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) throws HiperionException;
	
	/**
	 * 
	 * <b>
	 * Permite guardar un archivo en la base de datos
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 03/08/2014]</p>
	 *
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file)throws HiperionException;

}
