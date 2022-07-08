import java.util.Scanner;

public class SoloVocali {
	public static String estraiVocali(String str) {
		String vocalistr = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
			}
		}return vocalistr;
	}
	
		public static void main(String[] args) {
				Scanner stringa = new Scanner(System.in);
		
					System.out.println("Scrivi una parola");
					String str = stringa.nextLine();
					
	}
}
