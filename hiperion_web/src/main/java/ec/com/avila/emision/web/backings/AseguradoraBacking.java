/**
 * 
 */
package ec.com.avila.emision.web.backings;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import ec.com.avila.emision.web.beans.AseguradoraBean;
import ec.com.avila.hiperion.comun.HiperionException;
import ec.com.avila.hiperion.dto.AseguradoraDTO;
import ec.com.avila.hiperion.dto.ContactoDTO;
import ec.com.avila.hiperion.entities.Aseguradora;
import ec.com.avila.hiperion.entities.Catalogo;
import ec.com.avila.hiperion.entities.DetalleCatalogo;
import ec.com.avila.hiperion.entities.Persona;
import ec.com.avila.hiperion.servicio.AseguradoraService;
import ec.com.avila.hiperion.servicio.CatalogoService;
import ec.com.avila.hiperion.servicio.DetalleCatalogoService;
import ec.com.avila.hiperion.web.util.HiperionMensajes;
import ec.com.avila.hiperion.web.util.MessagesController;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author kruger
 * @version 1.0,Dec 21, 2013
 * @since JDK1.6
 */
@ManagedBean
@ViewScoped
public class AseguradoraBacking implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{aseguradoraBean}")
	private AseguradoraBean aseguradoraBean;

	@EJB
	private AseguradoraService aseguradoraService;

	@EJB
	private CatalogoService catalogoService;

	@EJB
	private DetalleCatalogoService detalleCatalogoService;

	private List<SelectItem> aseguradorasItems;

	@PostConstruct
	public void inicializar() throws HiperionException {
		// consultarAseguradoras();
	}

	/**
	 * 
	 * <b> Permite guardar una aseguradora en la base de datos </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: Aug 10, 2014]
	 * </p>
	 * 
	 * @throws HiperionException
	 */
	public void guardarAseguradora() throws HiperionException {

		Aseguradora aseguradora = new Aseguradora();

		aseguradora.setIdAseguradora(aseguradoraBean.getIdAseguradora());
		aseguradora.setDirecion(aseguradoraBean.getDireccion());
		aseguradora.setEmailAseguradora(aseguradoraBean.getEmail());
		aseguradora.setRuc(aseguradoraBean.getRuc());
		aseguradora.setTelfConvencionalAseg((aseguradoraBean.getTelefono()));

		List<Persona> contactos = new ArrayList<>();
		for (ContactoDTO contacto : aseguradoraBean.getContactoList()) {
			Persona persona = new Persona();
			persona.setNombrePersona(contacto.getNombre());
			persona.setApellidoPaterno(contacto.getApellidoPaterno());
			persona.setApellidoMaterno(contacto.getApellidoMaterno());
			persona.setIdentificacionPersona(contacto.getIdentificacion());
			// persona.setTelefonoConvencional(telefonoConvencional)(contacto.getTelefonoContacto());
			// persona.setCargo(contacto.getCargo());
			contactos.add(persona);
		}
		aseguradoraService.guardarAseguradora(aseguradora, contactos);

	}

	/**
	 * 
	 * <b> Permite consultar las aseguradoras ingresadas en la base de datos </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: Aug 17, 2014]
	 * </p>
	 * 
	 * @throws HiperionException
	 */
	public void consultarAseguradoras() throws HiperionException {

		List<Aseguradora> aseguradoras = aseguradoraService.consultarAseguradora(aseguradoraBean.getRuc(), aseguradoraBean.getIdAseguradora());

		List<AseguradoraDTO> aseguradorasDTOList = new ArrayList<>();

		if (!aseguradoras.isEmpty()) {

			for (Aseguradora aseguradora : aseguradoras) {

				aseguradoraBean.setActivarTabla(true);

				AseguradoraDTO aseguradoraDTO = new AseguradoraDTO();

				DetalleCatalogo detalleCatalogo = detalleCatalogoService.consultarDetalleByCatalogoAndDetalle(HiperionMensajes.getInstancia()
						.getInteger("ec.gob.avila.hiperion.recursos.catalogoAseguradoras"), aseguradora.getIdAseguradora());

				aseguradoraDTO.setNombreAseguradora(detalleCatalogo.getDescDetCatalogo());
				aseguradoraDTO.setRuc(aseguradora.getRuc());
				aseguradoraDTO.setTelefono(aseguradora.getTelfConvencionalAseg());

				aseguradorasDTOList.add(aseguradoraDTO);
			}

			aseguradoraBean.setAseguradorasList(aseguradorasDTOList);
		} else {
			MessagesController.addInfo(null, HiperionMensajes.getInstancia().getString("hiperion.mensaje.war.aseguradora"));
			aseguradorasDTOList = new ArrayList<>();
			aseguradoraBean.setActivarTabla(true);
		}
	}

	/**
	 * 
	 * <b> Permite activar la pantalla para crear una nueva aseguradora </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: Aug 18, 2014]
	 * </p>
	 * 
	 */
	public void crearAseguradora() {
		aseguradoraBean.setActivarNewAseguradora(true);
	}

	/**
	 * @return the aseguradoraBean
	 */
	public AseguradoraBean getAseguradoraBean() {
		return aseguradoraBean;
	}

	/**
	 * @param aseguradoraBean
	 *            the aseguradoraBean to set
	 */
	public void setAseguradoraBean(AseguradoraBean aseguradoraBean) {
		this.aseguradoraBean = aseguradoraBean;
	}

	/**
	 * @return the aseguradorasItems
	 * @throws HiperionException
	 */
	public List<SelectItem> getAseguradorasItems() throws HiperionException {

		this.aseguradorasItems = new ArrayList<SelectItem>();

		Catalogo catalogo = catalogoService.consultarCatalogoById(HiperionMensajes.getInstancia().getInteger(
				"ec.gob.avila.hiperion.recursos.catalogoAseguradoras"));

		List<DetalleCatalogo> aseguradoras = catalogo.getDetalleCatalogos();

		for (DetalleCatalogo detalle : aseguradoras) {
			SelectItem selectItem = new SelectItem(detalle.getCodDetalleCatalogo(), detalle.getDescDetCatalogo());
			aseguradorasItems.add(selectItem);
		}

		return aseguradorasItems;
	}

	/**
	 * @param aseguradorasItems
	 *            the aseguradorasItems to set
	 */
	public void setAseguradorasItems(List<SelectItem> aseguradorasItems) {
		this.aseguradorasItems = aseguradorasItems;
	}

}
