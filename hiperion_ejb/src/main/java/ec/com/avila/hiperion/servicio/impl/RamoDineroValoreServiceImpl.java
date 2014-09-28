/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoDineroValoreDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoDineroValore;
import ec.com.avila.hiperion.servicio.RamoDineroValoreService;
import ec.com.avila.hiperion.servicio.RamoDineroValoreServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoDineroValoreServiceImpl implements RamoDineroValoreService, RamoDineroValoreServiceRemote {

	@EJB
	private RamoDineroValoreDao ramoDineroValoreDao;

	public void guardarRamoDineroValore(RamoDineroValore ramoDineroValore) throws HiperionException {
		ramoDineroValoreDao.guardarRamoDineroValore(ramoDineroValore);
	}

	public List<RamoDineroValore> consultarRamoDineroValore() throws HiperionException {
		return ramoDineroValoreDao.consultarRamoDineroValore();
	}

	public void modificarRamoDineroValore(RamoDineroValore ramoDineroValore) throws HiperionException {

		ramoDineroValoreDao.modificarRamoDineroValore(ramoDineroValore);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoDineroValoreService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoDineroValoreDao.guardarArchivoPoliza(file);

	}

}
