package lezione0;

public class Operatori {
 
	public static void main(String[] args) {

//		byte num1 = 1;
//		byte num2 = 35;
//		
//		//Cast del dato
//		byte somma = (byte) (num1+num2);
//		
//		System.out.println(somma);
		
		int num1 = 78;
		int num2 = 4;
		
		//uso gli operatori matematici per fare le 4 operazioni
		int somma = num1 + num2;
		System.out.println("La somma dei due numeri vale " + somma);
		
		int sottrazione = num1 - num2;
		System.out.println("La sottrazione tra i due numeri vale " + sottrazione);
		
		int moltiplicazione = num1 * num2;
		System.out.println("Il prodotto tra i due numeri vale " + moltiplicazione);
		
		//int divisione = num1 / num2;  //operazione rischiosa per gli int
		double divisione = (double) num1 / num2; //cast del dato, senza il secondo double verrebbe 19.0
		System.out.println("Il quoziente vale " + divisione);
		
		//esempio con double
		double num3 = 4.5;
		double num4 = 9.2;
		
		double somma2 = num3 + num4;
		System.out.println(somma2);
		
		double sottr2 = num3 - num4;
		System.out.println(sottr2);
		
		double molt2 = num3 * num4;
		System.out.println(molt2);
		
		double div2 = num3 / num4;
		System.out.println(div2);
	}
}
