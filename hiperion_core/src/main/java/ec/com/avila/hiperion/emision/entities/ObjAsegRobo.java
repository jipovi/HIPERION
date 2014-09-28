package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the obj_aseg_robo database table.
 * 
 */
@Entity
@Table(name="obj_aseg_robo")
public class ObjAsegRobo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_objeto_robo")
	private Integer idObjetoRobo;

	@Column(name="detalle_obj_robo")
	private BigDecimal detalleObjRobo;

	@Column(name="dinero_obj_robo")
	private BigDecimal dineroObjRobo;

	@Column(name="item_robo_asalto")
	private Integer itemRoboAsalto;

	@Column(name="joyas_obj_robo")
	private BigDecimal joyasObjRobo;

	@Column(name="maquinaria_obj_robo")
	private BigDecimal maquinariaObjRobo;

	@Column(name="marcaderia_obj_robo")
	private BigDecimal marcaderiaObjRobo;

	@Column(name="muebles_obj_robo")
	private BigDecimal mueblesObjRobo;

	@Column(name="ubicacion_obj_robo")
	private BigDecimal ubicacionObjRobo;

	@Column(name="valor_obj_robo")
	private BigDecimal valorObjRobo;

	//bi-directional many-to-one association to RamoRoboAsalto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_robo")
	private RamoRoboAsalto ramoRoboAsalto;

	public ObjAsegRobo() {
	}

	public Integer getIdObjetoRobo() {
		return this.idObjetoRobo;
	}

	public void setIdObjetoRobo(Integer idObjetoRobo) {
		this.idObjetoRobo = idObjetoRobo;
	}

	public BigDecimal getDetalleObjRobo() {
		return this.detalleObjRobo;
	}

	public void setDetalleObjRobo(BigDecimal detalleObjRobo) {
		this.detalleObjRobo = detalleObjRobo;
	}

	public BigDecimal getDineroObjRobo() {
		return this.dineroObjRobo;
	}

	public void setDineroObjRobo(BigDecimal dineroObjRobo) {
		this.dineroObjRobo = dineroObjRobo;
	}

	public Integer getItemRoboAsalto() {
		return this.itemRoboAsalto;
	}

	public void setItemRoboAsalto(Integer itemRoboAsalto) {
		this.itemRoboAsalto = itemRoboAsalto;
	}

	public BigDecimal getJoyasObjRobo() {
		return this.joyasObjRobo;
	}

	public void setJoyasObjRobo(BigDecimal joyasObjRobo) {
		this.joyasObjRobo = joyasObjRobo;
	}

	public BigDecimal getMaquinariaObjRobo() {
		return this.maquinariaObjRobo;
	}

	public void setMaquinariaObjRobo(BigDecimal maquinariaObjRobo) {
		this.maquinariaObjRobo = maquinariaObjRobo;
	}

	public BigDecimal getMarcaderiaObjRobo() {
		return this.marcaderiaObjRobo;
	}

	public void setMarcaderiaObjRobo(BigDecimal marcaderiaObjRobo) {
		this.marcaderiaObjRobo = marcaderiaObjRobo;
	}

	public BigDecimal getMueblesObjRobo() {
		return this.mueblesObjRobo;
	}

	public void setMueblesObjRobo(BigDecimal mueblesObjRobo) {
		this.mueblesObjRobo = mueblesObjRobo;
	}

	public BigDecimal getUbicacionObjRobo() {
		return this.ubicacionObjRobo;
	}

	public void setUbicacionObjRobo(BigDecimal ubicacionObjRobo) {
		this.ubicacionObjRobo = ubicacionObjRobo;
	}

	public BigDecimal getValorObjRobo() {
		return this.valorObjRobo;
	}

	public void setValorObjRobo(BigDecimal valorObjRobo) {
		this.valorObjRobo = valorObjRobo;
	}

	public RamoRoboAsalto getRamoRoboAsalto() {
		return this.ramoRoboAsalto;
	}

	public void setRamoRoboAsalto(RamoRoboAsalto ramoRoboAsalto) {
		this.ramoRoboAsalto = ramoRoboAsalto;
	}

}