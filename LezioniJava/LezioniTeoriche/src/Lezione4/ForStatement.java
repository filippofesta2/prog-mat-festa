package Lezione4;

public class ForStatement {

	public static void main(String[] args) {
		
		// for (inizializzazione; condizione; aggiornamento) {}
		//          punto di       punto di    permette di
		//          partenza       arrivo      andare avanti
		//                                      nel ciclo

// Attenzione: la variabile i ha uno SCOPE LOCALE, cioè legato solo al ciclo for ed è visibile solo dentro di esso

		//i++ operatore di post incremento
		for (int i = 0; i<5;i++) {
			System.out.println("Sono al giro num: " + (i+1) + ". L'indice vale: " + i);
		}
		
		System.out.println("For al Contrario");
		//i-- operatore di post decremento
		// ciclo for contrario
		for(int i=5; i>0; i--) {
			System.out.println(i);
		}
// b è variabile con scope globale	
//se la dichiaro fuori dal ciclo nell'inizializzazione metterò semplicemente i=x senza int prima
		int b;
		for(b=0; b<10; b++) {
			System.out.println(b);
		}
		System.out.println(b); //qui b=10 perchè è l'ultimo valore assegnatogli e in quanto variabile globale è accessibile anche dopo la fine del ciclo;
		
//----------- Doppia variabile nel for -----------------------------
		
		int a;
		int c;
		
		for(a = 0, c = 9; a<10; a++, c--) {
			System.out.println("a vale: " + a + ".\t c vale: " + c);
		}
		
		// oppure -------------------------------------
				
		for(int d = 0, e =  9; d<10; d++, e--) {
			System.out.println("d vale: " + d + ".\t e vale: " + e);
		}
		
		//for con continue
		for (int i = 0; i < 5; i++) {
			if (i==2) {
				continue; //il continue permette di saltare un giro
			}
			System.out.println(i);
		}
		
		//for con break
			for (int i = 0; i < 5; i++) {
			if (i==2) {
				break; //il break interrompe il ciclo
			}
			System.out.println(i);
			}

	}
}
