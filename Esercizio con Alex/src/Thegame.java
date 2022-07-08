import java.util.Scanner;

/*Scrivere un programma che chieda agli utenti due stringhe in ingresso,
 le stringhe possono valere solo: “carta”, “forbice” o “sasso”. Il programma dovrà 
 quindi effettuare i dovuti controlli e dichiarare il vincitore secondo le note regole della
 “morra cinese” (forbice vince su carta, carta vince su sasso, sasso vince su forbice).*/

public class Thegame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] x = new String[2];
		System.out.println("Player 1 sceglie: ");
		x[0] = in.nextLine();
		System.out.println("Player 2 sceglie: ");
		x[1] = in.nextLine();
		
		
		if(x[0].equals("carta") && x[1].equals("sasso")) {
			System.out.println("carta vince su sasso, vince player 1");
		}
		else if(x[0].equals("forbice") && x[1].equals("carta")) {
			System.out.println("forbice vince su carta, vince player 1");
		}
		else if(x[0].equals("sasso") && x[1].equals("forbice")) {
			System.out.println("sasso vince su forbice, vince player 1");
		}
		else if(x[0].equals("forbice") && x[1].equals("sasso")) {
			System.out.println("sasso vince su forbice, vince player 1");
		}
		else
		
		if(x[1].equals("carta") && x[0].equals("sasso")) {
				System.out.println("carta vince su sasso, vince player 2");
		}
		else if(x[1].equals("forbice") && x[0].equals("carta")) {
				System.out.println("forbice vince su carta, vince player 2");
		}
		else if(x[1].equals("sasso") && x[0].equals("forbice")) {
				System.out.println("sasso vince su forbice, vince player 2");
		}
		else if(x[1].equals("forbice") && x[0].equals("sasso")) {
				System.out.println("sasso vince su forbice, vince player 2");
		}
		else
		System.out.println("pareggio");
	}
}
