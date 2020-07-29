package Simpleclass04;

import java.util.Scanner;

public class Start {

	public void sortTrainOfNumber(Train[] trains) {

		Train[] trains2 = new Train[5];

		for (int i = 0; i < trains.length; i++) {

			for (int j = 0; j < trains.length; j++) {

				if (trains[i].getNumberOfTrain() < trains[j].getNumberOfTrain()) {

					trains2[i] = trains[i];
					trains[i] = trains[j];
					trains[j] = trains2[i];
				}
			}
		}
		for (int i = 0; i < trains.length; i++) {
			System.out.println(trains[i]);

		}

	}

	public void sortDestination(Train[] trains) {
		Train[] trains2 = new Train[5];

		for (int i = 0; i < trains.length; i++) {
			for (int j = 0; j < trains2.length; j++) {

				if (trains[i].getDestination().charAt(0) < trains[j].getDestination().charAt(0)) {

					trains2[i] = trains[i];
					trains[i] = trains[j];
					trains[j] = trains2[i];
				}

			}

		}

		for (int i = 0; i < trains.length; i++) {
			time(trains);
			System.out.println(trains[i]);
		}
	}

	private static void time(Train[] trains) {

		Train[] trains2 = new Train[5];
		for (int i = 0; i < trains.length; i++) {
			for (int j = 0; j < trains.length; j++) {

				if (trains[i].getDestination() == trains[j].getDestination()
						&& trains[i].getDepartureTime().isBefore(trains[j].getDepartureTime())) {

					trains2[i] = trains[i];
					trains[i] = trains[j];
					trains[j] = trains2[i];

				}

			}

		}

	}

	public void print(Train[] trains) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите цифру от 1 до 5 получения информации: >> ");
		System.out.println(
				"1 - Минск" + "\n" + "2 - Гомель" + "\n" + "3 - Могилёв" + "\n" + "4 - Минск" + "\n" + "5 - Минск");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Некорректные данные!!!");
			System.out.println("Введите цифру от 1 до 5 получения информации: >> ");
			System.out.println(
					"1 - Минск" + "\n" + "2 - Гомель" + "\n" + "3 - Могилёв" + "\n" + "4 - Минск" + "\n" + "5 - Минск");

		}

		n = sc.nextInt() - 1;

		if (n < 5) {
			System.out.println(trains[n]);

		} else {

			System.out.println("Некорректные данные!!!");
			print(trains);

		}
	}

	public void start(Train[] trains) {
		int value;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Нажмите - 1 для возможности выбора поезда" + "\n" + "Нажмите - 2 для сортировки по пункту назначения"
						+ "\n" + "Нажмите - 3 для сортировки по номеру поезда" + "\n" + "Нажмите - 4 для выхода");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("\n" + "Некорректные данные!!!");
			System.out.println("Нажмите - 1 для возможности выбора поезда" + "\n"
					+ "Нажмите - 2 для сортировки по пункту назначения" + "\n"
					+ "Нажмите - 3 для сортировки по номеру поезда" + "\n" + "Нажмите - 4 для выхода");

		}

		value = sc.nextInt();

		if (value == 1) {
			print(trains);
		} else if (value == 2) {
			sortDestination(trains);
		} else if (value == 3) {
			sortTrainOfNumber(trains);
		} else if (value == 4) {

		} else {
			System.out.println("Некорректные данные!!!");

			start(trains);
		}

	}

}
