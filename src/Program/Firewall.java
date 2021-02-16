package Program;

public class Firewall extends Material{

	// Atributos de la clase
	private boolean small;
	// Constructor vacío
	public Firewall() {
		super.setTipo("Firewall");
	}
	
	public Firewall(boolean small) {
		super.setTipo("Firewall");
		this.setSmall(small);
	}
	
	// Constructor con parámetros
	public Firewall(int id, String sn, String brand, String model, String comments, boolean tiny) {
		super.setId(id);
		super.setSn(sn);
		super.setMarca(brand);
		super.setModelo(model);
		super.setComentarios(comments);
		setSmall(tiny);
		super.setTipo("Firewall");
	}
	
	// Getters y Setters
	
	// @return boolean - 
	public boolean getSmall() {
		return this.small;
	}
	// @param boolean -
	public void setSmall(boolean tiny) {
		this.small = tiny;
	}
	
	// Método para saber si es pequeño o grande
	public boolean isSmall() {
		if(this.small) {
			return true;
		} else {
			return false;
		}
	}
	
	// Métodos de la clase
	
}
