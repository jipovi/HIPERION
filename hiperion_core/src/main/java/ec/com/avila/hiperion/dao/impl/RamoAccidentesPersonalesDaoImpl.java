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
import ec.com.avila.hiperion.dao.RamoAccidentesPersonalesDao;
import ec.com.avila.hiperion.emision.entities.RamoAccidentesPersonale;

/**
 * <b> Permite implementar las operaciones de la tabla RamoAccidentesPersonales </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,31/12/2013
 * @since JDK1.6
 */

@Stateless
public class RamoAccidentesPersonalesDaoImpl implements RamoAccidentesPersonalesDao {

	Logger log = Logger.getLogger(RamoAccidentesPersonalesDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoAccidentePersonales(RamoAccidentesPersonale ramoAccidentesPersonales) throws HiperionException {
		try {

			em.persist(ramoAccidentesPersonales);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoAccidentesPersonales ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoAccidentesPersonale> consultarRamoAccidentesPersonales() throws HiperionException {

		try {

			return em.createNamedQuery("RamoAccidentesPersonale.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoAccidentesPersonales ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoAccidentesPersonales(RamoAccidentesPersonale ramoAccidentesPersonales) throws HiperionException {

		try {

			em.merge(ramoAccidentesPersonales);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoAccidentesPersonales ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoAccidentesPersonalesDao#guardaArchivoPoliza(ec.com.avila.hiperion.dao.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase file) throws HiperionException {
	try{
		em.persist(file);
		
	}catch(Exception e){
		log.error("Error no se puedo guardar el archivo ramo Accidentes personales",e);
		throw new HiperionException(e);
	}
		
	}

}
