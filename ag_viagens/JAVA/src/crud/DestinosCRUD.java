package crud;

import dao.DestinoDAO;
import modelo.Destinos;

import java.util.Scanner;

public class DestinosCRUD {

	public static void main(String[] args) {
		DestinoDAO destinoDAO = new DestinoDAO();

		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;

		int Id_destinos = 0;
		String Nome_Destinos = "";
		String nome1 = "";
		double Preco = 0;

		do {
			System.out.println("=== CRUD Destinos ===");
			System.out.println("1 - Cadastrar Destino");
			System.out.println("2 - Consultar Destino");
			System.out.println("3 - Atualizar Destino");
			System.out.println("4 - Deletar Destino");
			System.out.println("5 - Buscar por id");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("Digite o nome do Destino: ");
				Nome_Destinos = s.nextLine();
				System.out.println("Digite o preco do Destino: ");
				Preco = s.nextDouble();
				s.nextLine();
				System.out.println("Digite o id do Destino: ");
				Id_destinos = s.nextInt();
				s.nextLine();
				
				Destinos destino= new Destinos ();
				destino.setNome_Destinos(Nome_Destinos);
				destino.setPreco(Preco);
				
				
				destinoDAO.save(destino);
				
			System.out.println("\n***  Cadastrou  ***\n");
				
				break;
			case 2:
				// READ
				for (Destinos l : destinoDAO.getDestinos()) {
					System.out.println("Id: " + l.getId_destinos() + " Nome: " + l.getNome_Destinos() 
					+ " preco: "+ l.getPreco());
				}

				System.out.println("consultou");
				
				break;
			case 3:
				// UPDATE
				System.out.println("Digite o id do Destino: ");
				posicao = s.nextInt();
				s.nextLine();
				System.out.println("Digite o nome do Destino: ");
				nome1 = s.nextLine();
				System.out.println("Digite o preco do Destino: ");
				Preco = s.nextDouble();
				s.nextLine();
				
				Destinos l2 =  new Destinos(posicao, Nome_Destinos, Preco );
	
				destinoDAO.update(l2);

				System.out.println("atualizou" + l2.getNome_Destinos());
				break;
			case 4:
				// DELETE
				System.out.println("Digite o id do Destino: ");
				posicao = s.nextInt();

				destinoDAO.deleteById(posicao);

				break;
			case 5:
				// buscar por id
				System.out.println("Digite o id do Destino: ");
				posicao = s.nextInt();

				Destinos l3 =  destinoDAO.getDestinosById(posicao);

				System.out.println("Id: " + l3.getId_destinos() + " Nome: " + l3.getNome_Destinos() 
				+ " Preço: "+ l3.getPreco());

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
