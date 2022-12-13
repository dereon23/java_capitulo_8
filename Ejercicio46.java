package Capitulo8;

import java.util.Scanner;

public class Ejercicio46 {
	
	public static void main(String[] args) {
		System.out.print("Introduzca la altura");
		Scanner s = new Scanner(System.in);
		int altura=s.nextInt();
		for(int i=0; i<altura;i++) {
			System.out.println(lineaValle(i, altura));
		}
	}
	
	public static String lineaValle(int fil, int altura) {
		String lin="";
		if(altura-1==fil) {
			for(int i=0; i<altura*2-1;i++) {
				lin+="*";
			}
		}else {
			for(int i=0; i<altura*2-1;i++) {
				if(i==0||i==fil||i==(altura*2-1)-fil-1||i==altura*2-2) {
					lin+="*";
				}else {
					lin+=" ";
				}
			}
		}
		return lin;
	}

}
