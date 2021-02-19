package Program;

import java.util.ArrayList;

public class Pedido {
	// Atributos 
	private int id;
	private ArrayList <Material> lstMatPed;
	private String destinatario;
	private String dpto;
	private String autorizacion;
	private String tecnico;
	private String observaciones;
	
	// Constructor vac�o
	public Pedido() {
		lstMatPed = new ArrayList<Material>();
	}
	// Constructor pas�ndole datos
	public Pedido( String usuario, String destino, String aprobacion, String gestor, String obs ) {
		lstMatPed = new ArrayList<Material>();
		this.destinatario = usuario;
		this.dpto = destino;
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
	
	// ArrayList<Material>
	public ArrayList<Material> getMaterial(){
		return this.lstMatPed;
	}
	public void setMaterial(ArrayList<Material> lstMaterial) {
		this.lstMatPed = lstMaterial;
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
		return dpto;
	}
	public void setDestino(String destino) {
		this.dpto = destino;
	}
	
	// Autorizaci�n
	public String getAutorizacion() {
		return autorizacion;
	}
	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}

	// T�cnico
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
	
	// M�todos de la clase
	
	/* addMaterial();
	 * M�todo con el que a�adimos un material a la lista de Pedido
	 * 
	 */
	public void addMaterial( Material mat) {
		lstMatPed.add(mat);
	}
	
	/*
	 * removeMaterial();
	 * 
	 * @param void
	 * @return void
	 */
	public void removeMaterial() {
		lstMatPed.remove(lstMatPed.size()-1);
	}
	
	/*
	 * countMaterial();
	 * Devuelve la cantidad de material almacenado en la Array
	 * @param void
	 * @return int
	 */
	public int countMaterial() {		
		return lstMatPed.size();
	}
	
	/*
	 * toString();
	 * M�todo que describir� el pedido
	 * @param void
	 * @return void
	 */
	public String toString() {
		String descripcion;
		descripcion = "ID:"+this.id+" Material:"+lstMatPed.size()+"\n Para:"+this.destinatario+"\n Dpto:"+this.dpto+"\n Autorizado:"+this.autorizacion+"\n Tecnico:"+this.tecnico;
		
		return descripcion;
	}
}
