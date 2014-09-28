package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_riesgos_esp database table.
 * 
 */
@Entity
@Table(name="ramo_riesgos_esp")
public class RamoRiesgosEsp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_riesgo")
	private Integer idRiesgo;

	@Column(name="cond_imp_riesgos")
	private String condImpRiesgos;

	@Column(name="tasa_riesgos_esp")
	private BigDecimal tasaRiesgosEsp;

	//bi-directional many-to-one association to ClausulasAddRiesgo
	@OneToMany(mappedBy="ramoRiesgosEsp")
	private List<ClausulasAddRiesgo> clausulasAddRiesgos;

	//bi-directional many-to-one association to CobertAddRiesgo
	@OneToMany(mappedBy="ramoRiesgosEsp")
	private List<CobertAddRiesgo> cobertAddRiesgos;

	//bi-directional many-to-one association to CobertRiesgo
	@OneToMany(mappedBy="ramoRiesgosEsp")
	private List<CobertRiesgo> cobertRiesgos;

	//bi-directional many-to-one association to CondEspRiesgo
	@OneToMany(mappedBy="ramoRiesgosEsp")
	private List<CondEspRiesgo> condEspRiesgos;

	//bi-directional many-to-one association to CondPartRiesgo
	@OneToMany(mappedBy="ramoRiesgosEsp")
	private List<CondPartRiesgo> condPartRiesgos;

	//bi-directional many-to-one association to ObjAsegRiesgo
	@OneToMany(mappedBy="ramoRiesgosEsp")
	private List<ObjAsegRiesgo> objAsegRiesgos;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoRiesgosEsp() {
	}

	public Integer getIdRiesgo() {
		return this.idRiesgo;
	}

	public void setIdRiesgo(Integer idRiesgo) {
		this.idRiesgo = idRiesgo;
	}

	public String getCondImpRiesgos() {
		return this.condImpRiesgos;
	}

	public void setCondImpRiesgos(String condImpRiesgos) {
		this.condImpRiesgos = condImpRiesgos;
	}

	public BigDecimal getTasaRiesgosEsp() {
		return this.tasaRiesgosEsp;
	}

	public void setTasaRiesgosEsp(BigDecimal tasaRiesgosEsp) {
		this.tasaRiesgosEsp = tasaRiesgosEsp;
	}

	public List<ClausulasAddRiesgo> getClausulasAddRiesgos() {
		return this.clausulasAddRiesgos;
	}

	public void setClausulasAddRiesgos(List<ClausulasAddRiesgo> clausulasAddRiesgos) {
		this.clausulasAddRiesgos = clausulasAddRiesgos;
	}

	public ClausulasAddRiesgo addClausulasAddRiesgo(ClausulasAddRiesgo clausulasAddRiesgo) {
		getClausulasAddRiesgos().add(clausulasAddRiesgo);
		clausulasAddRiesgo.setRamoRiesgosEsp(this);

		return clausulasAddRiesgo;
	}

	public ClausulasAddRiesgo removeClausulasAddRiesgo(ClausulasAddRiesgo clausulasAddRiesgo) {
		getClausulasAddRiesgos().remove(clausulasAddRiesgo);
		clausulasAddRiesgo.setRamoRiesgosEsp(null);

		return clausulasAddRiesgo;
	}

	public List<CobertAddRiesgo> getCobertAddRiesgos() {
		return this.cobertAddRiesgos;
	}

	public void setCobertAddRiesgos(List<CobertAddRiesgo> cobertAddRiesgos) {
		this.cobertAddRiesgos = cobertAddRiesgos;
	}

	public CobertAddRiesgo addCobertAddRiesgo(CobertAddRiesgo cobertAddRiesgo) {
		getCobertAddRiesgos().add(cobertAddRiesgo);
		cobertAddRiesgo.setRamoRiesgosEsp(this);

		return cobertAddRiesgo;
	}

	public CobertAddRiesgo removeCobertAddRiesgo(CobertAddRiesgo cobertAddRiesgo) {
		getCobertAddRiesgos().remove(cobertAddRiesgo);
		cobertAddRiesgo.setRamoRiesgosEsp(null);

		return cobertAddRiesgo;
	}

	public List<CobertRiesgo> getCobertRiesgos() {
		return this.cobertRiesgos;
	}

	public void setCobertRiesgos(List<CobertRiesgo> cobertRiesgos) {
		this.cobertRiesgos = cobertRiesgos;
	}

	public CobertRiesgo addCobertRiesgo(CobertRiesgo cobertRiesgo) {
		getCobertRiesgos().add(cobertRiesgo);
		cobertRiesgo.setRamoRiesgosEsp(this);

		return cobertRiesgo;
	}

	public CobertRiesgo removeCobertRiesgo(CobertRiesgo cobertRiesgo) {
		getCobertRiesgos().remove(cobertRiesgo);
		cobertRiesgo.setRamoRiesgosEsp(null);

		return cobertRiesgo;
	}

	public List<CondEspRiesgo> getCondEspRiesgos() {
		return this.condEspRiesgos;
	}

	public void setCondEspRiesgos(List<CondEspRiesgo> condEspRiesgos) {
		this.condEspRiesgos = condEspRiesgos;
	}

	public CondEspRiesgo addCondEspRiesgo(CondEspRiesgo condEspRiesgo) {
		getCondEspRiesgos().add(condEspRiesgo);
		condEspRiesgo.setRamoRiesgosEsp(this);

		return condEspRiesgo;
	}

	public CondEspRiesgo removeCondEspRiesgo(CondEspRiesgo condEspRiesgo) {
		getCondEspRiesgos().remove(condEspRiesgo);
		condEspRiesgo.setRamoRiesgosEsp(null);

		return condEspRiesgo;
	}

	public List<CondPartRiesgo> getCondPartRiesgos() {
		return this.condPartRiesgos;
	}

	public void setCondPartRiesgos(List<CondPartRiesgo> condPartRiesgos) {
		this.condPartRiesgos = condPartRiesgos;
	}

	public CondPartRiesgo addCondPartRiesgo(CondPartRiesgo condPartRiesgo) {
		getCondPartRiesgos().add(condPartRiesgo);
		condPartRiesgo.setRamoRiesgosEsp(this);

		return condPartRiesgo;
	}

	public CondPartRiesgo removeCondPartRiesgo(CondPartRiesgo condPartRiesgo) {
		getCondPartRiesgos().remove(condPartRiesgo);
		condPartRiesgo.setRamoRiesgosEsp(null);

		return condPartRiesgo;
	}

	public List<ObjAsegRiesgo> getObjAsegRiesgos() {
		return this.objAsegRiesgos;
	}

	public void setObjAsegRiesgos(List<ObjAsegRiesgo> objAsegRiesgos) {
		this.objAsegRiesgos = objAsegRiesgos;
	}

	public ObjAsegRiesgo addObjAsegRiesgo(ObjAsegRiesgo objAsegRiesgo) {
		getObjAsegRiesgos().add(objAsegRiesgo);
		objAsegRiesgo.setRamoRiesgosEsp(this);

		return objAsegRiesgo;
	}

	public ObjAsegRiesgo removeObjAsegRiesgo(ObjAsegRiesgo objAsegRiesgo) {
		getObjAsegRiesgos().remove(objAsegRiesgo);
		objAsegRiesgo.setRamoRiesgosEsp(null);

		return objAsegRiesgo;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}