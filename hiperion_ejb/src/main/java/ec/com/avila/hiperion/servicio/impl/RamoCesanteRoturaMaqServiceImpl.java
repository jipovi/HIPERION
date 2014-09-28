/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoCesanteRoturaMaqDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoCesanteRoturaMaq;
import ec.com.avila.hiperion.servicio.RamoCesanteRoturaMaqService;
import ec.com.avila.hiperion.servicio.RamoCesanteRoturaMaqServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoCesanteRoturaMaqServiceImpl implements RamoCesanteRoturaMaqService, RamoCesanteRoturaMaqServiceRemote {

	@EJB
	private RamoCesanteRoturaMaqDao ramoCesanteRoturaMaqDao;

	public void guardarRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) throws HiperionException {
		ramoCesanteRoturaMaqDao.guardarRamoCesanteRoturaMaq(ramoCesanteRoturaMaq);
	}

	public List<RamoCesanteRoturaMaq> consultarRamoCesanteRoturaMaq() throws HiperionException {
		return ramoCesanteRoturaMaqDao.consultarRamoCesanteRoturaMaq();
	}

	public void modificarRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) throws HiperionException {

		ramoCesanteRoturaMaqDao.modificarRamoCesanteRoturaMaq(ramoCesanteRoturaMaq);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoCesanteRoturaMaqService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoCesanteRoturaMaqDao.guardarArchivoPoliza(file);
		
	}

}
