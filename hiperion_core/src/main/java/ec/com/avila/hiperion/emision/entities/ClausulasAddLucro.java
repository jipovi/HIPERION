package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_lucro database table.
 * 
 */
@Entity
@Table(name="clausulas_add_lucro")
public class ClausulasAddLucro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_lucro")
	private Integer idClausulaAdLucro;

	@Column(name="clausula_add_lc_incendio")
	private String clausulaAddLcIncendio;

	@Column(name="num_dias_lc_incendio")
	private Integer numDiasLcIncendio;

	//bi-directional many-to-one association to RamoLucroCesanteIncendio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_lucro")
	private RamoLucroCesanteIncendio ramoLucroCesanteIncendio;

	public ClausulasAddLucro() {
	}

	public Integer getIdClausulaAdLucro() {
		return this.idClausulaAdLucro;
	}

	public void setIdClausulaAdLucro(Integer idClausulaAdLucro) {
		this.idClausulaAdLucro = idClausulaAdLucro;
	}

	public String getClausulaAddLcIncendio() {
		return this.clausulaAddLcIncendio;
	}

	public void setClausulaAddLcIncendio(String clausulaAddLcIncendio) {
		this.clausulaAddLcIncendio = clausulaAddLcIncendio;
	}

	public Integer getNumDiasLcIncendio() {
		return this.numDiasLcIncendio;
	}

	public void setNumDiasLcIncendio(Integer numDiasLcIncendio) {
		this.numDiasLcIncendio = numDiasLcIncendio;
	}

	public RamoLucroCesanteIncendio getRamoLucroCesanteIncendio() {
		return this.ramoLucroCesanteIncendio;
	}

	public void setRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) {
		this.ramoLucroCesanteIncendio = ramoLucroCesanteIncendio;
	}

}