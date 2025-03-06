public class Penalizacion {
	private int idPenalizacion;
    private int idUsuario;
    private String fechaInicio;
    private String fechaFin;
    
    Penalizacion(int idPenalizacion, int idUsuario, String fechaInicio, String fechaFin) {
        this.idPenalizacion = idPenalizacion;
        this.idUsuario = idUsuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
    
    void asignarPenalizacion() {}
    void eliminarPenalizacion() {}
    void consultarEstadoPenalizacion() {}

	public int getIdPenalizacion() {
		return idPenalizacion;
	}

	public void setIdPenalizacion(int idPenalizacion) {
		this.idPenalizacion = idPenalizacion;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
    
}
