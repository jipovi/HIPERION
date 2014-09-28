package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_fidelidad database table.
 * 
 */
@Entity
@Table(name="clausulas_add_fidelidad")
public class ClausulasAddFidelidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_fidelidad")
	private Integer idClausulaAdFidelidad;

	@Column(name="clausula_fidelidad")
	private String clausulaFidelidad;

	@Column(name="numero_dias_fidelilad")
	private Integer numeroDiasFidelilad;

	//bi-directional many-to-one association to RamoFidelidad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_fidelidad")
	private RamoFidelidad ramoFidelidad;

	public ClausulasAddFidelidad() {
	}

	public Integer getIdClausulaAdFidelidad() {
		return this.idClausulaAdFidelidad;
	}

	public void setIdClausulaAdFidelidad(Integer idClausulaAdFidelidad) {
		this.idClausulaAdFidelidad = idClausulaAdFidelidad;
	}

	public String getClausulaFidelidad() {
		return this.clausulaFidelidad;
	}

	public void setClausulaFidelidad(String clausulaFidelidad) {
		this.clausulaFidelidad = clausulaFidelidad;
	}

	public Integer getNumeroDiasFidelilad() {
		return this.numeroDiasFidelilad;
	}

	public void setNumeroDiasFidelilad(Integer numeroDiasFidelilad) {
		this.numeroDiasFidelilad = numeroDiasFidelilad;
	}

	public RamoFidelidad getRamoFidelidad() {
		return this.ramoFidelidad;
	}

	public void setRamoFidelidad(RamoFidelidad ramoFidelidad) {
		this.ramoFidelidad = ramoFidelidad;
	}

}