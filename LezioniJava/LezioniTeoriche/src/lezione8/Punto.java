package lezione8;

public class Punto {

	//ATTRIBUTI O PROPRIETA' rappresentano lo STATO della classe
	double x;
	double y;
	
	// COSTRUTTORI o METODI COSTRUTTORI del punto
	//ATTENZIONE: I Costruttori hanno lo STESSO NOME della CLASSE
	
		//Primo Metodo Costruttore, fornisco uno stato iniziale
	
	public Punto() {
		
		x = 0;
		y = 0;
	}
	
		//OVERLOAD del metodo costruttore. Posso avere più metodi costruttori con firme diverse
	
	public Punto (int miaX, int miaY) {
		x = miaX;
		y = miaY;
	}
	
	public Punto (double miaX, double miaY) {
		x = miaX;
		y = miaY;
	}

	//voglio un metodo che mi descriva l'oggetto
	//Creo il metodo toString() (alt+shift+s)
	@Override
	public String toString() {
		return "Punto [la x vale =" + x + ",la y vale =" + y + "]";
	}
	
}
