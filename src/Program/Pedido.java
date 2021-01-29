package Program;

import java.util.ArrayList;

public class Pedido {
	// Atributos 
	private int id;
	private ArrayList <Material> lstMatPed;
	private String destinatario;
	private String destino;
	private String autorizacion;
	private String tecnico;
	private String observaciones;
	
	// Constructor vacío
	public Pedido() {
		// VOID
	}
	// Constructor pasándole datos
	public Pedido( String usuario, String destino, String aprobacion, String gestor, String obs ) {
		
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
	
	// Métodos de la clase
	
	/* addMaterial();
	 * Método con el que añadimos un material a la lista de Pedido
	 * 
	 */
}
