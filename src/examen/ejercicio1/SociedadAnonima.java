package examen.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class SociedadAnonima {

	private String nombre_sociedad;
	List<String> trabajos = new ArrayList<String>();
	
	public SociedadAnonima(String nombre_sociedad, List<String> trabajos) {
		this.nombre_sociedad = nombre_sociedad;
		this.trabajos = trabajos;
	}

}
