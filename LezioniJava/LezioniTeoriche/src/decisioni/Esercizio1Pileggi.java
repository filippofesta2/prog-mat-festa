package decisioni;

import java.util.Scanner;

public class Esercizio1Pileggi {

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		
		System.out.println("Inserisci 2 Numeri Interi");
		
		int A = s.nextInt();
		int B = s.nextInt();
		
		if (A==B)  {
			System.out.println("1");
		}
		else if (A>B) {
			System.out.println("2");
		}
		else {
			System.out.println("3");
		}
			
		s.close();
	}

}
