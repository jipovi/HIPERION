package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_buen_uso_ant database table.
 * 
 */
@Entity
@Table(name="cobert_buen_uso_ant")
public class CobertBuenUsoAnt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_buen_uso_ant")
	private Integer idCobertBuenUsoAnt;

	@Column(name="cobertura_anticipo")
	private String coberturaAnticipo;

	//bi-directional many-to-one association to RamoBuenUsoAnt
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ind_buen_uso_ant")
	private RamoBuenUsoAnt ramoBuenUsoAnt;

	public CobertBuenUsoAnt() {
	}

	public Integer getIdCobertBuenUsoAnt() {
		return this.idCobertBuenUsoAnt;
	}

	public void setIdCobertBuenUsoAnt(Integer idCobertBuenUsoAnt) {
		this.idCobertBuenUsoAnt = idCobertBuenUsoAnt;
	}

	public String getCoberturaAnticipo() {
		return this.coberturaAnticipo;
	}

	public void setCoberturaAnticipo(String coberturaAnticipo) {
		this.coberturaAnticipo = coberturaAnticipo;
	}

	public RamoBuenUsoAnt getRamoBuenUsoAnt() {
		return this.ramoBuenUsoAnt;
	}

	public void setRamoBuenUsoAnt(RamoBuenUsoAnt ramoBuenUsoAnt) {
		this.ramoBuenUsoAnt = ramoBuenUsoAnt;
	}

}