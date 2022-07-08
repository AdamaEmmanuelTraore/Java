import java.util.ArrayList;

public abstract class Dipendente {

	//ATTRIBUTI
	protected int matricola;
	protected ArrayList<Ticket> collezioneBigliettiVenduti = new ArrayList<Ticket>();
	
	
	//COSTRUTTORE
	public Dipendente() {
		this.matricola = 0;
	}
}
