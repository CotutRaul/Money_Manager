package program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql {
	static Statement st;
	static Connection connection;
	/**
	 * Class constructor which creates the connection to the data base and declares a statement.
	 */
	public Sql() {
		String dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "oracle";
		try {
			Connection connection = DriverManager.getConnection(dbURL,username,password);
			st = connection.createStatement();
		} catch (SQLException e) {
			System.out.println("Error! Not Connected to Oracle database!");
			e.printStackTrace();
		}
	}


}
