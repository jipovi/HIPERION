package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_garantia_aduanera database table.
 * 
 */
@Entity
@Table(name="ramo_garantia_aduanera")
public class RamoGarantiaAduanera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_aduanera")
	private Integer idAduanera;

	@Column(name="obj_asg_aduanera")
	private String objAsgAduanera;

	@Column(name="sector_aduanera")
	private Integer sectorAduanera;

	@Column(name="tipo_contragarantia_aduanera")
	private BigDecimal tipoContragarantiaAduanera;

	@Column(name="valor_poliza_aduanera")
	private String valorPolizaAduanera;

	//bi-directional many-to-one association to CobertAduanera
	@OneToMany(mappedBy="ramoGarantiaAduanera")
	private List<CobertAduanera> cobertAduaneras;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoGarantiaAduanera() {
	}

	public Integer getIdAduanera() {
		return this.idAduanera;
	}

	public void setIdAduanera(Integer idAduanera) {
		this.idAduanera = idAduanera;
	}

	public String getObjAsgAduanera() {
		return this.objAsgAduanera;
	}

	public void setObjAsgAduanera(String objAsgAduanera) {
		this.objAsgAduanera = objAsgAduanera;
	}

	public Integer getSectorAduanera() {
		return this.sectorAduanera;
	}

	public void setSectorAduanera(Integer sectorAduanera) {
		this.sectorAduanera = sectorAduanera;
	}

	public BigDecimal getTipoContragarantiaAduanera() {
		return this.tipoContragarantiaAduanera;
	}

	public void setTipoContragarantiaAduanera(BigDecimal tipoContragarantiaAduanera) {
		this.tipoContragarantiaAduanera = tipoContragarantiaAduanera;
	}

	public String getValorPolizaAduanera() {
		return this.valorPolizaAduanera;
	}

	public void setValorPolizaAduanera(String valorPolizaAduanera) {
		this.valorPolizaAduanera = valorPolizaAduanera;
	}

	public List<CobertAduanera> getCobertAduaneras() {
		return this.cobertAduaneras;
	}

	public void setCobertAduaneras(List<CobertAduanera> cobertAduaneras) {
		this.cobertAduaneras = cobertAduaneras;
	}

	public CobertAduanera addCobertAduanera(CobertAduanera cobertAduanera) {
		getCobertAduaneras().add(cobertAduanera);
		cobertAduanera.setRamoGarantiaAduanera(this);

		return cobertAduanera;
	}

	public CobertAduanera removeCobertAduanera(CobertAduanera cobertAduanera) {
		getCobertAduaneras().remove(cobertAduanera);
		cobertAduanera.setRamoGarantiaAduanera(null);

		return cobertAduanera;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}