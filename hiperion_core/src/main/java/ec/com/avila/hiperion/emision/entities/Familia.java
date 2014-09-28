package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the familia database table.
 * 
 */
@Entity
public class Familia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_familia")
	private Integer idFamilia;

	@Column(name="cedula_flia_asm")
	private String cedulaFliaAsm;

	@Column(name="edad_flia_asm")
	private Integer edadFliaAsm;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento_flia_asm")
	private Date fechaNacimientoFliaAsm;

	@Column(name="nombre_familia")
	private String nombreFamilia;

	@Column(name="parentezco_aflia_asm")
	private String parentezcoAfliaAsm;

	//bi-directional many-to-one association to RamoAsistenciaMedica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ast_medica")
	private RamoAsistenciaMedica ramoAsistenciaMedica;

	public Familia() {
	}

	public Integer getIdFamilia() {
		return this.idFamilia;
	}

	public void setIdFamilia(Integer idFamilia) {
		this.idFamilia = idFamilia;
	}

	public String getCedulaFliaAsm() {
		return this.cedulaFliaAsm;
	}

	public void setCedulaFliaAsm(String cedulaFliaAsm) {
		this.cedulaFliaAsm = cedulaFliaAsm;
	}

	public Integer getEdadFliaAsm() {
		return this.edadFliaAsm;
	}

	public void setEdadFliaAsm(Integer edadFliaAsm) {
		this.edadFliaAsm = edadFliaAsm;
	}

	public Date getFechaNacimientoFliaAsm() {
		return this.fechaNacimientoFliaAsm;
	}

	public void setFechaNacimientoFliaAsm(Date fechaNacimientoFliaAsm) {
		this.fechaNacimientoFliaAsm = fechaNacimientoFliaAsm;
	}

	public String getNombreFamilia() {
		return this.nombreFamilia;
	}

	public void setNombreFamilia(String nombreFamilia) {
		this.nombreFamilia = nombreFamilia;
	}

	public String getParentezcoAfliaAsm() {
		return this.parentezcoAfliaAsm;
	}

	public void setParentezcoAfliaAsm(String parentezcoAfliaAsm) {
		this.parentezcoAfliaAsm = parentezcoAfliaAsm;
	}

	public RamoAsistenciaMedica getRamoAsistenciaMedica() {
		return this.ramoAsistenciaMedica;
	}

	public void setRamoAsistenciaMedica(RamoAsistenciaMedica ramoAsistenciaMedica) {
		this.ramoAsistenciaMedica = ramoAsistenciaMedica;
	}

}