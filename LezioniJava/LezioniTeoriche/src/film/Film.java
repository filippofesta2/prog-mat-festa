package film;

import java.util.Arrays;

public class Film {
	public String titolo;
	public double durata;
	public int anno;
	public String genere;
	public String regista;
	
	public String[] attori = new String [3];

	
	
	public Film() {
		
	}



	public Film(String titolo, double durata, int anno, String genere, String regista, String[] attori) {
		this.titolo = titolo;
		this.durata = durata;
		this.anno = anno;
		this.genere = genere;
		this.regista = regista;
		this.attori = attori;
	}



	@Override
	public String toString() {
		return "Film [titolo=" + titolo + ", durata=" + durata + ", anno=" + anno + ", genere=" + genere + ", regista="
				+ regista + ", attori=" + Arrays.toString(attori) + "]";
	}
	
	
	

}
