/*Stampare a video la seguente figura:
******
*****
****
***
**
* */

public class StampaFig {

	public static void main(String[] args) {
		char ch = '*';
		int x = 6;
		for(int i = 0; i < x; i++) {
			for(int j = 0; j <= i; j++)
				System.out.print(ch);
			System.out.println();
		}
	}
}
