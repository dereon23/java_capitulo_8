package Capitulo8;

public class Ejercicio35 {
	
	public static void main(String[] args) {
		System.out.println(conviertEnPalotes(4875349));
	}

	public static String conviertEnPalotes(int n) {
		String palos="";
		int digitos=1;
		int cop=n;
		while(cop>9) {
			cop/=10;
			digitos++;
		}
		for(int i=digitos; i>0; i--) {
			for(int j=0;j<(n/((int)Math.pow(10, i-1))%10);j++) {
				palos+='|';
			}
			if(i!=1) {
				palos+='-';
			}
		}
		return palos;
	}
	
}
