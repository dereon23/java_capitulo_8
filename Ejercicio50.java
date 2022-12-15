package Capitulo8;

public class Ejercicio50 {

	public static void main(String[] args) {
		int[] a= {5,4,2,5,3}; int[] b= {5,2,3,7,4,7,8,3};
		System.out.println(Ejercicio47.convierteArrayEnString(mezcla(a,b)));
	}
	
	public static int[] mezcla(int[] a, int[] b) {
		int[] arr=new int[a.length+b.length];
		if(a.length>=b.length) {
			int i=0; int j=0;
			while(j<b.length) {
				if(i%2==0) {
					arr[i]=a[j];
				}else {
					arr[i]=b[j];
					j++;
				}
				i++;
			}
			while(i<arr.length) {
				arr[i]=a[j];
				i++; j++;
			}
		}else {
			arr=mezcla(b,a);
		}
		return arr;
	}
	
}
