package crud;

import java.sql.Date;
import java.util.Scanner;

import dao.ClienteDAO;
import dao.DestinoDAO;
import dao.PedidoDAO;
import modelo.Cliente;
import modelo.Destinos;
import modelo.Pedido;

public class PedidoCRUD {
	
	public static void main(String[] args) {
		PedidoDAO pedidoDAO = new PedidoDAO();

		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;

		int Id_pedido= 0;
		String Data_Hora = "";
		String Data_Embarque = "";

		do {
			System.out.println("=== CRUD Pedido ===");
			System.out.println("1 - Cadastrar Pedido");
			System.out.println("2 - Consultar Pedido ");
			System.out.println("3 - Atualizar Pedido");
			System.out.println("4 - Deletar Pedido");
			System.out.println("5 - Buscar por id");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				// CREATE
				
				System.out.println("Digite a data do pedido: ");
				Data_Hora = s.nextLine();
				
				System.out.println("Digite a data de embarque no pedido: ");
				Data_Embarque = s.nextLine();
				
				Pedido pedido = new Pedido();
				pedido.setData_Hora(Data_Hora);
				pedido.setData_Embarque(Data_Embarque);
				
				pedidoDAO.save(pedido);
				
				System.out.println("\n***  Cadastrou  ***\n");

				break;
			case 2:
				// READ
				for (Pedido 1 : pedidoDAO.getPedido()) {
					System.out.println("Data_Hora: " + 1.getData_Hora() + " Id_pedido: " + 1.getId_pedido() + 
					" Data_Embarque: " + 1.getData_Embarque());
				}
				
				System.out.println("consultou");
				break;
			case 3:
				// UPDATE
				System.out.println("Digite o id do Pedido: ");
				posicao = s.nextInt();
				s.nextLine();
				
				System.out.println("Digite a data do Pedido: ");
				posicao = s.nextInt();
				s.nextLine();
				
				
				Pedido e2 = new Pedido(posicao, Data_Hora, Id_pedido, Data_Embarque);
			
				pedidoDAO.update(e2);
	
				System.out.println("atualizou");
				break;
			case 4:
				// DELETE
				System.out.println("Digite o id do Pedido: ");
				posicao = s.nextInt();
				
				pedidoDAO.deleteById(posicao);
				
				break;
			case 5:
				// buscar por id
				System.out.println("Digite o id do Pedido: ");
				posicao = s.nextInt();
				
				Pedido e3 = pedidoDAO.getPedidoById_pedido(posicao);
				
				System.out.println("Id: " + e3.getId_pedido());
				
				break;
			default:
				System.out.println(opcao != 0 ? "opção invalida, digite novamente." : "");
				break;

			}

		} while (opcao != 0);

		System.out.println("Até mais!");
		s.close();
	}


}


