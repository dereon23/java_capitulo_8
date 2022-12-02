package Capitulo8;

import Capitulo8a.Ejercicio2;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		
		System.out.println("Primos:");
		for(int i=1; i<1000; i++) {
			if(Ejercicio2.esPrimo(i)) {
				System.out.print(i+" ");
			}
		}
		
		
		
		
	}
	
	
}
