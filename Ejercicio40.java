package Capitulo8;

public class Ejercicio40 {
	
	public static void main(String[] args){
		int[] x= {454,45733,5325,34637,55655,7656437,47533,3,4356,49876};
		x=filtraCon7(x);
		for(int i: x) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] filtraCon7(int x[]) {
		int j=0;
		for(int i=0; i<x.length;i++) {
			if(contiene7(x[i])) {
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
	
	public static boolean contiene7(int n) {
		boolean contiene=false;;
		while(n>6) {
			if(n%10==7) {contiene=true; break;}
			n/=10;
		}
		return contiene;
	}
	
}
