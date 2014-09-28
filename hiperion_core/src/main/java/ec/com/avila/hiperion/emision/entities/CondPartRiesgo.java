package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cond_part_riesgos database table.
 * 
 */
@Entity
@Table(name="cond_part_riesgos")
public class CondPartRiesgo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cond_part_riesgos")
	private Integer idCondPartRiesgos;

	@Column(name="condicion_part_riesgos")
	private String condicionPartRiesgos;

	//bi-directional many-to-one association to RamoRiesgosEsp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_riesgo")
	private RamoRiesgosEsp ramoRiesgosEsp;

	public CondPartRiesgo() {
	}

	public Integer getIdCondPartRiesgos() {
		return this.idCondPartRiesgos;
	}

	public void setIdCondPartRiesgos(Integer idCondPartRiesgos) {
		this.idCondPartRiesgos = idCondPartRiesgos;
	}

	public String getCondicionPartRiesgos() {
		return this.condicionPartRiesgos;
	}

	public void setCondicionPartRiesgos(String condicionPartRiesgos) {
		this.condicionPartRiesgos = condicionPartRiesgos;
	}

	public RamoRiesgosEsp getRamoRiesgosEsp() {
		return this.ramoRiesgosEsp;
	}

	public void setRamoRiesgosEsp(RamoRiesgosEsp ramoRiesgosEsp) {
		this.ramoRiesgosEsp = ramoRiesgosEsp;
	}

}