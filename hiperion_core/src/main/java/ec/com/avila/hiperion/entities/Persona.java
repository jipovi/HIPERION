package ec.com.avila.hiperion.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Integer idPersona;

	@Column(name = "apellido_materno")
	private String apellidoMaterno;

	@Column(name = "apellido_paterno")
	private String apellidoPaterno;

	@Column(name = "email_persona")
	private String emailPersona;

	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name = "identificacion_persona")
	private String identificacionPersona;

	@Column(name = "nombre_persona")
	private String nombrePersona;

	@Column(name = "telefono_conv_persona")
	private String telefonoConvPersona;

	@Column(name = "telefono_movil_persona")
	private String telefonoMovilPersona;

	@Column(name = "tipo_identificacion")
	private String tipoIdentificacion;

	// bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy = "persona", cascade = { CascadeType.ALL })
	private List<Cliente> clientes;

	// bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy = "persona")
	private List<Direccion> direccions;

	// bi-directional many-to-many association to Aseguradora
	@ManyToMany
	@JoinTable(name = "persona_aseguradora", joinColumns = { @JoinColumn(name = "id_persona") }, inverseJoinColumns = { @JoinColumn(name = "id_aseguradora") })
	private List<Aseguradora> aseguradoras;

	// bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy = "persona")
	private List<Usuario> usuarios;

	public Persona() {
	}

	public Integer getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getEmailPersona() {
		return this.emailPersona;
	}

	public void setEmailPersona(String emailPersona) {
		this.emailPersona = emailPersona;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento
	 *            the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getIdentificacionPersona() {
		return this.identificacionPersona;
	}

	public void setIdentificacionPersona(String identificacionPersona) {
		this.identificacionPersona = identificacionPersona;
	}

	public String getNombrePersona() {
		return this.nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getTelefonoConvPersona() {
		return this.telefonoConvPersona;
	}

	public void setTelefonoConvPersona(String telefonoConvPersona) {
		this.telefonoConvPersona = telefonoConvPersona;
	}

	public String getTelefonoMovilPersona() {
		return this.telefonoMovilPersona;
	}

	public void setTelefonoMovilPersona(String telefonoMovilPersona) {
		this.telefonoMovilPersona = telefonoMovilPersona;
	}

	public String getTipoIdentificacion() {
		return this.tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setPersona(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setPersona(null);

		return cliente;
	}

	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	public Direccion addDireccion(Direccion direccion) {
		getDireccions().add(direccion);
		direccion.setPersona(this);

		return direccion;
	}

	public Direccion removeDireccion(Direccion direccion) {
		getDireccions().remove(direccion);
		direccion.setPersona(null);

		return direccion;
	}

	public List<Aseguradora> getAseguradoras() {
		return this.aseguradoras;
	}

	public void setAseguradoras(List<Aseguradora> aseguradoras) {
		this.aseguradoras = aseguradoras;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setPersona(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setPersona(null);

		return usuario;
	}

}