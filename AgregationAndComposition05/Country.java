package AgregationAndComposition05;

public enum Country {

	TURKISH(50), THAI(70);
	
	private double priceCountry;

	private Country(double i) {
		this.priceCountry = i;
	}

	public double getPriceCountry() {
		return priceCountry;
	}
	

	
}
