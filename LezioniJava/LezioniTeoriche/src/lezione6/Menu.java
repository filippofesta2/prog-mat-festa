package lezione6;

import java.util.Scanner;

public class Menu {


	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char scelta;
		
		do {
			
			stampaMenu(); //richiama il metodo stampaMenu()
			scelta = input.next().charAt(0); // raccolgo una stringa con next() ed estraggo la lettera nella posizione 0 della stringa
			
			switch(scelta) {
			case 'g':
			case '1':
				System.out.println("Bravo, hai scelto di giocare a tombola. Abbiamo estratto per te i seguenti numeri...?");
				break;
			case 'c': 
			case '2':
				System.out.println("Hai scelto di calcolare qualcosa. I risultati sono ...");
				System.out.println(calcola()); //stampo il valore restituito da calcola()
				break;
			
			case 'q':
				System.out.println("Stai uscendo dal programma...");
				break;
			default:
				System.out.println("Scelta non valida. Riprova.");
			}
			
			System.out.println();
			
		}while(scelta != 'q' && scelta != 'Q');
		System.out.println("Hai chiuso il programma");
		
		input.close();
		
	}
// 	(FIRMA DEL METODO)
		//modificatore di accesso - modificatore di classe - tipo di ritorno - nome del metodo 
	public static void stampaMenu() {

		//CORPO DEL METODO
		System.out.println("-----MENU-----");
		System.out.println("1. GIOCA TOMBOLA (g)");
		System.out.println("2. Calcola (c)");
		System.out.println("3. Gioca ai dadi(d)");
		System.out.println("4. Esci (q)");
		System.out.println("--------------");
		
	}
	public static void giocaTombola() {
		
	}
	public static void giocaDadi() {
		
	}
	
	
	public static int calcola() {
		int numero = 1;
		return numero;
	}
	
}
