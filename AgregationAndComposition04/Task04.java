package AgregationAndComposition04;

import java.util.ArrayList;
import java.util.List;

public class Task04 {

	/*
	 * Клиент может иметь несколько счетов в банке. Учитывать возможность
	 * блокировки/разблокировки счета. Реализовать поиск и сортировку счетов.
	 * Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим
	 * положительный и отрицательный балансы отдельно
	 */

	public static void main(String[] args) {

		Account account1 = new Account("123654789", -78);
		Account account2 = new Account("654796325", 72552);
		Account account3 = new Account("236547952", 7224);
		Account account4 = new Account("321145789", -969);
		Account account5 = new Account("332146987", 96321);
		Account account6 = new Account("43434", -4);

		Client client1 = new Client("Petr", "Petrenko", account1, account2);
		Client client2 = new Client("Dmitry", "Sidorov", account3, account4, account5,account6);

		Bank sber = new Bank("SBER", client1, client2);

		Management management = new Management(sber);

		management.options();

	}
}
