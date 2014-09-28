/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio;

import java.util.List;

import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoDineroValore;

/**
 * <b> Servicio de interface local para realizar las operaciones sobre la tabla RamoDineroValore</b>
 * 
 * @author Susana Diaz
 * @version 1.0,16/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoDineroValoreService {
	/**
	 * 
	 * <b> Permite guardar los registros en la tabla RamoDineroValore. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoDineroValore
	 * @throws HiperionException
	 */

	public void guardarRamoDineroValore(RamoDineroValore ramoDineroValore) throws HiperionException;

	/**
	 * 
	 * <b> Permite Obtener la lista de RamoDineroValore que se encuentran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoDineroValore> consultarRamoDineroValore() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros en la tabla RamoDineroValore. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoDineroValore
	 * @throws HiperionException
	 */
	public void modificarRamoDineroValore(RamoDineroValore ramoDineroValore) throws HiperionException;

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