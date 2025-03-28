package lezione3;

public class OperatoreTernario {

	public static void main(String[] args) {
		// l'operatore ternario mi permette di condensare un flusso gestito solo con if-else
		int a = 5;
		int b = 6;
		int c = 7;
		int d = 8;
		
		if(a==b) {
			System.out.println("Uguali");
		}else {
			System.out.println("Diversi");
		}
		
		//sintassi operatore ternario --> condizione ? seTrue: seFalse
		
	    String risultato = (c==d)? "Sono Uguali" : "Sono Diversi";
	    System.out.println(risultato);
	    
	    //NIGHT CLUB - si entra se maggiorenni con invitoScritto
	    int età = 35;
	    boolean invitoScritto = true;
	    
	    String buttafuoriDice = (età>=18 && invitoScritto)? "Puoi Entrare" : "Non Puoi Entrare";
	    System.out.println(buttafuoriDice); 

	}

}
