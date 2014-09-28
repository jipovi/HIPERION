package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_cesante database table.
 * 
 */
@Entity
@Table(name="cobert_cesante")
public class CobertCesante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_cesante")
	private Integer idCobertCesante;

	@Column(name="cobertura_lc_rotura")
	private String coberturaLcRotura;

	//bi-directional many-to-one association to RamoCesanteRoturaMaq
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cesante")
	private RamoCesanteRoturaMaq ramoCesanteRoturaMaq;

	public CobertCesante() {
	}

	public Integer getIdCobertCesante() {
		return this.idCobertCesante;
	}

	public void setIdCobertCesante(Integer idCobertCesante) {
		this.idCobertCesante = idCobertCesante;
	}

	public String getCoberturaLcRotura() {
		return this.coberturaLcRotura;
	}

	public void setCoberturaLcRotura(String coberturaLcRotura) {
		this.coberturaLcRotura = coberturaLcRotura;
	}

	public RamoCesanteRoturaMaq getRamoCesanteRoturaMaq() {
		return this.ramoCesanteRoturaMaq;
	}

	public void setRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) {
		this.ramoCesanteRoturaMaq = ramoCesanteRoturaMaq;
	}

}