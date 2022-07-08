import java.util.Scanner;

/*
public class prove {

	public static void main(String[] args) {
		int a = 2, b = 4;
		double c = 2.5;
		System.out.println(a + c);
		System.out.println((double)b / a);
	}
}

class prove {
public static void main(String[] args) {
String s="ANNA";
boolean pal=true;
for (int sx=0,dx=s.length()-1;sx<dx;sx++,dx--)
  if (s.charAt(sx) != s.charAt(dx)) {
          pal = false;
          break;
  }
System.out.println(pal);
}//fine__main
}


/*Calcola la somma degli interi compresi fra a e b (interi) in moto iterativo.
Confronta il risultato usando la formula n*(n+1)/2 che da la somma degli interi fra 1 ed n.

class prove {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a, b, j, i, som= 0;
		System.out.println("Inserisci il primo numero");
		a= in.nextInt();
		System.out.println("Inserisci il secondo numero");
		b= in.nextInt();
		in.close();
		if(a>b) {
			j= a;
			a= b;
			b= j;
		}
		for(i= a; i<= b; i++) {
			som+= i;
			System.out.println("somma" + som);
			j= b*(b+1)/2;
			som=j-i+a;
			System.out.println("somma:"+ som);
		}
	}
}*/

import java.util.Scanner;
class prove {
public static void main (String[] args) {
Scanner in=new Scanner(System.in);
int x,cifre=0;
System.out.print("ins.num:");
x=in.nextInt();
in.close();
do{
  x=x/10;
  cifre++;
}while(x!=0);
System.out.println("cifre:"+cifre);
}//fine main
}//fine class