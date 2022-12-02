package Capitulo8;

import Capitulo8a.Ejercicio5;
import Capitulo8a.Ejercicio6;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		
		System.out.println(pasarADecimal(1101011010));
		
		
	}
	
	public static long pasarADecimal(long n) {
		long dec=0;
		for(int i=0; i<Ejercicio5.digitos(n);i++) {
			dec+=((long)(n/(Math.pow(10, i)))%10)*Math.pow(2, i);
		}
		return dec;
	}
	
}
