package Capitulo8;

import Capitulo8a.Ejercicio1;
import Capitulo8a.Ejercicio2;

public class Ejercicio51 {
	
	public static void main(String[] args) {
		int arr[] =new int[10];
		for(int i=0; i<10;i++) {
			arr[i]=(int)(Math.random()*99+2);
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nArray generado:");
		for(int i=0;i<10;i++) {
			if(Ejercicio2.esPrimo(arr[i])) {
				System.out.print("\nEl "+arr[i]+" es primo y ");
			}else {
				System.out.print("\nEl "+arr[i]+" no es primo y ");
			}
			if(Ejercicio1.esCapicua(arr[i])) {
				System.out.print("es capicúa");
			}else {
				System.out.print("no es capicúa");
			}
		}
	}

}
