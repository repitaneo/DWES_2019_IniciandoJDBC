package modelo.cines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.util.BDConect;
import negocio.beans.CineBean;

public class CinesUpdate {

	
	
	
	public void updateCine(CineBean cine) {
		Connection conexion = BDConect.getConexion(); 
       	PreparedStatement stmt;
       	
       	String sql = 	"UPDATE cines "
       					+ "SET nombre='"+cine.getNombre()+"', "
       					+ "direccion='"+cine.getDireccion()+"', "
       					+ "telefono='"+cine.getTelefono()+"', "
       					+ "responsable='"+cine.getResponsable()+"' "
       					+ "WHERE idcines="+cine.getIdCine();
       	
       	
		try {
			stmt = conexion.prepareStatement(sql);
	       	stmt.executeUpdate();
	       	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}	
	
	
}
