package AgregationAndComposition03;

public class City {

	private String cityName;

	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	public String getCityName() {
		return cityName;
	}

	@Override
	public String toString() {
		return cityName;
	}

}