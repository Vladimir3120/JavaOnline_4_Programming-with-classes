package Simpleclass07;

import java.math.BigDecimal;

public class Triangle {

	private Peak a;
	private Peak b;
	private Peak c;

	private double sideAB;
	private double sideAC;
	private double sideBC;

	private double perimetr;
	private double area;
	private Peak midCrossMedian;

	public Triangle(Peak a, Peak b, Peak c) {
		super();

		this.a = a;
		this.b = b;
		this.c = c;

		Calc calc = new Calc();

		sideAB = calc.side(a, b);
		sideAC = calc.side(a, c);
		sideBC = calc.side(b, c);

		if (sideAB < sideAC + sideBC && sideAC < sideAB + sideBC && sideBC < sideAB + sideAC) {

			perimetr = calc.perimetr(sideAB, sideAC, sideBC);
			area = calc.area(sideAB, sideAC, sideBC, perimetr);
			midCrossMedian = calc.midCrossMedian(a, b, c);

		} else {
			System.out.println("Треугольника не существует!!!");
		}

	}

	public Peak getA() {
		return a;
	}

	public Peak getB() {
		return b;
	}

	public Peak getC() {
		return c;
	}

	public double getSideAB() {
		return sideAB;
	}

	public double getSideAC() {
		return sideAC;
	}

	public double getSideBC() {
		return sideBC;
	}

	public double getPerimetr() {
		return perimetr;
	}

	public double getArea() {
		return area;
	}

	public Peak getMidCrossMedian() {
		return midCrossMedian;
	}

	@Override
	public String toString() {
		return "a - (" + a + "), b - (" + b + "), c = (" + c + ")" + "\n" + "sideAB = " + sideAB + ", sideAC = "
				+ sideAC + ", sideBC = " + sideBC + "\n" + "perimetr = " + perimetr + "\n" + "area = " + area + "\n"
				+ "midCrossMedian - (" + midCrossMedian + ")";
	}

}
