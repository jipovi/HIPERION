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

import ec.com.avila.hiperion.dao.RamoCumplimientoContratoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoCumplimientoContrato;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoCumplimientoContrato </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoCumplimientoContratoDaoImpl implements RamoCumplimientoContratoDao {

	Logger log = Logger.getLogger(RamoCumplimientoContratoDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoCumplimientoContrato(RamoCumplimientoContrato ramoCumplimientoContrato) throws HiperionException {
		try {

			em.persist(ramoCumplimientoContrato);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoCumplimientoContrato ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoCumplimientoContrato> consultarRamoCumplimientoContrato() throws HiperionException {

		try {

			return em.createNamedQuery("RamoCumplimientoContrato.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoCumplimientoContrato ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoCumplimientoContrato(RamoCumplimientoContrato ramoCumplimientoContrato) throws HiperionException {

		try {

			em.merge(ramoCumplimientoContrato);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoCumplimientoContrato ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoCumplimientoContratoDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("Nose puede guardar el archivo en el Ramo Cumplimiento de Contrato");
			throw new HiperionException(e);
		}
		
	}

}
