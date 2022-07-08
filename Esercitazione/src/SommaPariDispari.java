/*Esercizio: Scrivere un programma SommaPariDispari che prevede un array di 10 numeri
interi contenente valori a piacere (senza bisogno di chiederli all’utente) e stampa “Pari e
dispari uguali” se la somma dei numeri in posizioni pari dell’array è uguale alla somma dei
numeri in posizioni dispari, altrimenti il programma stampa “Pari e dispari diversi”. (Il
programma deve essere scritto facendo finta di non sapere quali siano i valori inseriti
nell’array)*/

public class SommaPariDispari {
	public static void main(String[] args) {
		int sommaPari = 0;
		int sommaDispari = 0;
		//array di 10 numeri interi contenente valori a piacere (senza bisogno di chiederli all’utente)
		int[] numeri = new int[10];
		numeri[0] = 1;
		numeri[1] = 1;
		numeri[2] = 1;
		numeri[3] = 1;
		numeri[4] = 1;
		numeri[5] = 1;
		numeri[6] = 1;
		numeri[7] = 0;
		numeri[8] = 1;
		numeri[9] = 0;
		
		sommaPari = numeri[2] + numeri[4] + numeri[6] + numeri[8];
		sommaDispari = numeri[0] + numeri[1] + numeri[3] + numeri[5] + numeri[7] + numeri[9];
		
		//se la somma dei numeri in posizioni pari dell’array è uguale alla somma dei numeri in posizioni dispari
		if(sommaPari == sommaDispari) {
		//stampa “Pari e dispari uguali”
		System.out.println("Pari e dispari uguali");
		}
		//altrimenti il programma stampa “Pari e dispari diversi”
		else { 
			System.out.println("Pari e dispari diversi");
		}
	
		
	}
}
