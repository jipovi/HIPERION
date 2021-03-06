/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoAsistenciaMedicaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoAsistenciaMedica;
import ec.com.avila.hiperion.servicio.RamoAstMedicaService;
import ec.com.avila.hiperion.servicio.RamoAstMedicaServiceRemote;

/**
 * <b> Servicio que implmenta las operaciones sobre la tabla RamoAstMedica </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,31/12/2013
 * @since JDK1.6
 */
public class RamoAstMedicaServiceImpl implements RamoAstMedicaService, RamoAstMedicaServiceRemote {

	@EJB
	protected RamoAsistenciaMedicaDao ramoAstMedicaDao;

	public void guardarRamoAsistenciaMedica(RamoAsistenciaMedica ramoAstMedica) throws HiperionException {
		ramoAstMedicaDao.guardarRamoAsistenciaMedica(ramoAstMedica);

	}

	public List<RamoAsistenciaMedica> consultarRamoAsistenciaMedica() throws HiperionException {
		return ramoAstMedicaDao.consultarRamoAsistenciaMedica();
	}

	public void modificarRamoAsistenciaMedica(RamoAsistenciaMedica ramoAstMedica) throws HiperionException {
		ramoAstMedicaDao.modificarRamoAsistenciaMedica(ramoAstMedica);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoAstMedicaService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoAstMedicaDao.guardarArchivoPoliza(file);
		
	}

}
