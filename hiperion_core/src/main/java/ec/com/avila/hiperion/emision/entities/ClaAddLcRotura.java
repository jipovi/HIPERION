package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cla_add_lc_rotura database table.
 * 
 */
@Entity
@Table(name="cla_add_lc_rotura")
public class ClaAddLcRotura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_cesante")
	private Integer idClausulaAdCesante;

	@Column(name="clausula_add_lc_rotura")
	private String clausulaAddLcRotura;

	@Column(name="num_dias_cla_lc_rotura")
	private Integer numDiasClaLcRotura;

	//bi-directional many-to-one association to RamoCesanteRoturaMaq
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cesante")
	private RamoCesanteRoturaMaq ramoCesanteRoturaMaq;

	public ClaAddLcRotura() {
	}

	public Integer getIdClausulaAdCesante() {
		return this.idClausulaAdCesante;
	}

	public void setIdClausulaAdCesante(Integer idClausulaAdCesante) {
		this.idClausulaAdCesante = idClausulaAdCesante;
	}

	public String getClausulaAddLcRotura() {
		return this.clausulaAddLcRotura;
	}

	public void setClausulaAddLcRotura(String clausulaAddLcRotura) {
		this.clausulaAddLcRotura = clausulaAddLcRotura;
	}

	public Integer getNumDiasClaLcRotura() {
		return this.numDiasClaLcRotura;
	}

	public void setNumDiasClaLcRotura(Integer numDiasClaLcRotura) {
		this.numDiasClaLcRotura = numDiasClaLcRotura;
	}

	public RamoCesanteRoturaMaq getRamoCesanteRoturaMaq() {
		return this.ramoCesanteRoturaMaq;
	}

	public void setRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) {
		this.ramoCesanteRoturaMaq = ramoCesanteRoturaMaq;
	}

}