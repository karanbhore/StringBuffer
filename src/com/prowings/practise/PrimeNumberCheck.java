package com.prowings.practise;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		boolean res = isPrimeNumber(4);

	}

	private static boolean isPrimeNumber(int num) {

		boolean flag = false;
		for (int i = 2; i <= num / 2; ++i) {
			// condition for non prime number
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num + "is a prime number .");
			return true;
		} else {
			System.out.println(num + "is not a prime number.");
			return false;
		}
	}

}
