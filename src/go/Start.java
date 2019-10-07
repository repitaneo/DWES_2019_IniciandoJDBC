package go;

import negocio.controlador.Cinesa;
import view.StartView;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cinesa cinesa = new Cinesa();
		
		try {
			
			StartView sv = new StartView(cinesa);
			sv.go();
		}
		catch(Exception e) {e.printStackTrace();}
		
	}

}
