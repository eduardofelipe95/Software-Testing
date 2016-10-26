package ufal.ic.br.TrabalhoTesteBeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
	private String user = "root";
	private String pass = "alessandraufal";
	
	public Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
