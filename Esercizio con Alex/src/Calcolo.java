import java.util.Scanner;

/*Scrivere un programma che calcoli il risultato dell’esame di uno studente.
Il programma prenderà in ingresso:
Il voto ottenuto nella prova scritta (variabile tra -8 e +8)
Il voto ottenuto nella prova pratica (variabile tra 0 e 24)
Memorizzati questi dati procederà al calcolo del risultato finale in trentesimi procedendo come segue:

Il risultato finale è la somma dei risultati.
se il voto di teoria è minore (o uguale) di zero e la somma dei voti di teoria e pratica è maggiore di 18 lo studente è bocciato.
se il voto di teoria è minore (o uguale) di zero e il voto di pratica è minore di 18 il programmalo studente è bocciato.
se il voto di teoria è maggiore di zero e la somma dei voti di teoria e pratica è minore di 18lo studente è bocciato.
se la somma di teoria e pratica vale 31 o 32 il programma stampa: “congratulazioni: 30 e lode”
in tutti gli altri casi lo studente è promosso e viene riportato il voto calcolato.*/

public class Calcolo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Scrivi un voto da -8 a 8 della prova scritta");
		int provScrit = in.nextInt();
		
		System.out.println("Scrivi un voto da 0 a 24 della prova pratica");
		int provPrat = in.nextInt();
		
		int somma = provScrit + provPrat;
		
		if(provScrit <= 0 && somma > 18) {
			System.out.println("Studente Bocciato");
		}
		else if(provScrit <= 0 && provScrit < 18) {
			System.out.println("Studente Bocciato");
		}
		else if(provScrit > 0 && somma < 18) {
			System.out.println("Studente Bocciato");
		}
		else if(somma == 31 || somma == 32) {
			System.out.println("congratulazioni: 30 e lode");
		}
		else
			System.out.println("Lo studente è promosso " + somma);
	}
}
