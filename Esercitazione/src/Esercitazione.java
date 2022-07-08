import java.util.Scanner;

//Scrivere un metodo “eliminaVocali” che rispetti le seguenti caratteristiche: prendere in input una
//stringa e restituire una stringa che sia ottenuta dalla prima eliminando le vocali(‘a’,’e’,’i’,‘o’,‘u’)

/*public class Esercitazione {
	public static void main(String[] args) {
		
		System.out.println(eliminaVocali("ciao alex"));
		
		}
	public static String eliminaVocali(String x) {
		String cont = "";
		for(int i = 0; i <= x.length(); i++) {
			if(x.charAt(i) != 'a' && x.charAt(i) != 'e' && x.charAt(i) != 'i' && x.charAt(i) != 'o' && x.charAt(i) != 'u') {
				cont += x.charAt(i);
			}
		} return cont;
	}
}*/


/*	ESERCIZI N° 4: Scrivere un programma che stampi la tabellina del numero dato come argomento

 	int[] v = num[5];
		System.out.println(v);
		}
	public static int[] num(int x) {
		int[] z = new int[10];
		for(int i = 0; i <= z.length; i++) 
			z[i] = x * i;
			return z;
	}*/




/*ESERCIZIO N°3: Scrivere un metodo che, dati un carattere c ed una stringa s, restituisce true se c 
   occorre in s, false altrimenti. char c = 'g', String s = "GiornoGiovanna", g, G.
   public static void main(String[] args) {
		Metodo();
		System.out.println(Metodo());
	}
	public static boolean Metodo () {
		String s = "GiornoGiovanna"; char c = 'g';
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c)
				return true;
		} return false;*/


//ESERCIZIO: N°1 Scrivere un programma che stampi a video i primi dieci numeri interi
/*	for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}*/

//ESERCIZIO N°2: Scrivere un programma che stampi a video i primi dieci interi pari compresi fra 20 e 0, partendo da 20.
/*	for(int i = 20; i >= 0; i--) {
if(i % 2 == 0)
System.out.println(i);
}*/


/*ESERCIZIO N°5: Scrivere un metodo che dica se dato un determinato anno è bisestile. In pratica, un anno è
//bisestile se è divisibile per 4. Gli anni secolari (quelli divisibili per 100) non basta che siano divisibili
//per 4 (es. 1700 è divisibile per 4 ma non è bisestile), devono essere divisibili anche per 400
 
  	public static void main(String[] args) {
		
		System.out.println(anni(1700));
	}
	public static boolean anni(int anno) {
		
		if(anno % 4 == 0 && anno % 100 != 0) {
			return true;
		} else if(anno % 4 == 0 && anno % 100 == 0 && anno % 400 == 0) {
			return true;
		} return false;
	}
 * */

//Stampare a video la seguente figura:
//******


/*public class Esercitazione {
	public static void main(String[] args) {
		char x = '*';
		for(int i = 0; i <= 6; i++) {
			for(int j = 6 - i; j >= 0; j--) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
}
 */

//Scrivere un metodo che, dato un array di interi A ed un intero n, restituisce true se n compare in
//a, false altrimenti

/*public class Esercitazione {
	public static boolean metodo(int[] A, int n) {
		for(int i = 0; i < A.length; i++) {
			if(A[i] == n)
				return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		int A[] = {5, 4, 2}; //INIZIALIZZAZIONE ARRAY
		int n = 3;
		System.out.println(metodo(A, n));
	}
}*/

//Scrivere un metodo che, dato un array di interi a, restituisce il valore minimo in a
/*
public class Esercitazione {
	public static int metodo(int[] a) {
		int x = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < x)
				x = a[i];
		}
		return x;
	}
	public static void main(String[] args) {
		int a[] = {8, 7, 11, 2, 1};
		System.out.println(metodo(a));
	}
}*/


/* Scrivere un programma Ripeti che chiede all’utente di inserire una stringa e un numero intero positivo.
Entrambe le cose dovranno essere passate a un metodo ausiliario che stamperà tante copie 
della stringa quante indicate nel numero inserito dall’utente. Se il numero inserito dall’utente è
negativo il metodo ausiliario stamperà "ERRORE: numero negativo". Il nome del metodo
ausiliario può essere scelto a piacere*/

public class Esercitazione {
	public static String aus(String x, int y) {
		String a = "ERRORE: numero negativo";
		for(int i = 0; i <= y; i++) {
			if(y < 0)
				return a;
		}
		return x;
	}
	public static void main(String[] args) {
		String x = "ciao";
		int y = 3;
		System.out.println(aus(x, y));
	}
}