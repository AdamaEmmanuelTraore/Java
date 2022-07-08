package springboot.web.Planets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainPlanet {

	private String planet = "venus";
	
	public static void main(String[] args) {
		
		SpringApplication.run(MainPlanet.class, args);
	}
	
	@Bean
	public Planet planet() {
		System.out.println("Landing planet: "+ planet);
		
		switch(planet) {
		case "venus":
			return new Venus();
		case "mars":
			return new Mars();
		default: return new Mars();
		}
	}

}
