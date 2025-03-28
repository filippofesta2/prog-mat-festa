package lezione1;

import java.math.BigDecimal;

public class CalcolatriceScema {

	public static void main (String [] args) {
		//dati in input 2 interi, calcola tutte e 4 le operazioni matematiche
		
		int valore1 = 52;
		int valore2 = 46;
		
		int risultato1 = valore1 + valore2;
		
		System.out.println("Addizione: " + risultato1);
		
		int risultato2 = valore1 - valore2;
		System.out.println("Sottrazione: " + risultato2);
		
		int risultato3 = valore1 * valore2;
		System.out.println("Moltiplicazione: " + risultato3);
		
		double risultato4 = (double) valore1/valore2;
		System.out.println("Divisione; " + risultato4);
		
		int risultato5 = valore1%valore2;
		System.out.println("Resto Divisione: " + risultato5);
		 
		//dati due valori double, calcola tutti i risultati
		
		System.out.println("ADESSO CON VALORI DOUBLE");
		
		double value3 = 5.12;
		double value4 = 8.6;
		
		double result6 = value3+value4;
		double result7 = value3-value4;
		double result8 = value3*value4;
		double result9 = value3/value4;
		
		System.out.println("Addizione: " + result6);
		System.out.println("Sottrazione: " + result7);
		System.out.println("Moltiplicazione: " + result8);
		System.out.println("Divisione: " + result9);

		System.out.println(" ------------BIG DECIMAL--------");
		String valoreSomma = Double.toString(result6);
		System.out.println("La somma adesso è " + valoreSomma); // !!!! valoreSomma ora è Stringa
		
		//BigDecimal
		
		BigDecimal bigDecimaleValore = new BigDecimal(valoreSomma);
		System.out.println(bigDecimaleValore.floatValue());
		
		System.out.println("--------Classe Math ---------");
		double radQuadRes8 = Math.sqrt(result8);
		System.out.println("Radice di result8: " + radQuadRes8);
		
		double absRes8 = Math.abs(result8);
		System.out.println("Valore assoulto di result8 " + absRes8);
		
		double rand = Math.round(Math.random() * 10);
		System.out.println(rand);
				
	}
}
