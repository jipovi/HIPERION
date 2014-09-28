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

import ec.com.avila.hiperion.dao.RamoEquipoElectronicoDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoEquipoElectronico;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoEquipoElectronico </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoEquipoElectronicoDaoImpl implements RamoEquipoElectronicoDao {

	Logger log = Logger.getLogger(RamoEquipoElectronicoDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoEquipoElectronico(RamoEquipoElectronico ramoEquipoElectronico) throws HiperionException {
		try {

			em.persist(ramoEquipoElectronico);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoEquipoElectronico ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoEquipoElectronico> consultarRamoEquipoElectronico() throws HiperionException {

		try {

			return em.createNamedQuery("RamoEquipoElectronico.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoEquipoElectronico ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoEquipoElectronico(RamoEquipoElectronico ramoEquipoElectronico) throws HiperionException {

		try {

			em.merge(ramoEquipoElectronico);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoEquipoElectronico ", e);
			throw new HiperionException(e);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.dao.RamoEquipoElectronicoDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try {
			em.persist(file);
		} catch (Exception e) {
			log.error("No se puede guardar el archivo en el Ramo Equipo Electronico");
			throw new HiperionException(e);
		}

	}
}
