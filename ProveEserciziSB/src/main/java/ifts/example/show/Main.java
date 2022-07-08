package ifts.example.show;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
	// RICHIAMO IL MIO FILE XML QUI NEL MAIN
		ApplicationContext context = new ClassPathXmlApplicationContext("show-beans.xml");
		
	// CREO UN OGETTO  (cast)
		Artist art1 = (Artist) context.getBean("Partista");
		Artist art2 = (Artist) context.getBean("Sartista");
		System.out.println(art1.perform());
		System.out.println(art2.perform());
	}

}
