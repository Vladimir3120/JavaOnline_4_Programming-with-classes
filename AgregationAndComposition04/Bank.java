package AgregationAndComposition04;

import java.util.Arrays;
import java.util.Scanner;

public class Bank {

	private String bankName;
	private Client[] clients;

	public Bank(String bankName, Client... clients) {
		super();
		this.bankName = bankName;
		this.clients = clients;
	}

	public String getBankName() {
		return bankName;
	}

	public Client[] getClients() {
		return clients;
	}

	@Override
	public String toString() {
		return "Bank=" + bankName + ", clients=" + Arrays.toString(clients);
	}

}