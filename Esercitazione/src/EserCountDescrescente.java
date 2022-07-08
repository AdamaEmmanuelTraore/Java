//Scrivere un programma che stampi a video i primi dieci interi pari compresi fra 20 e 0, partendo da 20.

public class EserCountDescrescente {

	public static void main(String[] args) {
		int num = 20;
		for(int i = num; i > 0; i--) {
			if(i % 2 == 0)
			System.out.println(i);
		}
	}
}
