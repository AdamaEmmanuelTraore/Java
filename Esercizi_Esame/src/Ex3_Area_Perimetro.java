/*Calcolare il perimetro e area di un rettangolo partendo da una base e da un’altezza*/

public class Ex3_Area_Perimetro {
	public static void main(String[] args) {
		int base = 10;
		int altezza = 20;
		int area = 0;
		int perimetro = 0;
		
		area = base * altezza;
		System.out.println("L'area del rettangolo è: " + area + " cm");
		perimetro = 2 * (base + altezza);
		System.out.print("Il perimetro del rettangolo è: " + perimetro + " cm");
	}

}
