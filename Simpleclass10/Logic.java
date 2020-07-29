package Simpleclass10;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import Simpleclass06.Time;

public class Logic {

	private Airline[] airline;

	public Logic(Airline[] airline) {
		super();
		this.airline = airline;
	}

	public void sortDestination(Airline[] airlines, String string) {

		for (int i = 0; i < airlines.length; i++) {

			if (airlines[i].getDestination() == string) {

				System.out.println(airlines[i]);

			}
		}

	}

	public void sortDaysOfWeek(Airline[] airlines, String string) {

		for (int i = 0; i < airlines.length; i++) {

			if (airlines[i].getDaysOfWeek() == string) {

				System.out.println(airlines[i]);

			}

		}

	}

	public void sortAfterTimeDaysOfWeek(Airline[] airlines, String string, String a) {

		for (int i = 0; i < airlines.length; i++) {

			if (airlines[i].getDaysOfWeek() == string && airlines[i].getDepartureTime().isAfter(LocalTime.parse(a))) {

				System.out.println(airlines[i]);

			} else {
				if (airlines[i].getDaysOfWeek() == string) {
					System.out.println("Рейсов больше нет");
					break;
				}
			}

		}

	}

}
