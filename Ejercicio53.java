package Capitulo8;

public class Ejercicio53 {

	public static void main(String[] args) {
		int[][] arr= {{5,7,9},
					{7,4,2},
					{6,4,2}};
		System.out.println(nEsimo(arr,7));
	}
	
	public static int nEsimo(int[][] n, int posicion) {
		if(posicion<n.length*n[0].length) {
			return n[posicion/n[0].length][posicion%n[0].length];
		}else {
			return -1;
		}
	}

	
}
