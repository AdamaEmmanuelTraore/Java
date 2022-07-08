
public class Quadrato extends FiguraGeometrica {
	
	//COSTRUTTORE
	public Quadrato(double base, double altezza) {
		super(base, altezza);
	}

	//METODI
	double area() {
		return this.base * this.altezza;
	}
	
	double perimetro() {
		return (this.base + this.altezza) * 2;
	}
	public String toString() {
		return "area del quadrato: " + area() + "Perimetro del quadrato: " + perimetro();
	}
}
