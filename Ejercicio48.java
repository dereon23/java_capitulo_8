package Capitulo8;

public class Ejercicio48 {
	
	public static void main(String[] args) {
		int[] a= {6,4,7,4,3,6,1,8,9};
		int[] b= {5,3,2,8,6,4};
		System.out.println(Ejercicio47.convierteArrayEnString(concatena(a,b)));
	}
	
	public static int[] concatena(int[] a, int[] b) {
		int[] arr=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			arr[i]=a[i];
		}
		for(int i=0; i<b.length;i++) {
			arr[i+a.length]=b[i];
		}
		return arr;
	}

}
