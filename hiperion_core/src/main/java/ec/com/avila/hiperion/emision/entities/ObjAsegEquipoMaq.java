package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the obj_aseg_equipo_maq database table.
 * 
 */
@Entity
@Table(name="obj_aseg_equipo_maq")
public class ObjAsegEquipoMaq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_objeto_equipo_maq")
	private Integer idObjetoEquipoMaq;

	@Column(name="anio_obj_maq")
	private Integer anioObjMaq;

	@Column(name="chasis_obj_eq_maq")
	private String chasisObjEqMaq;

	@Column(name="color_obj_eq_maq")
	private String colorObjEqMaq;

	@Column(name="item_obj_eq_maq")
	private Integer itemObjEqMaq;

	@Column(name="marca_obj_eq_maq")
	private String marcaObjEqMaq;

	@Column(name="modelo_obj_eq_maq")
	private String modeloObjEqMaq;

	@Column(name="motor_objj_eq_maq")
	private String motorObjjEqMaq;

	@Column(name="numero_serie_obj_maq")
	private String numeroSerieObjMaq;

	@Column(name="valor_aseg_obj_eq_maq")
	private BigDecimal valorAsegObjEqMaq;

	//bi-directional many-to-one association to RamoEquipoMaquinaria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_equipo_maquinaria")
	private RamoEquipoMaquinaria ramoEquipoMaquinaria;

	public ObjAsegEquipoMaq() {
	}

	public Integer getIdObjetoEquipoMaq() {
		return this.idObjetoEquipoMaq;
	}

	public void setIdObjetoEquipoMaq(Integer idObjetoEquipoMaq) {
		this.idObjetoEquipoMaq = idObjetoEquipoMaq;
	}

	public Integer getAnioObjMaq() {
		return this.anioObjMaq;
	}

	public void setAnioObjMaq(Integer anioObjMaq) {
		this.anioObjMaq = anioObjMaq;
	}

	public String getChasisObjEqMaq() {
		return this.chasisObjEqMaq;
	}

	public void setChasisObjEqMaq(String chasisObjEqMaq) {
		this.chasisObjEqMaq = chasisObjEqMaq;
	}

	public String getColorObjEqMaq() {
		return this.colorObjEqMaq;
	}

	public void setColorObjEqMaq(String colorObjEqMaq) {
		this.colorObjEqMaq = colorObjEqMaq;
	}

	public Integer getItemObjEqMaq() {
		return this.itemObjEqMaq;
	}

	public void setItemObjEqMaq(Integer itemObjEqMaq) {
		this.itemObjEqMaq = itemObjEqMaq;
	}

	public String getMarcaObjEqMaq() {
		return this.marcaObjEqMaq;
	}

	public void setMarcaObjEqMaq(String marcaObjEqMaq) {
		this.marcaObjEqMaq = marcaObjEqMaq;
	}

	public String getModeloObjEqMaq() {
		return this.modeloObjEqMaq;
	}

	public void setModeloObjEqMaq(String modeloObjEqMaq) {
		this.modeloObjEqMaq = modeloObjEqMaq;
	}

	public String getMotorObjjEqMaq() {
		return this.motorObjjEqMaq;
	}

	public void setMotorObjjEqMaq(String motorObjjEqMaq) {
		this.motorObjjEqMaq = motorObjjEqMaq;
	}

	public String getNumeroSerieObjMaq() {
		return this.numeroSerieObjMaq;
	}

	public void setNumeroSerieObjMaq(String numeroSerieObjMaq) {
		this.numeroSerieObjMaq = numeroSerieObjMaq;
	}

	public BigDecimal getValorAsegObjEqMaq() {
		return this.valorAsegObjEqMaq;
	}

	public void setValorAsegObjEqMaq(BigDecimal valorAsegObjEqMaq) {
		this.valorAsegObjEqMaq = valorAsegObjEqMaq;
	}

	public RamoEquipoMaquinaria getRamoEquipoMaquinaria() {
		return this.ramoEquipoMaquinaria;
	}

	public void setRamoEquipoMaquinaria(RamoEquipoMaquinaria ramoEquipoMaquinaria) {
		this.ramoEquipoMaquinaria = ramoEquipoMaquinaria;
	}

}