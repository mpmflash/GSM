package Program;
// Clase que almacena todo tipo de material

public class Material {
	// Atributos
	private int id;
	private String tipo;
	private String sn;
	private String marca;
	private String modelo;
	private String comentarios;
	
	// Constructor vacío
	public Material() {
		// VOID
	}
	// Constructor parámetros
	public Material(int x, String type, String serial, String brand, String model, String comments) {
		this.id = x;
		this.tipo = type;
		this.sn = serial;
		this.marca = brand;
		this.modelo = model;
		this.comentarios = comments;
	}
	// Getters y Setters
	// @return int - id
	public int getId() {
		return id;
	}
	// @param int - id
	public void setId(int id) {
		this.id = id;
	}
	
	// @return String - tipo
	public String getTipo() {
		return tipo;
	}
	// @param String - tipo
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// @return String - serial number
	public String getSn() {
		return sn;
	}
	// @param String - serial number
	public void setSn(String sn) {
		this.sn = sn;
	}
	
	// @return String - marca
	public String getMarca() {
		return marca;
	}
	// @param String - marca
	public void setMarca(String brand) {
		this.marca = brand;
	}
	
	// @return String - modelo 
	public String getModelo() {
		return modelo;
	}
	// @parma String - modelo
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	// @return String - comentarios del material (estado)
	public String getComentarios() {
		return comentarios;
	}
	// @param String - comentarios del material (estado)
	public void setComentarios(String comments) {
		this.comentarios = comments;
	}
	
	// Métodos de la clase
	
}
