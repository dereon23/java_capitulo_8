package Capitulo8;

public class Ejercicio54 {
	
	public static void main(String[] args){
		int[] arr= {4,6,5,3,6,4,2};
		System.out.println(ocurrencias(7,arr));
	}
	
	public static int ocurrencias(int digito, int n) {
		int dig=1; int cant=n;
		while(cant>9) {
			cant/=10; dig++;
		}
		cant=0;
		for(int i=0; i<dig;i++) {
			if((int)((n/Math.pow(10, i))%10)==digito){
				cant++;
			}
		}
		return cant;
	}
	
	public static int ocurrencias(int digito, int[] a) {
		int cant=0;
		for(int i=0; i<a.length;i++) {
			cant+=ocurrencias(digito,a[i]);
		}
		return cant;
	}



}
