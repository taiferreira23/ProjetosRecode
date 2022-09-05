package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionMySQL;
import modelo.Pedido;

public class PedidoDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;

	// Metodo pra salvar
	public void save(Pedido pedido) {
		String sql = "INSERT INTO pedido ( data) values(?);";

		try {
			// Cria uma conexão com o banco
			conn = ConnectionMySQL.createConnectionToMySQL();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);
			
			// Adicionar o valor do primeiro parametro da sql
			pstm.setString(1, pedido.getData_Hora());
			pstm.setString(2, pedido.getData_Embarque());

			// Executar a sql para inserção dos dados
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	// Metodo para Ler
	public List<Pedido> getPedido() {
		String sql = "select * from pedido;";

		List<Pedido> pedidos = new ArrayList<Pedido>();

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Pedido pedido1 = new Pedido();

				pedido1.setId_pedido(rset.getInt("Id_Pedido"));
				pedido1.setData_Hora(rset.getString("Data_Hora"));
				pedido1.setData_Embarque(rset.getString("Data_Embarque"));

				pedidos.add(pedido1);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return pedidos;
	}
	
	
	// Metodo pra atualizar

		public void update(Pedido pedido) {
			String sql = "UPDATE pedido set data = ? where Id_pedido = ?";

			try {
				conn = ConnectionMySQL.createConnectionToMySQL();

				pstm = conn.prepareStatement(sql);


				pstm.setInt(1, pedido.getId_pedido());
				pstm.setString(2, pedido.getData_Hora());
				pstm.setString(3, pedido.getData_Embarque());

				pstm.execute();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (pstm != null) {
						pstm.close();
					}
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	// Metodo para deletar
	public void deleteById(int id) {
		String sql = "DELETE FROM pedido WHERE id_pedido = ?";

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public Pedido getEditoraById(int id) {
		String sql = "SELECT * FROM pedido WHERE id_pedido = ?;";

		Pedido pedido = new Pedido();

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			rset = pstm.executeQuery();

			rset.next();

			pedido.setId_pedido(rset.getInt("id_pedido"));


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return pedido;
	}
}
