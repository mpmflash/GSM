package Program;
// Clase del programa GSM para almacenar la informaci�n de los usuarios del programa
public class Tecnico {
	// Atributos
	private int id;
	private String nombre;
	private String apellido;
	private String correo;
	private String password;
	
	// Constructor vac�o
	public Tecnico() {
		// VOID
	}
	
	// Constructor con datos
	public Tecnico(int x, String n, String a, String mail, String pass) {
		this.id = x;
		this.nombre = n;
		this.apellido = a;
		this.correo = mail;
		this.password = pass;
	}
	
	// Getters y Setters
	// @return int - id
	public int getId() {
		return id;
	}
	// @param int id - El id del t�cnico
	public void setId(int id) {
		this.id = id;
	}

	// @return String - nombre del t�cnico
	public String getNombre() {
		return nombre;
	}
	// @param String nombre - El nombre del t�cnico
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// @return String apellido - El apellido del t�cnico
	public String getApellido() {
		return apellido;
	}
	// @param String - apellido 
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// @return String - correo electr�nico
	public String getCorreo() {
		return correo;
	}
	// @param String - Correo electr�nico
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	// @return String - contrase�a
	public String getPassword() {
		return password;
	}
	// @param String - password
	public void setPassword(String pass) {
		this.password = pass;
	}
	
}
