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

import ec.com.avila.hiperion.dao.RamoEquipoMaquinariaDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoEquipoMaquinaria;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoEquipoMaquinaria </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoEquipoMaquinariaDaoImpl implements RamoEquipoMaquinariaDao {

	Logger log = Logger.getLogger(RamoEquipoMaquinariaDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) throws HiperionException {
		try {

			em.persist(ramoEquipoMaquinaria);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoEquipoMaquinaria ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoEquipoMaquinaria> consultarRamoEquipoMaquinaria() throws HiperionException {

		try {

			return em.createNamedQuery("RamoEquipoMaquinaria.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoEquipoMaquinaria ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) throws HiperionException {

		try {

			em.merge(ramoEquipoMaquinaria);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoEquipoMaquinaria ", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoEquipoMaquinariaDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try {
			em.persist(file);
		} catch (Exception e) {
			log.error("No se puede grabar el archivo en el Ramo Equipo y Maquinaria", e);
			throw new HiperionException(e);
		}

	}

}
