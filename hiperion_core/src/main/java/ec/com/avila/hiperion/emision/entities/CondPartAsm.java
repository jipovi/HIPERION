package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cond_part_asm database table.
 * 
 */
@Entity
@Table(name="cond_part_asm")
public class CondPartAsm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cond_part_asm")
	private Integer idCondPartAsm;

	@Column(name="condicion_part_asm")
	private String condicionPartAsm;

	//bi-directional many-to-one association to RamoAsistenciaMedica
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ast_medica")
	private RamoAsistenciaMedica ramoAsistenciaMedica;

	public CondPartAsm() {
	}

	public Integer getIdCondPartAsm() {
		return this.idCondPartAsm;
	}

	public void setIdCondPartAsm(Integer idCondPartAsm) {
		this.idCondPartAsm = idCondPartAsm;
	}

	public String getCondicionPartAsm() {
		return this.condicionPartAsm;
	}

	public void setCondicionPartAsm(String condicionPartAsm) {
		this.condicionPartAsm = condicionPartAsm;
	}

	public RamoAsistenciaMedica getRamoAsistenciaMedica() {
		return this.ramoAsistenciaMedica;
	}

	public void setRamoAsistenciaMedica(RamoAsistenciaMedica ramoAsistenciaMedica) {
		this.ramoAsistenciaMedica = ramoAsistenciaMedica;
	}

}