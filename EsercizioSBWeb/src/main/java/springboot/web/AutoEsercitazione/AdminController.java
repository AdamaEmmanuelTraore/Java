package springboot.web.AutoEsercitazione;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller                   // E' UNA VIEW CHE MOSTRA LA PAGINA
public class AdminController {

	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
}
