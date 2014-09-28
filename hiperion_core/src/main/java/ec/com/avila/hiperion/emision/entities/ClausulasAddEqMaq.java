package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_eq_maq database table.
 * 
 */
@Entity
@Table(name="clausulas_add_eq_maq")
public class ClausulasAddEqMaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_eq_maq")
	private Integer idClausulaAdEqMaq;

	@Column(name="clausula_eq_maq")
	private String clausulaEqMaq;

	@Column(name="num_dias_eq_maq")
	private Integer numDiasEqMaq;

	//bi-directional many-to-one association to RamoEquipoMaquinaria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_equipo_maquinaria")
	private RamoEquipoMaquinaria ramoEquipoMaquinaria;

	public ClausulasAddEqMaq() {
	}

	public Integer getIdClausulaAdEqMaq() {
		return this.idClausulaAdEqMaq;
	}

	public void setIdClausulaAdEqMaq(Integer idClausulaAdEqMaq) {
		this.idClausulaAdEqMaq = idClausulaAdEqMaq;
	}

	public String getClausulaEqMaq() {
		return this.clausulaEqMaq;
	}

	public void setClausulaEqMaq(String clausulaEqMaq) {
		this.clausulaEqMaq = clausulaEqMaq;
	}

	public Integer getNumDiasEqMaq() {
		return this.numDiasEqMaq;
	}

	public void setNumDiasEqMaq(Integer numDiasEqMaq) {
		this.numDiasEqMaq = numDiasEqMaq;
	}

	public RamoEquipoMaquinaria getRamoEquipoMaquinaria() {
		return this.ramoEquipoMaquinaria;
	}

	public void setRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) {
		this.ramoEquipoMaquinaria = ramoEquipoMaquinaria;
	}

}