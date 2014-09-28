/**
 * 
 */
package ec.com.avila.hiperion.servicio.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoAgropecuarioDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoAgropecuario;
import ec.com.avila.hiperion.servicio.RamoAgropecuarioService;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,Jul 15, 2014
 * @since JDK1.6
 */
@Stateless
public class RamoAgropecuarioServiceImpl implements RamoAgropecuarioService {

	@EJB
	private RamoAgropecuarioDao ramoAgropecuarioDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoAgropecuarioService#guardarAgropecuario(ec.com.avila.hiperion.emision.entities.RamoAgropecuario)
	 */
	@Override
	public Integer guardarAgropecuario(RamoAgropecuario ramoAgropecuario) throws HiperionException {

		return ramoAgropecuarioDao.guardarAgropecuario(ramoAgropecuario);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoAgropecuarioService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoAgropecuarioDao.guardarArchivoPoliza(file);

	}

}
