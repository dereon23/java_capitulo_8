package Capitulo8;

public class Ejercicio52 {
	
	public static void main(String[] arga) {
		int[] arr= {423,6,122,56,2453,2,566,4,231,435};
		System.out.println(aleatorioDeArray(arr));
	}
	
	public static int aleatorioDeArray(int[] a) {
		return a[(int)(Math.random()*a.length)];
	}

}
