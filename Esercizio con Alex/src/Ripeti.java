import java.util.Scanner;

/*Scrivere un programma Ripeti che chiede all’utente di inserire una stringa e un numero intero positivo.
 Entrambe le cose dovranno essere passate a un metodo ausiliario che stamperà tante copie della stringa quante
 indicate nel numero inserito dall’utente. Se il numero inserito dall’utente è negativo il metodo 
 ausiliario stamperà "ERRORE: numero negativo". Il nome del metodo ausiliario può essere scelto a piacere*/

public class Ripeti {
	
	public static String metodo(String x, int y) {
		int ripeti = 1;
		while(ripeti <y) {
			ripeti++;
			System.out.println(x);
		} return x;
	}

	public static void main(String[] args) {
		Scanner m1 = new Scanner(System.in);
		System.out.println("Inserisci una stringa a piacere");
		String uP = m1.nextLine();
		System.out.println(metodo(uP, 3));
	}
}
