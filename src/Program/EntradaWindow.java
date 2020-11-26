package Program;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntradaWindow extends JFrame {
	// Atributos de la clase
	// Diferentes JPanels para los diferentes tipos de material
	private JPanel pNorte;
	private JPanel pCPortatil;
	private JPanel pCSobremesa;
	private JPanel pCPantalla21;
	private JPanel pCPantalla24;
	private JPanel pCAllinOne;
	private JPanel pCTpv;
	private JPanel pCFwmini;
	private JPanel pCFwbig;
	private JPanel pSouth;
	private JPanel pActivo;
	
	// Componentes de los diferentes JPanels
	// JPanel NorthPane
	private JComboBox cBProducto;
	
	// JPanel CenterPane
	// pCPortatil:
	private JTextField tFPSN;
	private JTextField tFPHDD;
	private JTextField tFPRAM;
	// pCSobremesa:
	private JTextField tFSSN;
	private JTextField tFSHDD;
	private JTextField tFSRAM;
	
	// JPanel South:
	private JButton bGuardar;
	private JButton bVolver;
	
	// Constructor vac�o:
	public EntradaWindow() {
		// ** Nuestra ventana:
		this.setTitle("GSM - Entrada de Material");
		this.setSize(400,300); //Tama�o de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		getContentPane().setLayout(new BorderLayout());
		// Iniciamos los diferentes paneles en m�todos para limpiar el cuerpo de la clase
		initPortatilPane();
		initSobremesaPane();
		initNorthPane();
		initSouthPane();
		
		this.setVisible(true);
	}
	// M�todos de la clase
	/*
	 * initNorthPane();
	 * M�todo para iniciar el Panel North con sus objetos
	 * @param void
	 * @return void
	 */
	private void initNorthPane() {
		// Creamos panel para colocar los items en la parte superior de la ventana
		pNorte = new JPanel();
		getContentPane().add(pNorte, BorderLayout.NORTH);
		
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
		// A�adimos productos, que tendremos que cogerlo del tipo de productos que tenemos, de momento manual
		cBProducto.addItem("Port�til");
		cBProducto.addItem("Sobremesa");
		cBProducto.addItem("Pantalla 21");
		cBProducto.addItem("Pantalla 24");
		cBProducto.addItem("All in One");
		// Lanzamos el m�todo cambioProducto para que coja el primer producto por defecto
		cambioProducto();
		
		cBProducto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cambioProducto();
			}
		});
	}
	
	/*
	 * cambioProducto();
	 * M�todo que revisar� el producto seleccionado para mostrar el Jpanel correspondiente
	 * @param void
	 * @return void
	 */
	private void cambioProducto() {
		System.out.println("Se ha cambiado el producto en el Combobox. Ahora es: " + cBProducto.getSelectedItem() );
		// El primer JPanel que estoy montando es el del portatil as� que lo har� fijo por el momento
		// TO-DO: M�todo para intercambiar JPanels
		getContentPane().add(pCPortatil, BorderLayout.CENTER);
		switch( cBProducto.getSelectedItem().toString() ) {
			case "Port�til": 
				System.out.println("Escogido portatil en el combobox");
				pCPortatil.setVisible(true);
				break;
			case "Sobremesa":
				System.out.println("Escogido sobremesa en el combobox");
				break;
			default:
				System.out.println("Aqu� no deber�a entrar en la vida Hulio!");
				break;
		}
	}
	
	/*
	 * initPortatilPane();
	 * M�todo que preparar� el panel de entrada de material de port�til
	 * @param void
	 * @return void
	 */
	private void initPortatilPane() {
		pCPortatil = new JPanel();
		//pCPortatil.setLayout(new GridLayout(3,2));
		FlowLayout fLayout = new FlowLayout();
		fLayout.setHgap(20);
		fLayout.setVgap(5);
		pCPortatil.setLayout(fLayout);
		pCPortatil.setBorder(BorderFactory.createTitledBorder(" Agregando port�til "));
		
		JLabel lblPortSN = new JLabel("S/N");
		tFPSN = new JTextField();
		tFPSN.setColumns(25);
		JLabel lblHDD = new JLabel("HDD");
		tFPHDD = new JTextField();
		tFPHDD.setColumns(25);
		JLabel lblRAM = new JLabel("RAM");
		tFPRAM = new JTextField();
		tFPRAM.setColumns(25);
		//Agregamos los objetos creados al panel
		pCPortatil.add(lblPortSN);
		pCPortatil.add(tFPSN);
		pCPortatil.add(lblHDD);
		pCPortatil.add(tFPHDD);
		pCPortatil.add(lblRAM);
		pCPortatil.add(tFPRAM);		
	}
	
	/*
	 * initPortatilPane();
	 * M�todo que preparar� el panel de entrada de material de port�til
	 * @param void
	 * @return void
	 */
	private void initSobremesaPane() {
		pCSobremesa = new JPanel();
		FlowLayout fLayout = new FlowLayout();
		fLayout.setHgap(20);
		fLayout.setVgap(5);
		pCSobremesa.setLayout(fLayout);
		pCSobremesa.setBorder(BorderFactory.createTitledBorder(" Agregando sobremesa "));
		
		JLabel lblPortSN = new JLabel("S/N");
		tFSSN = new JTextField();
		tFSSN.setColumns(15);
		JLabel lblHDD = new JLabel("HDD");
		tFSHDD = new JTextField();
		tFSHDD.setColumns(15);
		JLabel lblRAM = new JLabel("RAM");
		tFSRAM = new JTextField();
		tFSRAM.setColumns(15);
		//Agregamos los objetos creados al panel
		pCSobremesa.add(lblPortSN);
		pCSobremesa.add(tFSSN);
		pCSobremesa.add(lblHDD);
		pCSobremesa.add(tFSHDD);
		pCSobremesa.add(lblRAM);
		pCSobremesa.add(tFSRAM);
	}
	
	/*
	 * initSouthPane();
	 * M�todo que iniciar� y mostrar� el panel de la parte bottom de la ventana
	 * @param void
	 * @return void
	 */
	private void initSouthPane() {
		pSouth = new JPanel();
		getContentPane().add(pSouth, BorderLayout.SOUTH);
		pSouth.setLayout(new FlowLayout());
		// Creamos objetos y agregamos al panel
		bGuardar = new JButton("Guardar datos");
		pSouth.add(bGuardar);
		bVolver = new JButton("Volver");
		pSouth.add(bVolver);
	}
}
