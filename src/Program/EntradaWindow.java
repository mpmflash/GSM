package Program;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;

public class EntradaWindow extends JFrame {
	// Atributos de la clase
	
	// Constructor vacío:
	public EntradaWindow() {
		// ** Nuestra ventana:
		this.setTitle("GSM - Entrada de Material");
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerramos con la X, el programa sigue en ejecución, con esta línea lo paramos
		this.setSize(800,600); //Tamaño de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		
		JLabel lblProducto = new JLabel("Producto");
		GridBagConstraints gbc_lblProducto = new GridBagConstraints();
		gbc_lblProducto.insets = new Insets(0, 0, 0, 5);
		gbc_lblProducto.anchor = GridBagConstraints.EAST;
		gbc_lblProducto.gridx = 2;
		gbc_lblProducto.gridy = 1;
		getContentPane().add(lblProducto, gbc_lblProducto);
		
		JComboBox cBProducto = new JComboBox();
		GridBagConstraints gbc_cBProducto = new GridBagConstraints();
		gbc_cBProducto.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBProducto.gridx = 3;
		gbc_cBProducto.gridy = 1;
		getContentPane().add(cBProducto, gbc_cBProducto);
		
		
		this.setVisible(true);
	}
}
