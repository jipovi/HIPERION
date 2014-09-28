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

import ec.com.avila.hiperion.dao.RamoAsistenciaMedicaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoAsistenciaMedica;

/**
 * <b> Permite implementar las operaciones en la tabla RamoMedica </b>
 * 
 * @author Franklin Pozo
 * @version 1.0,31/12/2013
 * @since JDK1.6
 */
@Stateless
public class RamoAsistenciaMedicaDaoImpl implements RamoAsistenciaMedicaDao {

	Logger log = Logger.getLogger(RamoAsistenciaMedicaDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoAsistenciaMedica(RamoAsistenciaMedica ramoAstMedica) throws HiperionException {
		try {

			em.persist(ramoAstMedica);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoAstMedica ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoAsistenciaMedica> consultarRamoAsistenciaMedica() throws HiperionException {

		try {

			// TODO Auto-generated method stub
			return em.createNamedQuery("RamoAstMedica.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoAstMedica ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoAsistenciaMedica(RamoAsistenciaMedica ramoAstMedica) throws HiperionException {

		try {

			em.merge(ramoAstMedica);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoAstMedica ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoAsistenciaMedicaDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("Error no se pudo guardar el archivo en el Ramo Asistencia Medica",e);
			throw new HiperionException(e);
		}
		
	}

}