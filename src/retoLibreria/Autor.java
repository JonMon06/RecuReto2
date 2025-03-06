package retoLibreria;

public class Autor {
	private int idAutor;
    private String nombre;
    private String apellidos;
    
    Autor(int idAutor, String nombre, String apellidos) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    void mostrarInformacion() {}
    void actualizarNombre(String nuevoNombre) {}
    void actualizarApellidos(String nuevosApellidos) {}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
    
}
