package Simpleclass03;

public class Task03 {

	/*
	 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер
	 * группы, успеваемость (массив из пяти элементов). Создайте массив из десяти
	 * элементов такого типа. Добавьте возможность вывода фамилий и номеров групп
	 * студентов, имеющих оценки, равные только 9 или 10.
	 */

	public static void main(String[] args) {

		Student excellentStudent = new Student();

		Student[] students = new Student[10];

		students[0] = new Student("Сидоров", "И.", "Д.", 5, new int[] { 10, 9, 9, 10, 9 });
		students[1] = new Student("Петров", "Ф.", "В.", 4, new int[] { 10, 3, 5, 15, 9 });
		students[2] = new Student("Дятлов", "С.", "А.", 5, new int[] { 6, 8, 5, 6, 2 });
		students[3] = new Student("Николаев", "Е.", "П.", 5, new int[] { 4, 8, 5, 7, 9 });
		students[4] = new Student("Александров", "И.", "В.", 3, new int[] { 10, 9, 10, 10, 10 });
		students[5] = new Student("Комаровский", "В.", "Я.", 3, new int[] { 10, 10, 10, 10, 9 });
		students[6] = new Student("Шпаковский", "Н.", "Ф.", 4, new int[] { 4, 6, 5, 5, 9 });
		students[7] = new Student("Вашинский", "Д.", "Д.", 4, new int[] { 10, 8, 5, 10, 10 });
		students[8] = new Student("Путковский", "В.", "Р.", 5, new int[] { 10, 8, 5, 10, 10 });
		students[9] = new Student("Шнуров", "И.", "С.", 5, new int[] { 7, 8, 7, 8, 9 });

		excellentStudent.excellentStudents(students);
	}

}
