/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoRoturaMaquinariaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoRoturaMaquinaria;
import ec.com.avila.hiperion.servicio.RamoRoturaMaquinariaService;
import ec.com.avila.hiperion.servicio.RamoRoturaMaquinariaServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoRoturaMaquinariaServiceImpl implements RamoRoturaMaquinariaService, RamoRoturaMaquinariaServiceRemote {

	@EJB
	private RamoRoturaMaquinariaDao ramoRoturaMaquinariaDao;

	public void guardarRamoRoturaMaquinaria(RamoRoturaMaquinaria ramoRoturaMaquinaria) throws HiperionException {
		ramoRoturaMaquinariaDao.guardarRamoRoturaMaquinaria(ramoRoturaMaquinaria);
	}

	public List<RamoRoturaMaquinaria> consultarRamoRoturaMaquinaria() throws HiperionException {
		return ramoRoturaMaquinariaDao.consultarRamoRoturaMaquinaria();
	}

	public void modificarRamoRoturaMaquinaria(RamoRoturaMaquinaria ramoRoturaMaquinaria) throws HiperionException {

		ramoRoturaMaquinariaDao.modificarRamoRoturaMaquinaria(ramoRoturaMaquinaria);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoRoturaMaquinariaService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoRoturaMaquinariaDao.guardarArchivoPoliza(file);
		
	}

}
