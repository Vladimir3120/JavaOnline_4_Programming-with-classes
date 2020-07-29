package Simpleclass07;

public class Task07 {

	/*
	 * Описать класс, представляющий треугольник. Предусмотреть методы для создания
	 * объектов, вычисления площади, периметра и точки пересечения медиан.
	 */

	public static void main(String[] args) {

		Triangle triangle = new Triangle(new Peak(6, 4), new Peak(3, 5), new Peak(8, 7));

		System.out.println(triangle);

	}

}
