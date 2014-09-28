package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_add_casco database table.
 * 
 */
@Entity
@Table(name="cobert_add_casco")
public class CobertAddCasco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_ad_casco")
	private Integer idCobertAdCasco;

	@Column(name="cobertura_casco")
	private String coberturaCasco;

	//bi-directional many-to-one association to RamoCascoMaritimo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_casco")
	private RamoCascoMaritimo ramoCascoMaritimo;

	public CobertAddCasco() {
	}

	public Integer getIdCobertAdCasco() {
		return this.idCobertAdCasco;
	}

	public void setIdCobertAdCasco(Integer idCobertAdCasco) {
		this.idCobertAdCasco = idCobertAdCasco;
	}

	public String getCoberturaCasco() {
		return this.coberturaCasco;
	}

	public void setCoberturaCasco(String coberturaCasco) {
		this.coberturaCasco = coberturaCasco;
	}

	public RamoCascoMaritimo getRamoCascoMaritimo() {
		return this.ramoCascoMaritimo;
	}

	public void setRamoCascoMaritimo(RamoCascoMaritimo ramoCascoMaritimo) {
		this.ramoCascoMaritimo = ramoCascoMaritimo;
	}

}