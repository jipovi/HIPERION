/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoGarantiaAduaneraDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoGarantiaAduanera;
import ec.com.avila.hiperion.servicio.RamoGarantiaAduaneraService;
import ec.com.avila.hiperion.servicio.RamoGarantiaAduaneraServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoGarantiaAduaneraServiceImpl implements RamoGarantiaAduaneraService, RamoGarantiaAduaneraServiceRemote {

	@EJB
	private RamoGarantiaAduaneraDao ramoGarantiaAduaneraDao;

	public void guardarRamoGarantiaAduanera(RamoGarantiaAduanera ramoGarantiaAduanera) throws HiperionException {
		ramoGarantiaAduaneraDao.guardarRamoGarantiaAduanera(ramoGarantiaAduanera);
	}

	public List<RamoGarantiaAduanera> consultarRamoGarantiaAduanera() throws HiperionException {
		return ramoGarantiaAduaneraDao.consultarRamoGarantiaAduanera();
	}

	public void modificarRamoGarantiaAduanera(RamoGarantiaAduanera ramoGarantiaAduanera) throws HiperionException {

		ramoGarantiaAduaneraDao.modificarRamoGarantiaAduanera(ramoGarantiaAduanera);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoGarantiaAduaneraService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoGarantiaAduaneraDao.guardarArchivoPoliza(file);

	}

}
