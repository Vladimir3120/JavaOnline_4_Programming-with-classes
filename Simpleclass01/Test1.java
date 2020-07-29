package Simpleclass01;

public class Test1 {

	private int a;
	private int b;

	public void print() {

		System.out.println("variableOne = " + a + "\n" + "variableTwo = " + b);

	}

	public Test1() {
		super();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int sum(int a, int b) {

		int sum;
		sum = a + b;

		System.out.print("sum = ");
		return out(sum);

	}

	public int compare(int a, int b) {

		int compare;

		if (a > b) {
			compare = a;
		} else {
			compare = b;
		}

		System.out.print("compare = ");
		return out(compare);
	}

	public int out(int a) {

		System.out.println(a);

		return a;

	}

}
