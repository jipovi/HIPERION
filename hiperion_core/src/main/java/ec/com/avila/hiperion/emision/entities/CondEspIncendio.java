package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cond_esp_incendio database table.
 * 
 */
@Entity
@Table(name="cond_esp_incendio")
public class CondEspIncendio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_condicion_esp_incendio")
	private Integer idCondicionEspIncendio;

	@Column(name="condicion_esp_incendio")
	private String condicionEspIncendio;

	//bi-directional many-to-one association to RamoIncendioLineasAliada
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_incendio")
	private RamoIncendioLineasAliada ramoIncendioLineasAliada;

	public CondEspIncendio() {
	}

	public Integer getIdCondicionEspIncendio() {
		return this.idCondicionEspIncendio;
	}

	public void setIdCondicionEspIncendio(Integer idCondicionEspIncendio) {
		this.idCondicionEspIncendio = idCondicionEspIncendio;
	}

	public String getCondicionEspIncendio() {
		return this.condicionEspIncendio;
	}

	public void setCondicionEspIncendio(String condicionEspIncendio) {
		this.condicionEspIncendio = condicionEspIncendio;
	}

	public RamoIncendioLineasAliada getRamoIncendioLineasAliada() {
		return this.ramoIncendioLineasAliada;
	}

	public void setRamoIncendioLineasAliada(RamoIncendioLineasAliada ramoIncendioLineasAliada) {
		this.ramoIncendioLineasAliada = ramoIncendioLineasAliada;
	}

}