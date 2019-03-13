package examen.ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una cadena: ");
		String cadena = sc.nextLine();
		Map<Character, List<Integer>> mapa = new HashMap<Character, List<Integer>>();
		
		
		for(int i = 0; i<cadena.length(); i++) {
			
			if(!mapa.containsKey(cadena.charAt(i))) {
				List<Integer> posicion = new ArrayList<Integer>();
				posicion.add(i);
				mapa.put(cadena.charAt(i), posicion);
			}
			else {
				mapa.get(cadena.charAt(i)).add(i);
//				List<Integer> posicion = new ArrayList<Integer>();
//				posicion.addAll(mapa.get(cadena.charAt(i)));
//				posicion.add(i);
//				mapa.put(cadena.charAt(i), posicion);
			}
		}
		System.out.println(mapa);
	}
}
