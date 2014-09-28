package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_lucro_cesante_incendio database table.
 * 
 */
@Entity
@Table(name="ramo_lucro_cesante_incendio")
public class RamoLucroCesanteIncendio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_lucro")
	private Integer idLucro;

	@Column(name="deduc_catastrofico_lc")
	private BigDecimal deducCatastroficoLc;

	@Column(name="deduc_otros_lc")
	private BigDecimal deducOtrosLc;

	@Column(name="periodo_indemnizacion")
	private Integer periodoIndemnizacion;

	@Column(name="tasa_comprensiva_lc")
	private BigDecimal tasaComprensivaLc;

	@Column(name="valor_items_lc")
	private BigDecimal valorItemsLc;

	//bi-directional many-to-one association to ClausulasAddLucro
	@OneToMany(mappedBy="ramoLucroCesanteIncendio")
	private List<ClausulasAddLucro> clausulasAddLucros;

	//bi-directional many-to-one association to CobertLucro
	@OneToMany(mappedBy="ramoLucroCesanteIncendio")
	private List<CobertLucro> cobertLucros;

	//bi-directional many-to-one association to ObjAsegLucro
	@OneToMany(mappedBy="ramoLucroCesanteIncendio")
	private List<ObjAsegLucro> objAsegLucros;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoLucroCesanteIncendio() {
	}

	public Integer getIdLucro() {
		return this.idLucro;
	}

	public void setIdLucro(Integer idLucro) {
		this.idLucro = idLucro;
	}

	public BigDecimal getDeducCatastroficoLc() {
		return this.deducCatastroficoLc;
	}

	public void setDeducCatastroficoLc(BigDecimal deducCatastroficoLc) {
		this.deducCatastroficoLc = deducCatastroficoLc;
	}

	public BigDecimal getDeducOtrosLc() {
		return this.deducOtrosLc;
	}

	public void setDeducOtrosLc(BigDecimal deducOtrosLc) {
		this.deducOtrosLc = deducOtrosLc;
	}

	public Integer getPeriodoIndemnizacion() {
		return this.periodoIndemnizacion;
	}

	public void setPeriodoIndemnizacion(Integer periodoIndemnizacion) {
		this.periodoIndemnizacion = periodoIndemnizacion;
	}

	public BigDecimal getTasaComprensivaLc() {
		return this.tasaComprensivaLc;
	}

	public void setTasaComprensivaLc(BigDecimal tasaComprensivaLc) {
		this.tasaComprensivaLc = tasaComprensivaLc;
	}

	public BigDecimal getValorItemsLc() {
		return this.valorItemsLc;
	}

	public void setValorItemsLc(BigDecimal valorItemsLc) {
		this.valorItemsLc = valorItemsLc;
	}

	public List<ClausulasAddLucro> getClausulasAddLucros() {
		return this.clausulasAddLucros;
	}

	public void setClausulasAddLucros(List<ClausulasAddLucro> clausulasAddLucros) {
		this.clausulasAddLucros = clausulasAddLucros;
	}

	public ClausulasAddLucro addClausulasAddLucro(ClausulasAddLucro clausulasAddLucro) {
		getClausulasAddLucros().add(clausulasAddLucro);
		clausulasAddLucro.setRamoLucroCesanteIncendio(this);

		return clausulasAddLucro;
	}

	public ClausulasAddLucro removeClausulasAddLucro(ClausulasAddLucro clausulasAddLucro) {
		getClausulasAddLucros().remove(clausulasAddLucro);
		clausulasAddLucro.setRamoLucroCesanteIncendio(null);

		return clausulasAddLucro;
	}

	public List<CobertLucro> getCobertLucros() {
		return this.cobertLucros;
	}

	public void setCobertLucros(List<CobertLucro> cobertLucros) {
		this.cobertLucros = cobertLucros;
	}

	public CobertLucro addCobertLucro(CobertLucro cobertLucro) {
		getCobertLucros().add(cobertLucro);
		cobertLucro.setRamoLucroCesanteIncendio(this);

		return cobertLucro;
	}

	public CobertLucro removeCobertLucro(CobertLucro cobertLucro) {
		getCobertLucros().remove(cobertLucro);
		cobertLucro.setRamoLucroCesanteIncendio(null);

		return cobertLucro;
	}

	public List<ObjAsegLucro> getObjAsegLucros() {
		return this.objAsegLucros;
	}

	public void setObjAsegLucros(List<ObjAsegLucro> objAsegLucros) {
		this.objAsegLucros = objAsegLucros;
	}

	public ObjAsegLucro addObjAsegLucro(ObjAsegLucro objAsegLucro) {
		getObjAsegLucros().add(objAsegLucro);
		objAsegLucro.setRamoLucroCesanteIncendio(this);

		return objAsegLucro;
	}

	public ObjAsegLucro removeObjAsegLucro(ObjAsegLucro objAsegLucro) {
		getObjAsegLucros().remove(objAsegLucro);
		objAsegLucro.setRamoLucroCesanteIncendio(null);

		return objAsegLucro;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}