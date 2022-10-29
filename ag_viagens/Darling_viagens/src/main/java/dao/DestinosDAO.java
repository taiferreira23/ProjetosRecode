
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import Connection.MySqlConnection;
import model.Destinos;


public class DestinosDAO {
   
 // Cria uma conexão com o banco
    private static Connection conn = MySqlConnection.createConnection();
    
	// Metodo pra salvar
	public void save(Destinos destino) {
		String sql = "INSERT INTO destinos (Preco, Nome_Destinos ) values(?, ?)";

		try {
			
		    

			// Cria um PreparedStatement, classe usada para executar a query
		    PreparedStatement pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parametro da sql
			pstm.setDouble(1, destino.getPreco());
			pstm.setString(2, destino.getNome_Destinos());

			// Executar a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();

		}
	    }

	// Metodo para Ler
	public List<Destinos> getDestinos() {
		String sql = "select * from Destinos_completo;";

		List<Destinos> destinos = new ArrayList<Destinos>();

		// Classe que vai recuperar os dados do banco de dados
		

		try {
		    Statement statement = conn.createStatement();
		    ResultSet rset = statement.executeQuery(sql);
			

			while (rset.next()) {
				Destinos destino = new Destinos();
				
				destino.setId_destinos(rset.getInt("Id_destinos"));
				destino.setPreco(rset.getDouble("Preco"));
				destino.setNome_Destinos(rset.getString("Nome_Destinos"));

				destinos.add(destino);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} 

		return destinos;
	}
	// Metodo pra atualizar

	public void update(Destinos destino) {
		String sql = "UPDATE destino set Preco = ?, Nome_Destinos = ?"+"  where Id_destinos = ?";

		try {
		    PreparedStatement pstm = conn.prepareStatement(sql);
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setInt(1, destino.getId_destinos());

			pstm.setString(2, destino.getNome_Destinos());

			pstm.setDouble(3, destino.getPreco());

			

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	    }

	// Metodo para deletar
	public void deleteById(int id) {
		String sql = "DELETE FROM destino WHERE Id_destinos = ?";

		try {
		    PreparedStatement pstm = conn.prepareStatement(sql);

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	    }
	public Destinos getDestinosById(int id) {
		String sql = "SELECT * FROM destino WHERE Id_destinos = ?;";

		Destinos destino = new Destinos();
		ResultSet rset = null;
		
		try {
		    PreparedStatement pstm = conn.prepareStatement(sql);

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			 rset = pstm.executeQuery();

			rset.next();

			destino.setId_destinos(rset.getInt("Id_destinos"));

			destino.setNome_Destinos(rset.getString("Nome_Destinos"));

			destino.setPreco(rset.getDouble("Preco"));


		} catch (Exception e) {
			e.printStackTrace();
		}

		return destino;
	}
}
