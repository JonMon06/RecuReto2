package retoLibreria;

public class Prestamo {
	 private int idPrestamo;
	    private int idEjemplar;
	    private int idUsuario;
	    private String fechaPrestamo;
	    private int duracionPrestamo;
	    private String fechaDevolucion;
	    
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

		public int getIdPrestamo() {
			return idPrestamo;
		}

		public void setIdPrestamo(int idPrestamo) {
			this.idPrestamo = idPrestamo;
		}

		public int getIdEjemplar() {
			return idEjemplar;
		}

		public void setIdEjemplar(int idEjemplar) {
			this.idEjemplar = idEjemplar;
		}

		public int getIdUsuario() {
			return idUsuario;
		}

		public void setIdUsuario(int idUsuario) {
			this.idUsuario = idUsuario;
		}

		public String getFechaPrestamo() {
			return fechaPrestamo;
		}

		public void setFechaPrestamo(String fechaPrestamo) {
			this.fechaPrestamo = fechaPrestamo;
		}

		public int getDuracionPrestamo() {
			return duracionPrestamo;
		}

		public void setDuracionPrestamo(int duracionPrestamo) {
			this.duracionPrestamo = duracionPrestamo;
		}

		public String getFechaDevolucion() {
			return fechaDevolucion;
		}

		public void setFechaDevolucion(String fechaDevolucion) {
			this.fechaDevolucion = fechaDevolucion;
		}
	    
}
