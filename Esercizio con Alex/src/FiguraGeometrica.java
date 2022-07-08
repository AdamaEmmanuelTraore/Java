
public abstract class FiguraGeometrica {

	//ATTRIBUTI
	protected double base;
	protected double altezza;
	
	//COSTRUTTORE
	public FiguraGeometrica(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	//METODO
	abstract double area();
	abstract double perimetro();
}
