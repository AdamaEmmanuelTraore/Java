import java.util.Scanner;

/** Scrivere un programma SoloVocali che chiede all’utente di inserire una
stringa e ne stampa le sole vocali, definendo il metodo estraiVocali. Per
esempio, se si immette la stringa "Viva Java", il programma stampa "iaaa".*/

public class SoloVocaliB {
	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		String frase = str.nextLine();
		System.out.println(estraiVocali(frase));
		str.close();
	}
	
	public static String estraiVocali(String pippo) {
		
		String risultato = "";
		for(int i = 0; i < pippo.length(); i++) {
			char ch = pippo.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				risultato += ch;
			}
		}
		return risultato;
	}
}
