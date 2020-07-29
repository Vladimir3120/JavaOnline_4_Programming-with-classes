package Simpleclass10;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Airline {

	private String destination;
	private int flightNumber;
	private String aircraftType;
	private LocalTime departureTime;
	private String daysOfWeek;

	public Airline() {
		super();
	}

	public Airline(String destination, int flightNumber, String aircraftType, String time, String daysOfWeek) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm"));
		this.daysOfWeek = daysOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public String getDaysOfWeek() {
		return daysOfWeek;
	}

	public void setDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", aircraftType="
				+ aircraftType + ", departureTime=" + departureTime + ", daysOfWeek=" + daysOfWeek + "]";
	}

}