package Simpleclass08;

public class Task08 {

	/*
	 * Создать класс Customer, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Customer, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Класс
	 * Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер
	 * банковского счета. Найти и вывести: a) список покупателей в алфавитном
	 * порядке; b) список покупателей, у которых номер кредитной карточки находится
	 * в заданном интервале
	 */

	public static void main(String[] args) {

		Customer[] customer = new Customer[5];

		customer[0] = new Customer(1, "Петров", "Петр", "Иванович", "Петренко 21", 125479652, 1453);
		customer[1] = new Customer(2, "Сидоров", "Дмитрий", "Сергеевич", "Темная 14", 456123789, 9653);
		customer[2] = new Customer(3, "Иванов", "Иван", "Дмитриевич", "Заугольна 63", 963258741, 4587);
		customer[3] = new Customer(4, "Фасолев", "Сергей", "Викторовия", "Ленина 5", 159753245, 2589);
		customer[4] = new Customer(5, "Игнатьев", "Виктор", "Петрович", "Чечина 18", 369874563, 3574);

		CustomerAgregation customerAgregation = new CustomerAgregation(customer);

		customerAgregation.sortCustSurname(customer);

		System.out.println();

		customerAgregation.sortNumberOfCard(1, 400000000, customer);

	}

}
