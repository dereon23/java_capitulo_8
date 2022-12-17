package Capitulo8;

public class Ejercicio55 {
	
	public static void main(String[] args) {
		String[] s= {"cas","df","dfg","cas","df","ere"};
		for(String e: sinRepetir(s)) {
			System.out.print(e+" ");
		}
	}

	public static String[] sinRepetir(String[] s) {
		for(int i=1; i<s.length;i++) {
			for(int j=0; j<i;j++) {
				if(s[j].equals(s[i])) {
					s[i]=""; break;
				}
			}
		}
		return s;
	}
	
}
