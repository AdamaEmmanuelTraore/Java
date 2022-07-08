/*scrivere un metodo che dato in input un numero e un vettore di interi dire se il
numero è una potenza dei valori indicati nel vettore. Esempio numero = 12 e
vettore= 1, 2, 3, 4 restituisce true. Se numero = 4 e v= 3, 4 restituisce false*/

public class Esercitazione3 {
	/*public static boolean p(int x, int[] y) {
		x = 0;
		if(x % 2 == 0) {
			return true;
		}
		else return false;
	}*/
	

	public static void main(String[] args) {
		int[] z = {1, 2, 3, 4};
		int num = 12;

		for(int i= 0; i < z.length; i++) {
			z[i] += i;
		if(num % z[i] == 0)
			System.out.println(true);
		else System.out.println(false);
		}
	}
}
