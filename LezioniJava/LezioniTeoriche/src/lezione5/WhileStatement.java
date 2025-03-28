package lezione5;

public class WhileStatement {

	public static void main(String[] args) {
		//WHILE: Cicli Indefiniti
		//while(condizione){esegui finchè la condizione è true}
	
		boolean condizione = true;
		
		int i = 0;
		
		while (condizione){
			i++;
			System.out.println("Tentativo n: "+ i);
			
			double casuale = Math.random(); // numero casuale tra 0 e 1
			if(casuale > 0.8) {
				condizione=false;
				System.out.println("Si chiude con: " + casuale);
			}
		}
		
		//esempio 2
		
		int a = 0;
		while (a <= 10){
			System.out.println("Ciao "+ a);
			a++;
		}
		System.out.println("Stop");
		
		//scrivi la tabellina del 5
		System.out.println("WHILE");
		int c = 10;
		while(c <=10) {
			int risultato = c*5;
			System.out.println("5 x " + c + "=" + risultato);
			c++;
		}
		
		//DO-WHILE:prima esegue qualcosa SEMPRE, poi controlla la condizione
		System.out.println("DO-WHILE");
		int d = 11;
		do {
			int risultato = d*5;
			System.out.println("5 x " + d + "=" + risultato);
			d++;
		}while(c<=10);
		
		
		
	}

}
