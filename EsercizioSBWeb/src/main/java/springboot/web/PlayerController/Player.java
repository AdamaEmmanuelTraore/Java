package springboot.web.PlayerController;

public class Player {

	private int id;
	private String name;
	private String lastName;
	private String team;
	
	public Player() {
		
	}
	
	public Player(int id, String name, String lastName, String team) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.team = team;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	
}
