package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cond_esp_robo database table.
 * 
 */
@Entity
@Table(name="cond_esp_robo")
public class CondEspRobo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cond_esp_robo")
	private Integer idCondEspRobo;

	@Column(name="condicion_esp_robo")
	private String condicionEspRobo;

	//bi-directional many-to-one association to RamoRoboAsalto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_robo")
	private RamoRoboAsalto ramoRoboAsalto;

	public CondEspRobo() {
	}

	public Integer getIdCondEspRobo() {
		return this.idCondEspRobo;
	}

	public void setIdCondEspRobo(Integer idCondEspRobo) {
		this.idCondEspRobo = idCondEspRobo;
	}

	public String getCondicionEspRobo() {
		return this.condicionEspRobo;
	}

	public void setCondicionEspRobo(String condicionEspRobo) {
		this.condicionEspRobo = condicionEspRobo;
	}

	public RamoRoboAsalto getRamoRoboAsalto() {
		return this.ramoRoboAsalto;
	}

	public void setRamoRoboAsalto(RamoRoboAsalto ramoRoboAsalto) {
		this.ramoRoboAsalto = ramoRoboAsalto;
	}

}