/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoSoatDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoSoat;
import ec.com.avila.hiperion.servicio.RamoSoatService;
import ec.com.avila.hiperion.servicio.RamoSoatServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoSoatServiceImpl implements RamoSoatService, RamoSoatServiceRemote {

	@EJB
	private RamoSoatDao ramoSoatDao;

	public void guardarRamoSoat(RamoSoat ramoSoat) throws HiperionException {
		ramoSoatDao.guardarRamoSoat(ramoSoat);
	}

	public List<RamoSoat> consultarRamoSoat() throws HiperionException {
		return ramoSoatDao.consultarRamoSoat();
	}

	public void modificarRamoSoat(RamoSoat ramoSoat) throws HiperionException {

		ramoSoatDao.modificarRamoSoat(ramoSoat);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoSoatService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoSoatDao.guardarArchivoPoliza(file);
		
	}

}
