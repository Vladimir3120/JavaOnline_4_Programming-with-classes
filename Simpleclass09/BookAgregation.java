package Simpleclass09;

import java.util.Scanner;

public class BookAgregation {

	private Book[] books;

	public BookAgregation() {
		super();
	}

	public BookAgregation(Book[] books) {
		super();
		this.books = books;
	}

	public void sortAuthor(Book[] book) {

		int value = scan("Выберите автора, чтобы посмотреть список книг: " + "\n" + "1 - Гоголь" + "\n" + "2 - Толстой"
				+ "\n" + "3 - Булгаков" + "\n" + "4 - Эккель" + "\n" + "5 - Пушкин");

		if (value > 0 && value < 6) {

			for (int i = 0; i < book.length; i++) {

				if (book[i].getId() == value) {

					for (int j = 0; j < book.length; j++) {

						if (book[i].getAuthor() == book[j].getAuthor()) {
							System.out.println(book[j]);
						}

					}

				}

			}
		} else {
			System.out.println("Некорректные данные");
			sortAuthor(book);
		}

	}

	public void sortPublishing(Book[] book) {

		int value = scan("Выберите издательство, чтобы посмотреть список книг: " + "\n" + "1 - Графман" + "\n"
				+ "2 - НоваТел" + "\n" + "3 - Питер" + "\n" + "4 - ТипоГРаф" + "\n" + "5 - Эксмо");

		if (value > 0 && value < 6) {

			for (int i = 0; i < book.length; i++) {

				if (book[i].getId() == value) {

					for (int j = 0; j < book.length; j++) {

						if (book[i].getPublishing() == book[j].getPublishing()) {
							System.out.println(book[j]);

						}

					}

				}

			}

		} else {
			System.out.println("Некорректные данные");
			sortPublishing(book);
		}

	}

	public void sortOfYear(int a, int b, Book[] book) {

		for (int i = 0; i < book.length; i++) {

			if (book[i].getYearOfPublish() >= a && book[i].getYearOfPublish() <= b) {
				System.out.println(book[i]);
			}

		}

	}

	public int scan(String message) {

		int value;

		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Некорректные данные");
			System.out.println(message);
		}
		value = sc.nextInt();

		return value;

	}

	public void print(Book[] book) {
		for (int i = 0; i < book.length; i++) {

			System.out.println(book[i]);

		}

	}

}
