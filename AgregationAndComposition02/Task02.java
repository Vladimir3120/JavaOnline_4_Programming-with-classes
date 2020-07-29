package AgregationAndComposition02;

public class Task02 {

	public static void main(String[] args) {

		Car car = new Car(new Wheel("Michelin"), 4, new Engine(2, GasTank.EMPTY), "Toyota");

		car.drive();
		car.refueling();
		car.drive();
		car.stop();
		car.wheelChange(new Wheel("Kama"), 2);
		car.drive();
		car.carName();

	}
}