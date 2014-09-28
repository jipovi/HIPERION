package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the dependientes database table.
 * 
 */
@Entity
@Table(name="dependientes")
public class Dependiente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_dependientes")
	private Integer idDependientes;

	@Column(name="cedula_dep_asm")
	private String cedulaDepAsm;

	@Column(name="edad_dep_asm")
	private Integer edadDepAsm;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento_dep")
	private Date fechaNacimientoDep;

	@Column(name="nombre_dep_asm")
	private String nombreDepAsm;

	//bi-directional many-to-one association to RamoAsistenciaMedica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ast_medica")
	private RamoAsistenciaMedica ramoAsistenciaMedica;

	public Dependiente() {
	}

	public Integer getIdDependientes() {
		return this.idDependientes;
	}

	public void setIdDependientes(Integer idDependientes) {
		this.idDependientes = idDependientes;
	}

	public String getCedulaDepAsm() {
		return this.cedulaDepAsm;
	}

	public void setCedulaDepAsm(String cedulaDepAsm) {
		this.cedulaDepAsm = cedulaDepAsm;
	}

	public Integer getEdadDepAsm() {
		return this.edadDepAsm;
	}

	public void setEdadDepAsm(Integer edadDepAsm) {
		this.edadDepAsm = edadDepAsm;
	}

	public Date getFechaNacimientoDep() {
		return this.fechaNacimientoDep;
	}

	public void setFechaNacimientoDep(Date fechaNacimientoDep) {
		this.fechaNacimientoDep = fechaNacimientoDep;
	}

	public String getNombreDepAsm() {
		return this.nombreDepAsm;
	}

	public void setNombreDepAsm(String nombreDepAsm) {
		this.nombreDepAsm = nombreDepAsm;
	}

	public RamoAsistenciaMedica getRamoAsistenciaMedica() {
		return this.ramoAsistenciaMedica;
	}

	public void setRamoAsistenciaMedica(RamoAsistenciaMedica ramoAsistenciaMedica) {
		this.ramoAsistenciaMedica = ramoAsistenciaMedica;
	}

}