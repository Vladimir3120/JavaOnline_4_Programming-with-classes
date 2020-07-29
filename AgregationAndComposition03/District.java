package AgregationAndComposition03;

public class District {

	private String districtName;
	private City city;
	private boolean isCityCentr;
	private boolean isCityCapital;

	public District() {
		super();
	}

	public District(String districtName, City city, boolean isCityCentr, boolean isCityCapital) {
		super();
		this.districtName = districtName;
		this.city = city;
		this.isCityCentr = isCityCentr;
		this.isCityCapital = isCityCapital;
	}

	public String getDistrictName() {
		return districtName;
	}

	public City getCity() {
		return city;
	}

	public boolean isCityCentr() {
		return isCityCentr;
	}

	public boolean isCityCapital() {
		return isCityCapital;
	}

	@Override
	public String toString() {
		return "District=" + districtName + ", city=" + city;
	}

}