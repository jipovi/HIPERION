package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the obj_aseg_equipo database table.
 * 
 */
@Entity
@Table(name="obj_aseg_equipo")
public class ObjAsegEquipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_objeto_aseg_equipo")
	private Integer idObjetoAsegEquipo;

	@Column(name="detalle_objeto_eq_elec")
	private Integer detalleObjetoEqElec;

	@Column(name="item_obj_eq_elec")
	private Integer itemObjEqElec;

	@Column(name="valor_obj_eq_elec")
	private BigDecimal valorObjEqElec;

	//bi-directional many-to-one association to RamoEquipoElectronico
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_equipo")
	private RamoEquipoElectronico ramoEquipoElectronico;

	public ObjAsegEquipo() {
	}

	public Integer getIdObjetoAsegEquipo() {
		return this.idObjetoAsegEquipo;
	}

	public void setIdObjetoAsegEquipo(Integer idObjetoAsegEquipo) {
		this.idObjetoAsegEquipo = idObjetoAsegEquipo;
	}

	public Integer getDetalleObjetoEqElec() {
		return this.detalleObjetoEqElec;
	}

	public void setDetalleObjetoEqElec(Integer detalleObjetoEqElec) {
		this.detalleObjetoEqElec = detalleObjetoEqElec;
	}

	public Integer getItemObjEqElec() {
		return this.itemObjEqElec;
	}

	public void setItemObjEqElec(Integer itemObjEqElec) {
		this.itemObjEqElec = itemObjEqElec;
	}

	public BigDecimal getValorObjEqElec() {
		return this.valorObjEqElec;
	}

	public void setValorObjEqElec(BigDecimal valorObjEqElec) {
		this.valorObjEqElec = valorObjEqElec;
	}

	public RamoEquipoElectronico getRamoEquipoElectronico() {
		return this.ramoEquipoElectronico;
	}

	public void setRamoEquipoElectronico(RamoEquipoElectronico ramoEquipoElectronico) {
		this.ramoEquipoElectronico = ramoEquipoElectronico;
	}

}