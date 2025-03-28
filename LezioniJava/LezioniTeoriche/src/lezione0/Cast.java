package lezione0;

public class Cast {

	public static void main(String[] args) {
		
	
	int i1 = 10, i2 = 5, i3 = 856; //è possibile dichiarare più variabili dello stesso tipo su un'unica riga
	
	byte b1, b2, b3;
	
	b1 = (byte) i1;
	b2 = (byte) i2;
	b3 = (byte) i3;
	
	short s3 = (short) i3;
	
	System.out.println( "Il cast di i1 vale " + b1);
	System.out.println("Il cast di i2 vale " + b2);
	System.out.println("Il cast di i3 vale " + b3); //quante volte vado a riempire la scatola byte????
	System.out.println("Il cast di i3 in short vale " + s3);
	} 
	
}
