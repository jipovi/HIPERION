package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the ramo_asistencia_medica database table.
 * 
 */
@Entity
@Table(name="ramo_asistencia_medica")
public class RamoAsistenciaMedica implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ast_medica")
	private Integer idAstMedica;

	@Column(name="total_mensual_grupo_asm")
	private BigDecimal totalMensualGrupoAsm;

	//bi-directional many-to-one association to CondPartAsm
	@OneToMany(mappedBy="ramoAsistenciaMedica")
	private List<CondPartAsm> condPartAsms;

	//bi-directional many-to-one association to Dependiente
	@OneToMany(mappedBy="ramoAsistenciaMedica")
	private List<Dependiente> dependientes;

	//bi-directional many-to-one association to Familia
	@OneToMany(mappedBy="ramoAsistenciaMedica")
	private List<Familia> familias;

	//bi-directional many-to-one association to LimitesCostosAsm
	@OneToMany(mappedBy="ramoAsistenciaMedica")
	private List<LimitesCostosAsm> limitesCostosAsms;

	//bi-directional many-to-one association to Poliza
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_poliza")
	private Poliza poliza;

	//bi-directional many-to-one association to Titular
	@OneToMany(mappedBy="ramoAsistenciaMedica")
	private List<Titular> titulars;

	public RamoAsistenciaMedica() {
	}

	public Integer getIdAstMedica() {
		return this.idAstMedica;
	}

	public void setIdAstMedica(Integer idAstMedica) {
		this.idAstMedica = idAstMedica;
	}

	public BigDecimal getTotalMensualGrupoAsm() {
		return this.totalMensualGrupoAsm;
	}

	public void setTotalMensualGrupoAsm(BigDecimal totalMensualGrupoAsm) {
		this.totalMensualGrupoAsm = totalMensualGrupoAsm;
	}

	public List<CondPartAsm> getCondPartAsms() {
		return this.condPartAsms;
	}

	public void setCondPartAsms(List<CondPartAsm> condPartAsms) {
		this.condPartAsms = condPartAsms;
	}

	public CondPartAsm addCondPartAsm(CondPartAsm condPartAsm) {
		getCondPartAsms().add(condPartAsm);
		condPartAsm.setRamoAsistenciaMedica(this);

		return condPartAsm;
	}

	public CondPartAsm removeCondPartAsm(CondPartAsm condPartAsm) {
		getCondPartAsms().remove(condPartAsm);
		condPartAsm.setRamoAsistenciaMedica(null);

		return condPartAsm;
	}

	public List<Dependiente> getDependientes() {
		return this.dependientes;
	}

	public void setDependientes(List<Dependiente> dependientes) {
		this.dependientes = dependientes;
	}

	public Dependiente addDependiente(Dependiente dependiente) {
		getDependientes().add(dependiente);
		dependiente.setRamoAsistenciaMedica(this);

		return dependiente;
	}

	public Dependiente removeDependiente(Dependiente dependiente) {
		getDependientes().remove(dependiente);
		dependiente.setRamoAsistenciaMedica(null);

		return dependiente;
	}

	public List<Familia> getFamilias() {
		return this.familias;
	}

	public void setFamilias(List<Familia> familias) {
		this.familias = familias;
	}

	public Familia addFamilia(Familia familia) {
		getFamilias().add(familia);
		familia.setRamoAsistenciaMedica(this);

		return familia;
	}

	public Familia removeFamilia(Familia familia) {
		getFamilias().remove(familia);
		familia.setRamoAsistenciaMedica(null);

		return familia;
	}

	public List<LimitesCostosAsm> getLimitesCostosAsms() {
		return this.limitesCostosAsms;
	}

	public void setLimitesCostosAsms(List<LimitesCostosAsm> limitesCostosAsms) {
		this.limitesCostosAsms = limitesCostosAsms;
	}

	public LimitesCostosAsm addLimitesCostosAsm(LimitesCostosAsm limitesCostosAsm) {
		getLimitesCostosAsms().add(limitesCostosAsm);
		limitesCostosAsm.setRamoAsistenciaMedica(this);

		return limitesCostosAsm;
	}

	public LimitesCostosAsm removeLimitesCostosAsm(LimitesCostosAsm limitesCostosAsm) {
		getLimitesCostosAsms().remove(limitesCostosAsm);
		limitesCostosAsm.setRamoAsistenciaMedica(null);

		return limitesCostosAsm;
	}

	public Poliza getPoliza() {
		return this.poliza;
	}

	public void setPoliza(Poliza poliza) {
		this.poliza = poliza;
	}

	public List<Titular> getTitulars() {
		return this.titulars;
	}

	public void setTitulars(List<Titular> titulars) {
		this.titulars = titulars;
	}

	public Titular addTitular(Titular titular) {
		getTitulars().add(titular);
		titular.setRamoAsistenciaMedica(this);

		return titular;
	}

	public Titular removeTitular(Titular titular) {
		getTitulars().remove(titular);
		titular.setRamoAsistenciaMedica(null);

		return titular;
	}

}