package AgregationAndComposition02;

public class Wheel {

	private String model;
	private static int id = 0;
	private final int wheelId;
	private boolean isRotate = false;

	public Wheel(String model) {
		super();
		this.model = model;
		this.wheelId = id++;
	}

	public boolean isRotating(boolean isRotating) {
		return this.isRotate = isRotating;

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isRotate() {
		return isRotate;
	}

	public void setRotate(boolean isRotate) {
		this.isRotate = isRotate;
	}

	@Override
	public String toString() {
		return model + " - " + wheelId + ", isRotate = " + isRotate;
	}

}