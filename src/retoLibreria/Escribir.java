package retoLibreria;

public class Escribir {
	private int idLibro;
    private int idAutor;
    
    Escribir(int idLibro, int idAutor) {
        this.idLibro = idLibro;
        this.idAutor = idAutor;
    }
    
    void asignarAutorALibro(int idLibro, int idAutor) {}
    void eliminarAutorDeLibro(int idLibro, int idAutor) {}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
    
}

