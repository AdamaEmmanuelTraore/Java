//Trovare il massimo elemento in un array (o il minimo)

public class GliArray1 {

	public static void main(String[] args) {
		int[] x = {10, 3, 5, 11};
		int primo = x[0];
		
		for(int i = 0; i < x.length; i++) {
			if(x[i] < primo) {
				primo = x[i];
			}
		}
		System.out.println(primo);
	
	}
}
/*	int[] x = {1, 3, 5, 11};
int y = x[0];
for(int i = 0; i < x.length; i++) {
	if(x[i] > y) {
		y = x[i]; // ASSEGNAMENTO VALORE X
	}
}
System.out.println("Il massimo è: " + y);*/