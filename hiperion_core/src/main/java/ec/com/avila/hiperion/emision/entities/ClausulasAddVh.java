package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_vh database table.
 * 
 */
@Entity
@Table(name="clausulas_add_vh")
public class ClausulasAddVh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_vehiculo")
	private Integer idClausulaAdVehiculo;

	@Column(name="clausula_add_vh")
	private String clausulaAddVh;

	@Column(name="num_dias_vh")
	private Integer numDiasVh;

	//bi-directional many-to-one association to RamoVehiculo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ramo_vehiculos")
	private RamoVehiculo ramoVehiculo;

	public ClausulasAddVh() {
	}

	public Integer getIdClausulaAdVehiculo() {
		return this.idClausulaAdVehiculo;
	}

	public void setIdClausulaAdVehiculo(Integer idClausulaAdVehiculo) {
		this.idClausulaAdVehiculo = idClausulaAdVehiculo;
	}

	public String getClausulaAddVh() {
		return this.clausulaAddVh;
	}

	public void setClausulaAddVh(String clausulaAddVh) {
		this.clausulaAddVh = clausulaAddVh;
	}

	public Integer getNumDiasVh() {
		return this.numDiasVh;
	}

	public void setNumDiasVh(Integer numDiasVh) {
		this.numDiasVh = numDiasVh;
	}

	public RamoVehiculo getRamoVehiculo() {
		return this.ramoVehiculo;
	}

	public void setRamoVehiculo(RamoVehiculo ramoVehiculo) {
		this.ramoVehiculo = ramoVehiculo;
	}

}