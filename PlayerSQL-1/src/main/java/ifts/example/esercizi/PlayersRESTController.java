package ifts.example.esercizi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PlayersRESTController {
	
	@Autowired
	PlayerRepository playerRepository;
	
	@GetMapping("/")
	public ModelAndView getRoot()
	{
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("home.html");
	    return modelAndView;
	}
	
	//@GetMapping("/players")
	@RequestMapping(value="/players", method=RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public List<Player> getAllPlayers() {
		return this.playerRepository;
	}
	
	@RequestMapping(value="/players", method=RequestMethod.POST)
	public ResponseEntity<String> addPlayer(@RequestBody Player newPlayer)
	{
		String retStr = "";
		if(this.playerRepository.save(newPlayer) > 0);
		return new ResponseEntity<Player>(p, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/players/{id}", method=RequestMethod.GET)
	public public ResponseEntity<Player> getPlayerById(@PathVariable int id)
	{
		Player p = this.playerRepository.findById(id);
		if()
	}
	
	@RequestMapping(value="/players", method=RequestMethod.DELETE)
	public void deleteAllPlayers()
	{
		this.players.clear();
	}
	
	@RequestMapping(value="/players/{id}", method=RequestMethod.DELETE)
	public void deletePlayerById(@PathVariable int id)
	{
		for(int idx=0;idx<this.players.size();idx++)
		{
			if(this.players.get(idx).getId() == id)
			{				
				this.players.remove(idx);				
			}
		}
	}
	
	@RequestMapping(value="/players/{id}", method=RequestMethod.PUT)
	public Player updatePlayerById(@PathVariable int id, @RequestBody Player modPlayer)
	{
		Player p=null;
		for(int idx=0; idx<this.players.size();idx++)
		{
			if(this.players.get(idx).getId() == id)
			{
				//this.players.set(idx, modPlayer);
				if(modPlayer.getFirstName() != null && (!modPlayer.getFirstName().isBlank()))
					this.players.get(idx).setFirstName(modPlayer.getFirstName());
				
				if(modPlayer.getLastName() != null && (!modPlayer.getLastName().isBlank()))
					this.players.get(idx).setLastName(modPlayer.getLastName());
				
				if(modPlayer.getTeam() != null && (!modPlayer.getTeam().isBlank()))
					this.players.get(idx).setTeam(modPlayer.getTeam());
				
				p=this.players.get(idx);
			}
		}
		return p;
	}
	
	
	//mappatura di test per mostrare utilizzo ResponseEntity
	@RequestMapping(value="/test/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> getTestEntity(@PathVariable int id)
	{
		try
		{
			if(this.players.get(id) != null)
			{
				//Utilizzo ResponseEntity per ritornare il Player
				//e contestualmente mi permette di inviare il 
				//codice HTTP da me scelto 
				return new ResponseEntity<>(this.players.get(id), HttpStatus.OK);
			}
		}
		catch(Exception e)
		{
			//In questo caso ritorno una Stringa ed il codice di errore HTTP 500
			return new ResponseEntity<>("ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return null;
	}

}
