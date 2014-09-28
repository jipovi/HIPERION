package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_incendio database table.
 * 
 */
@Entity
@Table(name="cobert_incendio")
public class CobertIncendio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_incendio")
	private Integer idCobertIncendio;

	@Column(name="cobertura_incendio")
	private String coberturaIncendio;

	//bi-directional many-to-one association to RamoIncendioLineasAliada
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_incendio")
	private RamoIncendioLineasAliada ramoIncendioLineasAliada;

	public CobertIncendio() {
	}

	public Integer getIdCobertIncendio() {
		return this.idCobertIncendio;
	}

	public void setIdCobertIncendio(Integer idCobertIncendio) {
		this.idCobertIncendio = idCobertIncendio;
	}

	public String getCoberturaIncendio() {
		return this.coberturaIncendio;
	}

	public void setCoberturaIncendio(String coberturaIncendio) {
		this.coberturaIncendio = coberturaIncendio;
	}

	public RamoIncendioLineasAliada getRamoIncendioLineasAliada() {
		return this.ramoIncendioLineasAliada;
	}

	public void setRamoIncendioLineasAliada(RamoIncendioLineasAliada ramoIncendioLineasAliada) {
		this.ramoIncendioLineasAliada = ramoIncendioLineasAliada;
	}

}