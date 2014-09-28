package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_equipo database table.
 * 
 */
@Entity
@Table(name="clausulas_add_equipo")
public class ClausulasAddEquipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_equipo")
	private Integer idClausulaAdEquipo;

	@Column(name="clausula_eq_elec")
	private String clausulaEqElec;

	//bi-directional many-to-one association to RamoEquipoElectronico
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_equipo")
	private RamoEquipoElectronico ramoEquipoElectronico;

	public ClausulasAddEquipo() {
	}

	public Integer getIdClausulaAdEquipo() {
		return this.idClausulaAdEquipo;
	}

	public void setIdClausulaAdEquipo(Integer idClausulaAdEquipo) {
		this.idClausulaAdEquipo = idClausulaAdEquipo;
	}

	public String getClausulaEqElec() {
		return this.clausulaEqElec;
	}

	public void setClausulaEqElec(String clausulaEqElec) {
		this.clausulaEqElec = clausulaEqElec;
	}

	public RamoEquipoElectronico getRamoEquipoElectronico() {
		return this.ramoEquipoElectronico;
	}

	public void setRamoEquipoElectronico(RamoEquipoElectronico ramoEquipoElectronico) {
		this.ramoEquipoElectronico = ramoEquipoElectronico;
	}

}