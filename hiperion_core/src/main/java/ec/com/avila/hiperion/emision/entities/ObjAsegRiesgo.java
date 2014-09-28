package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the obj_aseg_riesgos database table.
 * 
 */
@Entity
@Table(name="obj_aseg_riesgos")
public class ObjAsegRiesgo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_obj_contratista3")
	private Integer idObjContratista3;

	@Column(name="detalle_obj_riesgos")
	private String detalleObjRiesgos;

	//bi-directional many-to-one association to RamoRiesgosEsp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_riesgo")
	private RamoRiesgosEsp ramoRiesgosEsp;

	public ObjAsegRiesgo() {
	}

	public Integer getIdObjContratista3() {
		return this.idObjContratista3;
	}

	public void setIdObjContratista3(Integer idObjContratista3) {
		this.idObjContratista3 = idObjContratista3;
	}

	public String getDetalleObjRiesgos() {
		return this.detalleObjRiesgos;
	}

	public void setDetalleObjRiesgos(String detalleObjRiesgos) {
		this.detalleObjRiesgos = detalleObjRiesgos;
	}

	public RamoRiesgosEsp getRamoRiesgosEsp() {
		return this.ramoRiesgosEsp;
	}

	public void setRamoRiesgosEsp(RamoRiesgosEsp ramoRiesgosEsp) {
		this.ramoRiesgosEsp = ramoRiesgosEsp;
	}

}