package AgregationAndComposition03;

public class State {

	private String stateName;
	private Area[] area;
	private int numberOfAreas;

	public State(String stateName, Area... area) {
		super();
		this.stateName = stateName;
		this.area = area;

		for (Area area2 : area) {

			numberOfAreas++;
		}
	}

	public String getStateName() {
		return stateName;
	}

	public int getNumberOfAreas() {
		return numberOfAreas;
	}

	public void capital() {

		for (Area area2 : area) {

			if (area2.getCapital() != null) {
				System.out.println(getStateName() + " Столица" + " = " + area2.getCapital());
			}
		}
	}

	public void square() {
		for (Area area2 : area) {
			System.out.println(area2.getAreaName() + " = " + area2.getSquare() + " км.кв");
		}
	}

	public void numberOfAreas() {
		System.out.println("Колличество областей = " + getNumberOfAreas());
	}

	public void centrOfArea() {
		System.out.print("Областные центры = ");
		for (Area area2 : area) {

			System.out.print(area2.getCityCentr() + " ");

		}
	}

}