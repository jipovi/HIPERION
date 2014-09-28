package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the titular database table.
 * 
 */
@Entity
public class Titular implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_titular")
	private Integer idTitular;

	@Column(name="cedula_titular_asm")
	private String cedulaTitularAsm;

	@Column(name="edad_titular_asm")
	private Integer edadTitularAsm;

	@Column(name="nombre_titutar")
	private String nombreTitutar;

	@Column(name="prima_neta_titular_asm")
	private BigDecimal primaNetaTitularAsm;

	//bi-directional many-to-one association to RamoAsistenciaMedica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ast_medica")
	private RamoAsistenciaMedica ramoAsistenciaMedica;

	public Titular() {
	}

	public Integer getIdTitular() {
		return this.idTitular;
	}

	public void setIdTitular(Integer idTitular) {
		this.idTitular = idTitular;
	}

	public String getCedulaTitularAsm() {
		return this.cedulaTitularAsm;
	}

	public void setCedulaTitularAsm(String cedulaTitularAsm) {
		this.cedulaTitularAsm = cedulaTitularAsm;
	}

	public Integer getEdadTitularAsm() {
		return this.edadTitularAsm;
	}

	public void setEdadTitularAsm(Integer edadTitularAsm) {
		this.edadTitularAsm = edadTitularAsm;
	}

	public String getNombreTitutar() {
		return this.nombreTitutar;
	}

	public void setNombreTitutar(String nombreTitutar) {
		this.nombreTitutar = nombreTitutar;
	}

	public BigDecimal getPrimaNetaTitularAsm() {
		return this.primaNetaTitularAsm;
	}

	public void setPrimaNetaTitularAsm(BigDecimal primaNetaTitularAsm) {
		this.primaNetaTitularAsm = primaNetaTitularAsm;
	}

	public RamoAsistenciaMedica getRamoAsistenciaMedica() {
		return this.ramoAsistenciaMedica;
	}

	public void setRamoAsistenciaMedica(RamoAsistenciaMedica ramoAsistenciaMedica) {
		this.ramoAsistenciaMedica = ramoAsistenciaMedica;
	}

}