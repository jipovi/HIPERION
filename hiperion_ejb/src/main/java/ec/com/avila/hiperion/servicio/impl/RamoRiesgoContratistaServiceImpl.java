/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoRiesgoContratistaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoRiesgoContratista;
import ec.com.avila.hiperion.servicio.RamoRiesgoContratistaService;
import ec.com.avila.hiperion.servicio.RamoRiesgoContratistaServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoRiesgoContratistaServiceImpl implements RamoRiesgoContratistaService, RamoRiesgoContratistaServiceRemote {

	@EJB
	private RamoRiesgoContratistaDao ramoRiesgoContratistaDao;

	public void guardarRamoRiesgoContratista(RamoRiesgoContratista ramoRiesgoContratista) throws HiperionException {
		ramoRiesgoContratistaDao.guardarRamoRiesgoContratista(ramoRiesgoContratista);
	}

	public List<RamoRiesgoContratista> consultarRamoRiesgoContratista() throws HiperionException {
		return ramoRiesgoContratistaDao.consultarRamoRiesgoContratista();
	}

	public void modificarRamoRiesgoContratista(RamoRiesgoContratista ramoRiesgoContratista) throws HiperionException {

		ramoRiesgoContratistaDao.modificarRamoRiesgoContratista(ramoRiesgoContratista);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoRiesgoContratistaService#guardarRamoArchivo(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarRamoArchivo(ArchivoBase file) throws HiperionException {
		ramoRiesgoContratistaDao.guardarArchivoPoliza(file);
		
	}

}
