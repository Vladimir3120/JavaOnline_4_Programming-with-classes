package AgregationAndComposition05;

public enum FoodType {

	BREAKFAST(10), BREAKFAST_DINNER(17), ALL_INCLUSIVE(30);

	private int foodPrice;

	private FoodType(int i) {
		this.foodPrice = i;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

}
