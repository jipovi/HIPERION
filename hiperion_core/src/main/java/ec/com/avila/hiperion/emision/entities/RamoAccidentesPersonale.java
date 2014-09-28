package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_accidentes_personales database table.
 * 
 */
@Entity
@Table(name="ramo_accidentes_personales")
public class RamoAccidentesPersonale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_accidentes")
	private Integer idAccidentes;

	@Column(name="deduc_accidente")
	private BigDecimal deducAccidente;

	private BigDecimal facturacion;

	@Column(name="file_cond_generales")
	private String fileCondGenerales;

	@Column(name="prima_neta_persona")
	private BigDecimal primaNetaPersona;

	@Column(name="prima_total_persona")
	private BigDecimal primaTotalPersona;

	@Column(name="tasa_acciondente")
	private BigDecimal tasaAcciondente;

	//bi-directional many-to-one association to ClausulasAddAccPer
	@OneToMany(mappedBy="ramoAccidentesPersonale")
	private List<ClausulasAddAccPer> clausulasAddAccPers;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	public RamoAccidentesPersonale() {
	}

	public Integer getIdAccidentes() {
		return this.idAccidentes;
	}

	public void setIdAccidentes(Integer idAccidentes) {
		this.idAccidentes = idAccidentes;
	}

	public BigDecimal getDeducAccidente() {
		return this.deducAccidente;
	}

	public void setDeducAccidente(BigDecimal deducAccidente) {
		this.deducAccidente = deducAccidente;
	}

	public BigDecimal getFacturacion() {
		return this.facturacion;
	}

	public void setFacturacion(BigDecimal facturacion) {
		this.facturacion = facturacion;
	}

	public String getFileCondGenerales() {
		return this.fileCondGenerales;
	}

	public void setFileCondGenerales(String fileCondGenerales) {
		this.fileCondGenerales = fileCondGenerales;
	}

	public BigDecimal getPrimaNetaPersona() {
		return this.primaNetaPersona;
	}

	public void setPrimaNetaPersona(BigDecimal primaNetaPersona) {
		this.primaNetaPersona = primaNetaPersona;
	}

	public BigDecimal getPrimaTotalPersona() {
		return this.primaTotalPersona;
	}

	public void setPrimaTotalPersona(BigDecimal primaTotalPersona) {
		this.primaTotalPersona = primaTotalPersona;
	}

	public BigDecimal getTasaAcciondente() {
		return this.tasaAcciondente;
	}

	public void setTasaAcciondente(BigDecimal tasaAcciondente) {
		this.tasaAcciondente = tasaAcciondente;
	}

	public List<ClausulasAddAccPer> getClausulasAddAccPers() {
		return this.clausulasAddAccPers;
	}

	public void setClausulasAddAccPers(List<ClausulasAddAccPer> clausulasAddAccPers) {
		this.clausulasAddAccPers = clausulasAddAccPers;
	}

	public ClausulasAddAccPer addClausulasAddAccPer(ClausulasAddAccPer clausulasAddAccPer) {
		getClausulasAddAccPers().add(clausulasAddAccPer);
		clausulasAddAccPer.setRamoAccidentesPersonale(this);

		return clausulasAddAccPer;
	}

	public ClausulasAddAccPer removeClausulasAddAccPer(ClausulasAddAccPer clausulasAddAccPer) {
		getClausulasAddAccPers().remove(clausulasAddAccPer);
		clausulasAddAccPer.setRamoAccidentesPersonale(null);

		return clausulasAddAccPer;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

}