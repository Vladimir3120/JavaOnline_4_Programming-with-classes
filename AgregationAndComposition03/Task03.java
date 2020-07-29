package AgregationAndComposition03;

public class Task03 {

	/*
	 * Создать объект класса Государство, используя классы Область, Район, Город.
	 * Методы: вывести на консоль столицу, количество областей, площадь, областные
	 * центры.
	 */

	public static void main(String[] args) {

		Area areaGomelskay = new Area("Гомельская", 40372, new District("Гомельский", new City("Гомель"), true, false),
				new District("Ветковский", new City("Ветка"), false, false),
				new District("Брагинский", new City("Брагин"), false, false));

		Area areaBrestskay = new Area("Брестская", 32787, new District("Бресткий", new City("Брест"), true, false),
				new District("Барановичский", new City("Барановичи"), false, false),
				new District("Ивацевичский", new City("Ивацевичи"), false, false));

		Area areaMinskay = new Area("Минская", 39854, new District("Минский", new City("Минск"), true, true),
				new District("Березенский", new City("Березино"), false, false),
				new District("Вилейский", new City("Вилейка"), false, false));

		Area areaVitebskay = new Area("Витебская", 40051, new District("Витебский", new City("Витебск"), true, false),
				new District("Браславский", new City("Браслав"), false, false),
				new District("Глубокский", new City("Глубокое"), false, false));

		Area areaGrodnenskay = new Area("Гроднненская", 25127,
				new District("Гродненский", new City("Гродно"), true, false),
				new District("Волковыский", new City("Волковыск"), false, false),
				new District("Вороновский", new City("Вороново"), false, false));

		Area areaMogilevskay = new Area("Могилевская", 29068,
				new District("Могилевский", new City("Могилев"), true, false),
				new District("Бобруйский", new City("Бобруйск"), false, false),
				new District("Быховский", new City("Быхов"), false, false));

		State state = new State("Республика Беларусь", areaBrestskay, areaMinskay, areaGomelskay, areaGrodnenskay,
				areaMogilevskay, areaVitebskay);

		state.capital();
		state.numberOfAreas();
		state.square();
		state.centrOfArea();

	}
}