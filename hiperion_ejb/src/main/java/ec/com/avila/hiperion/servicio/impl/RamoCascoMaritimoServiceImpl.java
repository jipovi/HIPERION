/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoCascoMaritimoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoCascoMaritimo;
import ec.com.avila.hiperion.servicio.RamoCascoMaritimoService;
import ec.com.avila.hiperion.servicio.RamoCascoMaritimoServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Susana Diaz
 * @version 1.0,17/01/2014
 * @since JDK1.6
 */
@Stateless
public class RamoCascoMaritimoServiceImpl implements RamoCascoMaritimoService, RamoCascoMaritimoServiceRemote {

	@EJB
	private RamoCascoMaritimoDao ramoCascoMaritimoDao;

	public void guardarRamoCascoMaritimo(RamoCascoMaritimo ramoCascoMaritimo) throws HiperionException {
		ramoCascoMaritimoDao.guardarRamoCascoMaritimo(ramoCascoMaritimo);
	}

	public List<RamoCascoMaritimo> consultarRamoCascoMaritimo() throws HiperionException {
		return ramoCascoMaritimoDao.consultarRamoCascoMaritimo();
	}

	public void modificarRamoCascoMaritimo(RamoCascoMaritimo ramoCascoMaritimo) throws HiperionException {

		ramoCascoMaritimoDao.modificarRamoCascoMaritimo(ramoCascoMaritimo);

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.servicio.RamoCascoMaritimoService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoCascoMaritimoDao.guardarArchivoPoliza(file);
		
	}

}
