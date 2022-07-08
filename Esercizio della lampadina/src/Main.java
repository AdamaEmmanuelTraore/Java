import java.util.Scanner;

/*Scrivere una classe Lampadina che mi consenta di modellare il suo stato
“acceso/spento”, mi consenta di compiere delle azioni “accendi e spegni” e
sapere il suo stato attuale. Chiedere all’utente di inserire un valore intero N
e di creare N lampadine*/

public class Main {
	public static void main(String[] args) {
		lampadina lampadina1 = new lampadina("accesa");
		System.out.println("La lampadina è " + lampadina1.info());
		Scanner valore = new Scanner(System.in);
		System.out.println("Inserisci un valore per creare N lampadine");
		int lampade = valore.nextInt();
		int[] n = new int[lampade];
	}
}
