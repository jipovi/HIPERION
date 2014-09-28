package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cond_esp_trans database table.
 * 
 */
@Entity
@Table(name="cond_esp_trans")
public class CondEspTran implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_condicion_esp_transporte")
	private Integer idCondicionEspTransporte;

	@Column(name="condicion_esp_trans")
	private String condicionEspTrans;

	@Column(name="descripcion_cond_esp_trans")
	private String descripcionCondEspTrans;

	//bi-directional many-to-one association to RamoTransporte
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_transporte")
	private RamoTransporte ramoTransporte;

	public CondEspTran() {
	}

	public Integer getIdCondicionEspTransporte() {
		return this.idCondicionEspTransporte;
	}

	public void setIdCondicionEspTransporte(Integer idCondicionEspTransporte) {
		this.idCondicionEspTransporte = idCondicionEspTransporte;
	}

	public String getCondicionEspTrans() {
		return this.condicionEspTrans;
	}

	public void setCondicionEspTrans(String condicionEspTrans) {
		this.condicionEspTrans = condicionEspTrans;
	}

	public String getDescripcionCondEspTrans() {
		return this.descripcionCondEspTrans;
	}

	public void setDescripcionCondEspTrans(String descripcionCondEspTrans) {
		this.descripcionCondEspTrans = descripcionCondEspTrans;
	}

	public RamoTransporte getRamoTransporte() {
		return this.ramoTransporte;
	}

	public void setRamoTransporte(RamoTransporte ramoTransporte) {
		this.ramoTransporte = ramoTransporte;
	}

}