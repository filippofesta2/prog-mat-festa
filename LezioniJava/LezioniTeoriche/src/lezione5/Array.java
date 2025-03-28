package lezione5;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		//istanziare l'array, su java è oggetto immutabile
		int[] numeri = new int[5]; //new = keyword utilizzata per istanziare un nuovo ogetto. [5] stabilisce la dimensione esatta del mio array [0,1,2,3,4]
		
		//per ogni indice assegno un valore. RICORDA: gli array sono oggetti 0-based. Aggiungere un numeri[5] = X manda in errore il programma
		numeri[0] = 10;
		numeri[1] = 5;
		numeri[2] = 8;
		numeri[3] = 74;
		numeri[4] = 58;
		
		numeri[3] = 9; //riassegno il valore in un indice del mio array
		//int dimensioneArr = numeri.length;
		
		//stampo l'array
		System.out.println(numeri); //qui stampa il puntatore alla memoria dove è allocato l'array, è il riferimento allo slot di memoria utilizzato
		//leggo i singoli valori del mio array
		for(int i = 0; i< numeri.length; i++) {
			System.out.println(numeri[i]);		
		}
		
		//notazione short per l'array
		int[]arrayNumCas = {2,3,4,5,6,72};
		
		for (int i = 0; i < arrayNumCas.length; i++) {
			if(arrayNumCas[i]%2 ==0) {
				System.out.println("Il numero " + arrayNumCas[i] + " è pari");
			}	
		}
		//creo un array con una dimensione scelta dall'utente
		Scanner scan = new Scanner(System.in);
		System.out.println("QUal è la dimensione dell'array?");
		int dimArr = scan.nextInt();
		int [] mioArr = new int[dimArr];
		
		//leggi la grandezza dell'array
		System.out.println(mioArr.length);
		
		//uso il for per scrivere l'array
		for(int i = 0;i<mioArr.length; i++) {
			System.out.println("Inserisci un numero intero");
			mioArr[i]= scan.nextInt();
		}
		
		//uso il do-while per scrivere l'array
		
//		int indice = 0;
//		do {
//			System.out.println("Inserisci un intero");
//			mioArr[indice] = scan.nextInt();
//			indice++;
//		}while(mioArr.length >= (indice+1));
		
		
		
		//leggo i singoli valori  dell'array
		for (int i = 0; i < mioArr.length; i++) {
			System.out.println("il valore all'indice "+ i + " è:" + mioArr[i]);
		}
		
		
		scan.close();

	}

}
