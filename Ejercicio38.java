package Capitulo8;

public class Ejercicio38 {
	
	public static void main(String[] args){
		int[] x= {454,4533,5325,2553,55655,23325,3235,3,4356,343};
		x=filtraCapicuas(x);
		for(int i: x) {
			System.out.print(i+" ");
		}
	}
	
	public static int[] filtraCapicuas(int x[]) {
		int j=0;
		for(int i=0; i<x.length;i++) {
			if(Capitulo8a.Ejercicio1.esCapicua(x[i])) {
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
