package retoLibreria;

public class Libro {
	int idLibro;
    String titulo;
    String isbn;
    
    Libro(int idLibro, String titulo, String isbn) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    void mostrarInformacion() {}
    void actualizarTitulo(String nuevoTitulo) {}
    void actualizarISBN(String nuevoISBN) {}
}
