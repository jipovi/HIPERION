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

import ec.com.avila.hiperion.dao.RamoGarantiaAduaneraDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoGarantiaAduanera;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoGarantiaAduanera </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoGarantiaAduaneraDaoImpl implements RamoGarantiaAduaneraDao {

	Logger log = Logger.getLogger(RamoGarantiaAduaneraDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoGarantiaAduanera(RamoGarantiaAduanera ramoGarantiaAduanera) throws HiperionException {
		try {

			em.persist(ramoGarantiaAduanera);

		} catch (Exception e) {
			log.error("Error no se pudo guardar ramoGarantiaAduanera ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoGarantiaAduanera> consultarRamoGarantiaAduanera() throws HiperionException {

		try {

			return em.createNamedQuery("RamoGarantiaAduanera.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar ramoGarantiaAduanera ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoGarantiaAduanera(RamoGarantiaAduanera ramoGarantiaAduanera) throws HiperionException {

		try {

			em.merge(ramoGarantiaAduanera);

		} catch (Exception e) {
			log.error("Error no se pudo modicar ramoGarantiaAduanera ", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoGarantiaAduaneraDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try {
			em.persist(file);
		} catch (Exception e) {
			log.error("No se puede guardar el archivo em el Ramo Garantia Aduanera", e);
			throw new HiperionException(e);
		}

	}

}
