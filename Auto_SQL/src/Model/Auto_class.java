package Model;

public class Auto_class {
	public int id;
	public String marchio;
	public String nazione;
	public int fatturato;
	public int dipendenti;
	
	public Auto_class(int id, String marchio, String nazione, int fatturato, int dipendenti) {
		super();
		this.id = id;
		this.marchio = marchio;
		this.nazione = nazione;
		this.fatturato = fatturato;
		this.dipendenti = dipendenti;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getMarchio() {
		return marchio;
	}
	public void setMarchio(String marchio) {
		this.marchio = marchio;
	}

	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public int getFatturato() {
		return fatturato;
	}
	public void setFatturato(int fatturato) {
		this.fatturato = fatturato;
	}

	public int getDipendenti() {
		return dipendenti;
	}
	public void setDipendenti(int dipendenti) {
		this.dipendenti = dipendenti;
	}

	@Override
	public String toString() {
		return "Auto [ID = " + id + ", MARCHIO = " + marchio + ", NAZIONE = " + nazione + ", FATTURATO = " + fatturato
				+ ", DIPENDENTI = " + dipendenti + "]";
	}
}
