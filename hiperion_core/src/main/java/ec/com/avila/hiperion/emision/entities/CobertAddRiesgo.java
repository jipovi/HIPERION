package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_add_riesgos database table.
 * 
 */
@Entity
@Table(name="cobert_add_riesgos")
public class CobertAddRiesgo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_ad_riesgos")
	private Integer idCobertAdRiesgos;

	@Column(name="cobertura_add_riesgos")
	private String coberturaAddRiesgos;

	//bi-directional many-to-one association to RamoRiesgosEsp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_riesgo")
	private RamoRiesgosEsp ramoRiesgosEsp;

	public CobertAddRiesgo() {
	}

	public Integer getIdCobertAdRiesgos() {
		return this.idCobertAdRiesgos;
	}

	public void setIdCobertAdRiesgos(Integer idCobertAdRiesgos) {
		this.idCobertAdRiesgos = idCobertAdRiesgos;
	}

	public String getCoberturaAddRiesgos() {
		return this.coberturaAddRiesgos;
	}

	public void setCoberturaAddRiesgos(String coberturaAddRiesgos) {
		this.coberturaAddRiesgos = coberturaAddRiesgos;
	}

	public RamoRiesgosEsp getRamoRiesgosEsp() {
		return this.ramoRiesgosEsp;
	}

	public void setRamoRiesgosEsp(RamoRiesgosEsp ramoRiesgosEsp) {
		this.ramoRiesgosEsp = ramoRiesgosEsp;
	}

}