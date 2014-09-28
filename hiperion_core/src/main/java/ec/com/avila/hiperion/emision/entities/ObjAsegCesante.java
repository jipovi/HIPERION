package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the obj_aseg_cesante database table.
 * 
 */
@Entity
@Table(name="obj_aseg_cesante")
public class ObjAsegCesante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_objeto_aseg_cesante")
	private Integer idObjetoAsegCesante;

	@Column(name="des_obj_lc_rotura")
	private String desObjLcRotura;

	@Column(name="item_obj_lc_rotura")
	private Integer itemObjLcRotura;

	@Column(name="ubicacion_obj_lc_rotura")
	private String ubicacionObjLcRotura;

	@Column(name="valor_aseg_obj_lc_rotura")
	private BigDecimal valorAsegObjLcRotura;

	//bi-directional many-to-one association to RamoCesanteRoturaMaq
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cesante")
	private RamoCesanteRoturaMaq ramoCesanteRoturaMaq;

	public ObjAsegCesante() {
	}

	public Integer getIdObjetoAsegCesante() {
		return this.idObjetoAsegCesante;
	}

	public void setIdObjetoAsegCesante(Integer idObjetoAsegCesante) {
		this.idObjetoAsegCesante = idObjetoAsegCesante;
	}

	public String getDesObjLcRotura() {
		return this.desObjLcRotura;
	}

	public void setDesObjLcRotura(String desObjLcRotura) {
		this.desObjLcRotura = desObjLcRotura;
	}

	public Integer getItemObjLcRotura() {
		return this.itemObjLcRotura;
	}

	public void setItemObjLcRotura(Integer itemObjLcRotura) {
		this.itemObjLcRotura = itemObjLcRotura;
	}

	public String getUbicacionObjLcRotura() {
		return this.ubicacionObjLcRotura;
	}

	public void setUbicacionObjLcRotura(String ubicacionObjLcRotura) {
		this.ubicacionObjLcRotura = ubicacionObjLcRotura;
	}

	public BigDecimal getValorAsegObjLcRotura() {
		return this.valorAsegObjLcRotura;
	}

	public void setValorAsegObjLcRotura(BigDecimal valorAsegObjLcRotura) {
		this.valorAsegObjLcRotura = valorAsegObjLcRotura;
	}

	public RamoCesanteRoturaMaq getRamoCesanteRoturaMaq() {
		return this.ramoCesanteRoturaMaq;
	}

	public void setRamoCesanteRoturaMaq(RamoCesanteRoturaMaq ramoCesanteRoturaMaq) {
		this.ramoCesanteRoturaMaq = ramoCesanteRoturaMaq;
	}

}