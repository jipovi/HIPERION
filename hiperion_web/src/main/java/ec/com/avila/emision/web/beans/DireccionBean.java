/*
 * Copyright 2014 JIPOVI Solutions - ECUADOR 
 * Todos los derechos reservados
 */
package ec.com.avila.emision.web.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ec.com.avila.hiperion.dto.CantonDto;
import ec.com.avila.hiperion.dto.DireccionDto;
import ec.com.avila.hiperion.dto.ParroquiaDto;
import ec.com.avila.hiperion.dto.ProvinciaDto;

/**
 * <b> Clase que permite . </b>
 * 
 * @author Dario Vinueza.
 * @version 1.0,16/06/2014
 * @since JDK1.6
 */
@ManagedBean(name = "direccionBean")
@ViewScoped
public class DireccionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private ProvinciaDto provinciaDto;
	private CantonDto cantonDto;
	private ParroquiaDto parroquiaDto;
	private String codTipoDireccion;
	private String tipoDireccion;
	private String callePrincipal;
	private String numeracion;
	private String calleSecundaria;
	private String referencia;
	// Contactos Telefonicos
	private String telefonoConvencional;
	private String telefonoMovil;

	private List<DireccionDto> direccionesRegistradas;

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

	public ParroquiaDto getParroquiaDto() {
		return parroquiaDto;
	}

	public void setParroquiaDto(ParroquiaDto parroquiaDto) {
		this.parroquiaDto = parroquiaDto;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	 * @return the telefonoConvencional
	 */
	public String getTelefonoConvencional() {
		return telefonoConvencional;
	}

	/**
	 * @param telefonoConvencional
	 *            the telefonoConvencional to set
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
	 * @param telefonoMovil
	 *            the telefonoMovil to set
	 */
	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	/**
	 * @return the direccionesRegistradas
	 */
	public List<DireccionDto> getDireccionesRegistradas() {
		return direccionesRegistradas;
	}

	/**
	 * @param direccionesRegistradas
	 *            the direccionesRegistradas to set
	 */
	public void setDireccionesRegistradas(List<DireccionDto> direccionesRegistradas) {
		this.direccionesRegistradas = direccionesRegistradas;
	}
}
