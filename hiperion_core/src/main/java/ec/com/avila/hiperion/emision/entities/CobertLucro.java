package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_lucro database table.
 * 
 */
@Entity
@Table(name="cobert_lucro")
public class CobertLucro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_lucro")
	private Integer idCobertLucro;

	@Column(name="cobertura_lc_incendio")
	private String coberturaLcIncendio;

	//bi-directional many-to-one association to RamoLucroCesanteIncendio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_lucro")
	private RamoLucroCesanteIncendio ramoLucroCesanteIncendio;

	public CobertLucro() {
	}

	public Integer getIdCobertLucro() {
		return this.idCobertLucro;
	}

	public void setIdCobertLucro(Integer idCobertLucro) {
		this.idCobertLucro = idCobertLucro;
	}

	public String getCoberturaLcIncendio() {
		return this.coberturaLcIncendio;
	}

	public void setCoberturaLcIncendio(String coberturaLcIncendio) {
		this.coberturaLcIncendio = coberturaLcIncendio;
	}

	public RamoLucroCesanteIncendio getRamoLucroCesanteIncendio() {
		return this.ramoLucroCesanteIncendio;
	}

	public void setRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) {
		this.ramoLucroCesanteIncendio = ramoLucroCesanteIncendio;
	}

}