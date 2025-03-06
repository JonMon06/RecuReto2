 package retoLibreria;

public class Usuario {
	private int idUsuario;
    private String dni;
    private String telefono;
    private String correoElectronico;
    private String nombreUsuario;
    private String contrasena;
    private String tipo; // Socio, Empleado
    private String numeroSeguridadSocial; // Solo empleados
    private String fechaRegistro;
    
    Usuario(int idUsuario, String dni, String telefono, String correoElectronico, String nombreUsuario, String contrasena, String tipo, String numeroSeguridadSocial, String fechaRegistro) {
        this.idUsuario = idUsuario;
        this.dni = dni;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.tipo = tipo;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.fechaRegistro = fechaRegistro;
    }
    
    void registrarUsuario() {}
    void actualizarDatos(String nuevoTelefono, String nuevoCorreo) {}
    void cambiarContrasena(String nuevaContrasena) {}
    void mostrarInformacion() {}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
    
}
