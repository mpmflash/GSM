package Program;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntradaWindow extends JFrame {
	// Atributos de la clase
	// Diferentes JPanels para los diferentes tipos de material
	private JPanel pNorte;
	private JPanel pCPortatil;
	private JPanel pCPOrdenador;
	private JPanel pCPantalla21;
	private JPanel pCPantalla24;
	private JPanel pCAllinOne;
	private JPanel pCTpv;
	private JPanel pCFwmini;
	private JPanel pCFwbig;
	
	// Componentes de los diferentes JPanels
	private JComboBox cBProducto;
	
	// Constructor vacío:
	public EntradaWindow() {
		// ** Nuestra ventana:
		this.setTitle("GSM - Entrada de Material");
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerramos con la X, el programa sigue en ejecución, con esta línea lo paramos
		this.setSize(800,600); //Tamaño de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		getContentPane().setLayout(new BorderLayout());
		// Iniciamos los diferentes paneles en métodos para limpiar el cuerpo de la clase
		initNorthPane();
		
		
		this.setVisible(true);
	}
	// Métodos de la clase
	private void initNorthPane() {
		// Creamos panel para colocar los items en la parte superior de la ventana
		pNorte = new JPanel();
		getContentPane().add(pNorte);
		
		// Montamos el panel Norte con los items
		// Configuramos el gridBagLayout
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pNorte.setLayout(gridBagLayout);
		
		// Ponemos label de producto
		JLabel lblProducto = new JLabel("Producto");
		GridBagConstraints gbc_lblProducto = new GridBagConstraints();
		gbc_lblProducto.insets = new Insets(0, 0, 0, 5);
		gbc_lblProducto.anchor = GridBagConstraints.EAST;
		gbc_lblProducto.gridx = 2;
		gbc_lblProducto.gridy = 1;
		pNorte.add(lblProducto, gbc_lblProducto);
		
		// Ponemos comobox para seleccionar el tipo de material que queremos entrar
		cBProducto = new JComboBox();
		GridBagConstraints gbc_cBProducto = new GridBagConstraints();
		gbc_cBProducto.anchor = GridBagConstraints.WEST;
		gbc_cBProducto.gridx = 3;
		gbc_cBProducto.gridy = 1;
		pNorte.add(cBProducto, gbc_cBProducto);
		// Añadimos productos, que tendremos que cogerlo del tipo de productos que tenemos, de momento manual
		cBProducto.addItem("Portátil");
		cBProducto.addItem("Pantalla 21");
		cBProducto.addItem("Pantalla 24");
		cBProducto.addItem("Ordenador");
		cBProducto.addItem("All in One");
		// Lanzamos el método cambioProducto para que coja el primer producto por defecto
		cambioProducto();
		
		cBProducto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cambioProducto();
			}
		});
	}
	
	// Método que revisará el producto seleccionado para mostrar el Jpanel correspondiente
	private void cambioProducto() {
		System.out.println("Se ha cambiado el producto en el Combobox. Ahora es: " + cBProducto.getSelectedItem() );
	}
}
