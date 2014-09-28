package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_vida database table.
 * 
 */
@Entity
@Table(name="ramo_vida")
public class RamoVida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_vida")
	private Integer idVida;

	@Column(name="prima_neta_persona_vida")
	private BigDecimal primaNetaPersonaVida;

	@Column(name="prima_total_persona_vida")
	private BigDecimal primaTotalPersonaVida;

	@Column(name="tasa_incapicidad")
	private BigDecimal tasaIncapicidad;

	@Column(name="tasa_muerte")
	private BigDecimal tasaMuerte;

	@Column(name="tasa_vida")
	private BigDecimal tasaVida;

	@Column(name="total_asegurados")
	private Integer totalAsegurados;

	//bi-directional many-to-one association to GruposVida
	@OneToMany(mappedBy="ramoVida")
	private List<GruposVida> gruposVidas;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoVida() {
	}

	public Integer getIdVida() {
		return this.idVida;
	}

	public void setIdVida(Integer idVida) {
		this.idVida = idVida;
	}

	public BigDecimal getPrimaNetaPersonaVida() {
		return this.primaNetaPersonaVida;
	}

	public void setPrimaNetaPersonaVida(BigDecimal primaNetaPersonaVida) {
		this.primaNetaPersonaVida = primaNetaPersonaVida;
	}

	public BigDecimal getPrimaTotalPersonaVida() {
		return this.primaTotalPersonaVida;
	}

	public void setPrimaTotalPersonaVida(BigDecimal primaTotalPersonaVida) {
		this.primaTotalPersonaVida = primaTotalPersonaVida;
	}

	public BigDecimal getTasaIncapicidad() {
		return this.tasaIncapicidad;
	}

	public void setTasaIncapicidad(BigDecimal tasaIncapicidad) {
		this.tasaIncapicidad = tasaIncapicidad;
	}

	public BigDecimal getTasaMuerte() {
		return this.tasaMuerte;
	}

	public void setTasaMuerte(BigDecimal tasaMuerte) {
		this.tasaMuerte = tasaMuerte;
	}

	public BigDecimal getTasaVida() {
		return this.tasaVida;
	}

	public void setTasaVida(BigDecimal tasaVida) {
		this.tasaVida = tasaVida;
	}

	public Integer getTotalAsegurados() {
		return this.totalAsegurados;
	}

	public void setTotalAsegurados(Integer totalAsegurados) {
		this.totalAsegurados = totalAsegurados;
	}

	public List<GruposVida> getGruposVidas() {
		return this.gruposVidas;
	}

	public void setGruposVidas(List<GruposVida> gruposVidas) {
		this.gruposVidas = gruposVidas;
	}

	public GruposVida addGruposVida(GruposVida gruposVida) {
		getGruposVidas().add(gruposVida);
		gruposVida.setRamoVida(this);

		return gruposVida;
	}

	public GruposVida removeGruposVida(GruposVida gruposVida) {
		getGruposVidas().remove(gruposVida);
		gruposVida.setRamoVida(null);

		return gruposVida;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}