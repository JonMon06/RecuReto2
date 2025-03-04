package retoLibreria;

public class Usuario {
	int idUsuario;
    String dni;
    String telefono;
    String correoElectronico;
    String nombreUsuario;
    String contrasena;
    String tipo; // Socio, Empleado
    String numeroSeguridadSocial; // Solo empleados
    String fechaRegistro;
    
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
}
