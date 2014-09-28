package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the obj_aseg_transporte database table.
 * 
 */
@Entity
@Table(name="obj_aseg_transporte")
public class ObjAsegTransporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_obj_asg_transporte")
	private Integer idObjAsgTransporte;

	@Column(name="item_transporte")
	private Integer itemTransporte;

	@Column(name="limite_embarque_transporte")
	private BigDecimal limiteEmbarqueTransporte;

	@Column(name="limite_movilizacion_anual")
	private BigDecimal limiteMovilizacionAnual;

	@Column(name="medio_transporte")
	private Integer medioTransporte;

	@Column(name="tipo_embalaje")
	private String tipoEmbalaje;

	@Column(name="trayecto_desde")
	private String trayectoDesde;

	@Column(name="trayecto_hasta")
	private String trayectoHasta;

	private String valuacion;

	//bi-directional many-to-one association to RamoTransporte
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_transporte")
	private RamoTransporte ramoTransporte;

	public ObjAsegTransporte() {
	}

	public Integer getIdObjAsgTransporte() {
		return this.idObjAsgTransporte;
	}

	public void setIdObjAsgTransporte(Integer idObjAsgTransporte) {
		this.idObjAsgTransporte = idObjAsgTransporte;
	}

	public Integer getItemTransporte() {
		return this.itemTransporte;
	}

	public void setItemTransporte(Integer itemTransporte) {
		this.itemTransporte = itemTransporte;
	}

	public BigDecimal getLimiteEmbarqueTransporte() {
		return this.limiteEmbarqueTransporte;
	}

	public void setLimiteEmbarqueTransporte(BigDecimal limiteEmbarqueTransporte) {
		this.limiteEmbarqueTransporte = limiteEmbarqueTransporte;
	}

	public BigDecimal getLimiteMovilizacionAnual() {
		return this.limiteMovilizacionAnual;
	}

	public void setLimiteMovilizacionAnual(BigDecimal limiteMovilizacionAnual) {
		this.limiteMovilizacionAnual = limiteMovilizacionAnual;
	}

	public Integer getMedioTransporte() {
		return this.medioTransporte;
	}

	public void setMedioTransporte(Integer medioTransporte) {
		this.medioTransporte = medioTransporte;
	}

	public String getTipoEmbalaje() {
		return this.tipoEmbalaje;
	}

	public void setTipoEmbalaje(String tipoEmbalaje) {
		this.tipoEmbalaje = tipoEmbalaje;
	}

	public String getTrayectoDesde() {
		return this.trayectoDesde;
	}

	public void setTrayectoDesde(String trayectoDesde) {
		this.trayectoDesde = trayectoDesde;
	}

	public String getTrayectoHasta() {
		return this.trayectoHasta;
	}

	public void setTrayectoHasta(String trayectoHasta) {
		this.trayectoHasta = trayectoHasta;
	}

	public String getValuacion() {
		return this.valuacion;
	}

	public void setValuacion(String valuacion) {
		this.valuacion = valuacion;
	}

	public RamoTransporte getRamoTransporte() {
		return this.ramoTransporte;
	}

	public void setRamoTransporte(RamoTransporte ramoTransporte) {
		this.ramoTransporte = ramoTransporte;
	}

}