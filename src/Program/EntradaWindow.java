package Program;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
import java.util.ArrayList;

public class EntradaWindow extends JFrame {
	// Atributos de la clase
	private ArrayList<Material> stock;
	// Diferentes JPanels para los diferentes tipos de material
	private JPanel pNorte;
	private JPanel pCPortatil;
	private JPanel pCSobremesa;
	private JPanel pCPantalla;
	private JPanel pCAllinone;
	private JPanel pCTpv;
	private JPanel pCFw;
	private JPanel pSouth;
	private JPanel pActivo;
	
	// Componentes de los diferentes JPanels
	// JPanel NorthPane
	private JComboBox cBProducto;
	private JTextField tFMarca;
	private JTextField tFModelo;
	private JTextArea tAComentario;
	private JComboBox cBPedido;
	
	// JPanel CenterPane
	private boolean firstTime = true;
	// pCPortatil:
	private JTextField tFPSN;
	private JTextField tFPHDD;
	private JTextField tFPRAM;
	// pCSobremesa:
	private JTextField tFSSN;
	private JTextField tFSHDD;
	private JTextField tFSRAM;
	// pCPantalla
	private JComboBox cBTamanyo;
	// pCAllinone
	private JTextField tFASN;
	private JTextField tFAHDD;
	private JTextField tFARAM;
	// pCTpv
	private JTextField tFTSN;
	private JTextField tFTHDD;
	private JTextField tFTRAM;
	// pCFw
	private JTextField tFFSN;
	private JComboBox cBFw;
	
	// JPanel South:
	private JButton bGuardar;
	private JButton bVolver;
	
	// Constructor vacío:
	public EntradaWindow( ArrayList<Material> lstMat, ArrayList<Pedido> lstPed) {
		// ** Nuestra ventana:
		this.setTitle("GSM - Entrada de Material");
		this.setSize(400,300); //Tamaño de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		getContentPane().setLayout(new BorderLayout());
		// Inicializamos las listas para poderlas utilizar
		stock = lstMat;
		// Iniciamos los diferentes paneles en métodos para limpiar el cuerpo de la clase
		initPortatilPane();
		initSobremesaPane();
		initPantallaPane();
		initAllinonePane();
		initTpvPane();
		initFirewallPane();
		initNorthPane();
		initSouthPane();
		
		this.setVisible(true);
	}
	// Métodos de la clase
	/*
	 * initNorthPane();
	 * Método para iniciar el Panel North con sus objetos
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
		//gbc_lblProducto.anchor = GridBagConstraints.EAST;
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
		cBProducto.addItem("Ordenador");
		cBProducto.addItem("Pantalla");
		cBProducto.addItem("All in One");
		cBProducto.addItem("TPV");
		cBProducto.addItem("Firewall");
		
		// Ponemos label marca:
		JLabel lblMarca = new JLabel("Marca");
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.gridx = 2;
		gbc_lblMarca.gridy = 2;
		pNorte.add(lblMarca, gbc_lblMarca);
		// Ponemos TextField de Marca
		tFMarca = new JTextField();
		tFMarca.setColumns(15);
		GridBagConstraints gbc_tFMarca = new GridBagConstraints();
		gbc_tFMarca.anchor = GridBagConstraints.WEST;
		gbc_tFMarca.gridx = 3;
		gbc_tFMarca.gridy = 2;
		pNorte.add(tFMarca, gbc_tFMarca);
		// Ponemos Label Modelo
		JLabel lblModelo = new JLabel("Modelo");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.gridx = 2;
		gbc_lblModelo.gridy = 3;
		pNorte.add(lblModelo, gbc_lblModelo);
		// Ponemos TextField de Modelo
		tFModelo = new JTextField();
		tFModelo.setColumns(15);
		GridBagConstraints gbc_tFModelo = new GridBagConstraints();
		gbc_tFModelo.anchor = GridBagConstraints.WEST;
		gbc_tFModelo.gridx = 3;
		gbc_tFModelo.gridy = 3;
		pNorte.add(tFModelo, gbc_tFModelo);
		// Ponemos label Comentario
		JLabel lblComentario = new JLabel("Comentario");
		GridBagConstraints gbc_lblComentario = new GridBagConstraints();
		gbc_lblComentario.gridx = 2;
		gbc_lblComentario.gridy = 4;
		pNorte.add(lblComentario, gbc_lblComentario);
		// Ponemos TextArea comentario
		tAComentario = new JTextArea();
		GridBagConstraints gbc_tAComentario = new GridBagConstraints();
		gbc_tAComentario.gridwidth = 2;
		gbc_tAComentario.fill = GridBagConstraints.HORIZONTAL;
		gbc_tAComentario.gridx = 2;
		gbc_tAComentario.gridy = 5;
		pNorte.add(tAComentario, gbc_tAComentario);
		JLabel lblPedido = new JLabel("Pedido");
		GridBagConstraints gbc_lblPedido = new GridBagConstraints();
		gbc_lblPedido.gridx = 2;
		gbc_lblPedido.gridy = 6;
		pNorte.add(lblPedido, gbc_lblPedido);
		// Ponemos el Combobox de pedido
		cBPedido = new JComboBox();
		GridBagConstraints gbc_cBPedido = new GridBagConstraints();
		gbc_cBPedido.gridx = 3;
		gbc_cBPedido.gridy = 6;
		cBPedido.addItem("Stock");
		pNorte.add(cBPedido, gbc_cBPedido);
		
		
		// Lanzamos el método cambioProducto para que coja el primer producto por defecto
		cambioProducto();
		
		cBProducto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cambioProducto();
			}
		});
	}
	
	/*
	 * cambioProducto(); - activado por ActionListener del Combobox
	 * Método que revisará el producto seleccionado para mostrar el Jpanel correspondiente
	 * @param void
	 * @return void
	 */
	private void cambioProducto() {
		System.out.println("Se ha cambiado el producto en el Combobox. Ahora es: " + cBProducto.getSelectedItem() );		
		switch( cBProducto.getSelectedItem().toString() ) {
			case "Portátil": 
				System.out.println("Escogido portatil en el combobox");
				if(firstTime) {
					getContentPane().add(pCPortatil, BorderLayout.CENTER);
					pActivo = pCPortatil;
					pCPortatil.setVisible(true);
					firstTime = false;
				}else {
					pActivo.setVisible(false);
					getContentPane().remove(pActivo);
					getContentPane().add(pCPortatil, BorderLayout.CENTER);
					pActivo = pCPortatil;
					pCPortatil.setVisible(true);
				}
				break;
			case "Ordenador":
				System.out.println("Escogido sobremesa en el combobox");
				pActivo.setVisible(false);
				getContentPane().remove(pActivo);
				getContentPane().add(pCSobremesa, BorderLayout.CENTER);
				pActivo = pCSobremesa;
				pCSobremesa.setVisible(true);
				break;
			case "Pantalla":
				System.out.println("Escogido pantalla en el combobox");
				pActivo.setVisible(false);
				getContentPane().remove(pActivo);
				getContentPane().add(pCPantalla, BorderLayout.CENTER);
				pActivo = pCPantalla;
				pCPantalla.setVisible(true);
				break;
			case "All in One":
				System.out.println("Escogido All in one en el combobox");
				pActivo.setVisible(false);
				getContentPane().remove(pActivo);
				getContentPane().add(pCAllinone, BorderLayout.CENTER);
				pActivo = pCAllinone;
				pCAllinone.setVisible(true);
				break;
			case "TPV":
				System.out.println("Escogido TPV en el combobox");
				pActivo.setVisible(false);
				getContentPane().remove(pActivo);
				getContentPane().add(pCTpv, BorderLayout.CENTER);
				pActivo = pCTpv;
				pCTpv.setVisible(true);
				break;
			case "Firewall":
				System.out.println("Escogido firewall en el combobox");
				pActivo.setVisible(false);
				getContentPane().remove(pActivo);
				getContentPane().add(pCFw, BorderLayout.CENTER);
				pActivo = pCFw;
				pCFw.setVisible(true);
				break;
				
			default:
				System.out.println("Aquí no debería entrar en la vida Hulio!");
				break;
		}
	}
	
	/*
	 * initPortatilPane();
	 * Método que preparará el panel de entrada de material de portátil
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
		pCPortatil.setBorder(BorderFactory.createTitledBorder(" Agregando portátil "));
		
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
	 * initSobremesaPane();
	 * Método que preparará el panel de entrada de material de sobremesa
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
		tFSSN.setColumns(25);
		JLabel lblHDD = new JLabel("HDD");
		tFSHDD = new JTextField();
		tFSHDD.setColumns(25);
		JLabel lblRAM = new JLabel("RAM");
		tFSRAM = new JTextField();
		tFSRAM.setColumns(25);
		//Agregamos los objetos creados al panel
		pCSobremesa.add(lblPortSN);
		pCSobremesa.add(tFSSN);
		pCSobremesa.add(lblHDD);
		pCSobremesa.add(tFSHDD);
		pCSobremesa.add(lblRAM);
		pCSobremesa.add(tFSRAM);
	}
	
	/*
	 * initPantallaPane();
	 * Método que preparará el panel de entrada de material de pantallas
	 * @param void
	 * @return void
	 */
	private void initPantallaPane() {
		pCPantalla = new JPanel();
		FlowLayout fLayout = new FlowLayout();
		fLayout.setHgap(20);
		fLayout.setVgap(5);
		pCPantalla.setLayout(fLayout);
		pCPantalla.setBorder(BorderFactory.createTitledBorder(" Agregando Pantalla "));
		
		JLabel lblTamanyo = new JLabel("Tamaño");
		cBTamanyo = new JComboBox();
		cBTamanyo.addItem("21");
		cBTamanyo.addItem("24");
		//Agregamos los objetos creados al panel
		pCPantalla.add(lblTamanyo);
		pCPantalla.add(cBTamanyo);
	}
	
	/*
	 * initAllinonePane();
	 * Método que preparará el panel de entrada de material de Allinone
	 * @param void
	 * @return void
	 */
	private void initAllinonePane() {
		pCAllinone = new JPanel();
		FlowLayout fLayout = new FlowLayout();
		fLayout.setHgap(20);
		fLayout.setVgap(5);
		pCAllinone.setLayout(fLayout);
		pCAllinone.setBorder(BorderFactory.createTitledBorder(" Agregando All-in-One "));
		
		JLabel lblAllinoneSN = new JLabel("S/N");
		tFASN = new JTextField();
		tFASN.setColumns(25);
		JLabel lblHDD = new JLabel("HDD");
		tFAHDD = new JTextField();
		tFAHDD.setColumns(25);
		JLabel lblRAM = new JLabel("RAM");
		tFARAM = new JTextField();
		tFARAM.setColumns(25);
		//Agregamos los objetos creados al panel
		pCAllinone.add(lblAllinoneSN);
		pCAllinone.add(tFASN);
		pCAllinone.add(lblHDD);
		pCAllinone.add(tFAHDD);
		pCAllinone.add(lblRAM);
		pCAllinone.add(tFARAM);
	}
	
	/*
	 * initTpvPane();
	 * Método que preparará el panel de entrada de material de Allinone
	 * @param void
	 * @return void
	 */
	private void initTpvPane() {
		pCTpv = new JPanel();
		FlowLayout fLayout = new FlowLayout();
		fLayout.setHgap(20);
		fLayout.setVgap(5);
		pCTpv.setLayout(fLayout);
		pCTpv.setBorder(BorderFactory.createTitledBorder(" Agregando TPV "));
		
		JLabel lblAllinoneSN = new JLabel("S/N");
		tFTSN = new JTextField();
		tFTSN.setColumns(25);
		JLabel lblHDD = new JLabel("HDD");
		tFTHDD = new JTextField();
		tFTHDD.setColumns(25);
		JLabel lblRAM = new JLabel("RAM");
		tFTRAM = new JTextField();
		tFTRAM.setColumns(25);
		//Agregamos los objetos creados al panel
		pCTpv.add(lblAllinoneSN);
		pCTpv.add(tFTSN);
		pCTpv.add(lblHDD);
		pCTpv.add(tFTHDD);
		pCTpv.add(lblRAM);
		pCTpv.add(tFTRAM);
	}
	
	/*
	 * initFirewallPane();
	 * Método que preparará el panel de entrada de material de pantallas
	 * @param void
	 * @return void
	 */
	private void initFirewallPane() {
		pCFw = new JPanel();
		FlowLayout fLayout = new FlowLayout();
		fLayout.setHgap(20);
		fLayout.setVgap(5);
		pCFw.setLayout(fLayout);
		pCFw.setBorder(BorderFactory.createTitledBorder(" Agregando Firewall "));
		
		JLabel lblSNFW = new JLabel("SN");
		tFFSN = new JTextField();
		tFFSN.setColumns(10);
		JLabel lblTamanyo = new JLabel("Tamaño");
		cBFw = new JComboBox();
		cBFw.addItem("Pequeño");
		cBFw.addItem("Grande");
		//Agregamos los objetos creados al panel
		pCFw.add(lblSNFW);
		pCFw.add(tFFSN);
		pCFw.add(lblTamanyo);
		pCFw.add(cBFw);
	}
	
	/*
	 * initSouthPane();
	 * Método que iniciará y mostrará el panel de la parte bottom de la ventana
	 * @param void
	 * @return void
	 */
	private void initSouthPane() {
		pSouth = new JPanel();
		getContentPane().add(pSouth, BorderLayout.SOUTH);
		pSouth.setLayout(new FlowLayout());
		// Creamos objetos y agregamos al panel
		bGuardar = new JButton("Guardar datos");
		
		bGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveData( cBProducto.getSelectedItem().toString() );
				System.out.println("Se ha guardado el material correctamente");
				closeWindow();
			}
		});
		pSouth.add(bGuardar);
		
		bVolver = new JButton("Volver");
		bVolver.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Cierra la ventana y vuelve a la pantalla principal del programa
				closeWindow();
			}
		});
		pSouth.add(bVolver);
	}
	
	/*
	 * saveData();
	 * Método que coge los datos introducidos y los guarda en una entrada de material
	 * @param
	 * @return
	 */
	private void saveData(String producto) {
		switch(producto) {
		// TO-DO - Probar agregando un portátil
		case "Portátil":
			System.out.println("Guardando Portátil [SaveData]");
			Portatil laptop = new Portatil(stock.size()+1, tFPSN.getText(), tFMarca.getText(), tFModelo.getText(), tAComentario.getText(), Integer.parseInt(tFPHDD.getText()), Integer.parseInt(tFPRAM.getText()));
			stock.add(laptop);
			break;
		case "Sobremesa":
			System.out.println("Guardando Sobremesa [SaveData]");
			Ordenador pc = new Ordenador( stock.size()+1, tFSSN.getText(), tFMarca.getText(), tFModelo.getText(), tAComentario.getText(), Integer.parseInt(tFSHDD.getText()), Integer.parseInt(tFSRAM.getText()));
			stock.add(pc);
			break;
		case "Pantalla":
			System.out.println("Guardando Pantalla [SaveData]");
			//Pantalla screen = new Pantalla( stock.size()+1,);
			break;
		case "All in One":
			System.out.println("Guardando AllinOne [SaveData]");
			Allinone aio = new Allinone();
			break;
		case "TPV":
			System.out.println("Guardando TPV [SaveData]");
			Tpv tpv = new Tpv();
			break;
		case "Firewall":
			System.out.println("Guardando Firewall [SaveData]");
			boolean tiny;
			if(cBFw.getSelectedIndex() == 0) {
				tiny = true;
			} else {
				tiny = false;
			}
			Firewall fw = new Firewall( stock.size()+1, tFFSN.getText(), tFMarca.getText(), tFModelo.getText(), tAComentario.getText(), tiny);
			stock.add(fw);
			break;
		default:
			System.out.println("Opción no contemplada en este switch [SaveData]");
			break;
		}
		
	}
	
	/*
	 * closeWindow();
	 * Método que nos sirve para cerrar el JFrame activo
	 * @param void
	 * @return void
	 */
	private void closeWindow() {
		this.dispose();
	}
}
