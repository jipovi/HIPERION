package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_riesgos database table.
 * 
 */
@Entity
@Table(name="clausulas_add_riesgos")
public class ClausulasAddRiesgo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_riesgos")
	private Integer idClausulaAdRiesgos;

	@Column(name="clausula_add_riesgos")
	private String clausulaAddRiesgos;

	//bi-directional many-to-one association to RamoRiesgosEsp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_riesgo")
	private RamoRiesgosEsp ramoRiesgosEsp;

	public ClausulasAddRiesgo() {
	}

	public Integer getIdClausulaAdRiesgos() {
		return this.idClausulaAdRiesgos;
	}

	public void setIdClausulaAdRiesgos(Integer idClausulaAdRiesgos) {
		this.idClausulaAdRiesgos = idClausulaAdRiesgos;
	}

	public String getClausulaAddRiesgos() {
		return this.clausulaAddRiesgos;
	}

	public void setClausulaAddRiesgos(String clausulaAddRiesgos) {
		this.clausulaAddRiesgos = clausulaAddRiesgos;
	}

	public RamoRiesgosEsp getRamoRiesgosEsp() {
		return this.ramoRiesgosEsp;
	}

	public void setRamoRiesgosEsp(RamoRiesgosEsp ramoRiesgosEsp) {
		this.ramoRiesgosEsp = ramoRiesgosEsp;
	}

}