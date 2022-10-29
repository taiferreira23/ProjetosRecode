package model;

public class Pedido {
	private String Data_Hora;
	private int Id_pedido;
	private String Total_Valor;
	private String Total_Itens;
	private Cliente cliente;
	private Destinos destinos;
	private String Data_Embarque;
	
	public Pedido() {
		super();
	}

	public Pedido(String data_Hora, int id_pedido, String total_Valor, String total_Itens, Cliente cliente,
			Destinos destinos, String data_Embarque) {
		super();
		Data_Hora = data_Hora;
		Id_pedido = id_pedido;
		Total_Valor = total_Valor;
		Total_Itens = total_Itens;
		this.cliente = cliente;
		this.destinos = destinos;
		Data_Embarque = data_Embarque;
	}

	public String getData_Hora() {
		return Data_Hora;
	}

	public void setData_Hora(String data_Hora) {
		Data_Hora = data_Hora;
	}

	public int getId_pedido() {
		return Id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		Id_pedido = id_pedido;
	}

	public String getTotal_Valor() {
		return Total_Valor;
	}

	public void setTotal_Valor(String total_Valor) {
		Total_Valor = total_Valor;
	}

	public String getTotal_Itens() {
		return Total_Itens;
	}

	public void setTotal_Itens(String total_Itens) {
		Total_Itens = total_Itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Destinos getDestinos() {
		return destinos;
	}

	public void setDestinos(Destinos Id_destinos) {
		this.destinos = Id_destinos;
	}

	public String getData_Embarque() {
		return Data_Embarque;
	}

	public void setData_Embarque(String data_Embarque) {
		Data_Embarque = data_Embarque;
	}

	
	
}
