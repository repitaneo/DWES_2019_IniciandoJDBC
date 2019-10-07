package view.cines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import modelo.cines.CinesUpdate;
import negocio.beans.CineBean;

public class ModificarCineView {

	
	
	public static void modificarCine(CineBean cine) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		// presentamos los valores anteriores
		System.out.println("Este cine tiene los siguiente valores");
		System.out.println(cine);
		
		
		// leemos cada uno de los atributos del Cine
		System.out.println("Nuevo Nombre?");
		String cadena = br.readLine();
		if(cadena.length()>0) {
			
			cine.setNombre(cadena);
		}
		
		// leemos cada uno de los atributos del Cine
		System.out.println("Nuevo responsable?");
		cadena = br.readLine();
		if(cadena.length()>0) {
			
			cine.setResponsable(cadena);
		}
		
		
		
		// leemos cada uno de los atributos del Cine
		System.out.println("Nuevo telefono?");
		cadena = br.readLine();
		if(cadena.length()>0) {
			
			cine.setTelefono(cadena);
		}
		
		// leemos cada uno de los atributos del Cine
		System.out.println("Nuevo direccion?");
		cadena = br.readLine();
		if(cadena.length()>0) {
			
			cine.setDireccion(cadena);
		}	
		CinesUpdate cu = new CinesUpdate();
		cu.updateCine(cine);
		
	
	}
	
}
