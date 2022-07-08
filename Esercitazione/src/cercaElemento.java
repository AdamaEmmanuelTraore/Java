import java.util.Scanner;

public class cercaElemento {
		public static int[] numero (int[] x) {
		return x;
		}
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int[] serieNum = new int[4];
			int x = 0;
			
			for(int i = 0; i < serieNum.length; i++) {
				System.out.println("Inserisci il numero");
				int num = input.nextInt();
				
			} if((x >= 0) && (x <= 4)) {
				x++;
				System.out.println("True");
				
			}else System.out.println("False");
		}
}
