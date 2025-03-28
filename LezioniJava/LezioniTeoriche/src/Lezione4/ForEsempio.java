package Lezione4;

import java.util.Scanner;

public class ForEsempio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi sommare?");
        int numeriDaSommare =  input.nextInt() ;
        
        //per poter vedere la somma mi servo di una variabile di accumulo/backup/supporto/esterna
        int somma = 0;
        
        System.out.println("Vuoi sommare " + numeriDaSommare + " numeri. Di volta in volta scrivi quali");
        for(int i = 0; i< numeriDaSommare; i++) {
        	System.out.println("Inserisci il prossimo numero, il 42 è VIETATO");
        	int n = input.nextInt();
        	if(n == 42) {
        		i--;
        		System.out.println("Don't Panic");
        	}
        	else if(n%2 == 0) {
        	somma += (n*2); //somma = somma + n
        	System.out.println("La somma parziale vale: " + somma);
        	}else {
        		somma += n;
        		System.out.println("La somma parziale vale: "+ somma);
        	}
        }
        
        System.out.println("La somma totale dei numeri vale " + somma);
        System.out.println("La media dei numeri vale: " + somma/numeriDaSommare);
        
// voglio migliorare questo ciclo for: ogniqualvolta l'utente inserisce un numero pari il suo valore raddoppia
        
        
        input.close();
	}

}
