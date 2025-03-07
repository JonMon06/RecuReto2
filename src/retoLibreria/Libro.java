package retoLibreria;

public class Libro {
	private int idLibro;
    private String titulo;
    private String isbn;
    
    Libro(int idLibro, String titulo, String isbn) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.isbn = isbn;
    }
    
    void mostrarInformacion() {}
    void actualizarTitulo(String nuevoTitulo) {}
    void actualizarISBN(String nuevoISBN) {}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
    
}
