package ifts.example.esercizi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcPlayerRepository implements PlayerRepository{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Player p) {
		int retCode = 0;
		if(jdbcTemplate.update("INSERT INTO Players(firstName, lastName, team) VALUES(?,?,?",
				new Object[] {p.getFirstName(), p.getLastName(), p.getTeam()}) > 0)
		{
			retCode = 1;
		}
		return retCode;
	}

	@Override
	public Player findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * from players WHERE id=?", BeanPropertyRowMapper.newInstance(Player.class));
	}

	@Override
	public List<Player> findAll() {
		return jdbcTemplate.query("SELECT * from players", BeanPropertyRowMapper.newInstance(Player.class));
	}

	@Override
	public int update(Player p) {
		return jdbcTemplate.update("UPDATE players SET firstName=?, lastName=?, team=? WHERE id=?",
				new Object[] {p.getFirstName(), p.getLastName(), p.getTeam(), p.getId()});
	}

	@Override
	public int deleteById(long id) {
		return jdbcTemplate.update("DELETE FROM players WHERE id=?", id);
	}

	@Override
	public int deleteAll() {
		return jdbcTemplate.update("DELETE FROM players");
	}

}
