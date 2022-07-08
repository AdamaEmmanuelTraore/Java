package ifts.example.esercizi;

import java.util.List;

public interface PlayerRepository {

//SALVA UN PLAYER NEL DB
		int save(Player p);
		
//RECUPERA UN PLAYER NEL DB
		Player findById(int id);
		
//RECUPERA LA LISTA DI TUTTI I PLAYER
		List<Player> findAll();
		
//AGGIORNO UN PLAYER
		int update(Player p);
		
//CANCELLA UN RECORD
		int deleteById(long id);
		
//CANCELLA TUTTO
		int deleteAll();
}
