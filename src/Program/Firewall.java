package Program;

public class Firewall extends Material{

	// Atributos de la clase
	private boolean small;
	// Constructor vac�o
	public Firewall() {
		super.setTipo("Firewall");
	}
	
	public Firewall(boolean small) {
		super.setTipo("Firewall");
		this.setSmall(small);
	}
	
	// Constructor con par�metros
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
	
	// M�todo para saber si es peque�o o grande
	public boolean isSmall() {
		if(this.small) {
			return true;
		} else {
			return false;
		}
	}
	
	// M�todos de la clase
	
}
