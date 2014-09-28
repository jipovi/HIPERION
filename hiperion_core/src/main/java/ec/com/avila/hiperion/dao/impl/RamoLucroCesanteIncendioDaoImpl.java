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

import ec.com.avila.hiperion.dao.RamoLucroCesanteIncendioDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoLucroCesanteIncendio;

/**
 * 
 * <b> Permite implementar las operaciones de la tabla RamoLucroCesanteIncendio </b>
 * 
 * @author Susana Diaz
 * @version 1.0,15/01/14
 * @since JDK1.6
 */
@Stateless
public class RamoLucroCesanteIncendioDaoImpl implements RamoLucroCesanteIncendioDao {

	Logger log = Logger.getLogger(RamoLucroCesanteIncendioDaoImpl.class);

	@PersistenceContext(unitName = "sgs_pu")
	protected EntityManager em;

	public void guardarRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) throws HiperionException {
		try {

			em.persist(ramoLucroCesanteIncendio);

		} catch (Exception e) {
			log.error("Error no se pudo guardar el ramoLucroCesanteIncendio ", e);
			throw new HiperionException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public List<RamoLucroCesanteIncendio> consultarRamoLucroCesanteIncendio() throws HiperionException {

		try {

			return em.createNamedQuery("RamoLucroCesanteIncendio.findAll").getResultList();

		} catch (Exception e) {
			log.error("Error no se pudo consultar el ramoLucroCesanteIncendio ", e);
			throw new HiperionException(e);
		}
	}

	public void modificarRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) throws HiperionException {

		try {

			em.merge(ramoLucroCesanteIncendio);

		} catch (Exception e) {
			log.error("Error no se pudo modicar el ramoLucroCesanteIncendio ", e);
			throw new HiperionException(e);
		}

	}

	/* (non-Javadoc)
	 * @see ec.com.avila.hiperion.dao.RamoLucroCesanteIncendioDao#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		try{
			em.persist(file);
		}catch(Exception e){
			log.error("No se puede guardar el archivo en el Ramo Lucro Cesante Incendio y lineas Aliadas",e);
			throw new HiperionException(e);
		}
		
	}

}
