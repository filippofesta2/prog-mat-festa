package cellulare;

public class Testcellulare {

	public static void main(String[] args) {
		Cellulare c = new Cellulare("Samsung", "S24", 0);
		
		System.out.println(c);
		
		c.ricarica(20);
		c.chiamata(10);
		
		System.out.println("Credito: "+ c.infocredito());
		System.out.println("Chiamate: " +c.quanteChiamate());
		
		System.out.println("Ho finito i soldi? "+c.creditoEsaurito());
		
	}
}
