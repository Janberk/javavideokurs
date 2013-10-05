package de.canberk.mix;

import java.util.Scanner;

public class Loops {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Gib eine Ganzzahl ein: ");
		int userInput = sc.nextInt();
		System.out.println("\nDu hast " + userInput
				+ " eingegeben. Pyramide aus " + userInput
				+ " Zeilen wird erzeugt.\n");
		testLoop(userInput);
		System.out.println(sumMultOfThreeFiveBelowNum(100));
		einmalEins();
		for (int i = 0; i <= 100; i++) {
			System.out.println(i + " - " + isPrim(i));
		}
		System.out.println(isPrim(1));

	}

	public static void testLoop(int numRow) {

		int row = numRow + 2;
		String blank = " ";
		String star = "*";

		for (int i = 1; i <= numRow; i++) {

			for (int j = i; j <= numRow - 1; j++) {
				System.out.print(blank);
			}
			row -= 2;
			for (int k = row; k <= numRow; k++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

	public static int sumMultOfThreeFiveBelowNum(int num) {
		int count = 0;
		for (int i = 1; i < num; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				count += i;
			}
		}
		return count;
	}

	public static void einmalEins() {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(j + " x " + i + " = " + i * j);
			}
			System.out.println();
		}
	}

	public static boolean isPrim(int num) {

		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			int result = num % i;
			if (result == 0) {
				return false;
			}
		}
		return true;
	}

}
