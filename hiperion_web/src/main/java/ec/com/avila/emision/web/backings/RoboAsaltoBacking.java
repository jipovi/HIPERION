/**
 * 
 */
package ec.com.avila.emision.web.backings;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;

import ec.com.avila.emision.web.beans.RamoRoboAsaltoBean;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.RamoRoboAsalto;
import ec.com.avila.hiperion.servicio.RamoRoboAsaltoService;
import ec.com.avila.hiperion.servicio.RamoService;
import ec.com.avila.hiperion.web.beans.RamoBean;
import ec.com.avila.hiperion.web.util.HiperionMensajes;
import ec.com.avila.hiperion.web.util.MessagesController;

/**
 * <b>Clase Baking que permite gestionar la informaci&oacute;n que se maneje en las p&acute;ginas web que utilicen el Ramo Robo y/o Asalto. </b>
 * 
 * @author Dario Vinueza
 * @version 1.0,17/02/2014
 * @since JDK1.6
 */
@ManagedBean
@ViewScoped
public class RoboAsaltoBacking implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{ramoBean}")
	private RamoBean ramoBean;
	@ManagedProperty(value ="#{ramoRoboAsaltoBean}")
	private RamoRoboAsaltoBean ramoRoboAsaltoBean;

	@EJB
	private RamoService ramoService;
	@EJB
	private RamoRoboAsaltoService ramoRoboAsaltoService;
	
	Logger log = Logger.getLogger(RoboAsaltoBacking.class);
	
	/**
	 * 
	 * <b>
	 * Permite guardar datos en el Ramo Robo y/o Asalto
	 * </b>
	 * <p>[Author: Franklin Pozo, Date: 08/09/2014]</p>
	 *
	 */
	public void guardarRamo() throws HiperionException{
		RamoRoboAsalto ramoRoboAsalto=new RamoRoboAsalto();
		
		//ramoRoboAsalto.setTasaRobo(ramoRoboAsaltoBean.getTasaRobo());
		//ramoRoboAsalto.setTasaHurto(ramoRoboAsaltoBean.getTasaHurto());

		
		try{
			ramoRoboAsaltoService.guardarRamoRoboAsalto(ramoRoboAsalto);
			MessagesController.addInfo(null, HiperionMensajes.getInstancia().getString("hiperion.mensaje.exito.roboAsalto"));
		}catch(HiperionException e){
			log.error("Error al momento de guardar el Ramo Robo y/o Asalto",e);
			MessagesController.addError(null, HiperionMensajes.getInstancia().getString("hiperion.mensaje.error.roboAsalto"));
			throw new HiperionException(e);
		}
	}

	
	/**
	 * @return the ramoRoboAsaltoBeans
	 */
	public RamoRoboAsaltoBean getRamoRoboAsaltoBean() {
		return ramoRoboAsaltoBean;
	}


	/**
	 * @param ramoRoboAsaltoBean the ramoRoboAsaltoBean to set
	 */
	public void setRamoRoboAsaltoBean(RamoRoboAsaltoBean ramoRoboAsaltoBean) {
		this.ramoRoboAsaltoBean = ramoRoboAsaltoBean;
	}


	public RamoBean getRamoBean() {
		return ramoBean;
	}

	public void setRamoBean(RamoBean ramoBean) {
		this.ramoBean = ramoBean;
	}
}