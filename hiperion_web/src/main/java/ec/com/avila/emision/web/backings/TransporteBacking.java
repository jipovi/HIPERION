/**
 * 
 */
package ec.com.avila.emision.web.backings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import org.apache.log4j.Logger;

import ec.com.avila.emision.web.beans.RamoTransporteBean;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.emision.entities.RamoTransporte;
import ec.com.avila.hiperion.entities.Catalogo;
import ec.com.avila.hiperion.entities.DetalleCatalogo;
import ec.com.avila.hiperion.servicio.CatalogoService;
import ec.com.avila.hiperion.servicio.RamoService;
import ec.com.avila.hiperion.servicio.RamoTransporteService;
import ec.com.avila.hiperion.web.beans.RamoBean;
import ec.com.avila.hiperion.web.util.HiperionMensajes;
import ec.com.avila.hiperion.web.util.MessagesController;

/**
 * <b>Clase Baking que permite gestionar la informaci&oacute;n que se maneje en las p&acute;ginas web que utilicen el Ramo Transporte. </b>
 * 
 * @author Dario Vinueza
 * @version 1.0,17/02/2014
 * @since JDK1.6
 */
@ManagedBean
@ViewScoped
public class TransporteBacking implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{ramoBean}")
	private RamoBean ramoBean;

	@ManagedProperty(value = "#{ramoTransporteBean}")
	private RamoTransporteBean ramoTransporteBean;

	private List<SelectItem> tipoTransporteItems;

	@EJB
	private RamoService ramoService;

	@EJB
	private CatalogoService catalogoService;

	@EJB
	private RamoTransporteService ramoTransporteService;

	Logger log = Logger.getLogger(TransporteBacking.class);

	public void guardarRamo() throws HiperionException {

		RamoTransporte ramoTransporte = new RamoTransporte();

		ramoTransporte.setTasaTransporte(ramoTransporteBean.getTasa());
		ramoTransporte.setCondImportantesTransporte(ramoTransporteBean.getCondImportantes());

		try {
			ramoTransporteService.guardarRamoTransporte(ramoTransporte);
			MessagesController.addInfoSession(null, HiperionMensajes.getInstancia().getString("hiperion.mensaje.exito.transporte"));
		} catch (HiperionException e) {
			log.error("Error al momento de guardar el Ramo Transporte", e);
			MessagesController.addError(null, HiperionMensajes.getInstancia().getString("hiperion.mensaje.error.transporte"));
			throw new HiperionException(e);
		}

	}

	/**
	 * @return the ramoTransporteBean
	 */
	public RamoTransporteBean getRamoTransporteBean() {
		return ramoTransporteBean;
	}

	/**
	 * @param ramoTransporteBean
	 *            the ramoTransporteBean to set
	 */
	public void setRamoTransporteBean(RamoTransporteBean ramoTransporteBean) {
		this.ramoTransporteBean = ramoTransporteBean;
	}

	public RamoBean getRamoBean() {
		return ramoBean;
	}

	public void setRamoBean(RamoBean ramoBean) {
		this.ramoBean = ramoBean;
	}

	/**
	 * @return the tipoTransporteItems
	 * @throws HiperionException
	 */
	public List<SelectItem> getTipoTransporteItems() throws HiperionException {

		this.tipoTransporteItems = new ArrayList<SelectItem>();
		Catalogo catalogo = catalogoService.consultarCatalogoById(HiperionMensajes.getInstancia().getInteger(
				"ec.gob.avila.hiperion.recursos.catalogoMedioTransporte"));
		List<DetalleCatalogo> tipos = catalogo.getDetalleCatalogos();

		for (DetalleCatalogo detalle : tipos) {
			SelectItem selectItem = new SelectItem(detalle.getCodDetalleCatalogo(), detalle.getDescDetCatalogo());
			tipoTransporteItems.add(selectItem);
		}

		return tipoTransporteItems;
	}

	/**
	 * @param tipoTransporteItems
	 *            the tipoTransporteItems to set
	 */
	public void setTipoTransporteItems(List<SelectItem> tipoTransporteItems) {
		this.tipoTransporteItems = tipoTransporteItems;
	}

}