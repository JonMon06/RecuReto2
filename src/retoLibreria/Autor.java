package retoLibreria;

public class Autor {
	int idAutor;
    String nombre;
    String apellidos;
    
    Autor(int idAutor, String nombre, String apellidos) {
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    void mostrarInformacion() {}
    void actualizarNombre(String nuevoNombre) {}
    void actualizarApellidos(String nuevosApellidos) {}
}
