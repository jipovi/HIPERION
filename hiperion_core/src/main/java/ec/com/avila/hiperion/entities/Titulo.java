package ec.com.avila.hiperion.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the titulo database table.
 * 
 */
@Entity
public class Titulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_titulo")
	private Integer idTitulo;

	private String titulo;

	//bi-directional many-to-one association to DetalleAnexo
	@OneToMany(mappedBy="titulo")
	private List<DetalleAnexo> detalleAnexos;

	public Titulo() {
	}

	public Integer getIdTitulo() {
		return this.idTitulo;
	}

	public void setIdTitulo(Integer idTitulo) {
		this.idTitulo = idTitulo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<DetalleAnexo> getDetalleAnexos() {
		return this.detalleAnexos;
	}

	public void setDetalleAnexos(List<DetalleAnexo> detalleAnexos) {
		this.detalleAnexos = detalleAnexos;
	}

	public DetalleAnexo addDetalleAnexo(DetalleAnexo detalleAnexo) {
		getDetalleAnexos().add(detalleAnexo);
		detalleAnexo.setTitulo(this);

		return detalleAnexo;
	}

	public DetalleAnexo removeDetalleAnexo(DetalleAnexo detalleAnexo) {
		getDetalleAnexos().remove(detalleAnexo);
		detalleAnexo.setTitulo(null);

		return detalleAnexo;
	}

}