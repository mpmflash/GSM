package Program;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.GridLayout;

public class FirstWindow extends JFrame{
	private JTextField tFQuickSearch;
	// Atributos de la clase
	// JPanels:
	private JPanel pMenuMaterial;
	private JPanel pQuickSearch;
	private JPanel pCentral;
	private JPanel pPedidos;
	private JPanel pEntrega;
	private JPanel pStock;
	private JPanel pSouth;
	private JPanel pLastEntregas;
	
	// PQuickSearch:
	private JLabel lblQuickSearch;
	
	// PMenuMaterial:
	private JButton btnEntrada;
	private JButton btnSalida;
	private JButton btnAlmacen;
	private JButton btnPrestamos;
	private JButton btnSolicitudes;
	private JButton btnTrabajadores;
	
	// PStock:
	private JLabel lblPortatil;
	private JLabel lblnPortatil;
	private JLabel lblOrdenador;
	private JLabel lblnOrdenador;
	private JLabel lblPantalla21;
	private JLabel lblnPantalla21;
	private JLabel lblPantalla24;
	private JLabel lblnPantalla24;
	private JLabel lblAllInOne;
	private JLabel lblnAllInOne;
	private JLabel lblTpv;
	private JLabel lblnTpv;
	private JLabel lblLitleFirewall;
	private JLabel lblnLitleFirewall;
	private JLabel lblBigFirewall;
	private JLabel lblnBigFirewall;
	
	// PPedidos:
	private JTextPane tPPedidos;
	
	// PEntregas:
	private JTextPane tPEntregas;
	
	// PLastEntregas:
	private JTextPane tPLastMoves;
	
	// Constructor vac�o de la clase
	public FirstWindow() {
		// ** Nuestra ventana:
		this.setTitle("GSM - Gesti�n de Stock Material");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerramos con la X, el programa sigue en ejecuci�n, con esta l�nea lo paramos
		this.setSize(800,600); //Tama�o de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		
		// Configurando panel Men� Material
		pMenuMaterial = 	new JPanel();
		pMenuMaterial.setLayout(new GridBagLayout());
		
		// Ahora ya podemos agregar objetos al panel
		// Bot�n entrada
		btnEntrada = new JButton("Entrada");
		GridBagConstraints cBtnEntrada = new GridBagConstraints();
		cBtnEntrada.gridx = 0;
		cBtnEntrada.gridy = 0;
		cBtnEntrada.fill = GridBagConstraints.HORIZONTAL;
		cBtnEntrada.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnEntrada, cBtnEntrada);
		// Bot�n salida
		GridBagConstraints cBtnSalida = new GridBagConstraints(); 
		btnSalida = new JButton("Salida");
		cBtnSalida.gridx = 0;
		cBtnSalida.gridy = 1;
		cBtnSalida.fill = GridBagConstraints.HORIZONTAL;
		cBtnSalida.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnSalida, cBtnSalida);
		// Bot�n Almac�n
		btnAlmacen = new JButton("Almac�n");
		GridBagConstraints cBtnAlmacen = new GridBagConstraints();
		cBtnAlmacen.gridx = 0;
		cBtnAlmacen.gridy = 2;
		cBtnAlmacen.fill = GridBagConstraints.HORIZONTAL;
		cBtnAlmacen.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnAlmacen, cBtnAlmacen);
		// Bot�n Pr�stamos
		btnPrestamos = new JButton("Pr�stamos");
		GridBagConstraints cBtnPrestamos = new GridBagConstraints();
		cBtnPrestamos.gridx = 0;
		cBtnPrestamos.gridy = 3;
		cBtnPrestamos.fill = GridBagConstraints.HORIZONTAL;
		cBtnPrestamos.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnPrestamos, cBtnPrestamos);
		// Bot�n Solicitudes
		btnSolicitudes = new JButton("Solicitudes");
		GridBagConstraints cBtnSolicitudes = new GridBagConstraints();
		cBtnSolicitudes.gridx = 0;
		cBtnSolicitudes.gridy = 4;
		cBtnSolicitudes.fill = GridBagConstraints.HORIZONTAL;
		cBtnSolicitudes.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnSolicitudes, cBtnSolicitudes);
		// Bot�n Trabajadores
		btnTrabajadores = new JButton("Trabajadores");
		GridBagConstraints cBtnTrabajadores = new GridBagConstraints();
		cBtnTrabajadores.gridx = 0;
		cBtnTrabajadores.gridy = 5;
		cBtnTrabajadores.fill = GridBagConstraints.HORIZONTAL;
		cBtnTrabajadores.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnTrabajadores, cBtnTrabajadores);
		
		// Agregamos el Panel Men� Material al ContentPane
		getContentPane().add(pMenuMaterial, BorderLayout.WEST);
		pMenuMaterial.setBorder(BorderFactory.createTitledBorder("Stock Central"));

		// Panel Quick Search
		pQuickSearch = new JPanel();
		getContentPane().add(pQuickSearch, BorderLayout.NORTH);
		
		lblQuickSearch = new JLabel("B�squeda r�pida:");
		pQuickSearch.add(lblQuickSearch);
		
		tFQuickSearch = new JTextField();
		tFQuickSearch.setHorizontalAlignment(SwingConstants.RIGHT);
		pQuickSearch.add(tFQuickSearch);
		tFQuickSearch.setColumns(20);
		
		// Panel Central
		pCentral = new JPanel();
		getContentPane().add(pCentral, BorderLayout.CENTER);
		pCentral.setLayout(new GridLayout(0, 3));
		
		// Panel Pedidos > Dentro de pCentral
		pPedidos = new JPanel();
		pPedidos.setBorder(BorderFactory.createTitledBorder("Pedidos"));
		pCentral.add(pPedidos);
		
		tPPedidos = new JTextPane();
		tPPedidos.setPreferredSize(new Dimension(190,400));
		tPPedidos.setEditable(false);
		pPedidos.add(tPPedidos);
		
		// Panel Entrega > Dentro de pCentral
		pEntrega = new JPanel();
		pEntrega.setBorder(BorderFactory.createTitledBorder("Entregas"));
		pCentral.add(pEntrega);
		
		tPEntregas = new JTextPane();
		tPEntregas.setPreferredSize(new Dimension(190,400));
		tPEntregas.setEditable(false);
		pEntrega.add(tPEntregas);
		
		// Panel Stock > Dentro d pCentral
		pStock = new JPanel();
		pStock.setBorder(BorderFactory.createTitledBorder("Stock"));
		pStock.setLayout(new GridLayout(0,2));
		pCentral.add(pStock);
		
		lblPortatil = new JLabel("Port�tiles:");
		pStock.add(lblPortatil);
		lblnPortatil = new JLabel("0"); // Esta informaci�n habr� que sacarla de una BBDD
		pStock.add(lblnPortatil);
		
		lblOrdenador = new JLabel("Ordenadores:");
		pStock.add(lblOrdenador);
		lblnOrdenador = new JLabel("0"); // Esta informaci�n habr� que sacarla de una BBDD
		pStock.add(lblnOrdenador);
		
		lblPantalla21 = new JLabel("Pantallas 21\':");
		pStock.add(lblPantalla21);
		lblnPantalla21 = new JLabel("0"); // Esta informaci�n habr� que sacarla de una BBDD
		pStock.add(lblnPantalla21);
		
		lblPantalla24 = new JLabel("Pantallas 24\':");
		pStock.add(lblPantalla24);
		lblnPantalla24 = new JLabel("0"); // Esta informaci�n habr� que sacarla de una BBDD
		pStock.add(lblnPantalla24);
		
		lblAllInOne = new JLabel("All in One:");
		pStock.add(lblAllInOne);
		lblnAllInOne = new JLabel("0"); // Esta informaci�n habr� que sacarla de una BBDD
		pStock.add(lblnAllInOne);
		
		lblTpv = new JLabel("TPV's:");
		pStock.add(lblTpv);
		lblnTpv = new JLabel("0"); // Esta informaci�n habr� que sacarla de una BBDD
		pStock.add(lblnTpv);
		
		lblLitleFirewall = new JLabel("Firewall peque�os:");
		pStock.add(lblLitleFirewall);
		lblnLitleFirewall = new JLabel("0"); // Esta informaci�n habr� que sacarla de una BBDD
		pStock.add(lblnLitleFirewall);
		
		lblBigFirewall = new JLabel("Firewall grandes:");
		pStock.add(lblBigFirewall);
		lblnBigFirewall = new JLabel("0"); // Esta informaci�n habr� que sacarla de una BBDD
		pStock.add(lblnBigFirewall);
		
		//Creamos panel pSouth para organizar mejor lo que queremos en la ventana
		pSouth = new JPanel();
		this.getContentPane().add(pSouth, BorderLayout.SOUTH);
		
		// Panel LastEntregas > Dentro de pSouth
		pLastEntregas = new JPanel();
		pLastEntregas.setBorder(BorderFactory.createTitledBorder("�ltimos movimientos"));
		pSouth.add(pLastEntregas);
		
		tPLastMoves = new JTextPane();
		tPLastMoves.setPreferredSize(new Dimension(400,50));
		tPLastMoves.setEditable(false);
		pLastEntregas.add(tPLastMoves);
	}
	// M�todos de la clase
}
