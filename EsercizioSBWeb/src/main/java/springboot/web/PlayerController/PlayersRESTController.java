package springboot.web.PlayerController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PlayersRESTController {

	List<Player> players = new ArrayList<>();
	
	public PlayersRESTController(){
		
		players.add(new Player(1, "Mario", "Rossi", "Roma"));
		players.add(new Player(2, "Gabriele", "Bianchi", "Juventus"));
		players.add(new Player(3, "Andrea", "Verdi", "Inter"));
		players.add(new Player(4, "Tommaso", "Bruni", "Milan"));
	}
	
	@RequestMapping(value="/players", method=RequestMethod.GET)
	public @ResponseBody List<Player> getAllPlayer() {
		return this.players;
	}
	
	// AGGIUNGIAMO UN PLAYER
	@RequestMapping(value="/players/{id}", method=RequestMethod.GET)
	public Player getPlayerById(@PathVariable int id) {
		Player p = null;
		
		for(int i=0; i < this.players.size(); i++) {
			if(this.players.get(i).getId() == id)
				p = this.players.get(i);
		}
		return p;
}
	// CANCELLIAMO UN PLAYER
	@RequestMapping(value="/players/{id}", method=RequestMethod.DELETE)
	public void deletePlayerById(@PathVariable int id) {
		for(int i = 0 ; i < this.players.size(); i++) {
			if(this.players.get(i).getId() == id) {
				String ris = "Cancello player con id:" + this.players.get(i).getId();
				System.out.println(ris);
				this.players.remove(i);
			}
		}
	}
	
	// AGGIUNGIAMO UN PLAYER
		@RequestMapping(value="/players", method=RequestMethod.POST)
		public void addPlayer(@RequestBody Player newPlayer) {
			int newId = this.players.get(this.players.size()-1).getId()+1;
			newPlayer.setId(newId);
			players.add(newPlayer);
		}
		
		// AGGIORNIAMO UN PLAYER
		@RequestMapping(value="player/{id}", method=RequestMethod.PUT)
		public Player updatePlayerById(@PathVariable int id, @RequestBody Player modPlayer) {
			Player p = null;
			for(int i = 0; i < this.players.size(); i++) {
				if(this.players.get(i).getId() == id) {
					this.players.set(i, modPlayer);
					p = this.getPlayerById(i);
				}
			}
			return p;
		}
}
