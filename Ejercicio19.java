package Capitulo8;

import Capitulo8a.Ejercicio5;

public class Ejercicio19 {
	
	public static void main(String[] args) {
		
		System.out.println(pasarADecimalDeHexadecimal("2C9B"));
		System.out.println(pasarAOctalDeDecimal(84249));
		System.out.println(pasarADecimalDeOctal(342375));
		System.out.println(pasarAHexadecimalDeDecimal(935342112));
		
	}
	
	public static long pasarADecimalDeBinario(long n) {
		long dec=0;
		for(int i=0; i<Ejercicio5.digitos(n);i++) {
			dec+=((long)(n/(Math.pow(10, i)))%10)*Math.pow(2, i);
		}
		return dec;
	}
	
	public static long pasarADecimalDeOctal(long n) {
		long dec=0;
		for(int i=0; i<Ejercicio5.digitos(n);i++) {
			dec+=((long)(n/(Math.pow(10, i)))%10)*Math.pow(8, i);
		}
		return dec;
	}
	
	public static long pasarADecimalDeHexadecimal(String n) {
		long dec=0;
		int aux;
		for(int i=0; i<n.length();i++) {
			switch(n.charAt(n.length()-1-i)) {
			case 'A': aux=10;
				break;
			case 'B': aux=11;
				break;
			case 'C': aux=12;
				break;
			case 'D': aux=13;
				break;
			case 'E': aux=14;
				break;
			case 'F': aux=15;
				break;
			default: aux=Integer.parseInt(n.charAt(n.length()-1-i)+"");
			}
			dec+=Math.pow(16, i)*aux;
		}
		return dec;
	}
	
	public static long pasarABinarioDeDecimal(long n) {
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
	
	public static long pasarAOctalDeDecimal(long n) {
		long bin=n;
		int digitos=1;
		while(n>7) {
			n/=8;
			digitos++;
		}
		n=(int)bin; int binar[]=new int[digitos]; bin=(long)Math.pow(10, digitos+1);
		for(int i=0; i<digitos;i++) {
			binar[i]=(int)n%8;
			n/=8;
		}
		
		for(int i=digitos-1;i>=0;i--) {
			bin+=binar[i]*Math.pow(10, i);
		}
		bin-=(long)Math.pow(10, digitos+1);
		
		return bin;
	}
	
	public static String pasarAHexadecimalDeDecimal(long n) {
		int digitos=1;
		long n2=n;
		while(n>15) {
			n/=16;
			digitos++;
		}
		String hex="";
		for(int i=0; i<digitos;i++) {
			switch(((int)n2)%16) {
			case 10: hex="A"+hex;	break;
			case 11: hex="B"+hex;	break;
			case 12: hex="C"+hex;	break;
			case 13: hex="D"+hex;	break;
			case 14: hex="E"+hex;	break;
			case 15: hex="F"+hex;	break;
			default: hex=n2%16+""+hex;
			}
			n2/=16;
		}
		return hex;
	}
	
	public static long pasarAOctalDeBinario(long n) {
		return pasarAOctalDeDecimal((pasarADecimalDeBinario(n)));
	}
	
	public static String pasarAHexadecimalDeBinario(long n) {
		return pasarAHexadecimalDeDecimal((pasarADecimalDeBinario(n)));
	}
	
	public static long pasarABinarioDeOctal(long n) {
		return pasarABinarioDeDecimal((pasarADecimalDeOctal(n)));
	}
	
	public static String pasarAHexadecimalDeOctal(long n) {
		return pasarAHexadecimalDeDecimal((pasarADecimalDeOctal(n)));
	}
	
	public static long pasarABinarioDeHexadecimal(String n) {
		return pasarABinarioDeDecimal((pasarADecimalDeHexadecimal(n)));
	}
	
	public static String pasarAOctalDeHexadecimal(String n) {
		return pasarAHexadecimalDeDecimal((pasarADecimalDeHexadecimal(n)));
	}
	
	
	

}
