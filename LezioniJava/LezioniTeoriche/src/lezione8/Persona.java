package lezione8;

public class Persona {

	//Stato
	String nome;
	String cognome;
	Integer eta;
	
	//costruttori
	public Persona() {
		
	}

	public Persona(String nome, String cognome, Integer eta) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + "]";
	}
	
	
	
	
}
