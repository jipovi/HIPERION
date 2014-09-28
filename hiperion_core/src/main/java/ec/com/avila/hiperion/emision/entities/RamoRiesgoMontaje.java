package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_riesgo_montaje database table.
 * 
 */
@Entity
@Table(name="ramo_riesgo_montaje")
public class RamoRiesgoMontaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_riesgo_montaje")
	private Integer idRiesgoMontaje;

	@Column(name="periodo_construc_montaje")
	private Integer periodoConstrucMontaje;

	@Column(name="periodo_mant_montaje")
	private Integer periodoMantMontaje;

	@Column(name="tasa_montaje")
	private BigDecimal tasaMontaje;

	//bi-directional many-to-one association to ClausulasAddMontaje
	@OneToMany(mappedBy="ramoRiesgoMontaje")
	private List<ClausulasAddMontaje> clausulasAddMontajes;

	//bi-directional many-to-one association to CobertMontaje
	@OneToMany(mappedBy="ramoRiesgoMontaje")
	private List<CobertMontaje> cobertMontajes;

	//bi-directional many-to-one association to ObjAsegMontaje
	@OneToMany(mappedBy="ramoRiesgoMontaje")
	private List<ObjAsegMontaje> objAsegMontajes;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoRiesgoMontaje() {
	}

	public Integer getIdRiesgoMontaje() {
		return this.idRiesgoMontaje;
	}

	public void setIdRiesgoMontaje(Integer idRiesgoMontaje) {
		this.idRiesgoMontaje = idRiesgoMontaje;
	}

	public Integer getPeriodoConstrucMontaje() {
		return this.periodoConstrucMontaje;
	}

	public void setPeriodoConstrucMontaje(Integer periodoConstrucMontaje) {
		this.periodoConstrucMontaje = periodoConstrucMontaje;
	}

	public Integer getPeriodoMantMontaje() {
		return this.periodoMantMontaje;
	}

	public void setPeriodoMantMontaje(Integer periodoMantMontaje) {
		this.periodoMantMontaje = periodoMantMontaje;
	}

	public BigDecimal getTasaMontaje() {
		return this.tasaMontaje;
	}

	public void setTasaMontaje(BigDecimal tasaMontaje) {
		this.tasaMontaje = tasaMontaje;
	}

	public List<ClausulasAddMontaje> getClausulasAddMontajes() {
		return this.clausulasAddMontajes;
	}

	public void setClausulasAddMontajes(List<ClausulasAddMontaje> clausulasAddMontajes) {
		this.clausulasAddMontajes = clausulasAddMontajes;
	}

	public ClausulasAddMontaje addClausulasAddMontaje(ClausulasAddMontaje clausulasAddMontaje) {
		getClausulasAddMontajes().add(clausulasAddMontaje);
		clausulasAddMontaje.setRamoRiesgoMontaje(this);

		return clausulasAddMontaje;
	}

	public ClausulasAddMontaje removeClausulasAddMontaje(ClausulasAddMontaje clausulasAddMontaje) {
		getClausulasAddMontajes().remove(clausulasAddMontaje);
		clausulasAddMontaje.setRamoRiesgoMontaje(null);

		return clausulasAddMontaje;
	}

	public List<CobertMontaje> getCobertMontajes() {
		return this.cobertMontajes;
	}

	public void setCobertMontajes(List<CobertMontaje> cobertMontajes) {
		this.cobertMontajes = cobertMontajes;
	}

	public CobertMontaje addCobertMontaje(CobertMontaje cobertMontaje) {
		getCobertMontajes().add(cobertMontaje);
		cobertMontaje.setRamoRiesgoMontaje(this);

		return cobertMontaje;
	}

	public CobertMontaje removeCobertMontaje(CobertMontaje cobertMontaje) {
		getCobertMontajes().remove(cobertMontaje);
		cobertMontaje.setRamoRiesgoMontaje(null);

		return cobertMontaje;
	}

	public List<ObjAsegMontaje> getObjAsegMontajes() {
		return this.objAsegMontajes;
	}

	public void setObjAsegMontajes(List<ObjAsegMontaje> objAsegMontajes) {
		this.objAsegMontajes = objAsegMontajes;
	}

	public ObjAsegMontaje addObjAsegMontaje(ObjAsegMontaje objAsegMontaje) {
		getObjAsegMontajes().add(objAsegMontaje);
		objAsegMontaje.setRamoRiesgoMontaje(this);

		return objAsegMontaje;
	}

	public ObjAsegMontaje removeObjAsegMontaje(ObjAsegMontaje objAsegMontaje) {
		getObjAsegMontajes().remove(objAsegMontaje);
		objAsegMontaje.setRamoRiesgoMontaje(null);

		return objAsegMontaje;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}