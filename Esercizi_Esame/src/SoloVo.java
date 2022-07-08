import java.util.Scanner;

/*Scrivere un programma SoloVocali che chiede all’utente di inserire una
stringa e ne stampa le sole vocali, definendo il metodo estraiVocali. Per
esempio, se si immette la stringa "Viva Java", il programma stampa "iaaa".*/

public class SoloVo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Scrivi qualcosa");
		String parola = input.nextLine();
		
		for(int i = 0; i < parola.length(); i++) {
			char ch = parola.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch);
			} else {
				System.out.print("Non ci sono vocali");
			}
		}

	}

}
