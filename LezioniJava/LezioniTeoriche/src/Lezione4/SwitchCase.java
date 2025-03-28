package Lezione4;

import java.util.Scanner;

public class SwitchCase {

	public static void main (String[] args) {
		
		//switch(valore){
		//case 1:               //è il valore inserito
		// codice da eseguire:
		//break;
		//defaultK;
		
		Scanner s = new Scanner(System.in);
		int giornoSettimana = 7;      
		switch (giornoSettimana) {
		case 1:
			System.out.println("Buon Lunedi");
			break;
		case 2:
			System.out.println("Buon Martedi");
			break;
		case 3:
			System.out.println("Buon Mercoledi");
			break;
		case 4:
			System.out.println("Buon Giovedi");
			break;
		case 5: 
			System.out.println("Buon Venerdi");
			break;
		case 6:
			System.out.println("Buon Sabato");
			break;
		case 7:
			System.out.println("Buona Domenica, digita 0 se oggi è l'ultima domenica del mese!");
			int ultimaDomenica = s.nextInt();
			if(ultimaDomenica == 0 ) {
				System.out.println("Oggi è l'ultima domenica del mese, ESPRIMI UN DESIDERIO!");
			}
			 break;
		default:
			System.out.println("Non riconosco questo valore");
			break;
		}	
			
//--------------------------------------------------------------------------------------------------
			
			String meseAnno = "Marzo";
			
			switch(meseAnno) {
			case "Gennaio":
				System.out.println("Sei nel primo mese dell'anno");
				break;
			case "Febbraio":
				System.out.println("Sei nel secondo mese dell'anno");
				break;
			case "Marzo":
				System.out.println("Sei nel terzo mese dell'anno");
				break;
			case "Aprile":
				System.out.println("Sei nel quarto mese dell'anno");
				break;
			default:
				System.out.println("non avevo voglia di fare tutti i casi, inserisci uno dei primi 4 mesi");
				break;		
			}
			
// ----------- calcolo trimestri // qui lo switch non va bene usarlo
			int meseCorrente = 3;
			switch(meseCorrente) {
			case 1:
				System.out.println("Sei Nel primo trimestre");
				break;
			case 2:
				System.out.println("Sei Nel primo trimestre");
				break;
			case 3:
				System.out.println("Sei Nel primo trimestre");
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("Sei Nel secondo trimestre");
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("Sei Nel terso trimestre");
				break;
			case 10:
			case 11:
			case 12:
				System.out.println("Sei Nel quarto trimestre");
				break;
			default:
				System.out.println("Mese non valido");
				
			}

		
	s.close();	
	}
}
