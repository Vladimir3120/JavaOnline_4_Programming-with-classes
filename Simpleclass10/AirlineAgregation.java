package Simpleclass10;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AirlineAgregation {

	private Airline[] airlines;
	private Logic logic = new Logic(airlines);

	public AirlineAgregation() {
		super();
	}

	public AirlineAgregation(Airline[] airlines) {
		super();
		this.airlines = airlines;
	}

	public void sortDestination(Airline[] airlines) {

		int value = scan("Выберите пункт назначения, чтобы посмотреть список рейсов:" + "\n" + "1 - Гомель" + "\n"
				+ "2 - Москва" + "\n" + "3 - Краков" + "\n" + "4 - Мюнхен");

		switch (value) {
		case 1:

			logic.sortDestination(airlines, "Гомель");
			break;

		case 2:

			logic.sortDestination(airlines, "Москва");
			break;

		case 3:

			logic.sortDestination(airlines, "Краков");
			break;

		case 4:

			logic.sortDestination(airlines, "Мюнхен");
			break;

		default:
			System.out.println("Некорректные данные");
			sortDestination(airlines);
			break;
		}

	}

	public void sortDaysOfWeek(Airline[] airlines) {

		int value = scan("Выберите день недели, чтобы посмотреть список рейсов:" + "\n" + "1 - Понедельник" + "\n"
				+ "2 - Вторник" + "\n" + "3 - Среда");

		switch (value) {
		case 1:

			logic.sortDaysOfWeek(airlines, "Понедельник");
			break;

		case 2:

			logic.sortDaysOfWeek(airlines, "Вторник");
			break;

		case 3:

			logic.sortDaysOfWeek(airlines, "Среда");
			break;

		default:
			System.out.println("Некорректные данные");

			break;
		}

	}

	public void sortAfterTimeDaysOfWeek(Airline[] airlines) {

		int value = scan("Выберите день недели, чтобы посмотреть список рейсов:" + "\n" + "1 - Понедельник" + "\n"
				+ "2 - Вторник" + "\n" + "3 - Среда");

		switch (value) {
		case 1:

			String time = scanTime(
					"Введите время в формате HH:mm, для просмотра рейса время вылета которого больше заданного");

			logic.sortAfterTimeDaysOfWeek(airlines, "Понедельник", time);

			break;

		case 2:

			String time1 = scanTime(
					"Введите время в формате HH:mm, для просмотра рейса время вылета которого больше заданного");

			logic.sortAfterTimeDaysOfWeek(airlines, "Вторник", time1);
			break;

		case 3:

			String time2 = scanTime(
					"Введите время в формате HH:mm, для просмотра рейса время вылета которого больше заданного");

			logic.sortAfterTimeDaysOfWeek(airlines, "Среда", time2);

			break;

		default:
			System.out.println("Некоректные данные!!!");

			sortAfterTimeDaysOfWeek(airlines);

		}

	}

	public int scan(String message) {

		int value;

		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Некорректные данные");
			System.out.println(message);
		}
		value = sc.nextInt();

		return value;

	}

	public String scanTime(String message) {

		String value;

		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNext()) {
			sc.next();
			System.out.println("Некорректные данные");
			System.out.println(message);
		}
		value = sc.next();

		return value;

	}

}
