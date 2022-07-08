import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Prova {

	public static void main(String[] args) {
		readFile2();
	}
	
	public static void readFile2() {
		String path = "C:/Users/AdamaEmmanuelTraore/Documents/file reader, writer";
		char[] in = new char[50];
		int size = 0;
		
		try {
		File file = new File(path);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		size = br.read(in);
		System.out.print("Caratteri presenti: " + size + "\n");
		System.out.print("Il contenuto del file è il seguente:\n");
		
		for(int i=0; i<size; i++)
		System.out.print(in[i]);
		br.close();
		fr.close();
		}
		catch(IOException e) {
		e.printStackTrace();
		}
		}
}
