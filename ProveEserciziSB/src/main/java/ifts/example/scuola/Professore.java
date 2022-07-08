package ifts.example.scuola;

public class Professore implements Organo {

	private String nome;
	private Organo materia;
	
	public Professore(String nome, Organo materia) {
		this.nome = nome;
		this.materia = materia;
	}
	
	@Override
	public String attività() {
		return "Salve ragazzi, sono " + this.nome + " il vostro insegnante di " + this.materia.attività();
	}

}
