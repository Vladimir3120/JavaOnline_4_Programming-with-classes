package Simpleclass04;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Task04 {

	/*
	 * Создайте класс Train, содержащий поля: название пункта назначения, номер
	 * поезда, время отправления. Создайте данные в массив из пяти элементов типа
	 * Train, добавьте возможность сортировки элементов массива по номерам поездов.
	 * Добавьте возможность вывода информации о поезде, номер которого введен
	 * пользователем. Добавьте возможность сортировки массив по пункту назначения,
	 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по
	 * времени отправления.
	 */

	public static void main(String[] args) {

		Train[] trains = new Train[5];

		trains[0] = new Train("Минск", 11, "20:00");
		trains[1] = new Train("Гомель", 2, "12:15");
		trains[2] = new Train("Могилёв", 4, "11:00");
		trains[3] = new Train("Минск", 8, "19:00");
		trains[4] = new Train("Витебск", 7, "14:44");

		Start start = new Start();
		start.start(trains);

	}

}
