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
import ec.com.avila.hiperion.dao.RamoBuenaCalMatDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoBuenaCalMat;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoBuenaCalMat </b>
 * 
 * @author Dario Vinueza
 * @version 1.0,21/12/2013
 * @since JDK1.6
 */
@Stateless
public class RamoBuenaCalMatDaoImpl implements RamoBuenaCalMatDao {

	Logger log = Logger.getLogger(RamoBuenaCalMatDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoBuenaCalMat(RamoBuenaCalMat ramoBuenaCalMat) throws HiperionException {
		try {

			em.persist(ramoBuenaCalMat);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoBuenaCalMat ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoBuenaCalMat> consultarRamoBuenaCalMat() throws HiperionException {

		try {

			return em.createNamedQuery("RamoBuenaCalMat.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoBuenaCalMat ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoBuenaCalMat(RamoBuenaCalMat ramoBuenaCalMat) throws HiperionException {

		try {

			em.merge(ramoBuenaCalMat);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoBuenaCalMat ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoBuenaCalMatDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("Error no se pudo guardar el archivo en el ramo buena calidad de materiales",e);
			throw new HiperionException(e);
		}

	}

}
