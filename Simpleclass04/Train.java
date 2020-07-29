package Simpleclass04;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Train {

	private String destination;
	private int numberOfTrain;
	private LocalTime departureTime;

	public Train() {
		super();
	}

	public Train(String destination, int numberOfTrain, String time) {
		super();
		this.destination = destination;
		this.numberOfTrain = numberOfTrain;
		departureTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
	}

	public String getDestination() {
		return destination;
	}

	public int getNumberOfTrain() {
		return numberOfTrain;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	@Override
	public String toString() {
		return "Куда - " + destination + ", " + "Номер поезда - " + numberOfTrain + ", " + "Время отправления - "
				+ departureTime;
	}

}