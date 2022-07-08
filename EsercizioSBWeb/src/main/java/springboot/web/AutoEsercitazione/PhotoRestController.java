package springboot.web.AutoEsercitazione;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

//SERVE A RESTITUIRE I DATI TRAMITE REST API
@RestController
public class PhotoRestController {

	private List<Photo> list;
	
	public PhotoRestController() {
		list = new ArrayList<>();
		list.add(new Photo(1, "./img/01.png"));
		list.add(new Photo(2, "./img/02.png"));
		list.add(new Photo(3, "./img/03.png"));
	}
	
	@RequestMapping("/api/photos")
	public Iterable<Photo> getAll() {
		return list;
	}
	
// ORA FACCIO LA PARTE DINAMICA ({})
	@RequestMapping("/api/photos/{id}")
	public Photo getById(@PathVariable int id) {
		
		// QUI LA FILTRIAMO IN BASE ALL'ID SPECIFICATO NEL PATH
		Optional<Photo> photo = list.stream().filter(item->item.getId() == id).findFirst();
		
		// QUI VERIFICO CHE LA FOTO SIA STATA TROVATA
		if(photo.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return photo.get();
	}
}
