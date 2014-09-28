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

import org.apache.log4j.Logger;

import ec.com.avila.emision.web.beans.RamoRoturaMaquinariaBean;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.RamoRoturaMaquinaria;
import ec.com.avila.hiperion.servicio.RamoRoturaMaquinariaService;
import ec.com.avila.hiperion.servicio.RamoService;
import ec.com.avila.hiperion.web.beans.RamoBean;
import ec.com.avila.hiperion.web.util.HiperionMensajes;
import ec.com.avila.hiperion.web.util.MessagesController;

/**
 * <b>Clase Baking que permite gestionar la informaci&oacute;n que se maneje en las p&acute;ginas web que utilicen el Ramo Rotura Maquinaria. </b>
 * 
 * @author Dario Vinueza
 * @version 1.0,17/02/2014
 * @since JDK1.6
 */
@ManagedBean
@ViewScoped
public class RoturaMaquinariaBacking implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{ramoBean}")
	private RamoBean ramoBean;
	@ManagedProperty(value="#{ramoRoturaMaquinariaBean}")
	private RamoRoturaMaquinariaBean ramoRoturaMaquinariaBean;
	
	Logger log = Logger.getLogger(RoturaMaquinariaBacking.class);

	@EJB
	private RamoService ramoService;
	@EJB 
	private RamoRoturaMaquinariaService ramoRoturaMaquinariaService;

	/**
	 * 
	 * <b>
	 * Permite guardar objetos en el Ramo Rotura de Maquinaria
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 09/09/2014]</p>
	 *
	 */
	public void guardarRamo()throws HiperionException {
		RamoRoturaMaquinaria ramoRoturaMaquinaria =new RamoRoturaMaquinaria();
		
		ramoRoturaMaquinaria.setTasaRotMaq(ramoRoturaMaquinariaBean.getTasa());
		ramoRoturaMaquinaria.setDeducSiniestroRotMaq(ramoRoturaMaquinariaBean.getPorcentajeValorSiniestro());
	
		try{
			ramoRoturaMaquinariaService.guardarRamoRoturaMaquinaria(ramoRoturaMaquinaria);
			MessagesController.addInfo(null, HiperionMensajes.getInstancia().getString("hiperion.mensaje.exito.roturaMaquinaria"));
		} catch(HiperionException e){
			log.error("Error al momento de guardar el Ramo Rotura de Maquinaria",e);
			MessagesController.addError(null, HiperionMensajes.getInstancia().getString("hiperion.mensaje.error.roturaMaquinaria"));
			throw new HiperionException(e);
		}
	}
	
	

	/**
	 * @return the ramoRoturaMaquinariaBean
	 */
	public RamoRoturaMaquinariaBean getRamoRoturaMaquinariaBean() {
		return ramoRoturaMaquinariaBean;
	}



	/**
	 * @param ramoRoturaMaquinariaBean the ramoRoturaMaquinariaBean to set
	 */
	public void setRamoRoturaMaquinariaBean(RamoRoturaMaquinariaBean ramoRoturaMaquinariaBean) {
		this.ramoRoturaMaquinariaBean = ramoRoturaMaquinariaBean;
	}



	public RamoBean getRamoBean() {
		return ramoBean;
	}

	public void setRamoBean(RamoBean ramoBean) {
		this.ramoBean = ramoBean;
	}
}