package Capitulo8;

public class Ejercicio39 {
	
	public static void main(String[] args) {
		System.out.println(convierteEnPalabras(34243));
	}

	public static String convierteEnPalabras(int n) {
		String palabras="";
		int cop=n;
		int dig=1;
		while(cop>9) {
			cop/=10;
			dig++;
		}
		for(int i=0; i<dig;i++) {
			switch(((int)(n/Math.pow(10, dig-1-i)))%10){
				case 0:
					palabras+="cero";
					break;
				case 1:
					palabras+="uno";
					break;
				case 2:
					palabras+="dos";
					break;
				case 3:
					palabras+="tres";
					break;
				case 4:
					palabras+="cuatro";
					break;
				case 5:
					palabras+="cinco";
					break;
				case 6:
					palabras+="seis";
					break;
				case 7:
					palabras+="siete";
					break;
				case 8:
					palabras+="ocho";
					break;
				case 9:
					palabras+="nueve";
					break;
				default:;
			}
			if(i!=dig-1) {
				palabras+=", ";
			}
		}
		return palabras;
	}

	
}
