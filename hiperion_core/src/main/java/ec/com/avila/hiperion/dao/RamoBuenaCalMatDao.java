/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao;

import java.util.List;
import javax.ejb.Local;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoBuenaCalMat;

/**
 * <b> Interface local de la tabla RamoBuenaCalMat que permite realizar las operaciones necesarias </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/2014
 * @since JDK1.6
 */
@Local
public interface RamoBuenaCalMatDao {

	/**
	 * 
	 * <b> Permite guardar los registros de la tabla RamoBuenaCalMat </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoBuenaCalMat
	 * @throws HiperionException
	 */
	public void guardarRamoBuenaCalMat(RamoBuenaCalMat ramoBuenaCalMat) throws HiperionException;

	/**
	 * 
	 * <b> Permite obtener la lista de RamoBuenaCalMat que se encuantran en la base de datos </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoBuenaCalMat> consultarRamoBuenaCalMat() throws HiperionException;

	/**
	 * 
	 * <b> Permite modificar los registros de la tabla RamoBuenaCalMat </b>
	 * <p>
	 * [Author: Susana Diaz, Date: 15/01/2014]
	 * </p>
	 * 
	 * @param ramoBuenaCalMat
	 * @throws HiperionException
	 */
	public void modificarRamoBuenaCalMat(RamoBuenaCalMat ramoBuenaCalMat) throws HiperionException;
	
	/**
	 * 
	 * <b>
	 * Permite guardar un archivo en la base da datos.
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 02/08/2014]</p>
	 *
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file)throws HiperionException;

}
