package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cond_esp_riesgos database table.
 * 
 */
@Entity
@Table(name="cond_esp_riesgos")
public class CondEspRiesgo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cond_esp_riesgos")
	private Integer idCondEspRiesgos;

	@Column(name="condicion_esp_riesgos")
	private String condicionEspRiesgos;

	//bi-directional many-to-one association to RamoRiesgosEsp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_riesgo")
	private RamoRiesgosEsp ramoRiesgosEsp;

	public CondEspRiesgo() {
	}

	public Integer getIdCondEspRiesgos() {
		return this.idCondEspRiesgos;
	}

	public void setIdCondEspRiesgos(Integer idCondEspRiesgos) {
		this.idCondEspRiesgos = idCondEspRiesgos;
	}

	public String getCondicionEspRiesgos() {
		return this.condicionEspRiesgos;
	}

	public void setCondicionEspRiesgos(String condicionEspRiesgos) {
		this.condicionEspRiesgos = condicionEspRiesgos;
	}

	public RamoRiesgosEsp getRamoRiesgosEsp() {
		return this.ramoRiesgosEsp;
	}

	public void setRamoRiesgosEsp(RamoRiesgosEsp ramoRiesgosEsp) {
		this.ramoRiesgosEsp = ramoRiesgosEsp;
	}

}