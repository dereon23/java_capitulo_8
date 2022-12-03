package Capitulo8;

import Capitulo8a.Ejercicio6;

public class Ejercicio18 {
	
	public static void main(String[] args) {
		
		System.out.println(pasarABinario(6734));
		
	}
	
	public static long pasarABinario(int n) {
		long bin=n;
		int digitos=1;
		while(n>1) {
			n/=2;
			digitos++;
		}
		n=(int)bin; int binar[]=new int[digitos]; bin=(long)Math.pow(10, digitos+1);
		for(int i=0; i<digitos;i++) {
			if(n%2==1) {
				binar[i]=1;
			}else {
				binar[i]=0;
			}
			n/=2;
		}
		
		for(int i=digitos-1;i>=0;i--) {
			bin+=binar[i]*Math.pow(10, i);
		}
		bin-=(long)Math.pow(10, digitos+1);
		
		return bin;
	}

}
