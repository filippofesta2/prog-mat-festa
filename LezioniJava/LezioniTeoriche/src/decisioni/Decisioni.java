package decisioni;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Decisioni {

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
//------------------------------------------------------------		
		int età; //contiene l'età dell'utente
		
		System.out.println("Inserisci la tua Età");
		
		età = s.nextInt();
		
		if(età > 17) 
		{
			System.out.println("Puoi Entrare!");
		}
		
		else 
		{
			System.out.println("Fuori dalle Palle!");
		}

		System.out.println("Grazie al cazzo!");
//-----------------------------------------------------------------------		
		System.out.println("Dimme un numero");
		int num = s.nextInt();
		
		if(num>5) {
			System.out.println("Maggiore");
		}
		else if(num==5) 
		{
			System.out.println("Uguale");
		}
		else 
		{
			System.out.println("Minore");
		}
//--------------------------------------------------------------------------
		System.out.println("Dimme che temperatura c'è?");
		double temperatura = s.nextDouble();
		
		if(temperatura>30) {
			System.out.println("Antò, faccaldo");
		}else if(temperatura<20) {
		System.out.println("Scatena L'Inferno");
		}else {
			System.out.println("E' un buon giorno per morire: Avvia sequenza di autodistruzione");
		}
		
		System.out.println("Inserisci due numeri interi");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		
		if(num2==0) 
		{
			System.out.println("Ignorante!!!!");
		}
		
		else 
		{
			double divisione = (double)num1/num2;
			System.out.println("La divisione da come risultato "+ divisione);
		}
		
		Random r = new Random();
		int num3 = r.nextInt();
		System.out.println(num3);
		
		int estremi = r.nextInt(2,11); //da 2 a 10, l'estremo superiore non viene considerato
		System.out.println(estremi);
	
		int altroN = r.nextInt(6); //se si parte da 0 si può non specificare e mettere solo l'estremo maggiore
		System.out.println(altroN);
		
		int dado = r.nextInt(1,7);
		System.out.println(dado);
		
		int dado1 = r.nextInt(1,7);
		int dado2 = r.nextInt(1,7);
		
		System.out.println("Dado1 è " + dado1 + ", Dado2 è " + dado2);
		
		int somma = dado1 + dado2;
		System.out.println("La somma è "+ somma);
		if(somma>=10) {
			System.out.println("Hai Vinto!");
		}
		else {
			System.out.println("Hai Perso");
		}
		
		//---------------------------------------------------------------------
		
		LocalDate data = LocalDate.now(); //data di oggi
		System.out.println(data);
		
		int numeroGiorno = LocalDate.now().getDayOfMonth(); //prendi giorno del mese 
		System.out.println(numeroGiorno);
		
		String nomeGiorno = LocalDate.now().getDayOfWeek().name();	
		System.out.println(nomeGiorno);
		
		String nomeMese = LocalDate.now().getMonth().name();	
		System.out.println(nomeMese);
		
		int anno = LocalDate.now().getYear();
		System.out.println(anno);
		
		LocalDateTime dataConOra = LocalDateTime.now();
		System.out.println(dataConOra);
		
		int ora = LocalTime.now().getHour(); //prendi solo l'ora del giorno
		System.out.println(ora);
		
		//saluta in base all'ora
		String saluto;
		
		if(ora<12) {
			saluto = "Buongiorno";
		}
		else if(ora<18) {
			saluto = "Buon Pomeriggio";
		}
		else if (ora<22) {
			saluto = "Buonasera";
		}
		else {
			saluto= "BUonanotte";
		}
		System.out.println(saluto);
		
		
//--------------------------------------------------------------------
		
		//operatori logici --> &&(and) ||(or) !(not)
		
		boolean sole = false;
		int temp = 25;
		
		// Con && è vera solo se tutte e due le condizioni sono vere
		if(sole==true && temp > 20) {
			System.out.println("Puoi Uscire");
		}
		else {
			System.out.println("Non puoi uscire");
		}
		//Con || è vera se anche solo una delle condizioni è vera
		if(sole==true || temp >20) {
			System.out.println("Puoi Uscire");
		}
		else {
			System.out.println("Non puoi uscire");
		}
//----------------------------------------------------------------------------
		int voto1 = 6;
		int voto2 = 5;
		int voto3 = 10;
		
		//Promosso se tutti i voti sono sopra 6
		if(voto1 >= 6 && voto2 >= 6 && voto3 >= 6) {
			System.out.println("Sei Promosso");
		}
		else {
			System.out.println("Sei Bocciato");
		}
//		Promosso se voto1 e voto3 > 6 o se voto2>6
		
		if(voto1 >= 6 && voto3 >= 6 || voto2 >= 6) {
			System.out.println("Sei Promosso");
		}
		else {
			System.out.println("Sei Bocciato");
		}
		
		// && si legge prima di || (in pratica && fa parte di una condizione, || ne separa due)
		if(voto1 >= 6 || voto2 >= 6 && voto3 >= 6) {
			System.out.println("Sei Promosso");
		}
		else {
			System.out.println("Sei Bocciato");
		}
		
		if(voto2 >= 6 || voto1 >= 6 && voto3 >= 6) {
			System.out.println("Sei Promosso");
		}
		else {
			System.out.println("Sei Bocciato");
		}
		
		//le parentesi cambiano l'ordine di esecuzione 
		if(voto2 >= 6 && (voto1 >= 6 || voto3 >= 6)) {
			System.out.println("SeiPromosso");
		}
		else {
			System.out.println("Sei Bocciato");
		}
		
		//----------------------------------------------------------------------------------
		System.out.println("Inserisci ore e minuti:");
		int ore = s.nextInt();
		int minuti = s.nextInt();
		
		if(ore<0) {
			System.out.println("Non è un'ora valida");
		}
		else if (ore>23) {
			System.out.println("Non è un'ora valida");
		}
		else if (minuti < 0) {
			System.out.println("minuti invalidi");
		}
		else if (minuti > 59) {
			System.out.println("minuti invalidi");
		}
		else {
			System.out.println("Ora e Minuti Validi");
		}
		
		//con operatori logici si semplifica e accorcia il codice
		//con ||(or)
		if(ore<0 || ore>23 || minuti>0 || minuti>59) { // questo è uguale ai 4 if ed else if sopra
			System.out.println("Ora e minuti Invalidi");
		}
		else {
			System.out.println("Ora e minuti Validi");
		}
		
		//con &&(and)
		boolean ore_ok = ore >=0 && ore <24;
		boolean minuti_ok = minuti >=0 && minuti<60;
		
		if(minuti_ok && ore_ok) {
			System.out.println("Ora e minuti Validi");
		}
		else {
			System.out.println("Ora e minuti Invalidi");
		}
		
		
		s.close();
	}

}
