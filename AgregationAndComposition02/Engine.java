package AgregationAndComposition02;

public class Engine {

	private double engineCapasity;
	private boolean isDrive = false;
	private GasTank gasTank;

	public Engine(double engineCapasity, GasTank gasTank) {
		super();
		this.engineCapasity = engineCapasity;
		this.gasTank = gasTank;
	}

	public boolean isDriving(boolean isDriving) {
		return this.isDrive = isDriving;

	}

	public GasTank refueling() {
		return this.gasTank = GasTank.HIGH;

	}

	public double getEngineCapasity() {
		return engineCapasity;
	}

	public boolean isDrive() {
		return isDrive;
	}

	public GasTank getGasTank() {
		return gasTank;
	}

	@Override
	public String toString() {
		return "Engine = " + engineCapasity + ", isDrive = " + isDrive + ", " + " gasTank = " + gasTank;
	}

}

enum GasTank {
	EMPTY, LOW, MEDIUN, HIGH;
}