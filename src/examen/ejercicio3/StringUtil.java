package examen.ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringUtil {

	public void contarLetrasUnicas(String cadena) {
		cadena = cadena.toLowerCase();
		int contador = 0;
		List<Character> caracter = new ArrayList<Character>();
		Map<String, Integer> buffer = new HashMap<String, Integer>();
		if(!buffer.containsKey(cadena)) {
			for(int i=0; i<cadena.length();i++) {
				if(!caracter.contains(cadena.charAt(i)) && cadena.charAt(i) != ' '){
					caracter.add(cadena.charAt(i));
					contador++;
				}
			}
		}else {
			System.out.println(buffer.get(cadena));
		}
		buffer.put(cadena, contador);
		System.out.println(contador);
		}
	
	public static void main(String[] args) {
		StringUtil su = new StringUtil();
		String cadena = "Examen de programacion";
		System.out.print("Numero de letras cadena: ");
		System.out.println(cadena);
		su.contarLetrasUnicas(cadena);
	}
}
