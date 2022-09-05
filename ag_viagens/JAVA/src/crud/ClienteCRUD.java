package crud;

import dao.ClienteDAO;
import modelo.Cliente;

import java.util.Scanner;

public class ClienteCRUD {

	public static void main(String[] args) {
		ClienteDAO clienteDAO = new ClienteDAO();


		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;

		int Id_cliente = 0;
		String nome1 = "";
		String nome = "";
		String cpf = "";
		String Endereco = "";

		do {
			System.out.println("=== CRUD Cliente ===");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Consultar Cliente");
			System.out.println("3 - Atualizar Cliente");
			System.out.println("4 - Deletar Cliente");
			System.out.println("5 - Buscar por id");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();

			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("Digite o nome do Cliente: ");
				nome = s.nextLine();
				System.out.println("Digite o CPF do Cliente: ");
				cpf = s.nextLine();
				s.nextLine();
				System.out.println("Digite o Endereço do Cliente: ");
				Endereco = s.nextLine();

				
				Cliente cliente= new Cliente ();
				cliente.setNome(nome);
				cliente.setCpf(cpf);
				cliente.setEndereco(Endereco);
				
				
				clienteDAO.save(cliente);
				
				
			System.out.println("\n***  Cadastrou  ***\n");
			
				break;
			case 2:
				// READ
				for (Cliente l : clienteDAO.getCliente()) {
					System.out.println("Id: " + l.getId_cliente() + " Nome: " + l.getNome() 
					+ " CPF: "+ l.getCpf());
				}

				System.out.println("consultou");
				break;
			case 3:
				// UPDATE
				System.out.println("Digite o id do Cliente: ");
				posicao = s.nextInt();
				s.nextLine();
				System.out.println("Digite o nome do Cliente: ");
				nome1 = s.nextLine();
				System.out.println("Digite o CPF: ");
				cpf = s.nextLine();
				System.out.println("Digite o Endereço do Cliente: ");
				Endereco = s.nextLine();

				

				Cliente l2 = new Cliente(posicao, nome1, cpf, Endereco);

				clienteDAO.update(l2);

				System.out.println("atualizou" + l2.getNome());
				break;
			case 4:
				// DELETE
				System.out.println("Digite o id do Cliente: ");
				posicao = s.nextInt();

				clienteDAO.deleteById(posicao);

				break;
			case 5:
				// buscar por id
				System.out.println("Digite o id do Cliente: ");
				posicao = s.nextInt();

				Cliente l3 = clienteDAO.getClienteById(posicao);

				System.out.println("Id: " + l3.getId_cliente() + " Nome: " + l3.getNome() 
				+" CPF: "+ l3.getCpf()  + "Endereco: "+ l3.getEndereco());

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