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
		//initStock(lstStock);
	}
	
	public Datos(ArrayList<Material> stock, ArrayList<Pedido> listaPedido) {
		lstStock = new ArrayList<Material>();
		lstStock = stock;
		
		lstPedido = new ArrayList<Pedido>();
		lstPedido = listaPedido;
	}
	
	// Getters y Setters
	
	public void setMaterialList( ArrayList<Material> lstMat) {
		lstStock = lstMat;
	}
	public ArrayList<Material> getMaterialList(){
		return lstStock;
	}
	
	public void setPedidoList( ArrayList<Pedido> lstPed) {
		lstPedido = lstPed;
	}
	public ArrayList<Pedido> getPedidoList(){
		return lstPedido;
	}
	
	// Métodos de la clase

}
