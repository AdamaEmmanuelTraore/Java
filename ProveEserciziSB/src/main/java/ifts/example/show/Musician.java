package ifts.example.show;

public class Musician implements Artist {
	
// DEFINISCO GLI ATTRIBUTI
	private String name;
	private Instrument instrument;
	
// DEFINISCO IL COSTRUTTORE
	public Musician(String name, Instrument instrument) {
		this.name = name;
		this.instrument = instrument;
	}

// QUI DEFINISCO IL MIO METODO
	@Override
	public String perform() {
		return "Sono " + name + ": " + instrument.play();
	}

}
