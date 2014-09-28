package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_eq_maq database table.
 * 
 */
@Entity
@Table(name="cobert_eq_maq")
public class CobertEqMaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_eq_maq")
	private Integer idCobertEqMaq;

	@Column(name="cobertura_eq_maq")
	private String coberturaEqMaq;

	//bi-directional many-to-one association to RamoEquipoMaquinaria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_equipo_maquinaria")
	private RamoEquipoMaquinaria ramoEquipoMaquinaria;

	public CobertEqMaq() {
	}

	public Integer getIdCobertEqMaq() {
		return this.idCobertEqMaq;
	}

	public void setIdCobertEqMaq(Integer idCobertEqMaq) {
		this.idCobertEqMaq = idCobertEqMaq;
	}

	public String getCoberturaEqMaq() {
		return this.coberturaEqMaq;
	}

	public void setCoberturaEqMaq(String coberturaEqMaq) {
		this.coberturaEqMaq = coberturaEqMaq;
	}

	public RamoEquipoMaquinaria getRamoEquipoMaquinaria() {
		return this.ramoEquipoMaquinaria;
	}

	public void setRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) {
		this.ramoEquipoMaquinaria = ramoEquipoMaquinaria;
	}

}