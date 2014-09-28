package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_add_cesante database table.
 * 
 */
@Entity
@Table(name="cobert_add_cesante")
public class CobertAddCesante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_ad_cesante")
	private Integer idCobertAdCesante;

	@Column(name="cobertura_add_lc_rotura")
	private String coberturaAddLcRotura;

	//bi-directional many-to-one association to RamoCesanteRoturaMaq
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cesante")
	private RamoCesanteRoturaMaq ramoCesanteRoturaMaq;

	public CobertAddCesante() {
	}

	public Integer getIdCobertAdCesante() {
		return this.idCobertAdCesante;
	}

	public void setIdCobertAdCesante(Integer idCobertAdCesante) {
		this.idCobertAdCesante = idCobertAdCesante;
	}

	public String getCoberturaAddLcRotura() {
		return this.coberturaAddLcRotura;
	}

	public void setCoberturaAddLcRotura(String coberturaAddLcRotura) {
		this.coberturaAddLcRotura = coberturaAddLcRotura;
	}

	public RamoCesanteRoturaMaq getRamoCesanteRoturaMaq() {
		return this.ramoCesanteRoturaMaq;
	}

	public void setRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) {
		this.ramoCesanteRoturaMaq = ramoCesanteRoturaMaq;
	}

}