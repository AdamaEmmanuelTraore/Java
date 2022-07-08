import java.util.Scanner;
//ESERCICI DATA 02/11/2021


//class Esercizi {}

//ESERCIZIO N°1
/*
public class Esercizi {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}*/

//ESERCIZIO N°2
/*
public class Esercizi {
	public static void main(String[] args) {
		String nome = "Emmanuel";
		System.out.println("+----------+");
		System.out.println("| " + nome + " |");
		System.out.println("+----------+");
	}
}*/

//ESERCIZIO N°3
/*
public class Esercizi {
	public static void main(String[] args) {
		double perimetro;
		double area;
		double baseRettangolo = 2.5;
		double altezzaRettangolo = 2.5;
		perimetro = (baseRettangolo + altezzaRettangolo)*2;
		System.out.println("Il perimetro del rettangolo è: " + perimetro);
		area = baseRettangolo * altezzaRettangolo;
		System.out.println("L'area del rettangolo è: " + area);
		
	}
}*/

/*
//ESERCIZIO 4
public class Esercizi {
	public static void main (String[] args) {
		Scanner insDati = new Scanner(System.in); //SERVE ALL'UTENTE PER INSERIRE I DATI DA CONSOLE
		int secondi;
		int secondiGiorno = 86400; //EQUIVALE AI SECONDI IN UN GIORNO
		int secondiOra = 3600; //EQUIVALE AI SECONDI IN UN ORA
		int secondiMinuto = 60; //EQUIVALE AI SECONDI IN UN MINUTO
		System.out.println("A quanto equivale x giorni in secondi?");
		int tempoGiorno = insDati.nextInt(); //DICHIARAZIONE GIORNO A SCELTA (TRAMITE CONSOLE)
		tempoGiorno *= secondiGiorno;
		System.out.println("Equivale a: " + tempoGiorno + " secondi");
		System.out.println("A quanto equivale x ore in secondi?");
		int tempoOre = insDati.nextInt(); //DICHIARAZIONE ORE A SCELTA (TRAMITE CONSOLE)
		tempoOre *= secondiOra;
		System.out.println("Equivale a: " + tempoOre + " secondi");
		System.out.println("A quanto equivale x minuti in secondi?");
		int tempoMinuti = insDati.nextInt(); //DICHIARAZIONE MINUTI A SCELTA (TRAMITE CONSOLE)
		tempoMinuti *= secondiMinuto;
		System.out.println("Equivale a: " + tempoMinuti + "secondi");
		secondi = tempoGiorno + tempoOre + tempoMinuti;
		System.out.println("La somma dei secondi totale equivale a: " + secondi + "secondi");
	}
}*/

//ESERCIZIO 5
/*
public class Esercizi {
	public static void main (String[] args) {
		Scanner insDati = new Scanner(System.in);
		int giornoSec = 86400;
		int oraSec = 3600;
		int minutoSec = 60;
		System.out.println("Spara un numero per i secondi");
		int numSec = insDati.nextInt();
		System.out.println("Quanti secomdi sono in un giorno?");
		giornoSec = numSec / giornoSec;
		System.out.println("Questi secondi: " + numSec + " equivalgono a: " + giornoSec + " giorno/i");
		System.out.println("Quanti secomdi sono in un ora?");
		oraSec = numSec / oraSec;
		System.out.println("Questi secondi: " + numSec + " equivalgono a: " + oraSec + " ora/e");
		System.out.println("Quanti secomdi sono in un minuto?");
		minutoSec = numSec / minutoSec;
		System.out.println("Questi secondi: " + numSec + " equivalgono a: " + minutoSec + " minuto/i");
	}
}*/

//ESERCIZIO 6
/*
public class Esercizi {
	public static void main (String[] args) {
		Scanner insDati = new Scanner(System.in);
		int risultato;
		System.out.println("Inserisci da tastiera due valori a scelta per effettuare la loro somma");
		System.out.println("Inserisci il primo numero");
		int numA = insDati.nextInt();
		System.out.println("Inserisci il secondo numero");
		int numB = insDati.nextInt();
		risultato = numA + numB;
		System.out.println("La loro somma è uguale a " + risultato);
	}
}


public class Esercizi {
	public static void main(String[] args) {
		Scanner insDati = new Scanner(System.in);
		int risultato;
		System.out.println("Efettua la moltiplicazione fra due Numeri");
		System.out.println("Inserisci il primo Numero");
		int n1 = insDati.nextInt();
		System.out.println("Inserisci il secondo Numero");
		int n2 = insDati.nextInt();
		risultato = n1 * n2;
		System.out.println("Il risultato della moltiplicazione è: " + risultato);
	}
}
___________________________________________________________________________________________________________________
*/
//NUOVI ESERCIZI 03/11/2021
/*
public class Esercizi {
	public static void main (String[] args) {
		Scanner insDati = new Scanner(System.in);
		System.out.println("inserisci una stringa:");
		String nome = insDati.nextLine();
		for(int i = 0; i<nome.length(); i++) {
			char ch = nome.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				System.out.print(ch);
		}
	}
}


public class Esercizi {
	public static void main(String[] args) {
		//CONSENTE ALL'UTENTE DI SCRIVERE DA TASTIERA/CONSOLE
		Scanner insDati = new Scanner(System.in);
		//STAMPO A VIDEO LA DOMANDA ALL'UTENTE
		System.out.println("Inserisci una stringa:");
		//MI PERMETTE DI SCRIVERE IL RISULTATO
		String nome = insDati.nextLine();
		//CICLO CHE DESCRIVE LA POSIZIONE DA CUI PARTO PER CONTARE, CIOE' 0
		for(int i = 0; i < nome.length(); i++) {
			//IL CARATTERE DA CUI SI INIZIA A CONTARE
			char x = nome.charAt(i);
			//CICLO CHE MI PERMETTE DI EVIDENZIARE LE VOCALI (COME RICHIESTO DAL TESTO)
			if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
				System.out.print(x);
		}
	}
}*/

//SECONDO ESERCIZIO DELLA 2° SLIDE DEL 4°MODULO
/*
public class Esercizi {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		int count = 0;
		
		do {
			System.out.println("Inserire la parola (invio per uscire)");
			String utente = tastiera.nextLine();
			
			if(utente.length == 0)
			break;
			char ch = utente.charAt(0);
			
			if(ch>= 'A' && ch<='Z') {
			count += utente.length();
			}
			
		}while(utente.length() > 0);
		System.out.println("Tot: " + count);
	}
}*/

public class Esercizi {
	public static void main(String[] args) {
		addizione(3, 10);
	}
	static void addizione(int x, int y) {
		int risultato = x + y;
		System.out.println(risultato);
	}
}
