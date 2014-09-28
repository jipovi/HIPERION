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
import ec.com.avila.hiperion.dao.RamoBuenUsoAnticipoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoBuenUsoAnt;

/**
 * <b> Permite implementar las operaciones en la tabla RamoBuenUsoAnticipo </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,12/08/2014
 * @since JDK1.6
 */

@Stateless
public class RamoBuenUsoAnticipoDaoImpl implements RamoBuenUsoAnticipoDao {

	Logger log = Logger.getLogger(RamoBuenUsoAnticipoDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoBuenUsoAnticipoDao#guardarRamoBuenUsoAnticipo(ec.com.avila.hiperion.emision.entities.RamoBuenUsoAnt)
	 */
	@Override
	public void guardarRamoBuenUsoAnticipo(RamoBuenUsoAnt ramoBuenUsoAnt) throws HiperionException {
		try {
			em.persist(ramoBuenUsoAnt);
		} catch (Exception e) {
			log.error("Error no se pudo guardar el Ramo BuenUsoAnticipo", e);
			throw new HiperionException();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoBuenUsoAnticipoDao#consultarRamoBuenUsoAnticipo()
	 */
	@SuppressWarnings("unchecked")
	public List<RamoBuenUsoAnt> consultarRamoBuenUsoAnticipo() throws HiperionException {
		try {
			return em.createNamedQuery("RamoBuenUsoAnt.finAll").getResultList();
		} catch (Exception e) {
			log.error("No se pudo consultar el ramo BuenUsoAnt", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoBuenUsoAnticipoDao#modificarRamoBuenUsoAnticipo(ec.com.avila.hiperion.emision.entities.RamoBuenUsoAnt)
	 */
	public void modificarRamoBuenUsoAnticipo(RamoBuenUsoAnt ramoBuenUsoAnt) throws HiperionException {
		try {
			em.merge(ramoBuenUsoAnt);
		} catch (Exception e) {
			log.error("Error ni se pudo modificar el ramoBuenUsoAnt", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoBuenUsoAnticipoDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("Error no se pudo guardar el archivo en ramoBuenUsoAnt",e);
			throw new HiperionException(e);
		}

	}

}
