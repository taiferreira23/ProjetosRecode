package crud;

import java.util.Arrays;

import dao.ClienteDAO;
import modelo.Cliente;
import modelo.Destinos;
import modelo.Pedido;



public class Principal {

	public static void main(String[] args) {
		
		ClienteDAO clienteDAO = new ClienteDAO();
		
		Cliente a1 = new Cliente(2, "Marcos", "11223344556", "Rua da lua");
		Cliente a2 = new Cliente(20, "Taiane", "11223344557", "Rua do sol");
		
		
		for (Cliente a : clienteDAO.getCliente()) {
			System.out.println(a.getNome());
		}

		
		
		Destinos e1 = new Destinos(1, "Dubai", 1600);
		Destinos e2 = new Destinos(2, "Bahia", 600);
		
		Pedido l1 = new Pedido(1, a1, e1, "20/05/2022- 20:00", "22/10/2022 - 12:00");
		Pedido l2 = new Pedido(2, a2, e2, "25/05/2022- 23:00", "25/05/2023- 23:00");
		
		

		
		
		System.out.println("\n\nPedido: " + l1.getDestinos().getPreco());
		System.out.println("\n\nPedido: " + l2.getDestinos().getPreco());
		
		l1.getPedidos().addAll(Arrays.asList(e1));
		l1.getPedidos().addAll(Arrays.asList(e2));
		
		for (Destinos i : l1.getPedidos()) {
			System.out.println("Destinos: "+ i.getNome_Destinos() 
					+" valor: " + i.getPreco());
		}
		
		System.out.println("\n\nPedido: " + l1.getDestinos().getPreco());
		for (Destinos i : l2.getPedidos()) {
			System.out.println("Destinos: "+ i.getNome_Destinos() 
					+" valor: " + i.getPreco());
		}
		System.out.println(" \nValor compra: " + l2.calcularPedido());
		
	}

}
