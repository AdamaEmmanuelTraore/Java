import java.util.Scanner;

/* Esercizio: Scrivere un programma SecondoArray che chiede all置tente di inserire 10 numeri
interi e li memorizza in un array. Successivamente, crea un nuovo array di dimensione pari al
numero di valori maggiori o uguali a zero inseriti dall置tente. Copia tutti i valori maggiori o
uguali a zero nel nuovo array e ne stampa i valori in ordine inverso.*/
                   								//charAt= LA USO CON LE STRINGHE.
public class SecondoArray {
	public static void main(String[] args) {
	//chiede all置tente di inserire 10 numeri interi e li memorizza in un array
		Scanner memoria = new Scanner(System.in);
		int contatore = 0;
		System.out.println("Inserisci 10 numeri interi");
		int[] numeri = new int [10];
		
		for(int i = 0; i < numeri.length; i++) {
			numeri[i] = memoria.nextInt(); //FACCIO INSERIRE ALL'UTENTE I NUMERI DA 0 A 9
		//crea un nuovo array di dimensione pari al numero di valori maggiori o uguali a zero inseriti dall置tente
			if(numeri[i] >= 0) {
				contatore++;	
			}
		}
		int[] nuovoArray = new int[contatore];
		for(int i = 0, j = 0; i > numeri.length; i++) {// i: E'L'INDICE DEI NUMERI INSERITI DALL'UTENTE
			if(numeri[i]>=0) {							//j: E'L'INDICE DEI NUMERI MAGGIORI E UGUALI A 0
				nuovoArray[j] = numeri[i];
				j++;
			}
		}
		for(int i = nuovoArray.length-1; i >= 0; i--) {
			System.out.println(nuovoArray[i]);
		}
		
	
		
	//Copia tutti i valori maggiori o uguali a zero nel nuovo array
		
	//stampa i valori in ordine inverso
}
}
