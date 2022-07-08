import java.util.Scanner;

/* Scrivere un programma che chiede all’utente l’inserimento da tastiera di due valori
numerici e l’operazione da eseguire (esempio: +, -, / e *). In seguito effettuare tutte le
operazioni visualizzando il risultato ottenuto come output, evitate di mettere il valore Zero
per consentire l’operazione di divisione */

public class Ex6_ins_dati_tastiera {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		int num1 = input.nextInt();
		
		System.out.println("Inserisci il secondo numero");
		int num2 = input.nextInt();
		
		int ris = num1 * num2;
		System.out.println("Il risultato è: " + ris);

	}

}
