package springboot.web.AutoEsercitazione;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class AdminPhotoController {

	private List<Photo> list;
	private int lastId;
	
	public AdminPhotoController() {
		list = new ArrayList<>();
		list.add(new Photo(1, "./img/01.png"));
		list.add(new Photo(2, "./img/02.png"));
		list.add(new Photo(3, "./img/03.png"));
		
		lastId = 3;
	}
	
	@RequestMapping("/admin/api/photos")
	public Iterable<Photo> getAll() {
		return list;
	}
	
// ORA FACCIO LA PARTE DINAMICA ({})
	@RequestMapping("/admin/api/photos/{id}")
	public Photo getById(@PathVariable int id) {
		
	// QUI LA FILTRIAMO IN BASE ALL'ID SPECIFICATO NEL PATH
		Optional<Photo> photo = list.stream().filter(item->item.getId() == id).findFirst();
		
	// QUI VERIFICO CHE LA FOTO SIA STATA TROVATA
		if(photo.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		return photo.get();
	}
	
	// QUI HO AGGIUNTO UN NUOVO ELEMENTO(PHOTO).
	@RequestMapping(value="/admin/api/photos", method=RequestMethod.POST)
	public Photo create(@RequestBody Photo photo) {
		lastId ++;
		photo.setId(lastId);
		list.add(photo);
		return photo;
	}
	
	// QUI AGGIORNO LA PHOTO
	@RequestMapping(value="/admin/api/photos/{id}", method=RequestMethod.PUT)
	public Photo upload(@PathVariable int id, @RequestBody Photo photo) {
	// QUI LA FILTRIAMO IN BASE ALL'ID SPECIFICATO NEL PATH
		Optional<Photo> foundPhoto = list.stream().filter(item->item.getId() == id).findFirst();
				
	// QUI VERIFICO CHE LA FOTO SIA STATA TROVATA
		if(foundPhoto.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
		}
		
		foundPhoto.get().setUrl(photo.getUrl());
		
		return foundPhoto.get();
	}
	
	
	
	// QUI HO CANCELLATO IN ELEMENTO(PHOTO).
	@RequestMapping(value="/admin/api/photos/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		
		// QUI LA FILTRIAMO IN BASE ALL'ID SPECIFICATO NEL PATH
		Optional<Photo> foundPhoto = list.stream().filter(item->item.getId() == id).findFirst();
				
	// QUI VERIFICO CHE LA FOTO SIA STATA TROVATA
		if(foundPhoto.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "item not found");
	}
		list.remove(foundPhoto.get());
	}
}
