package retoLibreria;

public class Penalizacion {
	int idPenalizacion;
    int idUsuario;
    String fechaInicio;
    String fechaFin;
    
    Penalizacion(int idPenalizacion, int idUsuario, String fechaInicio, String fechaFin) {
        this.idPenalizacion = idPenalizacion;
        this.idUsuario = idUsuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    void asignarPenalizacion() {}
    void eliminarPenalizacion() {}
    void consultarEstadoPenalizacion() {}
}
