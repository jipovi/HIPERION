/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.hiperion.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import ec.com.avila.hiperion.comun.HiperionException;

import ec.com.avila.hiperion.dao.RamoCesanteRoturaMaqDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoCesanteRoturaMaq;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoCesanteRoturaMaq </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoCesanteRoturaMaqDaoImpl implements RamoCesanteRoturaMaqDao {

	Logger log = Logger.getLogger(RamoCesanteRoturaMaqDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) throws HiperionException {
		try {

			em.persist(ramoCesanteRoturaMaq);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoCesanteRoturaMaq ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoCesanteRoturaMaq> consultarRamoCesanteRoturaMaq() throws HiperionException {

		try {

			return em.createNamedQuery("RamoCesanteRoturaMaq.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoCesanteRoturaMaq ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) throws HiperionException {

		try {

			em.merge(ramoCesanteRoturaMaq);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoCesanteRoturaMaq ", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoCesanteRoturaMaqDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try {
			em.persist(file);
		} catch (Exception e) {
			log.error("No se puede grabar el archivo en el Ramo Lucro Cesante rorura de maquinaria");
			throw new HiperionException(e);
		}

	}

}
