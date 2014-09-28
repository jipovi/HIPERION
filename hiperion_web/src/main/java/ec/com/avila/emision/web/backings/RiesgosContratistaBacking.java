/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.emision.web.backings;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import ec.com.avila.hiperion.servicio.RamoService;
import ec.com.avila.hiperion.web.beans.RamoBean;

/**
 * <b> Clase Baking que permite gestionar la informaci&oacute;n que se maneje en las p&acute;ginas web que utilicen el Ramo Todo Riesgo Contratista.
 * </b>
 * 
 * @author Dario Vinueza
 * @version 1.0,20/02/2014
 * @since JDK1.6
 */
@ManagedBean
@ViewScoped
public class RiesgosContratistaBacking implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{ramoBean}")
	private RamoBean ramoBean;

	@EJB
	private RamoService ramoService;
	

	/**
	 * 
	 * <b>
	 * Prmite guardar informacion en el Ramo Riesgo contrataista
	 * </b>
	 * <p>[Author: Avila Sistemas, Date: 05/09/2014]</p>
	 *
	 */
	public void guardarRamo() {
		
	}

	public RamoBean getRamoBean() {
		return ramoBean;
	}

	public void setRamoBean(RamoBean ramoBean) {
		this.ramoBean = ramoBean;
	}
}
