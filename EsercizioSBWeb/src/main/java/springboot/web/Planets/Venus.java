package springboot.web.Planets;

public class Venus implements Planet {

	@Override
	public String getGreetings() {
		return "Yellow planet";
	}

	@Override
	public String getName() {
		return "Venus";
	}

}
