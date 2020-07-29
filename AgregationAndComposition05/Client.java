package AgregationAndComposition05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {

	private List<Vaucher> vauchers = new ArrayList<>();
	private List<Vaucher> client = new ArrayList<>();
	private Vaucher[] v;

	public Client() {

		createVaucher();
		choose();

	}

	private void choose() {

		int sum = 0;
		boolean isF = false;

		while (!isF) {

			int a = scan("Введите id путевок, которые вам подходят");

			for (int i = 0; i < v.length; i++) {
				if (a == v[i].getVaucherId()) {
					client.add(v[i]);
				}
			}

			if (scan("1 - продолжить" + "\n" + "0 - выход") == 1) {
				isF = false;
			} else {
				isF = true;
			}
		}

		System.out.println("Выбранные вами путевки");

		for (Vaucher vaucher : client) {
			System.out.println(vaucher);
			sum += vaucher.getPrice();
		}

		System.out.println("Общая сумма = " + sum);

	}

	public void createVaucher() {

		boolean f = false;

		while (!f) {

			vauchers.add(new Vaucher());

			for (Vaucher vaucher : vauchers) {
				System.out.println(vaucher);
			}

			if (scan("1 - продолжить выбор" + "\n" + "0 - сортировка / выход") == 1) {
				f = false;
			} else {
				sort();
				f = true;
			}
		}

	}

	private void sort() {

		int t = 0;
		double sum = 0;
		Vaucher temp;
		v = new Vaucher[vauchers.size()];

		for (Vaucher vaucher : vauchers) {
			v[t++] = vaucher;
		}

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v.length - 1 - i; j++) {

				if (v[j].getPrice() > v[j + 1].getPrice()) {
					temp = v[j];
					v[j] = v[j + 1];
					v[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < v.length; i++) {

			System.out.println(v[i]);

			sum += v[i].getPrice();
		}

		System.out.println("Общая сумма = " + sum);
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
