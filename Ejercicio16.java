package Capitulo8;

import Capitulo8a.Ejercicio1;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		
		System.out.println("Capicuos: ");
		for(int i=1; i<100000;i++) {
			if(Ejercicio1.esCapicua(i)) {
				System.out.println(i+" ");
			}
		}
		
		
	}

}
