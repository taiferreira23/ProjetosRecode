package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

    private static final String url = "jdbc:mysql://localhost:3306/ag_viagens2";
    private static final String user = "root";
    private static final String password = "T@i33727420";

    public static Connection createConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("O driver foi encontrado");

        } catch(ClassNotFoundException e) {
            System.out.println("O driver não foi encontrado. " + e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado ao banco de dados");
            return connection;

        } catch(SQLException e) {
            System.out.println("Não foi possivel conectar ao banco de dados." + e.getMessage());
            return null;
        }
    }
}
	
