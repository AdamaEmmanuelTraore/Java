
public class Triangolo extends FiguraGeometrica {

	//COSTRUTTORE
	public Triangolo(double base, double altezza) {
		super(base, altezza);
	}
	
	//METODO
	double area() {
		return (this.base * this.altezza) /2;
	}
	
	double perimetro() {
		return 3 * this.base;
	}
	public String toString() {
		return "area del triangolo: " + area() + "Perimetro del triangolo: " + perimetro();
	}
}
