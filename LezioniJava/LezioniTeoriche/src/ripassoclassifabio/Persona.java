package ripassoclassifabio;

public class Persona {
	public String nome;
	public String cognome;
	public int eta;
	public boolean maggiorenne;
	
	//Metodo Costruttore
	
	public Persona() {
		
	}
	public Persona(String nome, String cognome) {
	 this.nome = nome;
	 this.cognome = cognome;
	}
	
	

	public Persona(String nome, String cognome, int eta) {
		this.nome=nome;
		this.cognome=cognome;
		this.eta=eta;
	}
	
	
	public void mangia(String cibo) {
		System.out.println("Sta mangiando "+ cibo);
	}
	
	public void mangia (String pranzo, String cena) {
		System.out.println("A pranzo mangia "+pranzo+", a cena mangia "+ cena);
	}
	
	public void dorme() {
		System.out.println("ZZZZZZZZZZZ");
	}
	
	public boolean isMaggiorenne() { //ritorna vero quando la condizione nel return è vero
		return eta>=18;
	}
	
	@Override
	public String toString() {
		return "La persona si chiama " + nome + " " + cognome +
				" e ha " + eta + " anni";
	}

	
	
	
	
	
}
