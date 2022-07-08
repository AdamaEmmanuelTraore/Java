/*Stampare a video la seguente figura:
1      654321
12      54321
123      4321
1234      321
12345      21
123456      1 */


public class StampFig2 {
	public static void main(String[] args) {
		
		int num = 6;
		for(int i = 0; i < num; i++) {
			for(int j = num - i; j > 0; j--)
				System.out.print(j);
			System.out.println();
			
		}
		for(int i = 0; i <= num; i++) {
			for(int x = 1; x <= i; x++)
				System.out.print(x);
			System.out.println();
		}
	}
}
