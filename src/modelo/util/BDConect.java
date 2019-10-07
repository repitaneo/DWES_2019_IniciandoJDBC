package modelo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BDConect {

	private static Connection conexion = null;
	
	
	
	private BDConect() {
		
		String user ="root";
		String pass = "P@ssword";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbURL = "jdbc:mysql://localhost:3306/cines" 
				    + "?verifyServerCertificate=true" 
				    + "&useSSL=false"
				    + "&requireSSL=false";
            conexion = DriverManager.getConnection(dbURL, user, pass);
		} 
		catch (Exception ex) {
            ex.printStackTrace();
        } 			
	}
	
	
	
	
	public static Connection getConexion() {
	
		if(conexion==null) {
			
			new BDConect();
		}
		
		return conexion;
	}
	
	
	
	
}
