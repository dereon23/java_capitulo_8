package Capitulo8;

public class Ejercicio47 {
	
	public static void main(String[] args) {
		int[] arr= {6,4,2,8,6,9,7,4,2,4,3};
		System.out.println(convierteArrayEnString(arr));
	}
	
	public static String convierteArrayEnString(int[] a) {
		String lin="";
		for(int i=0; i<a.length;i++) {
			lin+=Integer.toString(a[i]);
		}
		return lin;
	}

}
