package Simpleclass01;

public class Task01 {

	/*
	 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и
	 * методы изменения этих переменных. Добавьте метод, который находит сумму
	 * значений этих переменных, и метод, который находит наибольшее значение из
	 * этих двух переменных.
	 */

	public static void main(String[] args) {

		Test1 test1 = new Test1();

		test1.setA(12);
		test1.setB(8);

		test1.print();

		test1.sum(test1.getA(), test1.getB());

		test1.compare(test1.getA(), test1.getB());

	}

}
