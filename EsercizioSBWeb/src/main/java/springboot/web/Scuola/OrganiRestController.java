package springboot.web.Scuola;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class OrganiRestController {

	List<Credenziali> studente = new ArrayList<>();
	List<Credenziali> professore = new ArrayList<>();
	
	public OrganiRestController() {
		studente.add(new Credenziali(1, "Adama", "Traore", "a.traore@itsrizzoli.it"));
		studente.add(new Credenziali(2, "Charis", "Tucker", "c.tucker@itsrizzoli.it"));
		studente.add(new Credenziali(3, "Yvie", "Davison", "y.tucker@itsrizzoli.it"));
		
		professore.add(new Credenziali(1, "Antonio", "Lezzi", "a.lezzi@itsrizzoli.it"));
		professore.add(new Credenziali(2, "Riccardo", "Colleoni", "r.colleoni@itsrizzoli.it"));
		professore.add(new Credenziali(3, "Samuele", "Elia", "s.elia@itsrizzoli.it"));
	}
	
//STAMPA TUTTI GLI STUDENTI
	@RequestMapping(value="/studenti", method= RequestMethod.GET)
	public List<Credenziali> getAllStudenti() {
		return studente;
	}
	
//STAMPA TUTTI I PROFESSORI
	@RequestMapping(value="/professori", method=RequestMethod.GET)
	public List<Credenziali> getAllProf() {
		return professore;
	}
	
//STAMPA UN SINGOLO STUDENTE IN BASE ALL'ID, FACCIO LA PARTE DINAMICA ({})
	@RequestMapping(value="/studente/{id}", method=RequestMethod.GET)
	public Credenziali getStudenteById(@PathVariable int id) {
		
		// ORA FACCIO LA PARTE DINAMICA ({})
		Optional<Credenziali> credenziali = studente.stream().filter(item->item.getId() == id).findFirst();
		
		// QUI VERIFICO CHE LA FOTO SIA STATA TROVATA
		if(credenziali.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return credenziali.get();
	}
	
	
}
