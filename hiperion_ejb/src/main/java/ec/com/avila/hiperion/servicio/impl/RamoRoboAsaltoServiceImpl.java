/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoRoboAsaltoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoRoboAsalto;
import ec.com.avila.hiperion.servicio.RamoRoboAsaltoService;
import ec.com.avila.hiperion.servicio.RamoRoboAsaltoServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoRoboAsaltoServiceImpl implements RamoRoboAsaltoService, RamoRoboAsaltoServiceRemote {

	@EJB
	private RamoRoboAsaltoDao ramoRoboAsaltoDao;

	public void guardarRamoRoboAsalto(RamoRoboAsalto ramoRoboAsalto) throws HiperionException {
		ramoRoboAsaltoDao.guardarRamoRoboAsalto(ramoRoboAsalto);
	}

	public List<RamoRoboAsalto> consultarRamoRoboAsalto() throws HiperionException {
		return ramoRoboAsaltoDao.consultarRamoRoboAsalto();
	}

	public void modificarRamoRoboAsalto(RamoRoboAsalto ramoRoboAsalto) throws HiperionException {

		ramoRoboAsaltoDao.modificarRamoRoboAsalto(ramoRoboAsalto);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoRoboAsaltoService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoRoboAsaltoDao.guardarArchivoPoliza(file);
	}

}
