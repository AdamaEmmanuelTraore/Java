package ifts.example.scuola;

public class Modulo implements Organo {

	private String materia;
	
	
	public Modulo() {}
	
	public Modulo(String materia) {
		this.materia = materia;
		
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	@Override
	public String attività() {
		return this.materia;
	}

}
