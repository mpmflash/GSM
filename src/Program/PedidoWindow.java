package Program;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PedidoWindow extends JFrame {
	// Atributos de la clase
	
	// Constructor vac�o
	public PedidoWindow() {
		// Preparamos la ventana
		this.setTitle("GSM - Pedido de Material");
		this.setSize(400,300); //Tama�o de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		getContentPane().setLayout(new BorderLayout());
		// Iniciamos los diferentes paneles en m�todos para limpiar el cuerpo de la clase
		
	}
	// M�todos de la clase
	
}
