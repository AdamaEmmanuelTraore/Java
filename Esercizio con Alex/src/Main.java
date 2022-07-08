
public class Main {

	public static void main(String[] args) {
		Scarpe x = new Scarpe(45, "nike", "bianco", "da corsa", 100);
		System.out.println(x.toString());
		x.SetTaglia(39);
		System.out.println(x.toString());
		System.out.println(x.GetTaglia());
	}
}
