package Capitulo8;
import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {
		System.out.print("Introduzca la altura de la figura: ");
		Scanner s=new Scanner(System.in);
		int altura=s.nextInt();
		for(int i=0; i<altura;i++) {
			System.out.println(linea('*',altura-i));
		}
	}
	
	public static String linea(char caracter, int repeticiones) {
		String lin="";
		for(int i=0; i<repeticiones;i++) {
			lin+=caracter;
		}
		return lin;
	}

}
