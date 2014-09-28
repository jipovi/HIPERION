package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clausulas_add_acc_pers database table.
 * 
 */
@Entity
@Table(name="clausulas_add_acc_pers")
public class ClausulasAddAccPer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_clausula_ad_acidente")
	private Integer idClausulaAdAcidente;

	@Column(name="clausula_acc_personales")
	private String clausulaAccPersonales;

	//bi-directional many-to-one association to RamoAccidentesPersonale
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_accidentes")
	private RamoAccidentesPersonale ramoAccidentesPersonale;

	public ClausulasAddAccPer() {
	}

	public Integer getIdClausulaAdAcidente() {
		return this.idClausulaAdAcidente;
	}

	public void setIdClausulaAdAcidente(Integer idClausulaAdAcidente) {
		this.idClausulaAdAcidente = idClausulaAdAcidente;
	}

	public String getClausulaAccPersonales() {
		return this.clausulaAccPersonales;
	}

	public void setClausulaAccPersonales(String clausulaAccPersonales) {
		this.clausulaAccPersonales = clausulaAccPersonales;
	}

	public RamoAccidentesPersonale getRamoAccidentesPersonale() {
		return this.ramoAccidentesPersonale;
	}

	public void setRamoAccidentesPersonale(RamoAccidentesPersonale ramoAccidentesPersonale) {
		this.ramoAccidentesPersonale = ramoAccidentesPersonale;
	}

}