package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_aduanera database table.
 * 
 */
@Entity
@Table(name="cobert_aduanera")
public class CobertAduanera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_aduanera")
	private Integer idCobertAduanera;

	@Column(name="cobertura_aduanera")
	private String coberturaAduanera;

	//bi-directional many-to-one association to RamoGarantiaAduanera
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_aduanera")
	private RamoGarantiaAduanera ramoGarantiaAduanera;

	public CobertAduanera() {
	}

	public Integer getIdCobertAduanera() {
		return this.idCobertAduanera;
	}

	public void setIdCobertAduanera(Integer idCobertAduanera) {
		this.idCobertAduanera = idCobertAduanera;
	}

	public String getCoberturaAduanera() {
		return this.coberturaAduanera;
	}

	public void setCoberturaAduanera(String coberturaAduanera) {
		this.coberturaAduanera = coberturaAduanera;
	}

	public RamoGarantiaAduanera getRamoGarantiaAduanera() {
		return this.ramoGarantiaAduanera;
	}

	public void setRamoGarantiaAduanera(RamoGarantiaAduanera ramoGarantiaAduanera) {
		this.ramoGarantiaAduanera = ramoGarantiaAduanera;
	}

}