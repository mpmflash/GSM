package Program;

public class Pantalla extends Material{

	// Atributos de la clase
	private int pulgadas;
	// Constructor vac�o
	public Pantalla() {
		
	}
	
	// Constructor con par�metros
	public Pantalla(int id, String type, String sn, String brand, String model, String comments, int inch) {
		super.setId(id);
		super.setTipo(type);
		super.setSn(sn);
		super.setMarca(brand);
		super.setModelo(model);
		super.setComentarios(comments);
		this.setPulgadas(inch);
	}
	
	// Getters y Setters
	
	// @return int - pulgadas tama�o
	public int getPulgadas() {
		return this.pulgadas;
	}
	// @param int - pulgadas tama�o
	public void setPulgadas(int inch) {
		this.pulgadas = inch;
	}
	
	// M�todos de la clase
	
}