package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_dinero_val database table.
 * 
 */
@Entity
@Table(name="cobert_dinero_val")
public class CobertDineroVal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_dinero_valores")
	private Integer idCobertDineroValores;

	@Column(name="cobertura_dinero")
	private String coberturaDinero;

	//bi-directional many-to-one association to RamoDineroValore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_dinero")
	private RamoDineroValore ramoDineroValore;

	public CobertDineroVal() {
	}

	public Integer getIdCobertDineroValores() {
		return this.idCobertDineroValores;
	}

	public void setIdCobertDineroValores(Integer idCobertDineroValores) {
		this.idCobertDineroValores = idCobertDineroValores;
	}

	public String getCoberturaDinero() {
		return this.coberturaDinero;
	}

	public void setCoberturaDinero(String coberturaDinero) {
		this.coberturaDinero = coberturaDinero;
	}

	public RamoDineroValore getRamoDineroValore() {
		return this.ramoDineroValore;
	}

	public void setRamoDineroValore(RamoDineroValore ramoDineroValore) {
		this.ramoDineroValore = ramoDineroValore;
	}

}