package Program;
// Clase para controlar los port�tiles que tenemos en stock

public class Ordenador extends Material{
	// Atributos
	private int hdd;
	private int ram;
	
	// Constructor vac�o
	public Ordenador() {
		// VOID
	}
	
	// Constructor con par�metros
	public Ordenador(int id, String type, String serial, String brand, String model, String comments, int hdd, int ram) {
		super.setId(id);
		super.setTipo(type);
		super.setSn(serial);
		super.setMarca(brand);
		super.setModelo(model);
		super.setComentarios(comments);
		this.hdd = hdd;
		this.ram = ram;
	}
	// Getters y Setters

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
		String ordenador = "";
		ordenador = "ID:"+this.getId()+". Tipo:"+this.getTipo()+". SN:"+this.getSn()+". Marca:"+super.getMarca()+". Modelo:"+super.getModelo()+". Comentarios:"+this.getComentarios()+". HDD:"+this.getHdd()+". RAM:"+this.getRam();
		return ordenador;
	}
	
}
