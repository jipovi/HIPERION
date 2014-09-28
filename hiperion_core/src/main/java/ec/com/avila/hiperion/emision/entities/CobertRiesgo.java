package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_riesgos database table.
 * 
 */
@Entity
@Table(name="cobert_riesgos")
public class CobertRiesgo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_riesgos")
	private Integer idCobertRiesgos;

	@Column(name="cobertura_riesgos")
	private String coberturaRiesgos;

	//bi-directional many-to-one association to RamoRiesgosEsp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_riesgo")
	private RamoRiesgosEsp ramoRiesgosEsp;

	public CobertRiesgo() {
	}

	public Integer getIdCobertRiesgos() {
		return this.idCobertRiesgos;
	}

	public void setIdCobertRiesgos(Integer idCobertRiesgos) {
		this.idCobertRiesgos = idCobertRiesgos;
	}

	public String getCoberturaRiesgos() {
		return this.coberturaRiesgos;
	}

	public void setCoberturaRiesgos(String coberturaRiesgos) {
		this.coberturaRiesgos = coberturaRiesgos;
	}

	public RamoRiesgosEsp getRamoRiesgosEsp() {
		return this.ramoRiesgosEsp;
	}

	public void setRamoRiesgosEsp(RamoRiesgosEsp ramoRiesgosEsp) {
		this.ramoRiesgosEsp = ramoRiesgosEsp;
	}

}