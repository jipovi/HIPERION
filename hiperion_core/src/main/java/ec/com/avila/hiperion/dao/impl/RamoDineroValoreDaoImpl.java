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

import ec.com.avila.hiperion.dao.RamoDineroValoreDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoDineroValore;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoDineroValore </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoDineroValoreDaoImpl implements RamoDineroValoreDao {

	Logger log = Logger.getLogger(RamoDineroValoreDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoDineroValore(RamoDineroValore ramoDineroValore) throws HiperionException {
		try {

			em.persist(ramoDineroValore);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoDineroValore ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoDineroValore> consultarRamoDineroValore() throws HiperionException {

		try {

			return em.createNamedQuery("RamoDineroValore.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoDineroValore ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoDineroValore(RamoDineroValore ramoDineroValore) throws HiperionException {

		try {

			em.merge(ramoDineroValore);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoDineroValore ", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoDineroValoreDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try {
			em.persist(file);
		} catch (Exception e) {
			log.error("No se puede grabar el archivo en el Ramo Dinero y Valores");
			throw new HiperionException();
		}

	}

}
