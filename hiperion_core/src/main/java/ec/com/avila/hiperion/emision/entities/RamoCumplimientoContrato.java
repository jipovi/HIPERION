package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_cumplimiento_contrato database table.
 * 
 */
@Entity
@Table(name="ramo_cumplimiento_contrato")
public class RamoCumplimientoContrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_contrato")
	private Integer idContrato;

	@Column(name="objeto_aseg_contrato")
	private String objetoAsegContrato;

	@Column(name="tipo_contragarantia_contrato")
	private String tipoContragarantiaContrato;

	@Column(name="valor_asegurado_contrato")
	private BigDecimal valorAseguradoContrato;

	@Column(name="valor_contrato")
	private BigDecimal valorContrato;

	//bi-directional many-to-one association to CobertContrato
	@OneToMany(mappedBy="ramoCumplimientoContrato")
	private List<CobertContrato> cobertContratos;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoCumplimientoContrato() {
	}

	public Integer getIdContrato() {
		return this.idContrato;
	}

	public void setIdContrato(Integer idContrato) {
		this.idContrato = idContrato;
	}

	public String getObjetoAsegContrato() {
		return this.objetoAsegContrato;
	}

	public void setObjetoAsegContrato(String objetoAsegContrato) {
		this.objetoAsegContrato = objetoAsegContrato;
	}

	public String getTipoContragarantiaContrato() {
		return this.tipoContragarantiaContrato;
	}

	public void setTipoContragarantiaContrato(String tipoContragarantiaContrato) {
		this.tipoContragarantiaContrato = tipoContragarantiaContrato;
	}

	public BigDecimal getValorAseguradoContrato() {
		return this.valorAseguradoContrato;
	}

	public void setValorAseguradoContrato(BigDecimal valorAseguradoContrato) {
		this.valorAseguradoContrato = valorAseguradoContrato;
	}

	public BigDecimal getValorContrato() {
		return this.valorContrato;
	}

	public void setValorContrato(BigDecimal valorContrato) {
		this.valorContrato = valorContrato;
	}

	public List<CobertContrato> getCobertContratos() {
		return this.cobertContratos;
	}

	public void setCobertContratos(List<CobertContrato> cobertContratos) {
		this.cobertContratos = cobertContratos;
	}

	public CobertContrato addCobertContrato(CobertContrato cobertContrato) {
		getCobertContratos().add(cobertContrato);
		cobertContrato.setRamoCumplimientoContrato(this);

		return cobertContrato;
	}

	public CobertContrato removeCobertContrato(CobertContrato cobertContrato) {
		getCobertContratos().remove(cobertContrato);
		cobertContrato.setRamoCumplimientoContrato(null);

		return cobertContrato;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}