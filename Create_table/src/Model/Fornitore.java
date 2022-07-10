package Model;

public class Fornitore {
	public int CodiceFornitore;
	public String Nome;
	public String Indirizzo;
	public String Citta;
	
	public Fornitore(int codiceFornitore, String nome, String indirizzo, String citta) {
		super();
		CodiceFornitore = codiceFornitore;
		Nome = nome;
		Indirizzo = indirizzo;
		Citta = citta;
	}

	public int getCodiceFornitore() {
		return CodiceFornitore;
	}

	public void setCodiceFornitore(int codiceFornitore) {
		CodiceFornitore = codiceFornitore;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getIndirizzo() {
		return Indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		Indirizzo = indirizzo;
	}

	public String getCitta() {
		return Citta;
	}

	public void setCitta(String citta) {
		Citta = citta;
	}

	@Override
	public String toString() {
		return "Fornitore [CODICEFORNITORE = " + CodiceFornitore + ", NOME = " + Nome + ", INDIRIZZO = " + Indirizzo
				+ ", CITTA = " + Citta + "]";
	}
	
	
	
	

}
