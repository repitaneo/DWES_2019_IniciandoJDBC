package modelo.cines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.util.BDConect;
import negocio.beans.CineBean;

public class CinesRead {

	
	
	public ArrayList<CineBean> getCines() {
		
		// creo un array list vacio que va a tener la lista de cines
		ArrayList<CineBean> devolver = new ArrayList<CineBean>();
		
		// preparo la conexion
		Connection conexion = BDConect.getConexion(); 
       	PreparedStatement stmt;
       	
       	// ejecuto la sentencia
		try {
			stmt = conexion.prepareStatement("SELECT * FROM cines");
	       	ResultSet rs = stmt.executeQuery();
	       	while (rs.next()) {
	       		
	       		CineBean cine = new CineBean();
	       		cine.setIdCine(rs.getInt("idcines"));
	       		cine.setNombre(rs.getString("nombre"));
	       		cine.setResponsable(rs.getString("responsable"));
	       		cine.setTelefono(rs.getString("telefono"));
	       		cine.setDireccion(rs.getString("direccion"));
	       		
	       		devolver.add(cine);
	       	} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return devolver;
	}
	
	
}
