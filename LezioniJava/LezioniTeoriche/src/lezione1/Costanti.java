package lezione1;

import java.math.BigDecimal;

public class Costanti {
 
	public static void main (String[] args){
	 
	 double primoNumero = 42.12;      //variabile
	 System.out.println(primoNumero);
	 
	 primoNumero = 45.3;              //aggiorno valore variabile
	 System.out.println(primoNumero);
	 
	//per trasformare una variabile in una costante utilizzo il MODIFICATORE final davanti alla dichiarazione del tipo (convenzione: solitamente le costanti vengono dicharate tutte in maiuscolo
	 final double IVA = 0.22;
	 //final double PI = 3.14; //COMMENTATI PERCHè NON LI USAVO E MI DAVA IL WARNING CHE MI DAVA FASTIDIO ALL'OCD
	 
	 //final int MAX_VALUE = 100;//COMMENTATI PERCHè NON LI USAVO E MI DAVA IL WARNING CHE MI DAVA FASTIDIO ALL'OCD
	 //final int MIN_VALUE = 0; //COMMENTATI PERCHè NON LI USAVO E MI DAVA IL WARNING CHE MI DAVA FASTIDIO ALL'OCD
	 
	 //non posso variare il valore di una costante ma lo posso utilizzare all'interno di un qualsiasi calcolo
	 //System.out.println(++MAX_VALUE); MAX_VALUE = MAX_VALUE + 1
	 
	 //Esempio Semplice: Calcolare l'iva su 259.34 euro
	 double costo = 259.34;
	 double valoreIVA = costo * IVA;
	 BigDecimal val_Iva = new BigDecimal(valoreIVA);
	 System.out.println("L'iva su " + costo + "Euro vale: " + val_Iva.floatValue());
	 
	 
 }
}
