package retoLibreria;

public class Ejemplar {
	int idEjemplar;
    int idLibro;
    String estadoFisico; // Bueno, Regular, Mal
    
    Ejemplar(int idEjemplar, int idLibro, String estadoFisico) {
        this.idEjemplar = idEjemplar;
        this.idLibro = idLibro;
        this.estadoFisico = estadoFisico;
    }
    
    void cambiarEstado(String nuevoEstado) {}
    void mostrarEstado() {}
}
