/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoEquipoMaquinariaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoEquipoMaquinaria;
import ec.com.avila.hiperion.servicio.RamoEquipoMaquinariaService;
import ec.com.avila.hiperion.servicio.RamoEquipoMaquinariaServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoEquipoMaquinariaServiceImpl implements RamoEquipoMaquinariaService, RamoEquipoMaquinariaServiceRemote {

	@EJB
	private RamoEquipoMaquinariaDao ramoEquipoMaquinariaDao;

	public void guardarRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) throws HiperionException {
		ramoEquipoMaquinariaDao.guardarRamoEquipoMaquinaria(ramoEquipoMaquinaria);
	}

	public List<RamoEquipoMaquinaria> consultarRamoEquipoMaquinaria() throws HiperionException {
		return ramoEquipoMaquinariaDao.consultarRamoEquipoMaquinaria();
	}

	public void modificarRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) throws HiperionException {

		ramoEquipoMaquinariaDao.modificarRamoEquipoMaquinaria(ramoEquipoMaquinaria);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoEquipoMaquinariaService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoEquipoMaquinariaDao.guardarArchivoPoliza(file);

	}

}
