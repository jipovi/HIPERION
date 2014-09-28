package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_resp database table.
 * 
 */
@Entity
@Table(name="clausulas_add_resp")
public class ClausulasAddResp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_responsabilidad")
	private Integer idClausulaAdResponsabilidad;

	@Column(name="clausula_resp")
	private String clausulaResp;

	@Column(name="num_dias_resp")
	private Integer numDiasResp;

	//bi-directional many-to-one association to RamoResponsabilidadCivil
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_responsabilidad")
	private RamoResponsabilidadCivil ramoResponsabilidadCivil;

	public ClausulasAddResp() {
	}

	public Integer getIdClausulaAdResponsabilidad() {
		return this.idClausulaAdResponsabilidad;
	}

	public void setIdClausulaAdResponsabilidad(Integer idClausulaAdResponsabilidad) {
		this.idClausulaAdResponsabilidad = idClausulaAdResponsabilidad;
	}

	public String getClausulaResp() {
		return this.clausulaResp;
	}

	public void setClausulaResp(String clausulaResp) {
		this.clausulaResp = clausulaResp;
	}

	public Integer getNumDiasResp() {
		return this.numDiasResp;
	}

	public void setNumDiasResp(Integer numDiasResp) {
		this.numDiasResp = numDiasResp;
	}

	public RamoResponsabilidadCivil getRamoResponsabilidadCivil() {
		return this.ramoResponsabilidadCivil;
	}

	public void setRamoResponsabilidadCivil(RamoResponsabilidadCivil ramoResponsabilidadCivil) {
		this.ramoResponsabilidadCivil = ramoResponsabilidadCivil;
	}

}