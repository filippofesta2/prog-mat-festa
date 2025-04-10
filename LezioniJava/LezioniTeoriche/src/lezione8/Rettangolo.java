package lezione8;

public class Rettangolo {

	//STATO DELLA CLASSE
	double h;
	double b;
	
	//ATTENZIONE: non abbiamo specificato un costruttore di default
	
	public Rettangolo(double h, double b) {
		//il this fa riferimento alla classe (la base di questa classe) quella della riga 6 = quella che passi al metodo
		this.h = h;
		this.b = b;
	}
	
	//COMPORTAMENTO DELLA CLASSE
	public double area() {
		double area = this.b * this.h;
		return area;
	}
	
	public double perimetro() {
		double perimetro = (this.b + this.h)*2;
		return perimetro;
	}

	
	public String toString() {
		return "Rettangolo [h = " + h + ", b = " + b + ", area = " + area() + ", perimetro = " + perimetro() + "]";
	}
	
	
	
	
}
