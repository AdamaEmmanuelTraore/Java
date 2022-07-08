/*Scrivere un programma che, dato un certo tempo in giorni, ore, minuti e secondi, restituisca il numero
totale di secondi. NB un giorno ha 86400 secondi, un’ora ha 3600 secondi e un minuto 60 secondi.*/

public class Ex4_Secondi_totali {

	public static void main(String[] args) {
		int min = 120;
		if (min >= 60) {
			int ora = min * min;
			int giorno = ora * 24;
			System.out.print("I secondi totali sono: " + giorno + " secondi");
		} else {
			System.out.print("È uguale a: " + min + " secondi");
		}
	}

}
