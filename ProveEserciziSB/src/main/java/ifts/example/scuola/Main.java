package ifts.example.scuola;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aula.xml");
		
		Professore prof1 = (Professore) context.getBean("prof1");
		System.out.println(prof1.attività());
	}

}
