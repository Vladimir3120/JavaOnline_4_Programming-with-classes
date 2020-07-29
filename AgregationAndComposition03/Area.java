package AgregationAndComposition03;

import java.util.Arrays;

public class Area {

	private String areaName;
	private City cityCentr;
	private District[] districts;
	private int square;
	private City capital;

	public Area(String areaName, int square, District... districts) {
		super();
		this.areaName = areaName;
		this.districts = districts;
		this.square = square;

		for (District district : districts) {
			if (district.isCityCentr() == true) {
				this.cityCentr = district.getCity();
			}
		}

		for (District district : districts) {
			if (district.isCityCapital() == true) {
				this.capital = district.getCity();
			}

		}

	}

	public City getCapital() {
		return capital;
	}

	public String getAreaName() {
		return areaName;
	}

	public City getCityCentr() {
		return cityCentr;
	}

	public District[] getDistricts() {
		return districts;
	}

	public int getSquare() {
		return square;
	}

	@Override
	public String toString() {
		return "Area=" + areaName + ", cityCentr=" + cityCentr + ", districts=" + Arrays.toString(districts)
				+ ", square=" + square;
	}

}