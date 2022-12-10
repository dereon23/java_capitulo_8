package Capitulo8;

public class Ejercicio37 {
	
	public static void main(String[] args) {
		System.out.println(convierteEnMorse(4539564));
	}

	
	public static String convierteEnMorse(int n) {
		String morse="";
		int cop=n;
		int dig=1;
		while(cop>9) {
			cop/=10;
			dig++;
		}
		for(int i=0; i<dig;i++) {
			switch(((int)(n/Math.pow(10, dig-1-i)))%10){
				case 0:
					morse+="-----";
					break;
				case 1:
					morse+=".----";
					break;
				case 2:
					morse+="..---";
					break;
				case 3:
					morse+="...--";
					break;
				case 4:
					morse+="....-";
					break;
				case 5:
					morse+=".....";
					break;
				case 6:
					morse+="-....";
					break;
				case 7:
					morse+="--...";
					break;
				case 8:
					morse+="---..";
					break;
				case 9:
					morse+="----.";
					break;
				default:;
			}
		}
		return morse;
	}
}
