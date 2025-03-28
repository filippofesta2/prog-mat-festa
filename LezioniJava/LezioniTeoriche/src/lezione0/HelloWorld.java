package lezione0;

public class HelloWorld {

	//Questo è il metodo main, punto di ingresso di una qualsiasi applicazione
	public static void main (String[] args) {
		//dhichiaro una variabile, devo inserire anche il tipo di dato
		String mioNome;
		
		//assegnare un valore alla variabile
		mioNome = "FrancoBaldo";
		
		//istanzio una variabile (di tipo intero) su di una sola riga
		int età = 35;
		
		//uso il char per un solo singolo carattere
		char classificazione = 'A';
		
		double stipendio = 6.5544;
		
		//alt+shift+y --> a capo automatico
		System.out.println("Hello, " + mioNome +"! Hai " + età + " anni e sei classificato come " + classificazione + " con stipendio " + stipendio );
	}
}
