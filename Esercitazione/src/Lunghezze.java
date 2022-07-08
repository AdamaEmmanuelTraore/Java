/** Scrivere un programma Lunghezze che chiede all’utente di inserire una
sequenza di stringhe e conclusa dalla stringa vuota, e poi stampa la somma
delle lunghezze delle stringhe che iniziano con una lettera maiuscola. Per
esempio, se si immettono le stringhe "Albero", "foglia", "Radici", "Ramo", "fiore"
(e poi "" per finire), il programma stampa 16.*/

import java.util.Scanner;                      //NEXT: CONSIDERA LA PRIMA PAROLA, E NON TUTTA LA FRASE/RIGA.

public class Lunghezze {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	int somma = 0;
	System.out.println("Quante stringhe vuoi?");
	int xStringhe = input.nextInt();
	String[] parole = new String[xStringhe]; //VA A CREARE L'ARRAY
	
	for(int i = 0; i < parole.length; i++) {
		System.out.println("Inserisci la parola");
		//System.out.println("1111111");
		parole[i] = input.next();// SERVE PER DEFINIRE ALL'UTENTE DOVE INSERIRE LA PAROLA NEL DETERMINATO ARRAY
		//System.out.println("2222222");
		if(parole[i].charAt(0) >= 'A' && parole[i].charAt(0) <= 'Z') {
			somma += parole[i].length(); // SOMMA DELLE LUNGHEZZE DELLE STRINGHE
			
		}
		
	}
	System.out.println(somma);
}
}
