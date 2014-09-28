package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the grupos_vida database table.
 * 
 */
@Entity
@Table(name="grupos_vida")
public class GruposVida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_grupo_vida")
	private Integer idGrupoVida;

	@Column(name="apellido_grupo_vida")
	private String apellidoGrupoVida;

	@Column(name="cedula_grupo_vida")
	private String cedulaGrupoVida;

	@Column(name="edad_grupo_vida")
	private String edadGrupoVida;

	@Column(name="nombre_grupo_vida")
	private String nombreGrupoVida;

	//bi-directional many-to-one association to RamoVida
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_vida")
	private RamoVida ramoVida;

	public GruposVida() {
	}

	public Integer getIdGrupoVida() {
		return this.idGrupoVida;
	}

	public void setIdGrupoVida(Integer idGrupoVida) {
		this.idGrupoVida = idGrupoVida;
	}

	public String getApellidoGrupoVida() {
		return this.apellidoGrupoVida;
	}

	public void setApellidoGrupoVida(String apellidoGrupoVida) {
		this.apellidoGrupoVida = apellidoGrupoVida;
	}

	public String getCedulaGrupoVida() {
		return this.cedulaGrupoVida;
	}

	public void setCedulaGrupoVida(String cedulaGrupoVida) {
		this.cedulaGrupoVida = cedulaGrupoVida;
	}

	public String getEdadGrupoVida() {
		return this.edadGrupoVida;
	}

	public void setEdadGrupoVida(String edadGrupoVida) {
		this.edadGrupoVida = edadGrupoVida;
	}

	public String getNombreGrupoVida() {
		return this.nombreGrupoVida;
	}

	public void setNombreGrupoVida(String nombreGrupoVida) {
		this.nombreGrupoVida = nombreGrupoVida;
	}

	public RamoVida getRamoVida() {
		return this.ramoVida;
	}

	public void setRamoVida(RamoVida ramoVida) {
		this.ramoVida = ramoVida;
	}

}