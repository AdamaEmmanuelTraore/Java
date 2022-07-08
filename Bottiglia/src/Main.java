
//MAIN
public class Main {
	
    public static void main(String[] args) {
    	Bottiglia bot = new Bottiglia(500, "Fanta"); //OGGETTO
    	System.out.println(bot.StatoAttuale());
    	Bottiglia x = new Bottiglia(250, "coca"); //OGGETTO
    	System.out.println(x.StatoAttuale());
    }
}
