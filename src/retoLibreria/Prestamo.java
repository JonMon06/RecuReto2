package retoLibreria;

public class Prestamo {
	 int idPrestamo;
	    int idEjemplar;
	    int idUsuario;
	    String fechaPrestamo;
	    int duracionPrestamo;
	    String fechaDevolucion;
	    
	    Prestamo(int idPrestamo, int idEjemplar, int idUsuario, String fechaPrestamo, int duracionPrestamo, String fechaDevolucion) {
	        this.idPrestamo = idPrestamo;
	        this.idEjemplar = idEjemplar;
	        this.idUsuario = idUsuario;
	        this.fechaPrestamo = fechaPrestamo;
	        this.duracionPrestamo = duracionPrestamo;
	        this.fechaDevolucion = fechaDevolucion;
	    }
	    
	    void registrarPrestamo() {}
	    void devolverEjemplar() {}
	    void extenderPrestamo(int diasExtra) {}
	    void mostrarDetallesPrestamo() {}
}
