package Capitulo8;

public class Ejercicio56 {
	
	public static void main(String[] args) {
		
		int[][] arr= {{34,56,78,23},
					  {76,36,89,44},
					  {75,32,12,17}};
		for(int n: corteza(arr)) {
			System.out.print(n+" ");
		}
		
	}
	
	public static int[] corteza(int[][] n) {
		int[] arr=new int[n[0].length*2+n.length*2-4];
		int cont=0;
		for(int i=0; i<n[0].length;i++) {
			arr[cont]=n[0][i];
			cont++;
		}
		for(int i=1;i<n.length;i++) {
			arr[cont]=n[i][n[0].length-1];
			cont++;
		}
		for(int i=n[0].length-2;i>=0;i--) {
			arr[cont]=n[n.length-1][i];
			cont++;
		}
		for(int i=n.length-2;i>=1;i--) {
			arr[cont]=n[i][0];
			cont++;
		}
		return arr;
	}

}
