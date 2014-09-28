/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoVidaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoVida;
import ec.com.avila.hiperion.servicio.RamoVidaService;
import ec.com.avila.hiperion.servicio.RamoVidaServiceRemote;

/**
 * <b> Servicio que implementa las operaciones de la tabla RamoVida </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,30/12/2013
 * @since JDK1.6
 */
public class RamoVidaServiceImpl implements RamoVidaService, RamoVidaServiceRemote {

	@EJB
	private RamoVidaDao ramoVidaDao;

	public void guardarRamoVida(RamoVida vida) throws HiperionException {
		ramoVidaDao.guardarRamoVida(vida);

	}

	public List<RamoVida> consultarRamoVida() throws HiperionException {
		// TODO Auto-generated method stub
		return ramoVidaDao.consultarRamoVida();
	}

	public void modificarRamoVida(RamoVida vida) throws HiperionException {
		ramoVidaDao.modificarRamoVida(vida);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoVidaService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoVidaDao.guardarArchivoPoliza(file);
		
	}

}
