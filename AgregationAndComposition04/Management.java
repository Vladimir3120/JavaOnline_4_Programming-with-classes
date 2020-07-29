package AgregationAndComposition04;

import java.util.Iterator;
import java.util.Scanner;

public class Management {

	private static Bank bank;

	public Management(Bank bank) {
		super();
		this.bank = bank;
	}

	private static void lockUnlock() { // блокировка / разблокровка

		int accountNumber = scan("Введите номер счета из 9 цифр, 0 - выход в главное меню");

		if (accountNumber != 0) {
			for (Client client : bank.getClients()) {
				for (Account account : client.getAccounts()) {

					if (accountNumber == Integer.parseInt(account.getAccountName())) {

						int lock = scan("1 - заблокировать, 2 - разблокровать");

						if (lock == 1) {
							account.lock(true);
						} else if (lock == 2) {
							account.lock(false);
						} else {
							System.out.println("Некорректные данные");

						}
					}

				}

			}
			lockUnlock();
		} else {
			options();
		}

	}

	private static void review() {

		for (Client client : bank.getClients()) {
			System.out.println("id=" + client.getClientId() + ", " + client.getName() + " " + client.getName());

			for (Account account : client.getAccounts()) {
				System.out.println(account);
			}
			System.out.println();
		}
	}

	private static void search() { // сортировка

		for (Client client : bank.getClients()) {

			System.out.println("id=" + client.getClientId() + ", " + client.getName() + " " + client.getSurname());

			client.sortAccaunt();
			System.out.println();

		}

		options();

	}

	private static void sumAc() { // сумма по счетам

		double sum = 0;

		for (Client client : bank.getClients()) {
			System.out.print("id=" + client.getClientId() + ", " + client.getName() + " " + client.getSurname());

			client.sum();

			for (Account account : client.getAccounts()) {
				System.out.println(account);
				sum += account.getBalance();

			}
			System.out.println();
		}
		System.out.println("[Общая сумма по вссем счетам в банке = " + sum + "]" + "\n");

		options();

	}

	private static void sumPositive() {

		for (Client client : bank.getClients()) {

			System.out.print("id=" + client.getClientId() + ", " + client.getName() + " " + client.getSurname());
			client.sumPositive();

			for (Account account : client.getAccounts()) {
				System.out.println(account);
			}
			System.out.println();
		}
		options();

	}

	private static void sumNegative() {

		for (Client client : bank.getClients()) {

			System.out.print("id=" + client.getClientId() + ", " + client.getName() + " " + client.getSurname());
			client.sumNegative();

			for (Account account : client.getAccounts()) {
				System.out.println(account);
			}
			System.out.println();
		}
		options();

	}

	public static void options() {

		int a = scan("1 - блокировка/разблокировка счета" + "\n" + "2 - поиск счетов / сортировка" + "\n"
				+ "3 - вычисление общей суммы по счетам" + "\n"
				+ "4 - вычисление суммы по счетам с положительным балансом" + "\n"
				+ "5 - вычисление суммы по счетам с отрицательным балансом" + "\n" + "6 - выход");

		if (a > 0 && a < 7) {
			switch (a) {

			case 1:
				System.out.println("[БЛОКИРОВКА / РАЗБЛОКИРОВКА]");

				review();
				lockUnlock();
				break;

			case 2:
				System.out.println("[ПОИСК / СОРТИРОВКА]");

				search();
				break;

			case 3:
				System.out.println("[ВЫЧИСЛЕНИЕ ОБЩЕЙ СУММЫ ПО СЧЕТАМ]");

				sumAc();
				break;

			case 4:
				System.out.println("[ВЫЧИСЛЕНИЕ СУММЫ ПО СЧЕТАМ С ПОЛОЖИТЕЛЬНЫМ БАЛАНСОМ]");

				sumPositive();
				break;

			case 5:
				System.out.println("[ВЫЧИСЛЕНИЕ СУММЫ ПО СЧЕТАМ С ОТРИЦАТЕЛЬНЫМ БАЛАНСОМ]");

				sumNegative();
				break;

			default:
				if (a == 6) {

					break;
				}
			}
		} else {
			options();
		}

	}

	public static int scan(String message) {

		int value;

		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Некорректные данные");
			System.out.println(message);
		}

		return value = sc.nextInt();

	}

}
