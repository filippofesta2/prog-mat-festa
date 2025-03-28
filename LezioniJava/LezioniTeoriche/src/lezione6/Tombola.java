package lezione6;

import java.util.Random;
import java.util.Scanner;

public class Tombola {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
//		dimensione array numeri casuali
		int dimensione = s.nextInt();
		
		int [] numeriCasuali = new int[dimensione];
		
		Random rand = new Random();
		
//		riempire l'array numeriCasuali con un while. QUindi il while si interrompera quando l'array è pieno
		
		int contatore = 0;  // contatore di posizione nell'array
		
		while (contatore<dimensione) {
			
			int numeroSingoloCasuale =  rand.nextInt(90)+1;
			
			boolean presente = false;
			
			//verifico se il numero esiste nell'array
			for (int i = 0; i < contatore; i++) { // i<contatore significa che ogni volta che contatore aumenta il for fa un giro
				if(numeriCasuali[i] == numeroSingoloCasuale) {
					presente = true;
					break;
				}
				
			}
			
			// se il numero da inserire non pè presente nell'array farò contatore++
				
			if(!presente) {
				numeriCasuali[contatore]= numeroSingoloCasuale;
				contatore++;
			}       
		}
		
		for (int i : numeriCasuali) {
			System.out.println(i);
		}
		
		
	}

}
