package Program;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class PedidoWindow extends JFrame {
	// Atributos de la clase
	// Arrays necesarias:
	private ArrayList<Pedido> lstPedido;
	
	// Pedido:
	private Pedido pedido;
	
	// JPanels
	private JPanel pNPedido;
	private JPanel pCenter;
	private JPanel pDatos;
	private JPanel pMaterial;
	private JPanel pBtnMaterial;
	private JPanel pMatPedido;
	private JPanel pObservaciones;
	
	// Zonas de la ventana:
	// pNPedido
	private JTextField tFNPedido;
	
	// pDatos
	private JTextField tFPersona;
	private JTextField tFDestino;
	private JTextField tFAutorizado;
	private JTextField tFTecnico;
	
	// pBtnMaterial
	private JComboBox cBProducto;
	private JButton bAnadir;
	private JButton bEliminar;
	//private ArrayList<JLabel> lstLblLastMat;
	
	// pMatPedido
	
	// pObservaciones
	private JTextArea tAObservaciones;
	private JButton bRealizarPedido;
	private JButton bCancelarPedido;
	
	// Constructor vacío
	public PedidoWindow(ArrayList<Pedido> lstPedido) {
		// Preparamos la ventana
		this.setTitle("GSM - Pedido de Material");
		this.setSize(400,400); //Tamaño de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		getContentPane().setLayout(new BorderLayout());
		this.setVisible(true);
		// Iniciamos los diferentes paneles en métodos para limpiar el cuerpo de la clase
		this.lstPedido = lstPedido;
		//lstLblLastMat = new ArrayList<JLabel>();
		pedido = new Pedido();
		
		initPanelpNPedido();
		initPanelpDatos();
		initPanelpMaterial();
		initPanelpCenter();
		initPanelpObservaciones();
	}
	// Métodos de la clase
	/*
	 * initPanelpNPedido();
	 * Método para preparar el JPanel pNPedido
	 * @param void
	 * @return void
	 */
	private void initPanelpNPedido() {
		pNPedido = new JPanel();
		pNPedido.setLayout(new FlowLayout());
		JLabel lblNPedido = new JLabel("Nº Pedido");
		tFNPedido = new JTextField();
		tFNPedido.setColumns(15);
		pNPedido.add(lblNPedido);
		pNPedido.add(tFNPedido);
		this.getContentPane().add(pNPedido, BorderLayout.NORTH);
	}
	
	/*
	 * initPanelpDatos();
	 * Método para preparar el JPanel pDatos
	 * @param void
	 * @return void
	 */
	private void initPanelpDatos() {
		pDatos = new JPanel();
		pDatos.setLayout(new GridLayout(2,4));
		JLabel lblPersona = new JLabel("Persona");
		pDatos.add(lblPersona);
		tFPersona = new JTextField();
		tFPersona.setColumns(10);
		pDatos.add(tFPersona);
		JLabel lblDpto = new JLabel("Dpto.");
		pDatos.add(lblDpto);
		tFDestino = new JTextField();
		tFDestino.setColumns(10);
		pDatos.add(tFDestino);
		JLabel lblAutorizado = new JLabel("Autorizado por");
		pDatos.add(lblAutorizado);
		tFAutorizado = new JTextField();
		tFAutorizado.setColumns(10);
		pDatos.add(tFAutorizado);
		JLabel lblTecnico = new JLabel("Técnico");
		pDatos.add(lblTecnico);
		tFTecnico = new JTextField();
		tFTecnico.setColumns(10);
		pDatos.add(tFTecnico);
	}
	
	/*
	 * initPMaterial();
	 * Inicializar los objetos del panel pMaterial
	 * @param void
	 * @return void
	 */
	private void initPanelpMaterial() {
		pMaterial = new JPanel();
		pMaterial.setLayout(new BorderLayout());
		initPanelpBtnMaterial();
		initPanelMatPedido();
		pMaterial.setBorder(BorderFactory.createTitledBorder("Material"));
		pMaterial.add( pBtnMaterial, BorderLayout.CENTER);
		pMaterial.add( pMatPedido, BorderLayout.SOUTH);
	}
	
	/*
	 * initPanelpBtnMaterial();
	 * Método para preparar el JPanel pMaterial
	 * @param void
	 * @return void
	 */
	private void initPanelpBtnMaterial() {
		pBtnMaterial = new JPanel();
		pBtnMaterial.setLayout(new GridLayout(3,5));
		// Producto
		JLabel lblProducto = new JLabel("Producto");
		pBtnMaterial.add(lblProducto);
		cBProducto = new JComboBox();
		cBProducto.addItem("Portatil");
		cBProducto.addItem("Pc");
		cBProducto.addItem("Pantalla 21");
		cBProducto.addItem("Pantalla 24");
		cBProducto.addItem("Allinone");
		cBProducto.addItem("Tpv");
		cBProducto.addItem("Fw grande");
		cBProducto.addItem("Fw pequeño");
		pBtnMaterial.add(cBProducto);
		
		// Botones
		bAnadir = new JButton("Añadir");
		bAnadir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addMaterial();
			}
			
		});
		pBtnMaterial.add(bAnadir);
		
		bEliminar = new JButton("Eliminar");
		bEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				borrarLastMat();
			}
			
		});
		pBtnMaterial.add(bEliminar);
	}
	
	/*
	 * initPanelMatPedido();
	 * Método que iniciará los objetos que pondremos en el panel de Material del pedido
	 */
	private void initPanelMatPedido(){
		pMatPedido = new JPanel();
		pMatPedido.setLayout(new GridLayout(2,2));
	}
	
	/*
	 * initPanelpCenter();
	 * Método para preparar el JPanel pCenter
	 * @param void
	 * @return void
	 */
	private void initPanelpCenter() {
		pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
		this.getContentPane().add(pCenter, BorderLayout.CENTER);
		pCenter.add(pDatos, BorderLayout.NORTH);
		pCenter.add(pMaterial, BorderLayout.CENTER);
	}
	
	private void initPanelpObservaciones(){
		pObservaciones = new JPanel();
		pObservaciones.setLayout(new GridLayout(3,2));
		this.getContentPane().add(pObservaciones, BorderLayout.SOUTH);
		JLabel lblObservaciones = new JLabel("Observaciones");
		pObservaciones.add(lblObservaciones);
		tAObservaciones = new JTextArea();
		pObservaciones.add(tAObservaciones, 2,1);
		bRealizarPedido = new JButton("Realizar pedido");
		pObservaciones.add(bRealizarPedido);
		bCancelarPedido = new JButton("Cancelar pedido");
		bCancelarPedido.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				closeWindow();	
			}
		});
		pObservaciones.add(bCancelarPedido);
		
	}
	
	// addPedido();
	private void addMaterial() {
		Material mat = new Material();
		switch(cBProducto.getSelectedIndex()) {
		case 0:
			Portatil laptop = new Portatil();
			mat = (Material)laptop;
			break;
		case 1:
			Ordenador pc = new Ordenador();
			mat = (Material)pc;
			break;
		case 2:
			Pantalla screen21 = new Pantalla();
			screen21.setPulgadas(21);
			mat = (Material)screen21;
			break;
		case 3:
			Pantalla screen24 = new Pantalla();
			screen24.setPulgadas(24);
			mat = (Material)screen24;
			break;
		case 4:
			Allinone allinone = new Allinone();
			mat = (Material)allinone;
			break;
		case 5:
			Tpv tpv = new Tpv();
			mat = (Material)tpv;
			break;
		case 6:
			Firewall fwsmall = new Firewall();
			fwsmall.setSmall(true);
			mat = (Material)fwsmall;
			break;
		case 7:
			Firewall fwbig = new Firewall();
			fwbig.setSmall(false);
			mat = (Material)fwbig;
			break;
		default:
			System.out.println("Aquí no debería entrar el programa [Material del Pedido]");
			break;
		}
		//System.out.println(cBProducto.getSelectedIndex());
		/* Estas dos líneas, se tienen que poner cuando guarde el pedido, al fin de hacerlo efectivo
		Pedido pedido = new Pedido(tFPersona.getText(), tFDestino.getText(), tFAutorizado.getText(), tFTecnico.getText(), tAObservaciones.getText());
		lstPedido.add(pedido);
		*/
		pedido.addMaterial(mat);
		JLabel lblLastMat = new JLabel(mat.getTipo());
		//lstLblLastMat.add(lblLastMat);
		pMatPedido.add(lblLastMat);
		pMatPedido.updateUI();
		System.out.println(pMatPedido.getComponentCount());
		System.out.println("Se ha añadido al pedido "+ mat.getTipo());
	}
	
	/*
	 * borrarLastMat();
	 * Elimina el último material añadido al pedido
	 * ¡¡ De momento solo soy capaz de eliminar 1, 2 seguidos falla !!
	 * @param void
	 * @return void
	 */
	private void borrarLastMat(){
		try {
			pMatPedido.remove(pMatPedido.getComponentCount()-1);
			System.out.println(pMatPedido.getComponentCount());
			//lstPedido.get(lstPedido.size()).removeMaterial(); //-- El error lo estoy teniendo todo el rato en esta línea!! No en la de eliminar los JLabels!!
			System.out.println("Eliminando el último material añadido");
			// Falta eliminar el JLabel ... para que no aparezca en el pMaterial
			// Con este código, puedo eliminar tan solo, un JLabel, pero no dos seguidos
			pMatPedido.updateUI();
		}catch(ArrayIndexOutOfBoundsException aIOOBE) {
			System.err.println("No puedes eliminar más materiales");
			System.out.println(pMatPedido.getComponentCount()-1);
		}
		
	}
	
	// closeWindow();
	private void closeWindow() {
		this.dispose();
	}
	
}
