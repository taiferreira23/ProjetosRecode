package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


import Connection.MySqlConnection;
import model.Pedido;

public class PedidoDAO {
	
 // Cria uma conexão com o banco
    private static Connection conn = MySqlConnection.createConnection();

	// Metodo pra salvar
	public static void save(Pedido pedido) {
		String sql = "INSERT INTO pedido (Data_Hora, Total_Valor, Total_Itens, Data_Embarque, Id_pedido, Id_destinos, Id_cliente)" + " values(?,?,?,?,?,?)";

		try {
			

			// Cria um PreparedStatement, classe usada para executar a query
		    PreparedStatement pstm = conn.prepareStatement(sql);
			
			// Adicionar o valor do primeiro parametro da sql
			pstm.setString(1, pedido.getData_Hora());
			pstm.setString(2, pedido.getTotal_Valor());
			pstm.setString(3, pedido.getTotal_Itens());
			pstm.setString(4, pedido.getData_Embarque());
			pstm.setInt(5, pedido.getId_pedido());
			pstm.setInt(6, pedido.getDestinos().getId_destinos());
			pstm.setInt(7, pedido.getCliente().getId_cliente());

			// Executar a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} 
		}

	// Metodo para Ler
	public  static List<Pedido> getPedido() {
		String sql = "select * from pedido;";

		List<Pedido> pedidos = new ArrayList<Pedido>();

		// Classe que vai recuperar os dados do banco de dados

		try {
		    Statement statement = conn.createStatement();
            ResultSet rset = statement.executeQuery(sql);

			while (rset.next()) {
				Pedido pedido1 = new Pedido();

				pedido1.setId_pedido(rset.getInt("Id_Pedido"));
				pedido1.setData_Hora(rset.getString("Data_Hora"));
				pedido1.setData_Embarque(rset.getString("Data_Embarque"));
				pedido1.setTotal_Valor(rset.getString("Total_Valor"));
				pedido1.setTotal_Itens(rset.getString("Total_Itens"));

				pedidos.add(pedido1);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} 

		return pedidos;
	}
	
	// Metodo para deletar
	public void deleteById(int id) {
		String sql = "DELETE FROM pedido WHERE Id_pedido = ?";

		try {
		    PreparedStatement pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public Pedido getPedidoById(int id) {
		String sql = "SELECT * FROM pedido WHERE Id_pedido = ?;";

		Pedido pedido = new Pedido();

		ResultSet rset = null;

		try {
		    PreparedStatement pstm = conn.prepareStatement(sql);

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			rset = pstm.executeQuery();

			rset.next();

			pedido.setId_pedido(rset.getInt("Id_pedido"));


		} catch (Exception e) {
			e.printStackTrace();
		}

		return pedido;
	}
}
