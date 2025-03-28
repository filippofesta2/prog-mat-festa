package esercitazioni;

import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		String nome = "Filippo";
		String cognome = "Festa";
		
		System.out.println("Il mio nome è " + nome + ". Il mio cognome è " + cognome);
// upgrade con user input
		
		Scanner input = new Scanner (System.in);
		System.out.println("Scrivi il tuo nome");
		String nomeUtente = input.nextLine();
		System.out.println("Scrivi il tuo cognome");
		String cognomeUtente = input.nextLine();
		System.out.println("il tuo nome è " + nomeUtente +  " , il tuo cognome è "  + cognomeUtente);
		input.close();
	}

}
