package Capitulo8;

public class Ejercicio36 {
	
	public static void main(String[] args){
		int[] x= {4,4,2,5,3,2,5,5,35,19,35,12,7,3,56,32};
		x=filtraPrimos(x);
		for(int i: x) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] filtraPrimos(int x[]) {
		int j=0;
		for(int i=0; i<x.length;i++) {
			if(Capitulo8a.Ejercicio2.esPrimo(x[i])) {
				x[j]=x[i];
				j++;
			}
		}
		if(j==0) {
			x[0]=-1;
			j++;
		}
		while(j<x.length) {
			x[j]=0;
			j++;
		}
		return x;
	}

}
