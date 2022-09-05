package modelo;

import java.util.ArrayList;
import java.util.List;

import modelo.Destinos;
import modelo.Cliente;

	
	public class Pedido {
		private int Id_pedido;
		private String Data_Hora;
		private String Data_Embarque;
		private double total;
		private Cliente cliente;
		private Destinos destinos;
		
		
		private List<Destinos>Pedidos = new ArrayList<Destinos>();
		


		public Pedido() {
		}
		
		
		public Pedido(int Id_pedido, Cliente cliente, Destinos destino, String Data_Hora, String Data_Embarque ) {
			this.Id_pedido = Id_pedido;
			this.cliente= cliente;
			this.destinos= destino;
			this.Data_Hora = Data_Hora;
			this.Data_Embarque = Data_Embarque;

		}


		
		public int getId_pedido() {
			return Id_pedido;
		}


		public void setId_pedido(int id_pedido) {
			Id_pedido = id_pedido;
		}


		public String getData_Hora() {
			return Data_Hora;
		}


		public void setData_Hora(String data_Hora) {
			Data_Hora = data_Hora;
		}


		public String getData_Embarque() {
			return Data_Embarque;
		}


		public void setData_Embarque(String data_Embarque) {
			Data_Embarque = data_Embarque;
		}


		public double getTotal() {
			return total;
		}


		public void setTotal(double total) {
			this.total = total;
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


		public void setDestinos(Destinos destinos) {
			this.destinos = destinos;
		} 
		
		


		public List<Destinos> getPedidos() {
			return Pedidos;
		}


		public void setPedidos(List<Destinos> pedidos) {
			Pedidos = pedidos;
		}


		//Metodo mostrar
		@Override
		public String toString() {
			return "Pedido [Id_pedido=" + Id_pedido + ", Data_Hora=" + Data_Hora +",Data_Embarque="+ Data_Embarque+"]";
		}

		public double calcularPedido() {
			for (int i= 0; i < Pedidos.size(); i++) {
				this.total+= Pedidos.get(i).getPreco();
			}
		        return this.total;
				


		}

		public void mostrarDestinos() {
				System.out.println("Destino: " + destinos.getNome_Destinos() + " total: " + this.total + " Valor: ");
			}

		}

