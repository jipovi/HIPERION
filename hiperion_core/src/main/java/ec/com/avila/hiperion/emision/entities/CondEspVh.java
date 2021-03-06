package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cond_esp_vh database table.
 * 
 */
@Entity
@Table(name="cond_esp_vh")
public class CondEspVh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_condicion_esp_vehiculo")
	private Integer idCondicionEspVehiculo;

	@Column(name="condicion_esp_vh")
	private String condicionEspVh;

	//bi-directional many-to-one association to RamoVehiculo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ramo_vehiculos")
	private RamoVehiculo ramoVehiculo;

	public CondEspVh() {
	}

	public Integer getIdCondicionEspVehiculo() {
		return this.idCondicionEspVehiculo;
	}

	public void setIdCondicionEspVehiculo(Integer idCondicionEspVehiculo) {
		this.idCondicionEspVehiculo = idCondicionEspVehiculo;
	}

	public String getCondicionEspVh() {
		return this.condicionEspVh;
	}

	public void setCondicionEspVh(String condicionEspVh) {
		this.condicionEspVh = condicionEspVh;
	}

	public RamoVehiculo getRamoVehiculo() {
		return this.ramoVehiculo;
	}

	public void setRamoVehiculo(RamoVehiculo ramoVehiculo) {
		this.ramoVehiculo = ramoVehiculo;
	}

}