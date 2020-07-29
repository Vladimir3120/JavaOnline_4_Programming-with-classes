package Simpleclass06;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		super();
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
		
		System.out.println(toString());
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		if (hour < 24 && hour > 0) {
			this.hour = hour;

		} else {
			this.hour = 0;
		}
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {

		if (minute < 60 && minute > 0) {
			this.minute = minute;

		} else {
			this.minute = 0;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {

		if (second < 60 && second > 0) {
			this.second = second;

		} else {
			this.second = 0;
		}
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

	public void timeChange(Time time, int plusHour, int plusMimute, int plusSecond) {

		int h = hour;
		int m = minute;
		int s = second;

		int x, y, z;

		if (h + plusHour > 23 || m + plusMimute > 59 || s + plusSecond > 59) {

			x = (h + plusHour) - (h + plusHour) / 24 * 24;
			System.out.print(x + ":");

			y = (m + plusMimute) - (m + plusMimute) / 60 * 60;
			System.out.print(y + ":");

			z = (s + plusSecond) - (s + plusSecond) / 60 * 60;
			System.out.print(z);

		} else {
			x = (h + plusHour);
			System.out.print(x + ":");

			y = (m + plusMimute);
			System.out.print(y + ":");

			z = (s + plusSecond);
			System.out.print(z);
		}

		int day = plusHour / 24;

		System.out.print(" + " +"("+ day + " суток)");

	}
}
