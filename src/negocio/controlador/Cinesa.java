package negocio.controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

import modelo.cines.CinesRead;
import negocio.beans.CineBean;




public class Cinesa {

	private ArrayList<CineBean> listaCines;
	
	
	
	/**
	 * 
	 * 
	 */
	public Cinesa() {
		
		// cargo los datos
		CinesRead cinesData = new CinesRead();
		listaCines = cinesData.getCines();

	}
	
	
	
	





	@Override
	public String toString() {
		return "Cinesa [listaCines=" + listaCines + "]";
	}








	/**
	 * Devuelve un iterador sobre los cines disponibles
	 * @return Iterator sobre los cines
	 */
	public Iterator<CineBean> getCines() {
		
		return listaCines.iterator();
	}








	/**
	 * Busca un cine en la lista por su ID y lo devuelves
	 * @param numero
	 * @return
	 */
	public CineBean getCine(int numero) {
		
		int i=0;
		boolean encontrado = false;
		
		// busco hasta el final de la lista
		while((i<listaCines.size())&&(!encontrado)) {
			
			if(listaCines.get(i).getIdCine()==numero) {
				
				encontrado = true;
			}
			else i++;
		}
		
		
		if(encontrado == true) {
		
			return listaCines.get(i);
		}	
		else return null;
	}
	
	
	
	
	
	
	
}
