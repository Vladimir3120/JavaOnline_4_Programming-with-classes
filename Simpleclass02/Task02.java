package Simpleclass02;

public class Task02 {

	/*
	 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными
	 * параметрами. Добавьте конструктор, инициализирующий члены класса по
	 * умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
	 */

	public static void main(String[] args) {

		Test2 test2 = new Test2();
		System.out.println("значения по умолчанию: " + "a = " + test2.getA() + "; " + "b = " + test2.getB());

		Test2 test3 = new Test2(32, 3);
		System.out.println("заданные значения: " + "a = " + test3.getA() + "; " + "b = " + test3.getB());

	}

}
