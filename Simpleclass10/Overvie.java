package Simpleclass10;

public class Overvie {

	private Airline[] airline;
	private AirlineAgregation agregation = new AirlineAgregation();

	public Overvie() {
		super();
	}

	public void overview(Airline[] airline) {
		int value = agregation.scan("Выберите для дальнейших действий:" + "\n" + "1 - Обзор всех рейсов" + "\n"
				+ "2 - Список рейсов по пункту назначения" + "\n" + "3 - Список рейсов по дню недели" + "\n"
				+ "4 - Список рейсов по дню недели от заданного времени");

		switch (value) {
		case 1:

			for (int i = 0; i < airline.length; i++) {
				System.out.println(airline[i]);
			}
			break;

		case 2:

			agregation.sortDestination(airline);
			break;

		case 3:

			agregation.sortDaysOfWeek(airline);
			break;

		case 4:

			agregation.sortAfterTimeDaysOfWeek(airline);
			break;

		default:
			System.out.println("Некорректные данные!!!");
			overview(airline);
			break;
		}

	}

}
