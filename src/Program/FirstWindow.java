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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.GridLayout;

public class FirstWindow extends JFrame{
	
	// Atributos de la clase
	private ArrayList<Material> stock;
	
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
	private JTextField tFQuickSearch;
	private JButton bQuickSearch;
	
	// PMenuMaterial:
	private JButton btnEntrada;
	private JButton btnPedido;
	private JButton btnSalida;
	private JButton btnAlmacen;
	private JButton btnPrestamo;
	
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
	
	// Constructor vacío de la clase
	public FirstWindow() {
		// ** Nuestra ventana:
		this.setTitle("GSM - Gestión de Stock Material");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerramos con la X, el programa sigue en ejecución, con esta línea lo paramos
		this.setSize(800,600); //Tamaño de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		
		// Configurando panel Menú Material
		pMenuMaterial = 	new JPanel();
		pMenuMaterial.setLayout(new GridBagLayout());
		
		// Ahora ya podemos agregar objetos al panel
		// Botón entrada
		btnEntrada = new JButton("Entrada");
		GridBagConstraints cBtnEntrada = new GridBagConstraints();
		cBtnEntrada.gridx = 0;
		cBtnEntrada.gridy = 0;
		cBtnEntrada.fill = GridBagConstraints.HORIZONTAL;
		cBtnEntrada.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnEntrada, cBtnEntrada);
		btnEntrada.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el botón Entrada");
				EntradaWindow entradaMaterial = new EntradaWindow(); 
			}
		});
		// Botón Pedido
		btnPedido = new JButton("Pedido");
		GridBagConstraints cBtnPedido = new GridBagConstraints();
		cBtnPedido.gridx = 0;
		cBtnPedido.gridy = 1;
		cBtnPedido.fill = GridBagConstraints.HORIZONTAL;
		cBtnPedido.insets = new Insets(0, 0, 5, 0);
		btnPedido.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Has pulsado el botón Pedido");
				PedidoWindow pedidoMaterial = new PedidoWindow();
			}
			
		});
		pMenuMaterial.add(btnPedido, cBtnPedido);
		// Botón salida
		GridBagConstraints cBtnSalida = new GridBagConstraints(); 
		btnSalida = new JButton("Salida");
		cBtnSalida.gridx = 0;
		cBtnSalida.gridy = 2;
		cBtnSalida.fill = GridBagConstraints.HORIZONTAL;
		cBtnSalida.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnSalida, cBtnSalida);
		// Botón Almacén
		btnAlmacen = new JButton("Almacén");
		GridBagConstraints cBtnAlmacen = new GridBagConstraints();
		cBtnAlmacen.gridx = 0;
		cBtnAlmacen.gridy = 3;
		cBtnAlmacen.fill = GridBagConstraints.HORIZONTAL;
		cBtnAlmacen.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnAlmacen, cBtnAlmacen);
		// Botón Préstamos
		btnPrestamo = new JButton("Préstamo");
		GridBagConstraints cBtnPrestamo = new GridBagConstraints();
		cBtnPrestamo.gridx = 0;
		cBtnPrestamo.gridy = 4;
		cBtnPrestamo.fill = GridBagConstraints.HORIZONTAL;
		cBtnPrestamo.insets = new Insets(0, 0, 5, 0);
		pMenuMaterial.add(btnPrestamo, cBtnPrestamo);
		
		// Agregamos el Panel Menú Material al ContentPane
		getContentPane().add(pMenuMaterial, BorderLayout.WEST);
		pMenuMaterial.setBorder(BorderFactory.createTitledBorder("Stock Central"));

		// Panel Quick Search
		pQuickSearch = new JPanel();
		getContentPane().add(pQuickSearch, BorderLayout.NORTH);
		
		lblQuickSearch = new JLabel("Búsqueda rápida:");
		pQuickSearch.add(lblQuickSearch);
		
		tFQuickSearch = new JTextField();
		tFQuickSearch.setHorizontalAlignment(SwingConstants.RIGHT);
		pQuickSearch.add(tFQuickSearch);
		tFQuickSearch.setColumns(20);
		
		bQuickSearch = new JButton("Búsqueda Rápida");
		pQuickSearch.add(bQuickSearch);
		
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
		// Inicializamos stock para ver números en pantalla
		
		stock = new ArrayList<Material>();
		
		
		pStock = new JPanel();
		pStock.setBorder(BorderFactory.createTitledBorder("Stock"));
		pStock.setLayout(new GridLayout(0,2));
		pCentral.add(pStock);
		
		lblPortatil = new JLabel("Portátiles:");
		pStock.add(lblPortatil);
		lblnPortatil = new JLabel( String.valueOf( countMaterial("Portatil") ) ); // Recorremos la array Stock para saber cuántos portátiles hay
		pStock.add(lblnPortatil);
		
		lblOrdenador = new JLabel("Ordenadores:");
		pStock.add(lblOrdenador);
		lblnOrdenador = new JLabel( String.valueOf( countMaterial("Ordenador") ) ); // Esta información habrá que sacarla de una BBDD
		pStock.add(lblnOrdenador);
		
		lblPantalla21 = new JLabel("Pantallas 21\':");
		pStock.add(lblPantalla21);
		lblnPantalla21 = new JLabel(String.valueOf( countMaterial("Pantalla21") )); // Esta información habrá que sacarla de una BBDD
		pStock.add(lblnPantalla21);
		
		lblPantalla24 = new JLabel("Pantallas 24\':");
		pStock.add(lblPantalla24);
		lblnPantalla24 = new JLabel(String.valueOf( countMaterial("Pantalla24") )); // Esta información habrá que sacarla de una BBDD
		pStock.add(lblnPantalla24);
		
		lblAllInOne = new JLabel("All in One:");
		pStock.add(lblAllInOne);
		lblnAllInOne = new JLabel(String.valueOf( countMaterial("Allinone") )); // Esta información habrá que sacarla de una BBDD
		pStock.add(lblnAllInOne);
		
		lblTpv = new JLabel("TPV's:");
		pStock.add(lblTpv);
		lblnTpv = new JLabel(String.valueOf( countMaterial("Tpv") )); // Esta información habrá que sacarla de una BBDD
		pStock.add(lblnTpv);
		
		lblLitleFirewall = new JLabel("Firewall pequeños:");
		pStock.add(lblLitleFirewall);
		lblnLitleFirewall = new JLabel(String.valueOf( countMaterial("Fwmini") )); // Esta información habrá que sacarla de una BBDD
		pStock.add(lblnLitleFirewall);
		
		lblBigFirewall = new JLabel("Firewall grandes:");
		pStock.add(lblBigFirewall);
		lblnBigFirewall = new JLabel(String.valueOf( countMaterial("Fwbig") )); // Esta información habrá que sacarla de una BBDD
		pStock.add(lblnBigFirewall);
		
		//Creamos panel pSouth para organizar mejor lo que queremos en la ventana
		pSouth = new JPanel();
		this.getContentPane().add(pSouth, BorderLayout.SOUTH);
		
		// Panel LastEntregas > Dentro de pSouth
		pLastEntregas = new JPanel();
		pLastEntregas.setBorder(BorderFactory.createTitledBorder("Últimos movimientos"));
		pSouth.add(pLastEntregas);
		
		tPLastMoves = new JTextPane();
		tPLastMoves.setPreferredSize(new Dimension(400,50));
		tPLastMoves.setEditable(false);
		pLastEntregas.add(tPLastMoves);
	}
	// Métodos de la clase
	private void initStock(ArrayList<Material> listaStock) {

		
	}
	
	/*
	 * countMaterial(String);
	 * Método que le pasas un tipo de material y recorre la arrayList Stock y te cuenta cuántos hay
	 * @param - String (tipo de material: portatil, pantalla, pc,...)
	 * @return - int (cantidad de material)
	 */
	private int countMaterial(String tipo) {
		int x= 0;
		System.out.println("Buscando en la array: "+tipo);
		for(Material lista: stock) {
			if(lista.getTipo() == tipo) {
				x++;
			}
		}
		return x;
	}
}