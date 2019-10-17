package go;

import negocio.controlador.Cinesa;
import modelo.cines.CinesCreate;
import modelo.cines.CinesDelete;
import negocio.beans.CineBean;
import view.StartView;

public class Start {

	public static void main(String[] args) {
		

		CineBean cine = new CineBean();
		cine.setIdCine(12);
		cine.setNombre("Auto Cine Gijon");
		cine.setResponsable("Auto S.L.");
		cine.setDireccion("Carretera Providencia s/n");
		cine.setTelefono("666777888");
		
		/*
		CinesCreate cinesCreate = new CinesCreate();
		cinesCreate.createCine(cine);
		*/

		CinesDelete cinesDelete = new CinesDelete();
		cinesDelete.deleteCine(cine);
		
		
		
		/*
		Cinesa cinesa = new Cinesa();
		
		try {
			
			StartView sv = new StartView(cinesa);
			sv.go();
		}
		catch(Exception e) {e.printStackTrace();}
		*/
		
	}

}
