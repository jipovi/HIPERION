package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_rotura database table.
 * 
 */
@Entity
@Table(name="clausulas_add_rotura")
public class ClausulasAddRotura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_rotura")
	private Integer idClausulaAdRotura;

	@Column(name="clausula_add_rotura")
	private String clausulaAddRotura;

	@Column(name="num_dias_rotura")
	private Integer numDiasRotura;

	//bi-directional many-to-one association to RamoRoturaMaquinaria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_rotura")
	private RamoRoturaMaquinaria ramoRoturaMaquinaria;

	public ClausulasAddRotura() {
	}

	public Integer getIdClausulaAdRotura() {
		return this.idClausulaAdRotura;
	}

	public void setIdClausulaAdRotura(Integer idClausulaAdRotura) {
		this.idClausulaAdRotura = idClausulaAdRotura;
	}

	public String getClausulaAddRotura() {
		return this.clausulaAddRotura;
	}

	public void setClausulaAddRotura(String clausulaAddRotura) {
		this.clausulaAddRotura = clausulaAddRotura;
	}

	public Integer getNumDiasRotura() {
		return this.numDiasRotura;
	}

	public void setNumDiasRotura(Integer numDiasRotura) {
		this.numDiasRotura = numDiasRotura;
	}

	public RamoRoturaMaquinaria getRamoRoturaMaquinaria() {
		return this.ramoRoturaMaquinaria;
	}

	public void setRamoRoturaMaquinaria(RamoRoturaMaquinaria ramoRoturaMaquinaria) {
		this.ramoRoturaMaquinaria = ramoRoturaMaquinaria;
	}

}