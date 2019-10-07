package negocio.beans;

import java.util.ArrayList;

public class CineBean {

	private int idCine;
	private String nombre;
	private String responsable;
	private String telefono;
	private String direccion;
	
	
	
	public int getIdCine() {
		return idCine;
	}
	public void setIdCine(int idCine) {
		this.idCine = idCine;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	@Override
	public String toString() {
		return "CineBean [idCine=" + idCine + ", nombre=" + nombre + "]\n";
	}
	
	
	
	
}
