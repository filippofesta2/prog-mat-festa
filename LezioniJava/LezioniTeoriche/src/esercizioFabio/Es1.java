package esercizioFabio;

import java.util.Scanner;

public class Es1 {
	
	
	public static void main(String[] args) {
		
		
		//chiedi all'utente 8 numeri > 0.
		//se viene inserito > 0 fai reinserire finchè rispetta la condizione
		//visualizza l'array su schermo e quante volte l'utente ha sbagliato
		
		Scanner s = new Scanner (System.in);
		int [] numeroArray = new int[8];
		int tentativo=0;
		
		System.out.println("Inserisci 8 numeri MAGGIORI di 0");
		
		
		
		for (int i = 0; i < numeroArray.length; i++) {
			numeroArray[i] = s.nextInt();
			if(numeroArray[i]<=0) {
				System.out.println("Errore: Sei un coglione, mettilo MAGGIORE di 0!");
				i--;
				tentativo++;	
			}
		}
		for (int i = 0; i < numeroArray.length; i++) {
			System.out.println("numeroArray[" + i + "] = " + numeroArray[i] + ".");
			
		}
		System.out.println("Errori Utente = " + tentativo);
		s.close();
		
	}
	



	
	
	
}
