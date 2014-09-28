/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoTranspoteDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoTransporte;
import ec.com.avila.hiperion.servicio.RamoTransporteService;
import ec.com.avila.hiperion.servicio.RamoTransporteServiceRemote;

/**
 * <b> Servicio que implementa las operaciones en la tabla RamoTransporte </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,30/12/2013
 * @since JDK1.6
 */
@Stateless
public class RamoTransporteServiceImpl implements RamoTransporteService, RamoTransporteServiceRemote {

	@EJB
	private RamoTranspoteDao ramoTranspoteDao;

	public void guardarRamoTransporte(RamoTransporte transporte) throws HiperionException {
		ramoTranspoteDao.guardarRamoTransporte(transporte);

	}

	public List<RamoTransporte> consultarRamoTransporte() throws HiperionException {
		return ramoTranspoteDao.consultarRamoTransporte();
	}

	public void modificarRamoTransporte(RamoTransporte transporte) throws HiperionException {
		ramoTranspoteDao.modificarRamoTransporte(transporte);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoTransporteService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoTranspoteDao.guardarRamoArchivo(file);

	}

}
