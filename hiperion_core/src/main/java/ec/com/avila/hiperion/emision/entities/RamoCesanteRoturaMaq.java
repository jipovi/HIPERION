package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_cesante_rotura_maq database table.
 * 
 */
@Entity
@Table(name="ramo_cesante_rotura_maq")
public class RamoCesanteRoturaMaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cesante")
	private Integer idCesante;

	@Column(name="deduc_minimo_aseg_lc_rotura")
	private BigDecimal deducMinimoAsegLcRotura;

	@Column(name="deduc_minimo_lc_rotura")
	private BigDecimal deducMinimoLcRotura;

	@Column(name="deduc_num_dias")
	private BigDecimal deducNumDias;

	@Column(name="period_indemnizacion_lc")
	private Integer periodIndemnizacionLc;

	@Column(name="tasa_lc_rotura")
	private BigDecimal tasaLcRotura;

	@Column(name="utilidad_bruta_lc_rotura")
	private BigDecimal utilidadBrutaLcRotura;

	//bi-directional many-to-one association to ClaAddLcRotura
	@OneToMany(mappedBy="ramoCesanteRoturaMaq")
	private List<ClaAddLcRotura> claAddLcRoturas;

	//bi-directional many-to-one association to CobertAddCesante
	@OneToMany(mappedBy="ramoCesanteRoturaMaq")
	private List<CobertAddCesante> cobertAddCesantes;

	//bi-directional many-to-one association to CobertCesante
	@OneToMany(mappedBy="ramoCesanteRoturaMaq")
	private List<CobertCesante> cobertCesantes;

	//bi-directional many-to-one association to ObjAsegCesante
	@OneToMany(mappedBy="ramoCesanteRoturaMaq")
	private List<ObjAsegCesante> objAsegCesantes;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoCesanteRoturaMaq() {
	}

	public Integer getIdCesante() {
		return this.idCesante;
	}

	public void setIdCesante(Integer idCesante) {
		this.idCesante = idCesante;
	}

	public BigDecimal getDeducMinimoAsegLcRotura() {
		return this.deducMinimoAsegLcRotura;
	}

	public void setDeducMinimoAsegLcRotura(BigDecimal deducMinimoAsegLcRotura) {
		this.deducMinimoAsegLcRotura = deducMinimoAsegLcRotura;
	}

	public BigDecimal getDeducMinimoLcRotura() {
		return this.deducMinimoLcRotura;
	}

	public void setDeducMinimoLcRotura(BigDecimal deducMinimoLcRotura) {
		this.deducMinimoLcRotura = deducMinimoLcRotura;
	}

	public BigDecimal getDeducNumDias() {
		return this.deducNumDias;
	}

	public void setDeducNumDias(BigDecimal deducNumDias) {
		this.deducNumDias = deducNumDias;
	}

	public Integer getPeriodIndemnizacionLc() {
		return this.periodIndemnizacionLc;
	}

	public void setPeriodIndemnizacionLc(Integer periodIndemnizacionLc) {
		this.periodIndemnizacionLc = periodIndemnizacionLc;
	}

	public BigDecimal getTasaLcRotura() {
		return this.tasaLcRotura;
	}

	public void setTasaLcRotura(BigDecimal tasaLcRotura) {
		this.tasaLcRotura = tasaLcRotura;
	}

	public BigDecimal getUtilidadBrutaLcRotura() {
		return this.utilidadBrutaLcRotura;
	}

	public void setUtilidadBrutaLcRotura(BigDecimal utilidadBrutaLcRotura) {
		this.utilidadBrutaLcRotura = utilidadBrutaLcRotura;
	}

	public List<ClaAddLcRotura> getClaAddLcRoturas() {
		return this.claAddLcRoturas;
	}

	public void setClaAddLcRoturas(List<ClaAddLcRotura> claAddLcRoturas) {
		this.claAddLcRoturas = claAddLcRoturas;
	}

	public ClaAddLcRotura addClaAddLcRotura(ClaAddLcRotura claAddLcRotura) {
		getClaAddLcRoturas().add(claAddLcRotura);
		claAddLcRotura.setRamoCesanteRoturaMaq(this);

		return claAddLcRotura;
	}

	public ClaAddLcRotura removeClaAddLcRotura(ClaAddLcRotura claAddLcRotura) {
		getClaAddLcRoturas().remove(claAddLcRotura);
		claAddLcRotura.setRamoCesanteRoturaMaq(null);

		return claAddLcRotura;
	}

	public List<CobertAddCesante> getCobertAddCesantes() {
		return this.cobertAddCesantes;
	}

	public void setCobertAddCesantes(List<CobertAddCesante> cobertAddCesantes) {
		this.cobertAddCesantes = cobertAddCesantes;
	}

	public CobertAddCesante addCobertAddCesante(CobertAddCesante cobertAddCesante) {
		getCobertAddCesantes().add(cobertAddCesante);
		cobertAddCesante.setRamoCesanteRoturaMaq(this);

		return cobertAddCesante;
	}

	public CobertAddCesante removeCobertAddCesante(CobertAddCesante cobertAddCesante) {
		getCobertAddCesantes().remove(cobertAddCesante);
		cobertAddCesante.setRamoCesanteRoturaMaq(null);

		return cobertAddCesante;
	}

	public List<CobertCesante> getCobertCesantes() {
		return this.cobertCesantes;
	}

	public void setCobertCesantes(List<CobertCesante> cobertCesantes) {
		this.cobertCesantes = cobertCesantes;
	}

	public CobertCesante addCobertCesante(CobertCesante cobertCesante) {
		getCobertCesantes().add(cobertCesante);
		cobertCesante.setRamoCesanteRoturaMaq(this);

		return cobertCesante;
	}

	public CobertCesante removeCobertCesante(CobertCesante cobertCesante) {
		getCobertCesantes().remove(cobertCesante);
		cobertCesante.setRamoCesanteRoturaMaq(null);

		return cobertCesante;
	}

	public List<ObjAsegCesante> getObjAsegCesantes() {
		return this.objAsegCesantes;
	}

	public void setObjAsegCesantes(List<ObjAsegCesante> objAsegCesantes) {
		this.objAsegCesantes = objAsegCesantes;
	}

	public ObjAsegCesante addObjAsegCesante(ObjAsegCesante objAsegCesante) {
		getObjAsegCesantes().add(objAsegCesante);
		objAsegCesante.setRamoCesanteRoturaMaq(this);

		return objAsegCesante;
	}

	public ObjAsegCesante removeObjAsegCesante(ObjAsegCesante objAsegCesante) {
		getObjAsegCesantes().remove(objAsegCesante);
		objAsegCesante.setRamoCesanteRoturaMaq(null);

		return objAsegCesante;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}