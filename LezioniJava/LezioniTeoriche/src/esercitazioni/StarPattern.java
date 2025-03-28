package esercitazioni;

public class StarPattern {

	public static void main(String[] args) {
		
		
		//Riprodurre il seguente pattern
				//  *****
				//  *****
				//  *****
				//  *****
				//  *****
		
		System.out.println("1");
		for(int i=0; i<5; i++) { //crea le righe
			for(int j=0; j<5;j++) { //crea le colonne, cioè i 5 * dentro ogni riga
				System.out.print("*");
			}
			System.out.println();
		}
			
		
		
				//STAMPA IL SEGUENTE PATTERN
				// *
				// * *
				// * * *
				// * * * *
				// * * * * *
		System.out.println("2");
		for (int i = 0; i <= 5; i++) {
			for( int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
				//STAMPA IL SEGUENTE PATTERN
				//* * * * * 
				//* * * *
				//* * *
				//* *
				//*
		
		System.out.println("3");	
		
		for (int i = 5; i > 0; i--) {
			
			for( int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
				//STAMPA IL SEGUENTE PATTERN
				//  	*
				//     * *
				//    * * *
				//   * * * *
				//  * * * * *
				
		System.out.println("4");	
		for (int i = 1; i<=5; i++) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}System.out.println();
		

				//STAMPA IL SEGUENTE PATTERN
				// * * * * *
				//  * * * *
				//   * * *
				//    * * 
				//     *
			
		System.out.println("5");	
		for (int i = 5; i>=1; i--) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}System.out.println();
				
				//STAMPA IL SEGUENTE PATTERN
				//	    *
				//     * *
				//    * * *
				//   * * * *
				//  * * * * *
				//   * * * *
				//    * * *
				//     * * 
				//      *
			
		System.out.println("6");
		for (int i = 1; i<=5; i++) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 4; i>=1; i--) {
			for(int k=1; k<=5-i; k++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}System.out.println();
		
				//STAMPA IL SEGUENTE PATTERN
				//	    *
				//     * *
				//    *   *
				//   *     *
				//  *       *
				//   *     *
				//    *   *
				//     * * 
				//      *
		
		System.out.println("7");
		
		int j = 0;
		
		for (int i = 0; i<4; i++) {
			for(int k=0; k<4-i; k++) {
				System.out.print(" ");
				}
			System.out.print("*");
					
			if(i>0) {	
				for(j = 0; j<2*i-1; j++) {
					System.out.print(" ");
				}		
				System.out.print("*");	
			}
			System.out.println();
		} 
		
		for (int i = 4; i>=0; i--) {		
			for(int k=0; k<4-i; k++) {
				System.out.print(" ");
				}
			System.out.print("*");
					
			if(i>0) {	
				for(j = 0; j<2*i-1; j++) {
					System.out.print(" ");
				}
						
				System.out.print("*");	
				
			}
			System.out.println();
		} 
	
	} 

}


