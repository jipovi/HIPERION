/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoDao;
import ec.com.avila.hiperion.entities.Ramo;
import ec.com.avila.hiperion.servicio.RamoService;
import ec.com.avila.hiperion.servicio.RamoServiceRemote;

/**
 * <b> Servicio que implementa las operaciones en la tabla Ramo Buen Uso de Anticipo </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,Dec 21, 2013
 * @since JDK1.6
 */
@Stateless
public class RamoServiceImpl implements RamoService, RamoServiceRemote {

	@EJB
	private RamoDao ramoDao;

	public void guardarRamo(Ramo ramo) throws HiperionException {
		ramoDao.guardarRamo(ramo);
	}

	public List<Ramo> consultarRamo() throws HiperionException {
		return ramoDao.consultarRamo();
	}

	public Ramo consultarRamoPorCodigo(String codigoRamo) throws HiperionException {
		return ramoDao.consultarRamoPorCodigo(codigoRamo);
	}

	public void modificarRamo(Ramo ramo) throws HiperionException {
		ramoDao.modificarRamo(ramo);

	}
}
