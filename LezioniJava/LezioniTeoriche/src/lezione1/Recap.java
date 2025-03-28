package lezione1;

public class Recap {

	public static void main (String[] args) {
		//dichiaro una variabile
		byte età = 27;
		
		//con il cast del dato in byte dico a java che anche 10 è in byte e permetto la somma invece della concatenazione, se età fosse stato in int non sarebbe stato necessario
		byte prossimaEtà = (byte)(età + 10);
		
		System.out.println("Ciao! Ho " + età + " anni! Tra dieci anni ne avrò " + prossimaEtà);
		
	}
}
