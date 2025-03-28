package esercitazioni;

import java.util.Scanner;

public class Esercizio2 {

	public static void main(String[] args) {
		
		int numero = 42;
		
		double radQuadNum = Math.sqrt(numero);
		
		
		System.out.println("La radice quadrata di " + numero + " è " + radQuadNum);

		Scanner input = new Scanner(System.in);
		
		//upgrade input utente
		
		System.out.println("scrivi un numero e ne calcolerò la radice quadrata");
		
		int userNumber = input.nextInt();
		double radQuadNum2 = Math.sqrt(userNumber);
		System.out.println("La radice quadrata di " + userNumber + " é " + radQuadNum2);
		
		input.close();
		
		
	}

}
