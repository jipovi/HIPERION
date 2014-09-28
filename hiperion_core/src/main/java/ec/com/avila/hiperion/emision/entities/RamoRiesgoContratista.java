package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_riesgo_contratista database table.
 * 
 */
@Entity
@Table(name="ramo_riesgo_contratista")
public class RamoRiesgoContratista implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_contratista")
	private Integer idContratista;

	@Column(name="period_construccion_contratista")
	private Integer periodConstruccionContratista;

	@Column(name="period_mant_contratista")
	private Integer periodMantContratista;

	@Column(name="tasa_perid_const")
	private BigDecimal tasaPeridConst;

	//bi-directional many-to-one association to ClausulasAddContratista
	@OneToMany(mappedBy="ramoRiesgoContratista")
	private List<ClausulasAddContratista> clausulasAddContratistas;

	//bi-directional many-to-one association to CobertContratista
	@OneToMany(mappedBy="ramoRiesgoContratista")
	private List<CobertContratista> cobertContratistas;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoRiesgoContratista() {
	}

	public Integer getIdContratista() {
		return this.idContratista;
	}

	public void setIdContratista(Integer idContratista) {
		this.idContratista = idContratista;
	}

	public Integer getPeriodConstruccionContratista() {
		return this.periodConstruccionContratista;
	}

	public void setPeriodConstruccionContratista(Integer periodConstruccionContratista) {
		this.periodConstruccionContratista = periodConstruccionContratista;
	}

	public Integer getPeriodMantContratista() {
		return this.periodMantContratista;
	}

	public void setPeriodMantContratista(Integer periodMantContratista) {
		this.periodMantContratista = periodMantContratista;
	}

	public BigDecimal getTasaPeridConst() {
		return this.tasaPeridConst;
	}

	public void setTasaPeridConst(BigDecimal tasaPeridConst) {
		this.tasaPeridConst = tasaPeridConst;
	}

	public List<ClausulasAddContratista> getClausulasAddContratistas() {
		return this.clausulasAddContratistas;
	}

	public void setClausulasAddContratistas(List<ClausulasAddContratista> clausulasAddContratistas) {
		this.clausulasAddContratistas = clausulasAddContratistas;
	}

	public ClausulasAddContratista addClausulasAddContratista(ClausulasAddContratista clausulasAddContratista) {
		getClausulasAddContratistas().add(clausulasAddContratista);
		clausulasAddContratista.setRamoRiesgoContratista(this);

		return clausulasAddContratista;
	}

	public ClausulasAddContratista removeClausulasAddContratista(ClausulasAddContratista clausulasAddContratista) {
		getClausulasAddContratistas().remove(clausulasAddContratista);
		clausulasAddContratista.setRamoRiesgoContratista(null);

		return clausulasAddContratista;
	}

	public List<CobertContratista> getCobertContratistas() {
		return this.cobertContratistas;
	}

	public void setCobertContratistas(List<CobertContratista> cobertContratistas) {
		this.cobertContratistas = cobertContratistas;
	}

	public CobertContratista addCobertContratista(CobertContratista cobertContratista) {
		getCobertContratistas().add(cobertContratista);
		cobertContratista.setRamoRiesgoContratista(this);

		return cobertContratista;
	}

	public CobertContratista removeCobertContratista(CobertContratista cobertContratista) {
		getCobertContratistas().remove(cobertContratista);
		cobertContratista.setRamoRiesgoContratista(null);

		return cobertContratista;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}