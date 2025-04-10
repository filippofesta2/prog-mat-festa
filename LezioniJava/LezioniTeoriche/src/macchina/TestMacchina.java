package macchina;

public class TestMacchina {
	
	public static void main(String[] args) {
		
		
		Macchina m = new Macchina();
		m.anno = 2025;
		m.colore = "rosso";
		m.marca = "Fiat";
		m.modello = "panda";
		m.prezzo = 8000;
		System.out.println(m);
		
		m.Parti();
		m.Accelera();
		System.out.println("Velocità = " + m.Velocita());
		m.Accelera();
		m.Accelera();
		m.Accelera();
		System.out.println("Velocità = " + m.Velocita());
		m.Frena();
		m.Frena();
		System.out.println("Velocità = " + m.Velocita());
		m.Ferma();
		
		//------------------------------------------------------------------
		
		Macchina m2 = new Macchina("Mercedes", "Gullwing", 1968, 50000, "grigia", 0);
		
		System.out.println(m2);
		m2.Parti();
		m2.Accelera();
		System.out.println("Velocità = " + m2.Velocita());
		m2.Accelera();
		m2.Accelera();
		m2.Accelera();
		System.out.println("Velocità = " + m2.Velocita());
		m2.Frena();
		m2.Frena();
		System.out.println("Velocità = " + m2.Velocita());
		m2.Ferma();
	}
}
