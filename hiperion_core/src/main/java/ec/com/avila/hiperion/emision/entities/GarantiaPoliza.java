package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the garantia_poliza database table.
 * 
 */
@Entity
@Table(name="garantia_poliza")
public class GarantiaPoliza implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_garantia_poliza")
	private Integer idGarantiaPoliza;

	@Column(name="garantia_eq_elec")
	private String garantiaEqElec;

	//bi-directional many-to-one association to RamoEquipoElectronico
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_equipo")
	private RamoEquipoElectronico ramoEquipoElectronico;

	public GarantiaPoliza() {
	}

	public Integer getIdGarantiaPoliza() {
		return this.idGarantiaPoliza;
	}

	public void setIdGarantiaPoliza(Integer idGarantiaPoliza) {
		this.idGarantiaPoliza = idGarantiaPoliza;
	}

	public String getGarantiaEqElec() {
		return this.garantiaEqElec;
	}

	public void setGarantiaEqElec(String garantiaEqElec) {
		this.garantiaEqElec = garantiaEqElec;
	}

	public RamoEquipoElectronico getRamoEquipoElectronico() {
		return this.ramoEquipoElectronico;
	}

	public void setRamoEquipoElectronico(RamoEquipoElectronico ramoEquipoElectronico) {
		this.ramoEquipoElectronico = ramoEquipoElectronico;
	}

}