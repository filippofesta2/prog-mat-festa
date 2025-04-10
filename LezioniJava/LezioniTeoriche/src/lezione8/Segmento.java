package lezione8;

public class Segmento {
	Punto a;
	Punto b;
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}

	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + "]";
	}
}
