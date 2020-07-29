package Simpleclass08;

import Simpleclass04.Train;

public class CustomerAgregation {

	private Customer[] customer;

	public CustomerAgregation(Customer[] customer) {
		super();
		this.customer = customer;
	}

	public Customer[] getCustomer() {
		return customer;
	}

	public Customer[] sortCustSurname(Customer[] customer) {

		Customer customer2;

		for (int i = 0; i < customer.length; i++) {
			for (int j = 0; j < customer.length; j++) {

				if (customer[i].getSurname().compareTo(customer[j].getSurname()) < 0) {

					customer2 = customer[i];
					customer[i] = customer[j];
					customer[j] = customer2;

				}

			}

		}
		return print(customer);

	}

	public void sortNumberOfCard(int a, int b, Customer[] customer) {

		for (int i = 0; i < customer.length; i++) {

			if (customer[i].getNumberOfCreditCrd() >= a && customer[i].getNumberOfCreditCrd() <= b) {
				System.out.println(customer[i]);

			}

		}

	}

	public Customer[] print(Customer[] customer) {

		for (int i = 0; i < customer.length; i++) {

			System.out.println(customer[i]);

		}
		return customer;

	}

}