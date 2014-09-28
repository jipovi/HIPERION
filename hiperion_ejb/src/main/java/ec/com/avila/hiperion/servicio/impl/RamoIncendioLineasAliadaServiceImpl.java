/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoIncendioLineasAliadaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoIncendioLineasAliada;
import ec.com.avila.hiperion.servicio.RamoIncendioLineasAliadaService;
import ec.com.avila.hiperion.servicio.RamoIncendioLineasAliadaServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Avila Sistemas
 * @version 1.0,10/08/2014
 * @since JDK1.6
 */
@Stateless
public class RamoIncendioLineasAliadaServiceImpl implements RamoIncendioLineasAliadaService, RamoIncendioLineasAliadaServiceRemote {

	@EJB
	private RamoIncendioLineasAliadaDao ramoIncendioLineasAliadaDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoIncendioLineasAliadaServiceRemote#guardarRamoIncendioLineasAliada(ec.com.avila.hiperion.emision.entities.RamoIncendioLineasAliada)
	 */
	@Override
	public void guardarRamoIncendioLineasAliada(RamoIncendioLineasAliada ramoIncendioLineasAliada) throws HiperionException {
		ramoIncendioLineasAliadaDao.guardarRamoIncendioLineasAliada(ramoIncendioLineasAliada);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoIncendioLineasAliadaService#consultarRamoIncendioLineasAliada()
	 */
	@Override
	public List<RamoIncendioLineasAliada> consultarRamoIncendioLineasAliada() throws HiperionException {
		return ramoIncendioLineasAliadaDao.consultarRamoIncendioLineasAliada();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoIncendioLineasAliadaService#modificarRamoIncendioLineasAliada(ec.com.avila.hiperion.emision.entities.RamoIncendioLineasAliada)
	 */
	@Override
	public void modificarRamoIncendioLineasAliada(RamoIncendioLineasAliada ramoIncendioLineasAliada) throws HiperionException {
		ramoIncendioLineasAliadaDao.modificarRamoIncendioLineasAliada(ramoIncendioLineasAliada);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoIncendioLineasAliadaService#guradarArchivoPoiza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guradarArchivoPoiza(ArchivoBase file) throws HiperionException {
		ramoIncendioLineasAliadaDao.guardarArchivoPoliza(file);

	}

}
