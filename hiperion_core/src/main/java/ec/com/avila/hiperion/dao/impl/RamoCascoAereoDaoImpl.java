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

import ec.com.avila.hiperion.dao.RamoCascoAereoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoCascoAereo;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoCascoAereo </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoCascoAereoDaoImpl implements RamoCascoAereoDao {

	Logger log = Logger.getLogger(RamoCascoAereoDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoCascoAereo(RamoCascoAereo ramoCascoAereo) throws HiperionException {
		try {

			em.persist(ramoCascoAereo);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoCascoAereo ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoCascoAereo> consultarRamoCascoAereo() throws HiperionException {

		try {

			return em.createNamedQuery("RamoCascoAereo.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoCascoAereo ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoCascoAereo(RamoCascoAereo ramoCascoAereo) throws HiperionException {

		try {

			em.merge(ramoCascoAereo);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoCascoAereo ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoCascoAereoDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("No se puedo grabar el archivo en el Ramo Casco Aereo",e);
			throw new HiperionException(e);
		}
		
	}

}
