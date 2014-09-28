/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */ 
package ec.com.avila.hiperion.dao;


import java.util.List;
import javax.ejb.Local;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoBuenUsoAnt;

/** 
 * <b>
 * Interfaz local de la tabla RamoBuenUsoAnticipo
 * </b>
 *  
 * @author Franklin Pozo
 * @version 1.0,12/08/2014
 * @since JDK1.6
 */
@Local
public interface RamoBuenUsoAnticipoDao {
	
	/**
	 * 
	 * <b>
	 * Permite guardar los registros en la tabla RamoBuenUsoAnticipo
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 12/08/2014]</p>
	 *
	 * @param ramoBuenUsoAnt
	 * @throws HiperionException
	 */
	public void guardarRamoBuenUsoAnticipo(RamoBuenUsoAnt ramoBuenUsoAnt)throws HiperionException;
	
	/**
	 * 
	 * <b>
	 * Permite obtener la lista de RamoBuenUsoAnticipo que se encuentra en la base de datos
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 12/08/2014]</p>
	 *
	 * @return
	 * @throws HiperionException
	 */
	public List<RamoBuenUsoAnt> consultarRamoBuenUsoAnticipo()throws HiperionException;
	
	/**
	 * 
	 * <b>
	 * Permite modificar los registros de la tabla RamoBuenUsoAnticipo
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 12/08/2014]</p>
	 *
	 * @param ramoBuenUsoAnt
	 * @throws HiperionException
	 */
	public void modificarRamoBuenUsoAnticipo(RamoBuenUsoAnt ramoBuenUsoAnt)throws HiperionException;
	
	/**
	 * 
	 * <b>
	 * Permite guardar un archivo en la base de datos
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 12/08/2014]</p>
	 *
	 * @param file
	 * @throws HiperionException
	 */
	public void guardarArchivoPoliza(ArchivoBase file)throws HiperionException;
}
