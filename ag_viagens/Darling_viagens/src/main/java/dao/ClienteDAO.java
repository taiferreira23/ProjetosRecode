package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Connection.MySqlConnection;
import model.Cliente;

public class ClienteDAO {
	
    // Cria uma conexão com o banco
    private static Connection conn = MySqlConnection.createConnection();

	// Metodo pra salvar
	public void save(Cliente cliente) {
		String sql = "INSERT INTO cliente (CPF, Nome, Endereco ) values(?, ?, ?)";

		try {

			// Cria um PreparedStatement, classe usada para executar a query
		    PreparedStatement pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parametro da sql
			pstm.setString(1, cliente.getCpf());
			pstm.setString(2, cliente.getNome());
			pstm.setString(3, cliente.getEndereco());

			// Executar a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		
		}
	    }

	// Metodo para Ler
	public List<Cliente> getCliente() {
		String sql = "select * from cliente;";

		List<Cliente> clientes = new ArrayList<Cliente>();

		// Classe que vai recuperar os dados do banco de dados
	

		try {
	          Statement statement = conn.createStatement();
	          ResultSet rset = statement.executeQuery(sql);

			while (rset.next()) {
				Cliente cliente = new Cliente();
				
				cliente.setCpf(rset.getString("CPF"));
				cliente.setNome(rset.getString("Nome"));
				cliente.setEndereco(rset.getString("Endereco"));
				cliente.setId_cliente(rset.getInt("Id_cliente"));

				

				clientes.add(cliente);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} 

		return clientes;
	}
	// Metodo pra atualizar

	public void update(Cliente cliente) {
		String sql = "UPDATE cliente set CPF = ?, Nome = ?,  Endereco = ?"+" where Id_cliente = ?";

		try {
		    PreparedStatement pstm = conn.prepareStatement(sql);

			pstm = conn.prepareStatement(sql);

			
			pstm.setString(1, cliente.getCpf());
			pstm.setString(2, cliente.getNome());
			pstm.setString(3, cliente.getEndereco());
			pstm.setInt(4, cliente.getId_cliente());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Metodo para deletar
	public void deleteById(int id) {
		String sql = "DELETE FROM cliente WHERE Id_cliente = ?";

		try {
		    PreparedStatement pstm = conn.prepareStatement(sql);

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	    }

	public Cliente getClienteById(int id) {
		String sql = "SELECT * FROM cliente WHERE Id_cliente = ?;";

		Cliente cliente = new Cliente();

		ResultSet rset = null;

		try {
		    PreparedStatement pstm = conn.prepareStatement(sql);

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			rset = pstm.executeQuery();

			rset.next();

			cliente.setId_cliente(rset.getInt("Id_cliente"));

			cliente.setNome(rset.getString("Nome"));

		} catch (Exception e) {
			e.printStackTrace();
		} 

		return cliente;
	}
}		
