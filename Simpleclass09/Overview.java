package Simpleclass09;

import java.util.Scanner;

public class Overview {
	private Book[] book;
	private BookAgregation bookAgregation = new BookAgregation();

	public Overview() {
		super();
	}

	public void overview(Book[] book, BookAgregation bookAgregation) {

		int v = bookAgregation.scan("Выберите нужное действие:" + "\n" + "1 - список всех книг" + "\n"
				+ "2 - список книг заданного автора" + "\n" + "3 - список книг, выпущенных заданным издаельством" + "\n"
				+ "4 - список книг, выпущщенных после заданного года");

		if (v > 0 && v < 5) {

			if (v == 1) {
				bookAgregation.print(book);

			}
			if (v == 2) {
				bookAgregation.sortAuthor(book);

			}
			if (v == 3) {
				bookAgregation.sortPublishing(book);

			}
			if (v == 4) {
				int a = bookAgregation.scan("год от");
				int b = bookAgregation.scan("год до");

				bookAgregation.sortOfYear(a, b, book);

			}

		} else {
			System.out.println("Некорректные данные");

		}

	}

}