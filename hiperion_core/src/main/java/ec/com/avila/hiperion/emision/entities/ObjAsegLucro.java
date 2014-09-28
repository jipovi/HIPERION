package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the obj_aseg_lucro database table.
 * 
 */
@Entity
@Table(name="obj_aseg_lucro")
public class ObjAsegLucro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_objeto_aseg_lucro")
	private Integer idObjetoAsegLucro;

	@Column(name="detalle_obj_lc_incendio")
	private String detalleObjLcIncendio;

	@Column(name="forma_seguro_lc")
	private String formaSeguroLc;

	@Column(name="item_obj_lc_incendio")
	private Integer itemObjLcIncendio;

	@Column(name="ubicacion_obj_lc_incendio")
	private String ubicacionObjLcIncendio;

	@Column(name="utilidad_bruta_lc_incendio")
	private BigDecimal utilidadBrutaLcIncendio;

	//bi-directional many-to-one association to RamoLucroCesanteIncendio
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_lucro")
	private RamoLucroCesanteIncendio ramoLucroCesanteIncendio;

	public ObjAsegLucro() {
	}

	public Integer getIdObjetoAsegLucro() {
		return this.idObjetoAsegLucro;
	}

	public void setIdObjetoAsegLucro(Integer idObjetoAsegLucro) {
		this.idObjetoAsegLucro = idObjetoAsegLucro;
	}

	public String getDetalleObjLcIncendio() {
		return this.detalleObjLcIncendio;
	}

	public void setDetalleObjLcIncendio(String detalleObjLcIncendio) {
		this.detalleObjLcIncendio = detalleObjLcIncendio;
	}

	public String getFormaSeguroLc() {
		return this.formaSeguroLc;
	}

	public void setFormaSeguroLc(String formaSeguroLc) {
		this.formaSeguroLc = formaSeguroLc;
	}

	public Integer getItemObjLcIncendio() {
		return this.itemObjLcIncendio;
	}

	public void setItemObjLcIncendio(Integer itemObjLcIncendio) {
		this.itemObjLcIncendio = itemObjLcIncendio;
	}

	public String getUbicacionObjLcIncendio() {
		return this.ubicacionObjLcIncendio;
	}

	public void setUbicacionObjLcIncendio(String ubicacionObjLcIncendio) {
		this.ubicacionObjLcIncendio = ubicacionObjLcIncendio;
	}

	public BigDecimal getUtilidadBrutaLcIncendio() {
		return this.utilidadBrutaLcIncendio;
	}

	public void setUtilidadBrutaLcIncendio(BigDecimal utilidadBrutaLcIncendio) {
		this.utilidadBrutaLcIncendio = utilidadBrutaLcIncendio;
	}

	public RamoLucroCesanteIncendio getRamoLucroCesanteIncendio() {
		return this.ramoLucroCesanteIncendio;
	}

	public void setRamoLucroCesanteIncendio(RamoLucroCesanteIncendio ramoLucroCesanteIncendio) {
		this.ramoLucroCesanteIncendio = ramoLucroCesanteIncendio;
	}

}