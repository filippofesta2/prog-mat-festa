package cellulare;

public class Cellulare {

	public String marca;
	public String modello;
	public double credito;
	public int numChiamate;
	public final double PREZZO_AL_MINUTO=.20;
	
	public Cellulare() {
		
	}
	
	public Cellulare(String marca, String modello, double credito) {
		this.marca = marca;
		this.modello = modello;
		this.credito = credito;
	}
	
	public void ricarica(double soldi) {
		credito += soldi;
	}
	
	public void chiamata(double durata) {
		credito -= PREZZO_AL_MINUTO * durata;
		numChiamate++;
	}
	
	public double infocredito() {
		return credito;
	}
	
	public int quanteChiamate() {
		return numChiamate;
	}
	
	public boolean creditoEsaurito() {
		return credito <= 0;
	}

	@Override
	public String toString() {
		return "Cellulare [marca=" + marca + ", modello=" + modello + ", credito=" + credito + ", numChiamate="
				+ numChiamate + ", PREZZO_AL_MINUTO=" + PREZZO_AL_MINUTO + "]";
	}
	
	
}
