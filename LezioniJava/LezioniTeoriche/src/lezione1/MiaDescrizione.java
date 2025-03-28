package lezione1;

public class MiaDescrizione {

	public static void main(String[] args) {
		
		String mioNome = "Filippo";
		int etàAttuale = 27;
		int prossimaEtà = etàAttuale + 10;
		int precedenteEtà = etàAttuale - 10;
		
		//nomeVar++ si chiama operatore di post incremento (prima leggo poi incremento la variabile
		//int annoProssimoEtà = etàAttuale ++;
		// ++nomeVar si chiama operatore di pre incremento (prima incremento poi leggo la variabile
		
		//int annoProssimoEtà = ++etàAttuale; questo operatore manipola il valore della variabile eràAttuale: d'ora in poi sarà sempre 28
		int annoProssimoEtà = etàAttuale + 1;
		
		//int annoPrecEtà = --etàAttuale; questo operatore manipola il valore della variabile eràAttuale: d'ora in poi sarà sempre 26
		int annoPrecEtà = etàAttuale -1;
		
		String descrizione ="Ciao, mi chiamo " + mioNome + " e ho " + etàAttuale + " anni. Dieci anni fa avevo " +  precedenteEtà + " anni. tra dieci anni avrò " + prossimaEtà + " anni. Tra un anno avrò " + annoProssimoEtà + " anni. L'anno scorso avevo " + annoPrecEtà + " anni.";
		
		System.out.println(descrizione);
	}

}
