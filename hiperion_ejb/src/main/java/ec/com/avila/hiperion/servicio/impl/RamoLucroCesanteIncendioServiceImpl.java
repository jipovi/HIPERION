/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoLucroCesanteIncendioDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoLucroCesanteIncendio;
import ec.com.avila.hiperion.servicio.RamoLucroCesanteIncendioService;
import ec.com.avila.hiperion.servicio.RamoLucroCesanteIncendioServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoLucroCesanteIncendioServiceImpl implements RamoLucroCesanteIncendioService, RamoLucroCesanteIncendioServiceRemote {

	@EJB
	private RamoLucroCesanteIncendioDao ramoLucroCesanteIncendioDao;

	public void guardarRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) throws HiperionException {
		ramoLucroCesanteIncendioDao.guardarRamoLucroCesanteIncendio(ramoLucroCesanteIncendio);
	}

	public List<RamoLucroCesanteIncendio> consultarRamoLucroCesanteIncendio() throws HiperionException {
		return ramoLucroCesanteIncendioDao.consultarRamoLucroCesanteIncendio();
	}

	public void modificarRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) throws HiperionException {

		ramoLucroCesanteIncendioDao.modificarRamoLucroCesanteIncendio(ramoLucroCesanteIncendio);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoLucroCesanteIncendioService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
	ramoLucroCesanteIncendioDao.guardarArchivoPoliza(file);
		
	}

}
