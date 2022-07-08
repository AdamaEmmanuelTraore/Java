package springboot.web.Planets;

public class Mars implements Planet {

	@Override
	public String getGreetings() {
		return "Red planet";
	}

	@Override
	public String getName() {
		return "Mars";
	}

}
