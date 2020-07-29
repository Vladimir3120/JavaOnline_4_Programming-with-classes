package AgregationAndComposition02;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private Wheel wheel;
	private List<Wheel> wheels;
	private Engine engine;
	private String carName;

	private boolean isCarGood;

	public Car(Wheel wheel, int numberOfWhels, Engine engine, String carName) {

		this.carName = carName;
		if (numberOfWhels == 4) {
			isCarGood = true;
			this.wheel = wheel;
			this.engine = engine;

			wheels = new ArrayList<>();
			for (int i = 0; i < numberOfWhels; i++) {

				wheels.add(new Wheel(wheel.getModel()));

			}
		} else {
			isCarGood = false;
			System.out.println("Машина должна иметь 4 колеса");
		}
	}

	public void drive() {

		if (isCarGood == true && engine.getGasTank() != GasTank.EMPTY) {
			engine.isDriving(true);

			for (Wheel wheel : wheels) {
				wheel.isRotating(true);
			}
			System.out.println("Машина движется");
		} else {
			if (isCarGood != false) {
				System.out.println("Нужна заправка");
			}
		}
	}

	public void stop() {
		if (isCarGood == true && isCarGood == true) {
			for (Wheel wheel : wheels) {
				wheel.isRotating(false);
			}
			System.out.println("Машина стоит");
		}

	}

	public void refueling() {
		if (isCarGood == true) {
			engine.refueling();
			System.out.println("Машина заправлена");
		}
	}

	public void wheelChange(Wheel wheel, int numberofWheel) {
		if (isCarGood == true) {
			wheels.set(numberofWheel, wheel);
			System.out.println("Колесо заменено");
		}
	}

	public void carName() {

		System.out.println(carName);

	}

	@Override
	public String toString() {
		return wheels + "; engine=" + engine + ", carName = " + carName;
	}

}