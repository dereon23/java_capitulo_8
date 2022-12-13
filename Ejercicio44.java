package Capitulo8;

import java.util.Scanner;

public class Ejercicio44 {
	
	public static void main(String[] args) {
		System.out.print("Introduzca la altura de la figura: ");
		Scanner s=new Scanner(System.in);
		int altura=s.nextInt();
		for(int i=0; i<altura;i++) {
			if(i==0) {
				for(int j=0; j<altura;j++) {
					System.out.print("*");
				}
				System.out.println();
			}else {
				System.out.println(linea('*',altura-i, altura));
			}
		}
	}
	
	public static String linea(char caracter, int repeticiones, int altura) {
		String lin="";
		for(int i=0; i<altura-repeticiones;i++) {
			lin+=" ";
		}
		for(int i=0; i<repeticiones;i++) {
			if(i==0||i==repeticiones-1) {
				lin+=caracter;
			}else {
				lin+=" ";
			}
		}
		return lin;
	}

}
