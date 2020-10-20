package Program;

public class Pedido {
	// Atributos 
	private int id;
	private String material;
	private String destinatario;
	private String destino;
	private String autorizacion;
	private String tecnico;
	private String observaciones;
	
	// Constructor vacío
	public Pedido() {
		
	}
	// Constructor pasándole datos
	public Pedido(String mat, String usuario, String destino, String aprobacion, String gestor, String obs ) {
		this.material = mat;
		this.destinatario = usuario;
		this.destino = destino;
		this.autorizacion = aprobacion;
		this.tecnico = gestor;
		this.observaciones = obs;
	}
	
	// Getters y Setters
	// ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// Material
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	// Destinatario
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	// Destino
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	// Autorización
	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}

	// Técnico
	public String getTecnico() {
		return tecnico;
	}
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	// Observaciones
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}	
}
