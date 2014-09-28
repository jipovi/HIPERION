package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cobert_agro database table.
 * 
 */
@Entity
@Table(name="cobert_agro")
public class CobertAgro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cobert_agro")
	private Integer idCobertAgro;

	@Column(name="cobertura_agro")
	private String coberturaAgro;

	//bi-directional many-to-one association to RamoAgropecuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_agropecuario")
	private RamoAgropecuario ramoAgropecuario;

	public CobertAgro() {
	}

	public Integer getIdCobertAgro() {
		return this.idCobertAgro;
	}

	public void setIdCobertAgro(Integer idCobertAgro) {
		this.idCobertAgro = idCobertAgro;
	}

	public String getCoberturaAgro() {
		return this.coberturaAgro;
	}

	public void setCoberturaAgro(String coberturaAgro) {
		this.coberturaAgro = coberturaAgro;
	}

	public RamoAgropecuario getRamoAgropecuario() {
		return this.ramoAgropecuario;
	}

	public void setRamoAgropecuario(RamoAgropecuario ramoAgropecuario) {
		this.ramoAgropecuario = ramoAgropecuario;
	}

}