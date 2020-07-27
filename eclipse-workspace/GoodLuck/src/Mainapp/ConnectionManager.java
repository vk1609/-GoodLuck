package Mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
public Connection getConnection() throws SQLException, ClassNotFoundException {
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = null;
	con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","SYSTEM","Vamsi@777#");
	if(con != null) {
		System.out.println("Established");
	}
	return con;
}
}

