package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the obj_aseg_responsabilidad database table.
 * 
 */
@Entity
@Table(name="obj_aseg_responsabilidad")
public class ObjAsegResponsabilidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_objeto_aseg_resposabilidad")
	private Integer idObjetoAsegResposabilidad;

	@Column(name="descripcion_resp")
	private String descripcionResp;

	@Column(name="item_resp")
	private Integer itemResp;

	//bi-directional many-to-one association to RamoResponsabilidadCivil
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_responsabilidad")
	private RamoResponsabilidadCivil ramoResponsabilidadCivil;

	public ObjAsegResponsabilidad() {
	}

	public Integer getIdObjetoAsegResposabilidad() {
		return this.idObjetoAsegResposabilidad;
	}

	public void setIdObjetoAsegResposabilidad(Integer idObjetoAsegResposabilidad) {
		this.idObjetoAsegResposabilidad = idObjetoAsegResposabilidad;
	}

	public String getDescripcionResp() {
		return this.descripcionResp;
	}

	public void setDescripcionResp(String descripcionResp) {
		this.descripcionResp = descripcionResp;
	}

	public Integer getItemResp() {
		return this.itemResp;
	}

	public void setItemResp(Integer itemResp) {
		this.itemResp = itemResp;
	}

	public RamoResponsabilidadCivil getRamoResponsabilidadCivil() {
		return this.ramoResponsabilidadCivil;
	}

	public void setRamoResponsabilidadCivil(RamoResponsabilidadCivil ramoResponsabilidadCivil) {
		this.ramoResponsabilidadCivil = ramoResponsabilidadCivil;
	}

}