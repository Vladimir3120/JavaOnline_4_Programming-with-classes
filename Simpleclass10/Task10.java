package Simpleclass10;

import java.time.LocalTime;

public class Task10 {

	/*
	 * Создать класс Airline, спецификация которого приведена ниже. Определить
	 * конструкторы, set- и get- методы и метод toString(). Создать второй класс,
	 * агрегирующий массив типа Airline, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль. Airline: пункт
	 * назначения, номер рейса, тип самолета, время вылета, дни недели. Найти и
	 * вывести: a) список рейсов для заданного пункта назначения; b) список рейсов
	 * для заданного дня недели; c) список рейсов для заданного дня недели, время
	 * вылета для которых больше заданного. <p> String destination, String number,
	 * Type type, DepartureTime departureTime
	 */

	public static void main(String[] args) {

		Airline[] airline = new Airline[5];

		airline[0] = new Airline("Гомель", 12, "Боинг 737", "13:15", "Понедельник");
		airline[1] = new Airline("Москва", 10, "Боинг 747", "18:45", "Среда");
		airline[2] = new Airline("Краков", 18, "Аэробус а380", "14:00", "Вторник");
		airline[3] = new Airline("Мюнхен", 5, "Боинг 737", "07:20", "Вторник");
		airline[4] = new Airline("Москва", 23, "Аэробус а380", "04:00", "Вторник");

		AirlineAgregation agregation = new AirlineAgregation();
		Overvie overvie = new Overvie();

		overvie.overview(airline);

	}

}
