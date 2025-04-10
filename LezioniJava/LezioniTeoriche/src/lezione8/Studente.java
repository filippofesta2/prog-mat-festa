package lezione8;

public class Studente {

	String nome;
	String cognome;
	Integer anno;
	Boolean presenza;
	String corso;

	public Studente(String nome, String cognome, Integer anno, Boolean presenza, String corso) {
		this.nome = nome;
		this.cognome = cognome;
		this.anno = anno;
		this.presenza = presenza;
		this.corso = corso;
	}
	
	public String Presentati() {
		
		String nome = this.nome;
		String cognome = this.cognome;
		return("Io sono " + nome + " " + cognome);
	}

	public String Iscrizione() {
		Integer anno = this.anno;
		String corso = this.corso;
		return("Sei stato iscritto al corso "+ corso + " dell'anno "+ anno);
	}

	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome + ", anno=" + anno + ", presenza=" + presenza
				+ ", corso=" + corso + "]";
	}
	
	
	
	
	
}
