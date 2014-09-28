package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_casco_aereo database table.
 * 
 */
@Entity
@Table(name="clausulas_add_casco_aereo")
public class ClausulasAddCascoAereo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_casco_aereo")
	private Integer idClausulaAdCascoAereo;

	@Column(name="clausula_add_aereo")
	private String clausulaAddAereo;

	@Column(name="num_dias_aereo")
	private Integer numDiasAereo;

	//bi-directional many-to-one association to RamoCascoAereo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_casco_aereo")
	private RamoCascoAereo ramoCascoAereo;

	public ClausulasAddCascoAereo() {
	}

	public Integer getIdClausulaAdCascoAereo() {
		return this.idClausulaAdCascoAereo;
	}

	public void setIdClausulaAdCascoAereo(Integer idClausulaAdCascoAereo) {
		this.idClausulaAdCascoAereo = idClausulaAdCascoAereo;
	}

	public String getClausulaAddAereo() {
		return this.clausulaAddAereo;
	}

	public void setClausulaAddAereo(String clausulaAddAereo) {
		this.clausulaAddAereo = clausulaAddAereo;
	}

	public Integer getNumDiasAereo() {
		return this.numDiasAereo;
	}

	public void setNumDiasAereo(Integer numDiasAereo) {
		this.numDiasAereo = numDiasAereo;
	}

	public RamoCascoAereo getRamoCascoAereo() {
		return this.ramoCascoAereo;
	}

	public void setRamoCascoAereo(RamoCascoAereo ramoCascoAereo) {
		this.ramoCascoAereo = ramoCascoAereo;
	}

}