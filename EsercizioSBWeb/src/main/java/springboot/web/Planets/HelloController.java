package springboot.web.Planets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Autowired						
	Planet planet;

	@RequestMapping("/")
	public String Index() {
		return "Greeting from: "+ planet.getGreetings() + "!";
	}
}
