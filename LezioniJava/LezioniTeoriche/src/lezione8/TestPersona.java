package lezione8;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("Filippo", "Festa", 27);
		
		//System.out.println(p.toString());
		
		System.out.println(p1); //questo (mettere solo p1 tra parentesi funziona solo perchè il toString() è dichiarato nella classe.
	}
}
