/**
 * 
 */
package ec.com.avila.hiperion.dto;


/**
 * <b> Clase que sirve para transferir datos de la Direcci&on; entre las diferentes Capas. </b>
 * 
 * @author Dario Vinueza
 * @version 1.0,22/06/2014
 * @since JDK1.6
 */
public class DireccionDto {

	private ProvinciaDto provinciaDto;
	private CantonDto cantonDto;
	private ParroquiaDto parroquiaDto;
	private String codTipoDireccion;
	private String tipoDireccion;
	private String callePrincipal;
	private String numeracion;
	private String calleSecundaria;
	private String referencia;
	private String telefonoConvencional;
	private String telefonoMovil;

	/**
	 * @return the codTipoDireccion
	 */
	public String getCodTipoDireccion() {
		return codTipoDireccion;
	}

	/**
	 * @param codTipoDireccion
	 *            the codTipoDireccion to set
	 */
	public void setCodTipoDireccion(String codTipoDireccion) {
		this.codTipoDireccion = codTipoDireccion;
	}

	/**
	 * @return the tipoDireccion
	 */
	public String getTipoDireccion() {
		return tipoDireccion;
	}

	/**
	 * @param tipoDireccion
	 *            the tipoDireccion to set
	 */
	public void setTipoDireccion(String tipoDireccion) {
		this.tipoDireccion = tipoDireccion;
	}

	/**
	 * @return the callePrincipal
	 */
	public String getCallePrincipal() {
		return callePrincipal;
	}

	/**
	 * @param callePrincipal
	 *            the callePrincipal to set
	 */
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}

	/**
	 * @return the numeracion
	 */
	public String getNumeracion() {
		return numeracion;
	}

	/**
	 * @param numeracion
	 *            the numeracion to set
	 */
	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}

	/**
	 * @return the calleSecundaria
	 */
	public String getCalleSecundaria() {
		return calleSecundaria;
	}

	/**
	 * @param calleSecundaria
	 *            the calleSecundaria to set
	 */
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}

	/**
	 * @return the referencia
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * @param referencia
	 *            the referencia to set
	 */
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	/**
	 * @return the provinciaDto
	 */
	public ProvinciaDto getProvinciaDto() {
		return provinciaDto;
	}

	/**
	 * @param provinciaDto
	 *            the provinciaDto to set
	 */
	public void setProvinciaDto(ProvinciaDto provinciaDto) {
		this.provinciaDto = provinciaDto;
	}

	/**
	 * @return the cantonDto
	 */
	public CantonDto getCantonDto() {
		return cantonDto;
	}

	/**
	 * @param cantonDto
	 *            the cantonDto to set
	 */
	public void setCantonDto(CantonDto cantonDto) {
		this.cantonDto = cantonDto;
	}

	/**
	 * @return the parroquiaDto
	 */
	public ParroquiaDto getParroquiaDto() {
		return parroquiaDto;
	}

	/**
	 * @param parroquiaDto
	 *            the parroquiaDto to set
	 */
	public void setParroquiaDto(ParroquiaDto parroquiaDto) {
		this.parroquiaDto = parroquiaDto;
	}

	/**
	 * @return the telefonoConvencional
	 */
	public String getTelefonoConvencional() {
		return telefonoConvencional;
	}

	/**
	 * @param telefonoConvencional the telefonoConvencional to set
	 */
	public void setTelefonoConvencional(String telefonoConvencional) {
		this.telefonoConvencional = telefonoConvencional;
	}

	/**
	 * @return the telefonoMovil
	 */
	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	/**
	 * @param telefonoMovil the telefonoMovil to set
	 */
	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}
}
