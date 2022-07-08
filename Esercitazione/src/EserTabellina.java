//Scrivere un programma che stampi le tabellina del numero dato come argomento

public class EserTabellina {

	public static void main(String[] args) {
		int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int x = 5;
		int y = 0;
		for(int i = 0; i <= num.length -1; i++) {
			System.out.println(x * num[i]);
		}
	}
}

