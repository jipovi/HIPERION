package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_contrato database table.
 * 
 */
@Entity
@Table(name="cobert_contrato")
public class CobertContrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_contrato")
	private Integer idCobertContrato;

	@Column(name="cobertura_contrato")
	private String coberturaContrato;

	//bi-directional many-to-one association to RamoCumplimientoContrato
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_contrato")
	private RamoCumplimientoContrato ramoCumplimientoContrato;

	public CobertContrato() {
	}

	public Integer getIdCobertContrato() {
		return this.idCobertContrato;
	}

	public void setIdCobertContrato(Integer idCobertContrato) {
		this.idCobertContrato = idCobertContrato;
	}

	public String getCoberturaContrato() {
		return this.coberturaContrato;
	}

	public void setCoberturaContrato(String coberturaContrato) {
		this.coberturaContrato = coberturaContrato;
	}

	public RamoCumplimientoContrato getRamoCumplimientoContrato() {
		return this.ramoCumplimientoContrato;
	}

	public void setRamoCumplimientoContrato(RamoCumplimientoContrato ramoCumplimientoContrato) {
		this.ramoCumplimientoContrato = ramoCumplimientoContrato;
	}

}