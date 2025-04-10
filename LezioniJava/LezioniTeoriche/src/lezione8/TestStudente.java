package lezione8;

import java.util.Scanner;

public class TestStudente {
	
	public static void main(String[] args) {
		//Setting dello scan
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci I tuoi dati: Nome - Cognome - Anno di iscrizione - Presenza in classe - Corso di iscrizione");
		String nome = scan.next();
		String cognome = scan.next();
		Integer anno = scan.nextInt();
		Boolean presenza = scan.nextBoolean();
		String corso = scan.next();
		
		//Programma testStudente
		Studente s = new Studente(nome, cognome, anno, presenza, corso);
		
		System.out.println("PResentazione");
		System.out.println();
			System.out.println(s.Presentati());
		System.out.println("Iscrizione");
		System.out.println();
			System.out.println(s.Iscrizione());
		System.out.println("ToString");
		System.out.println();
			System.out.println(s.toString());
		
		scan.close();
	
	}
	
	

	
	
}
