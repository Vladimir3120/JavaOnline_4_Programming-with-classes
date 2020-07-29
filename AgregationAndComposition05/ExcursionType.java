package AgregationAndComposition05;

public enum ExcursionType {
	
	EXCURION(70);

	private double priceExcursion;
	
	private ExcursionType(double i) {
		this.priceExcursion = i;
	}

	public double getPriceExcursion() {
		return priceExcursion;
	}
	
}


