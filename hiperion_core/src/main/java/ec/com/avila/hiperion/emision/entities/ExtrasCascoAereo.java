package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the extras_casco_aereo database table.
 * 
 */
@Entity
@Table(name="extras_casco_aereo")
public class ExtrasCascoAereo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_extra_casco_aereo")
	private Integer idExtraCascoAereo;

	@Column(name="extra_casco_aereo")
	private String extraCascoAereo;

	@Column(name="valor_extra_aereo")
	private BigDecimal valorExtraAereo;

	//bi-directional many-to-one association to RamoCascoAereo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_casco_aereo")
	private RamoCascoAereo ramoCascoAereo;

	public ExtrasCascoAereo() {
	}

	public Integer getIdExtraCascoAereo() {
		return this.idExtraCascoAereo;
	}

	public void setIdExtraCascoAereo(Integer idExtraCascoAereo) {
		this.idExtraCascoAereo = idExtraCascoAereo;
	}

	public String getExtraCascoAereo() {
		return this.extraCascoAereo;
	}

	public void setExtraCascoAereo(String extraCascoAereo) {
		this.extraCascoAereo = extraCascoAereo;
	}

	public BigDecimal getValorExtraAereo() {
		return this.valorExtraAereo;
	}

	public void setValorExtraAereo(BigDecimal valorExtraAereo) {
		this.valorExtraAereo = valorExtraAereo;
	}

	public RamoCascoAereo getRamoCascoAereo() {
		return this.ramoCascoAereo;
	}

	public void setRamoCascoAereo(RamoCascoAereo ramoCascoAereo) {
		this.ramoCascoAereo = ramoCascoAereo;
	}

}