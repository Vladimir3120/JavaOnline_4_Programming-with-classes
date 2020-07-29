package AgregationAndComposition05;

public enum DaysType {

	SEVEN(7), TWELVE(12), FOURTEEN(14);

	private int days;

	private DaysType(int i) {
		this.days = i;
	}

	public int getDays() {
		return days;
	}

}
