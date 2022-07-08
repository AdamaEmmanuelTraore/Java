import java.util.ArrayList;

public class Botteghino extends Dipendente{

	//METODO
	ArrayList<Ticket> collezionaBiglietto() {
		return this.collezioneBigliettiVenduti;
	}
	
	ArrayList<Ticket> vendeBiglietti(int qtB, Spettacolo sp) {
		ArrayList<Ticket> temp = new ArrayList<Ticket>();
		for(int i = 0; i < qtB; i++) {
			Ticket x = new Ticket(sp.getNomeSpettacolo(), 10, 6);
			temp.add(x);
		}
		collezioneBigliettiVenduti.addAll(temp);
		return temp;
	}
	
}
