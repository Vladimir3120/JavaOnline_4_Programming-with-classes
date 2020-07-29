package AgregationAndComposition05;

public enum CureType {
	
	CURE(10);

	private double priceCure;
	private CureType(double i) {
		this.priceCure = i;
	}
	public double getPriceCure() {
		return priceCure;
	}
	
	
}
