import java.util.Scanner;

/*Scrivere un programma StampaMaiuscole che, dato un array di stringhe,
 ne stampa solo quelle con la prima lettera maiuscola
 */

public class StampaMaiuscole {

	public static void main(String[] args) {
		String[] x = {"ciao", "Bello", "SwaG"};
		//Scanner in = new Scanner(System.in);
		//System.out.println("Inserire una stringa");
		//x[0] = in.nextLine();
		
		for(int i = 0; i < x.length -1; i++) {
			char ch = x[i].charAt(0);
			if(ch >= 65 && ch <= 90) { //IL MIO CARATTERE E' COMPRESO TRA 65 E 90.
				System.out.println(x[i]);
			}	
		}
	}
}
