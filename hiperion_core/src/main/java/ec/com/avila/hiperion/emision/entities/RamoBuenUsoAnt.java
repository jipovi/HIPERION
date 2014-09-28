package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_buen_uso_ant database table.
 * 
 */
@Entity
@Table(name="ramo_buen_uso_ant")
public class RamoBuenUsoAnt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ind_buen_uso_ant")
	private Integer indBuenUsoAnt;

	@Column(name="obj_aseg_anticipo")
	private String objAsegAnticipo;

	@Column(name="sector_anticipo")
	private Integer sectorAnticipo;

	@Column(name="valor_contrato_anticipo")
	private BigDecimal valorContratoAnticipo;

	@Column(name="valor_poliza_anticipo")
	private BigDecimal valorPolizaAnticipo;

	//bi-directional many-to-one association to CobertBuenUsoAnt
	@OneToMany(mappedBy="ramoBuenUsoAnt")
	private List<CobertBuenUsoAnt> cobertBuenUsoAnts;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoBuenUsoAnt() {
	}

	public Integer getIndBuenUsoAnt() {
		return this.indBuenUsoAnt;
	}

	public void setIndBuenUsoAnt(Integer indBuenUsoAnt) {
		this.indBuenUsoAnt = indBuenUsoAnt;
	}

	public String getObjAsegAnticipo() {
		return this.objAsegAnticipo;
	}

	public void setObjAsegAnticipo(String objAsegAnticipo) {
		this.objAsegAnticipo = objAsegAnticipo;
	}

	public Integer getSectorAnticipo() {
		return this.sectorAnticipo;
	}

	public void setSectorAnticipo(Integer sectorAnticipo) {
		this.sectorAnticipo = sectorAnticipo;
	}

	public BigDecimal getValorContratoAnticipo() {
		return this.valorContratoAnticipo;
	}

	public void setValorContratoAnticipo(BigDecimal valorContratoAnticipo) {
		this.valorContratoAnticipo = valorContratoAnticipo;
	}

	public BigDecimal getValorPolizaAnticipo() {
		return this.valorPolizaAnticipo;
	}

	public void setValorPolizaAnticipo(BigDecimal valorPolizaAnticipo) {
		this.valorPolizaAnticipo = valorPolizaAnticipo;
	}

	public List<CobertBuenUsoAnt> getCobertBuenUsoAnts() {
		return this.cobertBuenUsoAnts;
	}

	public void setCobertBuenUsoAnts(List<CobertBuenUsoAnt> cobertBuenUsoAnts) {
		this.cobertBuenUsoAnts = cobertBuenUsoAnts;
	}

	public CobertBuenUsoAnt addCobertBuenUsoAnt(CobertBuenUsoAnt cobertBuenUsoAnt) {
		getCobertBuenUsoAnts().add(cobertBuenUsoAnt);
		cobertBuenUsoAnt.setRamoBuenUsoAnt(this);

		return cobertBuenUsoAnt;
	}

	public CobertBuenUsoAnt removeCobertBuenUsoAnt(CobertBuenUsoAnt cobertBuenUsoAnt) {
		getCobertBuenUsoAnts().remove(cobertBuenUsoAnt);
		cobertBuenUsoAnt.setRamoBuenUsoAnt(null);

		return cobertBuenUsoAnt;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}