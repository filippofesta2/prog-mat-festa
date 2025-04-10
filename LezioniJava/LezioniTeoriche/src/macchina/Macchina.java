package macchina;

public class Macchina {

	public String marca;
	public String modello;
	public int anno;
	public double prezzo;
	public String colore;
	public int velocita;
	
	public Macchina() {
		
	}
	
	public Macchina(String marca, String modello, int anno, double prezzo, String colore, int velocita) {
		this.marca = marca;
		this.modello = modello;
		this.anno = anno;
		this.prezzo = prezzo;
		this.colore = colore;
		this.velocita = velocita;
	}

	public void Parti() {
		System.out.println("Sto partendo");
		velocita = 0;
		
	}
	
	public void Accelera() {
		velocita++;
	}
	
	public void Frena() {
		velocita--;
	}
	
	public void Ferma() {
		System.out.println("La macchina è ferma");
		velocita=0;
	}
	
	public int Velocita() {
		return velocita;
	}

	@Override
	public String toString() {
		return marca +" "+  modello +" "+  anno +" "+  prezzo
				+" "+  colore +" "+  velocita ;
	}
	
	
}
