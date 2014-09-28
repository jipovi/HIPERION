package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_incendio database table.
 * 
 */
@Entity
@Table(name="clausulas_add_incendio")
public class ClausulasAddIncendio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_incendio")
	private Integer idClausulaAdIncendio;

	@Column(name="clausula_add_incendio")
	private String clausulaAddIncendio;

	@Column(name="num_dias_incendio")
	private Integer numDiasIncendio;

	//bi-directional many-to-one association to RamoIncendioLineasAliada
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_incendio")
	private RamoIncendioLineasAliada ramoIncendioLineasAliada;

	public ClausulasAddIncendio() {
	}

	public Integer getIdClausulaAdIncendio() {
		return this.idClausulaAdIncendio;
	}

	public void setIdClausulaAdIncendio(Integer idClausulaAdIncendio) {
		this.idClausulaAdIncendio = idClausulaAdIncendio;
	}

	public String getClausulaAddIncendio() {
		return this.clausulaAddIncendio;
	}

	public void setClausulaAddIncendio(String clausulaAddIncendio) {
		this.clausulaAddIncendio = clausulaAddIncendio;
	}

	public Integer getNumDiasIncendio() {
		return this.numDiasIncendio;
	}

	public void setNumDiasIncendio(Integer numDiasIncendio) {
		this.numDiasIncendio = numDiasIncendio;
	}

	public RamoIncendioLineasAliada getRamoIncendioLineasAliada() {
		return this.ramoIncendioLineasAliada;
	}

	public void setRamoIncendioLineasAliada(RamoIncendioLineasAliada ramoIncendioLineasAliada) {
		this.ramoIncendioLineasAliada = ramoIncendioLineasAliada;
	}

}