package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_trans database table.
 * 
 */
@Entity
@Table(name="clausulas_add_trans")
public class ClausulasAddTran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_transporte")
	private Integer idClausulaAdTransporte;

	@Column(name="clausula_trans")
	private String clausulaTrans;

	@Column(name="num_dias_trans")
	private Integer numDiasTrans;

	//bi-directional many-to-one association to RamoTransporte
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_transporte")
	private RamoTransporte ramoTransporte;

	public ClausulasAddTran() {
	}

	public Integer getIdClausulaAdTransporte() {
		return this.idClausulaAdTransporte;
	}

	public void setIdClausulaAdTransporte(Integer idClausulaAdTransporte) {
		this.idClausulaAdTransporte = idClausulaAdTransporte;
	}

	public String getClausulaTrans() {
		return this.clausulaTrans;
	}

	public void setClausulaTrans(String clausulaTrans) {
		this.clausulaTrans = clausulaTrans;
	}

	public Integer getNumDiasTrans() {
		return this.numDiasTrans;
	}

	public void setNumDiasTrans(Integer numDiasTrans) {
		this.numDiasTrans = numDiasTrans;
	}

	public RamoTransporte getRamoTransporte() {
		return this.ramoTransporte;
	}

	public void setRamoTransporte(RamoTransporte ramoTransporte) {
		this.ramoTransporte = ramoTransporte;
	}

}