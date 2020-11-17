package Program;
// Clase del programa GSM para almacenar la información de los usuarios del programa
public class Tecnico {
	// Atributos
	private int id;
	private String nombre;
	private String apellido;
	private String correo;
	private String contraseña;
	
	// Constructor vacío
	public Tecnico() {
		
	}
	
	// Constructor con datos
	public Tecnico(int x, String n, String a, String mail, String pass) {
		this.id = x;
		this.nombre = n;
		this.apellido = a;
		this.correo = mail;
		this.contraseña = pass;
	}
	
	// Getters y Setters
	// @return int - id
	public int getId() {
		return id;
	}
	// @param int id - El id del técnico
	public void setId(int id) {
		this.id = id;
	}

	// @return String - nombre del técnico
	public String getNombre() {
		return nombre;
	}
	// @param String nombre - El nombre del técnico
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// @return String apellido - El apellido del técnico
	public String getApellido() {
		return apellido;
	}
	// @param String - apellido 
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// @return String - correo electrónico
	public String getCorreo() {
		return correo;
	}
	// @param String - Correo electrónico
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	// @return String - contraseña
	public String getContraseña() {
		return contraseña;
	}
	// @param String - password
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
