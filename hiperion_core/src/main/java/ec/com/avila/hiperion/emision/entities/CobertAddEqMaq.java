package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_add_eq_maq database table.
 * 
 */
@Entity
@Table(name="cobert_add_eq_maq")
public class CobertAddEqMaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_ad_eq_maq")
	private Integer idCobertAdEqMaq;

	@Column(name="cobertura_add_eq_maq")
	private String coberturaAddEqMaq;

	//bi-directional many-to-one association to RamoEquipoMaquinaria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_equipo_maquinaria")
	private RamoEquipoMaquinaria ramoEquipoMaquinaria;

	public CobertAddEqMaq() {
	}

	public Integer getIdCobertAdEqMaq() {
		return this.idCobertAdEqMaq;
	}

	public void setIdCobertAdEqMaq(Integer idCobertAdEqMaq) {
		this.idCobertAdEqMaq = idCobertAdEqMaq;
	}

	public String getCoberturaAddEqMaq() {
		return this.coberturaAddEqMaq;
	}

	public void setCoberturaAddEqMaq(String coberturaAddEqMaq) {
		this.coberturaAddEqMaq = coberturaAddEqMaq;
	}

	public RamoEquipoMaquinaria getRamoEquipoMaquinaria() {
		return this.ramoEquipoMaquinaria;
	}

	public void setRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) {
		this.ramoEquipoMaquinaria = ramoEquipoMaquinaria;
	}

}