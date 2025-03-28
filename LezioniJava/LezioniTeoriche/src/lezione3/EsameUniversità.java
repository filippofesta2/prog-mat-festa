package lezione3;

import java.util.Scanner;

public class EsameUniversità {

	public static void main(String[] args) {
		final int VOTO_MAX = 30;
		final int VOTO_MIN = 0;
		System.out.println("Inserisci il voto dello scritto");
		
		Scanner s = new Scanner(System.in);
		
		
		int scritto = s.nextInt();
		
			if(scritto>=0 && scritto <=30) {
				if(scritto >= 18) {
					System.out.println("Hai accesso all'orale");
					System.out.println("Inserisci il voto del tuo orale");
					int orale = s.nextInt();
					
					if(orale>=VOTO_MIN && orale<=VOTO_MAX) {
						if(orale >= 18) {
							double media = Math.round((double)((scritto+orale)/2));
							System.out.println("Promosso. Voto scritto: "+ scritto + " Voto Orale: "+ orale + " La Media tra i voti è: " + media);	
							
						} 
						else {
								System.out.println("Dovrai recuperare l'orale, capra!");
								
						}
					}
						else {
							System.out.println("Vaccagare Orale");	
							
						}	
					}else {
						System.out.println("Non ha avuto accesso all'orale, riprova alla prossima sessione");
						
					}
			}else {
				System.out.println("Vaccagare!");
				
			}
		s.close();

	}

}
