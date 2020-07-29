package AgregationAndComposition05;

public enum TransportType {

	VAN(1.3), BUS(1.1), AIRPLANE(1.4), SHIP(1.7);

	private double percent;

	private TransportType(double i) {
		this.percent = i;
	}

	public double getPercent() {
		return percent;
	}

}
