package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobertura_robo database table.
 * 
 */
@Entity
@Table(name="cobertura_robo")
public class CoberturaRobo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_robo")
	private Integer idCobertRobo;

	@Column(name="cobertura_robo")
	private String coberturaRobo;

	//bi-directional many-to-one association to RamoRoboAsalto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_robo")
	private RamoRoboAsalto ramoRoboAsalto;

	public CoberturaRobo() {
	}

	public Integer getIdCobertRobo() {
		return this.idCobertRobo;
	}

	public void setIdCobertRobo(Integer idCobertRobo) {
		this.idCobertRobo = idCobertRobo;
	}

	public String getCoberturaRobo() {
		return this.coberturaRobo;
	}

	public void setCoberturaRobo(String coberturaRobo) {
		this.coberturaRobo = coberturaRobo;
	}

	public RamoRoboAsalto getRamoRoboAsalto() {
		return this.ramoRoboAsalto;
	}

	public void setRamoRoboAsalto(RamoRoboAsalto ramoRoboAsalto) {
		this.ramoRoboAsalto = ramoRoboAsalto;
	}

}