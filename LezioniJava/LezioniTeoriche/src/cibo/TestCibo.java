package cibo;

public class TestCibo {

	public static void main(String[] args) {
		
		Cibo[] frigo = new Cibo[3];
		
		Cibo c1 = new Cibo("pera");
		Cibo c2 = new Cibo("pizza");
		Cibo c3 = new Cibo("patata");
		
		frigo[0] = c1;
		frigo[1] = c2;
		frigo[2] = c3;
		
		//oppure
		
		//Cibo[]frigo = {c1,c2,c3};
		System.out.println("Nel Frigo ci sono i seguenti cibi");
		for (Cibo cibo : frigo) {
			System.out.println(cibo);
		}
		
	}
}
