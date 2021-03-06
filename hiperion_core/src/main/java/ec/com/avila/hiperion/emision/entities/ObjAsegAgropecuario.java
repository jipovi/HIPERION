package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the obj_aseg_agropecuario database table.
 * 
 */
@Entity
@Table(name="obj_aseg_agropecuario")
public class ObjAsegAgropecuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_obj_agropecuario")
	private Integer idObjAgropecuario;

	@Column(name="color_obj_agro")
	private String colorObjAgro;

	@Column(name="edad_obj_agro")
	private Integer edadObjAgro;

	@Column(name="item_obj_agro")
	private Integer itemObjAgro;

	@Column(name="monto_aseg_obj_agro")
	private BigDecimal montoAsegObjAgro;

	@Column(name="nombre_obj_agro")
	private String nombreObjAgro;

	@Column(name="raza_obj_agro")
	private String razaObjAgro;

	@Column(name="sexo_obj_agro")
	private Integer sexoObjAgro;

	//bi-directional many-to-one association to RamoAgropecuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_agropecuario")
	private RamoAgropecuario ramoAgropecuario;

	public ObjAsegAgropecuario() {
	}

	public Integer getIdObjAgropecuario() {
		return this.idObjAgropecuario;
	}

	public void setIdObjAgropecuario(Integer idObjAgropecuario) {
		this.idObjAgropecuario = idObjAgropecuario;
	}

	public String getColorObjAgro() {
		return this.colorObjAgro;
	}

	public void setColorObjAgro(String colorObjAgro) {
		this.colorObjAgro = colorObjAgro;
	}

	public Integer getEdadObjAgro() {
		return this.edadObjAgro;
	}

	public void setEdadObjAgro(Integer edadObjAgro) {
		this.edadObjAgro = edadObjAgro;
	}

	public Integer getItemObjAgro() {
		return this.itemObjAgro;
	}

	public void setItemObjAgro(Integer itemObjAgro) {
		this.itemObjAgro = itemObjAgro;
	}

	public BigDecimal getMontoAsegObjAgro() {
		return this.montoAsegObjAgro;
	}

	public void setMontoAsegObjAgro(BigDecimal montoAsegObjAgro) {
		this.montoAsegObjAgro = montoAsegObjAgro;
	}

	public String getNombreObjAgro() {
		return this.nombreObjAgro;
	}

	public void setNombreObjAgro(String nombreObjAgro) {
		this.nombreObjAgro = nombreObjAgro;
	}

	public String getRazaObjAgro() {
		return this.razaObjAgro;
	}

	public void setRazaObjAgro(String razaObjAgro) {
		this.razaObjAgro = razaObjAgro;
	}

	public Integer getSexoObjAgro() {
		return this.sexoObjAgro;
	}

	public void setSexoObjAgro(Integer sexoObjAgro) {
		this.sexoObjAgro = sexoObjAgro;
	}

	public RamoAgropecuario getRamoAgropecuario() {
		return this.ramoAgropecuario;
	}

	public void setRamoAgropecuario(RamoAgropecuario ramoAgropecuario) {
		this.ramoAgropecuario = ramoAgropecuario;
	}

}