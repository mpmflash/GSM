package Program;

import javax.swing.JFrame;

public class EntradaWindow extends JFrame {
	// Atributos de la clase
	
	// Constructor vacío:
	public EntradaWindow() {
		// ** Nuestra ventana:
		this.setTitle("GSM - Entrada de Material");
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerramos con la X, el programa sigue en ejecución, con esta línea lo paramos
		this.setSize(800,600); //Tamaño de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		
		this.setVisible(true);
	}
}
