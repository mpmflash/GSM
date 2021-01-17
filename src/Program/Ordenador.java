package Program;
// Clase para controlar los port�tiles que tenemos en stock

public class Ordenador extends Material{
	// Atributos
	private String modelo;
	private int hdd;
	private int ram;
	
	// Constructor vac�o
	public Ordenador() {
		// VOID
	}
	
	// Constructor con par�metros
	public Ordenador(int id, String type, String serial, String comments, String model, int hdd, int ram) {
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
	// @parma String - modelo del port�til
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
	
	// M�todos de la clase
	
	/* toString() - @override
	 * M�todo que describe el ordenador con todos sus par�metros
	 * @param void
	 * @return String;
	 */
	public String toString() {
		String portatil = "";
		portatil = "ID:"+this.getId()+". Tipo:"+this.getTipo()+". SN:"+this.getSn()+". Comentarios:"+this.getComentarios()+". Modelo:"+this.getModelo()+". HDD:"+this.getHdd()+". RAM:"+this.getRam();
		return portatil;
	}
	
}
