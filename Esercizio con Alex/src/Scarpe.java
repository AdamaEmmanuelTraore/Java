
public class Scarpe {
//attributo/VARIABILI DI ISTANZA(MEMORIZZANO LO STATO DEGLI OGGETTI)
	private int taglia;
	private String marca;
	private String colore;
	private String modello;
	private double prezzo;
//construttore
	public Scarpe(int taglia, String marca, String colore, String modello, double prezzo) {
		this.taglia = taglia;
		this.marca = marca;
		this.colore = colore;
		this.modello = modello;
		this.prezzo = prezzo;
	}
//AZIONI / METODO(PUBLIC VOID)
	public void SetTaglia(int taglia) { //SET: Modificano i valore
		this.taglia = taglia;           //GET: Conoscere lo stato attuale di un attributo
	}									//TO: Permette di visualizzare gli "attributi" del nostro oggetto
	public void SetMarca(String marca) {
		this.marca = marca;
	}
	public void SetColore(String colore) {
		this.colore = colore;
	}
	public void SetModello(String modello) {
		this.modello = modello;
	}
	public void SetPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int GetTaglia() {
		return this.taglia;
	}
	public String GetMarca() {
		return this.marca;
	}
	public String Getcolore() {
		return this.colore;
	}
	public String GetModello() {
		return this.modello;
	}
	public double Getprezzo() {
		return this.prezzo;
	}
	public String toString() { //SERVE A RESTITUIRE DEI VALORI CON IL RETURN.
        String s = "";
    s += "\n===========================================\n";
        s += "taglia: " + this.taglia + "\n" + "marca: " + this.marca + "\n" + "colore: " + this.colore + "\n" + "modello: " + this.modello + "\n" + "prezzo: " + this.prezzo;
    s += "\n===========================================\n";
        return s;
	
	/*public String toString() {
		String s = "";
		s += "taglia: " + this.taglia + "\n" + "marca: " + this.marca + "\n" + "colore: " + this.colore + "\n" + "modello: " + this.modello + "\n" + "prezzo: " + this.prezzo;
		return s;*/
	}

}

//DESIGN PATTERN: è una configurazione per la progettazione/disegno di un problema.

//SINGLETON: Mi permette di definire uno e un solo oggetto
