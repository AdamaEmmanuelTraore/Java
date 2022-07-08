import java.util.Date;

public class Spettacolo {

	//ATTRIBUTO
	protected String nome;
	protected String genere;
	protected Date dataOrario;
	protected int durata;
	
	//COSTRUTTORE
	public Spettacolo(String nome, String genere, Date dataOrario, int durata) {
		this.nome = nome;
		this.genere = genere;
		this.dataOrario = dataOrario;
		this.durata = durata;
	}
	
	public String getNomeSpettacolo() {
		return nome;
	}
}
