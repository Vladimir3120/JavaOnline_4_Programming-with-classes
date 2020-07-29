package Simpleclass07;

public class Calc {

	public Calc() {
		super();
	}

	public double side(Peak a, Peak b) {

		return Math.sqrt((Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2)));
	}

	public double perimetr(double sideAB, double sideAC, double sideBC) {

		return sideAB + sideAC + sideBC;
	}

	public double area(double sideAB, double sideAC, double sideBC, double perimetr) {

		double midPerimetr = perimetr / 2;

		return Math.sqrt(midPerimetr * (midPerimetr - sideAB) * (midPerimetr - sideAC) * (midPerimetr - sideBC));

	}

	public Peak midCrossMedian(Peak a, Peak b, Peak c) {

		double x = (a.getX() + b.getX() + c.getX()) / 3;
		double y = (a.getY() + b.getY() + c.getY()) / 3;

		return new Peak(x, y);

	}

}
