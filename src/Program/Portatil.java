package Program;
// Clase para controlar los portátiles que tenemos en stock

public class Portatil extends Material{
	// Atributos
	private String modelo;
	private int hdd;
	private int ram;
	
	// Constructor vacío
	public Portatil() {
		// VOID
	}
	
	// Constructor con parámetros
	public Portatil(int id, String type, String serial, String comments, String model, int hdd, int ram) {
		super.setId(id);
		super.setTipo(type);
		super.setSn(serial);
		super.setComentarios(comments);
		this.modelo = model;
		this.hdd = hdd;
		this.ram = ram;
	}
	// Getters y Setters

	// @return String - modelo del portatil
	public String getModelo() {
		return modelo;
	}
	// @parma String - modelo del portátil
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// @return int - capacidad de disco duro
	public int getHdd() {
		return hdd;
	}
	// @param int - capacidad del disco duro
	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	// @return int - capacidad de ram
	public int getRam() {
		return ram;
	}
	// @param int - capacidad de ram
	public void setRam(int ram) {
		this.ram = ram;
	}
	
}
