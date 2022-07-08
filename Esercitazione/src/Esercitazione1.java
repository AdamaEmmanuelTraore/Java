/*scrivere un metodo che dato in input un array di interi restituisca il suo inverso.
Esempio se si fornisce 1, 3, 6 ,7 deve fornire in output 7, 6, 3,1 e stamparlo fuori dal
metodo.*/

public class Esercitazione1 {
	
	public static int[] inverso(int[] cont) {
		for(int i = 0; i < cont.length; i++) {
			cont[i] += i;
		}
		return cont;
	}
	
	public static void stampa(int [] v) {
		for(int j = v.length -1; j >= 0; j--) {
			v[j] -= j;
			System.out.println(v[j]);
		}		
	}
	
	public static void main(String[] args) {
		int[] cont = {1, 3, 6, 7};
		/*int[] invVett = inverso(cont);
		stampa(invVett);*/
		stampa(inverso(cont));
	}
}
