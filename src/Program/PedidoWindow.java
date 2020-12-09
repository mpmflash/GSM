package Program;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	private JTextField tFDpto;
	private JTextField tFAutorizado;
	private JTextField tFTecnico;
	
	// pMaterial
	
	// pObservaciones
	
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
		initPanelpCenter();
		initPanelpDatos();
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
	 * initPanelpCenter();
	 * Método para preparar el JPanel pCenter
	 * @param void
	 * @return void
	 */
	private void initPanelpCenter() {
		pCenter = new JPanel();
		pCenter.setLayout(new BorderLayout());
		this.getContentPane().add(pCenter, BorderLayout.CENTER);
	}
	/*
	 * initPanelpDatos();
	 * Método para preparar el JPanel pDatos
	 * @param void
	 * @return void
	 */
	private void initPanelpDatos() {
		pDatos = new JPanel();
		pDatos.setLayout(new GridLayout());
		JLabel lblPersona = new JLabel("Persona");
		tFPersona = new JTextField();
		tFPersona.setColumns(10);
		JLabel lblDpto = new JLabel("Dpto.");
		tFDpto = new JTextField();
		tFDpto.setColumns(10);
		
	}
}
