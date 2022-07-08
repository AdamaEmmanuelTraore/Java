package ifts.example.show;

public class Guitar implements Instrument {

// DEFINISCO GLI ATTRIBUTI
	private String sound;
	
//CREO UN METODO SET
	public void setSound(String sound) {
		this.sound = sound;
	}
	
// DEFINISCO IL COSTRUTTORE (vuoto)
	public Guitar() {}
	
// DEFINISCO IL COSTRUTTORE
	public Guitar(String sound) {
		this.sound = sound;
	}
	
// QUI DEFINISCO IL MIO METODO
	@Override
	public String play() {
		return this.sound;
	}

}
