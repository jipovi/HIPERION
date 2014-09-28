/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio;

import java.util.List;
import javax.ejb.Local;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoBuenaCalMat;

/**
 * <b> Servicio de interface local para realizar las operaciones sobre la tabla RamoBuenaCalMat</b>
 * 
 * @author Susana Diaz
 * @version 1.0,16/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoBuenaCalMatService {
	/**
	 * 
	 * <b> Permite guardar los registros en la tabla RamoBuenaCalMat. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoBuenaCalMat
	 * @throws HiperionException
	 */

	public void guardarRamoBuenaCalMat(RamoBuenaCalMat ramoBuenaCalMat) throws HiperionException;

	/**
	 * 
	 * <b> Permite Obtener la lista de RamoBuenaCalMat que se encuentran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoBuenaCalMat> consultarRamoBuenaCalMat() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros en la tabla RamoBuenaCalMat. </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 16/01/2014]
	 * </p>
	 * 
	 * @param ramoBuenaCalMat
	 * @throws HiperionException
	 */
	public void modificarRamoBuenaCalMat(RamoBuenaCalMat ramoBuenaCalMat) throws HiperionException;
	
	/**
	 * 
	 * <b>
	 * Permite guardar archivos en la bas de datos.
	 * </b>
	 * <p>[Author: Frankin Pozo, Date: 02/08/2014]</p>
	 *
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file)throws HiperionException;

}
