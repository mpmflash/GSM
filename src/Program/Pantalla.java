package Program;

public class Pantalla extends Material{

	// Atributos de la clase
	private int pulgadas;
	// Constructor vacío
	public Pantalla() {
		super.setTipo("Pantalla");
	}
	public Pantalla(int inch) {
		super.setTipo("Pantalla");
		this.setPulgadas(inch);
	}
	
	// Constructor con parámetros
	public Pantalla(int id, String sn, String brand, String model, String comments, int inch) {
		super.setId(id);
		super.setSn(sn);
		super.setMarca(brand);
		super.setModelo(model);
		super.setComentarios(comments);
		this.setPulgadas(inch);
		super.setTipo("Pantalla");
	}
	
	// Getters y Setters
	
	// @return int - pulgadas tamaño
	public int getPulgadas() {
		return this.pulgadas;
	}
	// @param int - pulgadas tamaño
	public void setPulgadas(int inch) {
		this.pulgadas = inch;
	}
	
	// Métodos de la clase
	
}
