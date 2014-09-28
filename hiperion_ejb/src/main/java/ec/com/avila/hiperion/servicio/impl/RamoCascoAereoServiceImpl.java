/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoCascoAereoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoCascoAereo;
import ec.com.avila.hiperion.servicio.RamoCascoAereoService;
import ec.com.avila.hiperion.servicio.RamoCascoAereoServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoCascoAereoServiceImpl implements RamoCascoAereoService, RamoCascoAereoServiceRemote {

	@EJB
	private RamoCascoAereoDao ramoCascoAereoDao;

	public void guardarRamoCascoAereo(RamoCascoAereo ramoCascoAereo) throws HiperionException {
		ramoCascoAereoDao.guardarRamoCascoAereo(ramoCascoAereo);
	}

	public List<RamoCascoAereo> consultarRamoCascoAereo() throws HiperionException {
		return ramoCascoAereoDao.consultarRamoCascoAereo();
	}

	public void modificarRamoCascoAereo(RamoCascoAereo ramoCascoAereo) throws HiperionException {

		ramoCascoAereoDao.modificarRamoCascoAereo(ramoCascoAereo);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoCascoAereoService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoCascoAereoDao.guardarArchivoPoliza(file);
		
	}

}
