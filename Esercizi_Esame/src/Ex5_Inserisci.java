import java.util.Scanner;

/*Scrivere un programma che chiede all’utente l’inserimento da tastiera di due valori numerici
ed effettuare la loro somma. Visualizzare come output il risultato ottenuto*/

public class Ex5_Inserisci {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		int num1 = input.nextInt();
		
		System.out.println("Inserisci il secondo numero");
		int num2 = input.nextInt();
		
		int somma = num1 + num2;
		
		System.out.print("La somma è: " + somma);
		}
}
