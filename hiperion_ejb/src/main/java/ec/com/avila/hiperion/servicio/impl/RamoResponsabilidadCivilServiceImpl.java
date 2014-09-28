/**
 * 
 */
package ec.com.avila.hiperion.servicio.impl;

import java.util.List;

import javax.ejb.EJB;

import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dao.RamoResponsabilidadCivilDao;
import ec.com.avila.hiperion.emision.entities.ArchivoBase;
import ec.com.avila.hiperion.emision.entities.RamoResponsabilidadCivil;
import ec.com.avila.hiperion.servicio.RamoResponsabilidadCivilService;
import ec.com.avila.hiperion.servicio.RamoResponsabilidadCivilServiceRemote;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Avila Sistemas
 * @version 1.0,03/08/2014
 * @since JDK1.6
 */
public class RamoResponsabilidadCivilServiceImpl implements RamoResponsabilidadCivilService, RamoResponsabilidadCivilServiceRemote {

	@EJB
	private RamoResponsabilidadCivilDao ramoResponsabilidadCivilDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoResponsabilidadCivilService#guardarRamoResponsabilidadCivil(ec.com.avila.hiperion.emision.entities.RamoResponsabilidadCivil)
	 */
	@Override
	public void guardarRamoResponsabilidadCivil(RamoResponsabilidadCivil ramoResponsabilidadCivil) throws HiperionException {
		ramoResponsabilidadCivilDao.guardarRamoResponsabilidadCivil(ramoResponsabilidadCivil);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoResponsabilidadCivilService#consultarRamoResponsabilidadCivil()
	 */
	@Override
	public List<RamoResponsabilidadCivil> consultarRamoResponsabilidadCivil() throws HiperionException {
		return ramoResponsabilidadCivilDao.consultarRamoResponsabilidadCivil();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoResponsabilidadCivilService#modificarRamoResponsabilidadCivil(ec.com.avila.hiperion.emision.entities.RamoResponsabilidadCivil)
	 */
	@Override
	public void modificarRamoResponsabilidadCivil(RamoResponsabilidadCivil ramoResponsabilidadCivil) throws HiperionException {
		ramoResponsabilidadCivilDao.modificarRamoResponsabilidadCivil(ramoResponsabilidadCivil);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.com.avila.hiperion.servicio.RamoResponsabilidadCivilService#guardarArchivoPoliza(ec.com.avila.hiperion.emision.entities.ArchivoBase)
	 */
	@Override
	public void guardarArchivoPoliza(ArchivoBase file) throws HiperionException {
		ramoResponsabilidadCivilDao.guardarArchivoPoliza(file);

	}

}
