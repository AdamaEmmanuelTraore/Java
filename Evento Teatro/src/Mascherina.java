import java.util.ArrayList;

public class Mascherina extends Dipendente{
	int cont = 0;

	//METODO
	
	/*QUESTO METODO DEVE RESTITUIRE LA QUANTITA' DI BIGLIETTI CHE POSSONO
	ENTRARE IN SALA, DOVE VA IN SCENA.*/
	
	public int controllaBiglietto(ArrayList<Ticket> y) {
		for(int j = 0; j < collezioneBigliettiVenduti.size(); j++) {
			for(int i = 0; i < y.size(); i++) {
				if(y.get(i).matricola == collezioneBigliettiVenduti.get(j).matricola)
					cont ++;
			}		
		}
		
		
		//avviaSpettacolo(y.get(0).nomeSpettacolo, cont);
		return cont;
	}
	
	/*UNO SPETTACOLO (MIN 3, MAX 5)*/
	
	protected boolean avviaSpettacolo(String nome, int count) {
		if(count >= 3 && count<=5) {
			System.out.println("Avvio " + nome);
			return true;
		}
		return false;
	}
}
