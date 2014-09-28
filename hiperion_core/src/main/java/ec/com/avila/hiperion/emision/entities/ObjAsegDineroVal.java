package ec.com.avila.hiperion.emision.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the obj_aseg_dinero_val database table.
 * 
 */
@Entity
@Table(name="obj_aseg_dinero_val")
public class ObjAsegDineroVal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ob_aseg_dinero_valores")
	private Integer idObAsegDineroValores;

	private String desde;

	@Column(name="dinero_valores")
	private BigDecimal dineroValores;

	private String hasta;

	@Column(name="item_obj_dinero")
	private Integer itemObjDinero;

	@Column(name="limite_embarque_obj_dinero")
	private BigDecimal limiteEmbarqueObjDinero;

	@Column(name="limite_estimado")
	private BigDecimal limiteEstimado;

	@Column(name="medio__transporte_dinero")
	private Integer medioTransporteDinero;

	//bi-directional many-to-one association to RamoDineroValore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_dinero")
	private RamoDineroValore ramoDineroValore;

	public ObjAsegDineroVal() {
	}

	public Integer getIdObAsegDineroValores() {
		return this.idObAsegDineroValores;
	}

	public void setIdObAsegDineroValores(Integer idObAsegDineroValores) {
		this.idObAsegDineroValores = idObAsegDineroValores;
	}

	public String getDesde() {
		return this.desde;
	}

	public void setDesde(String desde) {
		this.desde = desde;
	}

	public BigDecimal getDineroValores() {
		return this.dineroValores;
	}

	public void setDineroValores(BigDecimal dineroValores) {
		this.dineroValores = dineroValores;
	}

	public String getHasta() {
		return this.hasta;
	}

	public void setHasta(String hasta) {
		this.hasta = hasta;
	}

	public Integer getItemObjDinero() {
		return this.itemObjDinero;
	}

	public void setItemObjDinero(Integer itemObjDinero) {
		this.itemObjDinero = itemObjDinero;
	}

	public BigDecimal getLimiteEmbarqueObjDinero() {
		return this.limiteEmbarqueObjDinero;
	}

	public void setLimiteEmbarqueObjDinero(BigDecimal limiteEmbarqueObjDinero) {
		this.limiteEmbarqueObjDinero = limiteEmbarqueObjDinero;
	}

	public BigDecimal getLimiteEstimado() {
		return this.limiteEstimado;
	}

	public void setLimiteEstimado(BigDecimal limiteEstimado) {
		this.limiteEstimado = limiteEstimado;
	}

	public Integer getMedioTransporteDinero() {
		return this.medioTransporteDinero;
	}

	public void setMedioTransporteDinero(Integer medioTransporteDinero) {
		this.medioTransporteDinero = medioTransporteDinero;
	}

	public RamoDineroValore getRamoDineroValore() {
		return this.ramoDineroValore;
	}

	public void setRamoDineroValore(RamoDineroValore ramoDineroValore) {
		this.ramoDineroValore = ramoDineroValore;
	}

}