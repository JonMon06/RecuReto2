package retoLibreria;

public class Ejemplar {
	private int idEjemplar;
    private int idLibro;
    private String estadoFisico; // Bueno, Regular, Mal
    
    Ejemplar(int idEjemplar, int idLibro, String estadoFisico) {
        this.idEjemplar = idEjemplar;
        this.idLibro = idLibro;
        this.estadoFisico = estadoFisico;
    }
    
    void cambiarEstado(String nuevoEstado) {}
    void mostrarEstado() {}

	public int getIdEjemplar() {
		return idEjemplar;
	}

	public void setIdEjemplar(int idEjemplar) {
		this.idEjemplar = idEjemplar;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getEstadoFisico() {
		return estadoFisico;
	}

	public void setEstadoFisico(String estadoFisico) {
		this.estadoFisico = estadoFisico;
	}
    
}
