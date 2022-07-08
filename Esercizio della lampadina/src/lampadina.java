
public class lampadina { //CREAZIONE DELLA CLASSE LAMPADINA
	//ATTRIBUTO
	String stato; //CREAZIONE DELLA VARIABILE "STATO" 
	//COSTRUTTORE
	public lampadina(String stato) {  //CREAZIONE DEL COSTRUTTORE CHE MI PERMETTE DI INIZIALLIZZARE LA VARIABILE
		this.stato = stato;
	}
	//AZIONI / METODO
	public void acceso() { //DEFINISCO IL "METODO DI ISTANZA" DOVE DEFINISCO LO STATO "acceso"
		stato = "acceso";  //IL METODO DI ISTANZA VA SEMPRE DEFINITO CON "PUBLIC VOID..." E NON DA "RETURN".
	}
	
	public void spento() { //DEFINISCO IL "METODO DI ISTANZA" DOVE DEFINISCO LO STATO "spento"
		stato = "spento";
	}
	
	public String info() { //DEFINISCO IL "METODO DI ISTANZA" DOVE DEFINISCO LO STATO DELLA LAMPADA"info"
		return stato;
	}
}

