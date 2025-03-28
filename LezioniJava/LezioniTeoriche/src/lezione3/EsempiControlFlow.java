package lezione3;

public class EsempiControlFlow {

	public static void main (String[] args) {
		//operatori di confronto
		
		int a = 3;
		int b = 4;
		
		boolean c1 = (a==b); 
		boolean c2 = (a != b);
		boolean c3 = (a > b);
		boolean c4 = (a < b);
		boolean c5 = (a >= b);
		boolean c6 = (a <= b);
		
		 
		System.out.println("C1 è " + c1);
		System.out.println("C2 è " + c2);
		System.out.println("C3 è " + c3);
		System.out.println("C4 è " + c4);
		System.out.println("C5 è " + c5);
		System.out.println("C6 è " + c6);
		
		
		//If - else if - else
		//if(condizione){codice eseguito se condizione è true}
		
		
		if(c1) {
			System.out.println("I numeri sono Uguali");
		}else if (c2) {
			System.out.println("I due numeri sono diversi");
		}else if(c3) {
			System.out.println("A è maggiore di b");//non verrà mai letto perche è vero c2 che sta prima
		}
		else {
			System.out.println("Non so valutarli");
		}
		
//---------------------------------------------------------------
		
		int mese = 3;
		
		if(mese >=1 && mese<=3) {
			System.out.println("Primo Trimestre dell'anno");
		}else if(mese>=4 && mese<= 6) {
			System.out.println("Secondo Trimestre dell'anno");
		}else if(mese>=7 && mese<= 9) {
			System.out.println("Terzo Trimestre dell'anno");
		}else if(mese>=9 && mese<= 12) {
			System.out.println("Quarto Trimestre dell'anno");
		}else {
			System.out.println("Non posso valutare questo mese");
		}

//---------------------------------------------------------------
		
		//Esami Università
		int scritto = 18;
		int orale = 25;
		
		//prof severo: passo l'esame solo se ENTRAMBI sono > 18
		if(scritto >= 18 && orale >= 18) {
			System.out.println("Promosso Voto Scritto: "  + scritto + " Voto Orale: " + orale);
		}else if(scritto <18 && orale >=18) {
			System.out.println("Bocciato Scritto, Promosso Orale Voto Scritto: "  + scritto + " Voto Orale: " + orale);
		}else if(scritto >=18 && orale <18) {
			System.out.println("Promosso scritto, Bocciato orale Voto Scritto: "  + scritto + " Voto Orale: " + orale);
		}
		else {
			System.out.println("Bocciato in entrambi Voto Scritto: "  + scritto + " Voto Orale: " + orale);
		}
		
		
		//prof più permissivo: Basta che uno dei 2 sia > 18
		//bisogna andare dallo specifico al generico (prima entrambi false
		
		if (scritto <=18 || orale >= 18) {
			System.out.println("Esame superato solo grazie all'orale ");
		}else if (scritto >= 18 || orale < 18) {
			System.out.println("Esame superato solo grazie allo scritto");
		} else if (scritto >= 18 || orale >=18){
			System.out.println("Complimenti");
		}else {
			System.out.println("Bocciato, entrambi sono andati male mannaggia a te!");
		}
		
		
		
		
	}
}
