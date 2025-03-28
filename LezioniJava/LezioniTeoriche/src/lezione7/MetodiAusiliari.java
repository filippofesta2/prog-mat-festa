package lezione7;

import java.util.Scanner;

public class MetodiAusiliari {

	public static void main(String[] args) {
	
		System.out.println("Questo metodo (sotto) stampa un benvenuto");
//		richiamo il metodo
		benvenuto();
		
//		se volessi stampare il return di benvenuto2 devo "Stampare il metodo"
		System.out.println(benvenuto2());
		
//		posso anche acchiappare un valore di restituzione e registrarlo in una variabile
		String salve = benvenuto2();
		System.out.println(salve);
		
		double risultato = calcolaQualcosa();

		System.out.println("Il risultato è " + risultato);
//		oppure
		System.out.println("Il risultato è "+ calcolaQualcosa());
		
//		richiamo il metodo calcola() e gli passo 2 numeri
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		double risultato2 = calcola(num1, num2);
		System.out.println("Il risultato della somma dei numeri inseriti è "+risultato2);
		
		calcola2(6.2, 5,"filippo");
		
//   	richiamo il metodo3() e gli passo un numero		
		int numero3Metodi = metodo3(8);
		System.out.println("il risultato dei 3 metodi è " + numero3Metodi);

		scan.close();
	}
	
	
//	creo il metodo di benvenuto
//	modificatore di accesso (public) - modificatore static (il metodo appartiene alla classe) - tipo di ritorno(void) - nome del metodo
//	tutto questo compone la firma del metodo (SIGNATURE)	
	
//  osservazione su static: Questi metodi possono essererichiamati da altre classi, utilizzando il nome della classe nella quale sono stati dichiarati, non necessario se richiamati nella classe dichiarante
	public static void benvenuto() {
		System.out.println("Benvenuto"); //scrivere nella console non vuol dire restituire qualcosa (ergo si può usare il void, senza scrivere return alla fine)
	}
	
	public static String benvenuto2() {
		String saluto = "Benvenuto2";
		return saluto;
	}
	
	public static double calcolaQualcosa() {
		double num1 = 9.0;
		double num2 = 7.1;
		
		return num1+num2;
//		oppure
//		double somma = num1+num2;
//		return somma;
	}
	
//	num2 e num 2 sono parametri 
	public static double calcola(double num1, double num2) {
		
		double somma = num1+num2;
		return somma;
	}
	
	//non sono obbligato ad avere un return se ho dei parametri in ingresso
	public static void calcola2(double num1, double num2, String nomeUtente) {
		double somma = num1+num2;
		System.out.println("Ciao "+nomeUtente+" la somma di calcola2 è "+ somma);
	}
	
//	metodi che richiamano metodi che richiamano metodi
	public static int metodo1(int num) {
		return num;
	}
	public static int metodo2(int num) {
		return num*2;
	}
	public static int metodo3(int num) {
		int calcolo = metodo1(num) + metodo2(num) + num^2;
			return calcolo;
	}
	
}
