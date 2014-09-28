package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_materiales database table.
 * 
 */
@Entity
@Table(name="cobert_materiales")
public class CobertMateriale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_materiales")
	private Integer idCobertMateriales;

	@Column(name="cobertura_materiales")
	private String coberturaMateriales;

	//bi-directional many-to-one association to RamoBuenaCalMat
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_material")
	private RamoBuenaCalMat ramoBuenaCalMat;

	public CobertMateriale() {
	}

	public Integer getIdCobertMateriales() {
		return this.idCobertMateriales;
	}

	public void setIdCobertMateriales(Integer idCobertMateriales) {
		this.idCobertMateriales = idCobertMateriales;
	}

	public String getCoberturaMateriales() {
		return this.coberturaMateriales;
	}

	public void setCoberturaMateriales(String coberturaMateriales) {
		this.coberturaMateriales = coberturaMateriales;
	}

	public RamoBuenaCalMat getRamoBuenaCalMat() {
		return this.ramoBuenaCalMat;
	}

	public void setRamoBuenaCalMat(RamoBuenaCalMat ramoBuenaCalMat) {
		this.ramoBuenaCalMat = ramoBuenaCalMat;
	}

}