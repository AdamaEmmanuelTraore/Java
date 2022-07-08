/*Memorizzare in un array bidimensionale 10 x 10 la tavola pitagorica, quella delle tabelline,
 e stampare il contenuto della matrice (nella prima riga si dovrà
 trovare la tabellina del 1: 1 2 3 4 5 6 7 8 9 10).*/

public class array2D {

	public static void main(String[] args) {
		int[][] arr2D = {{1,2,3,4,5},{6,7,8,9,10}};
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++)
				System.out.print(arr2D[i][j]);
		}
	}
}
