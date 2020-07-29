package AgregationAndComposition04;

import java.util.Arrays;

public class Client {

	private static int id = 1;
	private final int ClientId;

	private String name;
	private String surname;
	private Account[] accounts;

	public Client(String name, String surname, Account... accounts) {

		super();
		this.ClientId = id++;
		this.name = name;
		this.surname = surname;
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public int getClientId() {
		return ClientId;
	}

	public void sortAccaunt() { // сортировка

		Account t;
		Account[] ac = new Account[accounts.length];

		for (int i = 0; i < ac.length; i++) {
			for (int j = 0; j < ac.length - 1 - i; j++) {

				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					t = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = t;
				}

			}
		}

		for (int i = 0; i < ac.length; i++) {
			System.out.println(accounts[i]);
		}

	}

	public void sum() { // сумма

		double sum = 0;

		for (int i = 0; i < accounts.length; i++) {
			sum += accounts[i].getBalance();

		}
		System.out.println(" [Сумма средств = " + sum + "]");

	}

	public void sumPositive() {

		double sumP = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > 0) {
				sumP += accounts[i].getBalance();
			}

		}

		System.out.println(" [Сумма счетов с положительным балансом = " + sumP + "]");

	}

	public void sumNegative() {

		double sumP = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() < 0) {
				sumP += accounts[i].getBalance();
			}

		}

		System.out.println(" [Сумма счетов с отрицательным балансом = " + sumP + "]");

	}

	private void sumTest() {

		double sumP = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > 0) {
				sumP += accounts[i].getBalance();
			}

		}

		System.out.println(" [Сумма счетов с положительным балансом = " + sumP + "]");

	}

	@Override
	public String toString() {
		return "id=" + ClientId + ", Client=" + name + ", surname=" + surname + ", accounts="
				+ Arrays.toString(accounts);
	}

}