package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_montaje database table.
 * 
 */
@Entity
@Table(name="cobert_montaje")
public class CobertMontaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_montaje")
	private Integer idCobertMontaje;

	@Column(name="cobertura_montaje")
	private String coberturaMontaje;

	//bi-directional many-to-one association to RamoRiesgoMontaje
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_riesgo_montaje")
	private RamoRiesgoMontaje ramoRiesgoMontaje;

	public CobertMontaje() {
	}

	public Integer getIdCobertMontaje() {
		return this.idCobertMontaje;
	}

	public void setIdCobertMontaje(Integer idCobertMontaje) {
		this.idCobertMontaje = idCobertMontaje;
	}

	public String getCoberturaMontaje() {
		return this.coberturaMontaje;
	}

	public void setCoberturaMontaje(String coberturaMontaje) {
		this.coberturaMontaje = coberturaMontaje;
	}

	public RamoRiesgoMontaje getRamoRiesgoMontaje() {
		return this.ramoRiesgoMontaje;
	}

	public void setRamoRiesgoMontaje(RamoRiesgoMontaje ramoRiesgoMontaje) {
		this.ramoRiesgoMontaje = ramoRiesgoMontaje;
	}

}