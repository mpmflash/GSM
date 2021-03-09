package Program;

import java.util.ArrayList;

public class Datos {

	//Atributos de la clase
	
	private ArrayList<Material> lstStock;
	private ArrayList<Pedido> lstPedido;
	
	public Datos() {
		
	}
	
	public Datos(ArrayList<Material> stock) {
		lstStock = new ArrayList<Material>();
		lstStock = stock;
	}
	
	public Datos(ArrayList<Material> stock, ArrayList<Pedido> listaPedido) {
		lstStock = new ArrayList<Material>();
		lstStock = stock;
		
		lstPedido = new ArrayList<Pedido>();
		lstPedido = listaPedido;
	}

}
