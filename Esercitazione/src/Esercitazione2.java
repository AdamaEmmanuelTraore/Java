/*scrivere un metodo che dato in input un vettore di interi li stampi a zig-zag.
Esempio se ho 1, 2, 4, 5, 20, stampa 1, 20, 2, 5, 4*/

public class Esercitazione2 {

	public static void main(String[] args) {
		int[] x = {1, 2, 4, 5, 20};
		for(int i = 0, j = x.length; i < x.length; i++) {
			x[i] += j;
			System.out.println(x[i]);
		}
	}
}
