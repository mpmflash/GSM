package Program;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	// JPanels
	private JPanel pNPedido;
	private JPanel pCenter;
	private JPanel pDatos;
	private JPanel pMaterial;
	private JPanel pObservaciones;
	
	// Zonas de la ventana:
	// pNPedido
	private JTextField tFNPedido;
	
	// pDatos
	private JTextField tFPersona;
	private JTextField tFDestino;
	private JTextField tFAutorizado;
	private JTextField tFTecnico;
	
	// pMaterial
	private JComboBox cBProducto;
	private JButton bAnadir;
	private JButton bEliminar;
	
	// pObservaciones
	private JTextArea tAObservaciones;
	private JButton bRealizarPedido;
	private JButton bCancelarPedido;
	
	// Constructor vacío
	public PedidoWindow() {
		// Preparamos la ventana
		this.setTitle("GSM - Pedido de Material");
		this.setSize(400,300); //Tamaño de la ventana
		this.setLocationRelativeTo(null); // Esto hace que se centre la ventana
		getContentPane().setLayout(new BorderLayout());
		this.setVisible(true);
		// Iniciamos los diferentes paneles en métodos para limpiar el cuerpo de la clase
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
	 * initPanelpMaterial();
	 * Método para preparar el JPanel pMaterial
	 * @param void
	 * @return void
	 */
	private void initPanelpMaterial() {
		pMaterial = new JPanel();
		pMaterial.setLayout(new GridLayout(3,5));
		pMaterial.setBorder(BorderFactory.createTitledBorder("Material"));
		// Producto
		JLabel lblProducto = new JLabel("Producto");
		pMaterial.add(lblProducto);
		cBProducto = new JComboBox();
		cBProducto.addItem("Pc");
		cBProducto.addItem("Portatil");
		cBProducto.addItem("Pantalla 21");
		cBProducto.addItem("Pantalla 24");
		cBProducto.addItem("Allinone");
		cBProducto.addItem("Tpv");
		cBProducto.addItem("Fw grande");
		cBProducto.addItem("Fw pequeño");
		pMaterial.add(cBProducto);
		
		// Botones
		bAnadir = new JButton("Añadir");
		pMaterial.add(bAnadir);
		
		bEliminar = new JButton("Eliminar");
		pMaterial.add(bEliminar);
		
		// Los diferentes objetos que se elijan
		
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
	
	// closeWindow();
	private void closeWindow() {
		this.dispose();
	}
	
}
