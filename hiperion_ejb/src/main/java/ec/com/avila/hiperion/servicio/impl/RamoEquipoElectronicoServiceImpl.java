/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoEquipoElectronicoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoEquipoElectronico;
import ec.com.avila.hiperion.servicio.RamoEquipoElectronicoService;
import ec.com.avila.hiperion.servicio.RamoEquipoElectronicoServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoEquipoElectronicoServiceImpl implements RamoEquipoElectronicoService, RamoEquipoElectronicoServiceRemote {

	@EJB
	private RamoEquipoElectronicoDao ramoEquipoElectronicoDao;

	public void guardarRamoEquipoElectronico(RamoEquipoElectronico ramoEquipoElectronico) throws HiperionException {
		ramoEquipoElectronicoDao.guardarRamoEquipoElectronico(ramoEquipoElectronico);
	}

	public List<RamoEquipoElectronico> consultarRamoEquipoElectronico() throws HiperionException {
		return ramoEquipoElectronicoDao.consultarRamoEquipoElectronico();
	}

	public void modificarRamoEquipoElectronico(RamoEquipoElectronico ramoEquipoElectronico) throws HiperionException {

		ramoEquipoElectronicoDao.modificarRamoEquipoElectronico(ramoEquipoElectronico);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoEquipoElectronicoService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoEquipoElectronicoDao.guardarArchivoPoliza(file);

	}

}
