package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_add_casco_aereo database table.
 * 
 */
@Entity
@Table(name="cobert_add_casco_aereo")
public class CobertAddCascoAereo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_ad_casco_aereo")
	private Integer idCobertAdCascoAereo;

	@Column(name="cobertura_aereo")
	private String coberturaAereo;

	//bi-directional many-to-one association to RamoCascoAereo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_casco_aereo")
	private RamoCascoAereo ramoCascoAereo;

	public CobertAddCascoAereo() {
	}

	public Integer getIdCobertAdCascoAereo() {
		return this.idCobertAdCascoAereo;
	}

	public void setIdCobertAdCascoAereo(Integer idCobertAdCascoAereo) {
		this.idCobertAdCascoAereo = idCobertAdCascoAereo;
	}

	public String getCoberturaAereo() {
		return this.coberturaAereo;
	}

	public void setCoberturaAereo(String coberturaAereo) {
		this.coberturaAereo = coberturaAereo;
	}

	public RamoCascoAereo getRamoCascoAereo() {
		return this.ramoCascoAereo;
	}

	public void setRamoCascoAereo(RamoCascoAereo ramoCascoAereo) {
		this.ramoCascoAereo = ramoCascoAereo;
	}

}