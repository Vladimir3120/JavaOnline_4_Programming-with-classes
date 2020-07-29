package AgregationAndComposition05;

import java.util.Scanner;

public class Vaucher {
	private static int id = 1;
	private final int vaucherId;
	private TourType tourType;
	private Country country;
	private DaysType daysType;
	private FoodType foodType;
	private TransportType transportType;
	private ExcursionType excursionType;
	private CureType cureType;
	private double price;

	public Vaucher() {
		this.vaucherId = id++;
		this.tourType = tourType();

		if (this.tourType == tourType.VOCATION) {
			this.country = country();
			if (this.country == country.TURKISH) {
				this.daysType = daysType();
				this.foodType = foodType();
				this.transportType = transportType.AIRPLANE;
				this.price = (country.getPriceCountry() * daysType.getDays() * transportType.getPercent())
						+ (foodType.getFoodPrice() * daysType.getDays());

			} else if (this.country == country.THAI) {
				this.daysType = daysType();
				this.foodType = foodType();
				this.transportType = transportType.AIRPLANE;
				this.price = (country.getPriceCountry() * daysType.getDays() * transportType.getPercent())
						+ (foodType.getFoodPrice() * daysType.getDays());
			}
		}

		if (this.tourType == tourType.CRUISE) {
			this.country = country();
			if (this.country == country.TURKISH) {
				this.daysType = daysType();
				this.foodType = foodType.ALL_INCLUSIVE;
				this.transportType = transportType.SHIP;
				this.price = (country.getPriceCountry() * daysType.getDays() * transportType.getPercent())
						+ (foodType.getFoodPrice() * daysType.getDays());

			} else if (this.country == country.THAI) {
				this.daysType = daysType();
				this.foodType = foodType.ALL_INCLUSIVE;
				this.transportType = transportType.SHIP;
				this.price = (country.getPriceCountry() * daysType.getDays() * transportType.getPercent())
						+ (foodType.getFoodPrice() * daysType.getDays());
			}
		}

		if (this.tourType == tourType.EXCURSION) {
			this.excursionType = excursionType.EXCURION;
			this.transportType = transportType();
			this.price = excursionType.getPriceExcursion() * transportType.getPercent();
		}

		if (this.tourType == tourType.CURE) {
			this.cureType = cureType.CURE;
			this.price = cureType.getPriceCure();
		}

		if (this.tourType == tourType.SHOPING) {
			this.transportType = transportType();
			this.price = transportType.getPercent() * 10;
		}

	}

	private TourType tourType() {

		System.out.println("Выберите тип отдыха");

		switch (scan("1 - vocation" + "\n" + "2 - excursion" + "\n" + "3 - cure" + "\n" + "4 - shoping" + "\n"
				+ "5 - cruise")) {
		case 1:
			this.tourType = tourType.VOCATION;
			break;

		case 2:
			this.tourType = tourType.EXCURSION;
			break;

		case 3:
			this.tourType = tourType.CURE;
			break;

		case 4:
			this.tourType = tourType.SHOPING;
			break;
		case 5:
			this.tourType = tourType.CRUISE;
			break;

		default:

			tourType();
			break;
		}

		return tourType;

	}

	private Country country() {

		System.out.println("Выберите страну");

		switch (scan("1 - Turkish" + "\n" + "2 - Thailand")) {
		case 1:
			this.country = country.TURKISH;
			break;

		case 2:
			this.country = country.THAI;
			break;

		default:

			country();
			break;
		}

		return country;

	}

	private DaysType daysType() {

		System.out.println("Выберите колличество дней");

		switch (scan("7" + "\n" + "12" + "\n" + "14")) {
		case 7:
			this.daysType = daysType.SEVEN;
			break;
		case 12:
			this.daysType = daysType.TWELVE;
			break;
		case 14:
			this.daysType = daysType.FOURTEEN;
			break;

		default:

			daysType();
			break;
		}

		return daysType;

	}

	private FoodType foodType() {

		System.out.println("Выберите питание");

		switch (scan("1 - Breakfast" + "\n" + "2 - Breakfast and dinner" + "\n" + "3 - All inclusive")) {
		case 1:
			this.foodType = foodType.BREAKFAST;
			break;
		case 2:
			this.foodType = foodType.BREAKFAST_DINNER;
			break;
		case 3:
			this.foodType = foodType.ALL_INCLUSIVE;
			break;

		default:

			foodType();
			break;
		}

		return foodType;

	}

	private TransportType transportType() {

		System.out.println("Выберите тип транспорта");

		switch (scan("1 - Van" + "\n" + "2 - Bus")) {
		case 1:
			this.transportType = transportType.VAN;
			break;
		case 2:
			this.transportType = transportType.BUS;
			break;

		default:

			transportType();
			break;
		}

		return transportType;

	}

	public int getVaucherId() {
		return vaucherId;
	}

	public TourType getTourType() {
		return tourType;
	}

	public Country getCountry() {
		return country;
	}

	public DaysType getDaysType() {
		return daysType;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public TransportType getTransportType() {
		return transportType;
	}

	public ExcursionType getExcursionType() {
		return excursionType;
	}

	public CureType getCureType() {
		return cureType;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Vaucher [vaucherId=" + vaucherId + ", tourType=" + tourType + ", country=" + country + ", daysType="
				+ daysType + ", foodType=" + foodType + ", transportType=" + transportType + ", price=" + price + "]";
	}

	private static int scan(String message) {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		return value = sc.nextInt();

	}
}