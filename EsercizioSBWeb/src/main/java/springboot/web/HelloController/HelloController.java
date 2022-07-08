package springboot.web.HelloController;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





/*--SPRING BOOT--
Spring boot ha lo scopo di semplificarci lo sviluppo e l'esecuzione di applicazioni SPRING, i quali hanno unna
grande quantità di META-DATI.
-SPRING INIZIALIZR
-SPRING STARTER


I META-DATI IN SPRING BOOT POSSONO ESSERE RAPPRESENTATI COME:
	- ANNOTAZIONI(@Autowired, @Component, @Controller, @Service, @Registry)
	- JAVA(TRAMITE @bean NELLE CLASSE ANNOTATE CON @Configuration)
	- XML(INIZIALMENTE USATO DA SPRING)


L'applicazione SPRING BOOT viene eseguita in questo modo:
	-La classe "SpringApplication" viene usata per l'avvio dell'applicazione.
	-L'annotazione "@SpringBootApplication" viene usata nella classe principale ed indica la combinazione di:
		#"@Configuration": Etichetta la classe come una classe di configurazione java.
		#"@ComponentScan": Abilita la scansione e l'indentificazione automatica dei bean/componenti.
		#"@EnableAutoConfiguration": Si occupa della creazione automatica dei bean/componenti mancanti o necessari.

Lo scopo di un applicazione Spring Boot è fare in modo che vengano creati/attivati tutti i bean/componenti dell'applicazione.

#"@Controller": E' un controller web per accettare richieste web (path /Hello).

ESEMPIO-1: 
@RestController								//INFORMA SPRING FRAMEWORK CHE SI TRATTA DI UN COMPONENTE "@Component" DI TIPO COMPONENT REST
public class HelloController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public @ResponseBody String Hello() {
		return "Hello, world";
	}
} */

/*#"@RequestMapping": QUESTA ANNOTAZIONE AGGIUNGE UNA REGOLA DI ROUTING, DOVE TUTTE LE RICHIESTE "HTTP" SU QUESTO PERCORSO (localhost:8080)
 * 					  VERRANNO INDIRIZZATI AL METODO HELLO().
 #"@ResponseBody": Questa annotazione specifica che il valore restituito dal metodo va interpretato come IL CONTENUTO della risposta.*/


/*ESEMPIO-2: SPRING BOOT MVC, RESTITUISCI UN SALUTO PERSONALIZZATO "/hello/name".
@Controller
public class HelloController {

	@RequestMapping("/hello/{name}")
	public String hello(Map<String, Object> model, @PathVariable String name) {
		model.put("name", name);
		return "greeting";   // SALUTO
	}
} 

@RestController
public class HelloController {

	@RequestMapping("/")
	public String Saluto() {
		return "Ciao, Benvenuto!";
	}
} */

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "Hello from /hello path";
	}
}






























