package ripassoclassifabio;

public class TestPersona {
	
	public static void main(String[] args) {
	
		Persona p = new Persona();
		p.cognome = "Rossi";
		p.nome="Mario";
		p.eta = 30;
		
		System.out.println(p);
		p.mangia("Pizza");
		p.mangia("Pasta", "Carne");
		p.dorme();
		System.out.println("E' maggiorenne? "+p.isMaggiorenne());
		
		Persona p2 = new Persona();
		p.cognome = "Verdi";
		p.nome="Luigi";
		p.eta = 33;
		
		System.out.println(p2);
		p2.mangia("Fiche");
		p2.mangia("Daisy", "Koopa");
		p2.dorme();
		System.out.println("E' maggiorenne? "+p.isMaggiorenne());
		
		Persona p3 = new Persona("Marco", "Franchi", 8);
		p3.mangia("merda");
		p3.mangia("Lupini", "Cervelli");
		p3.dorme();
		p3.eta=50;
		
		Persona p4 = new Persona("aa","bb", 50);
		System.out.println(p4);
		
	}
}
