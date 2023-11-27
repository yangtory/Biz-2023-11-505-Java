package com.callor.hello.prime;

public class PrimeG {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			int index = 0;
			for (index = 2; index < 100; index++) {
				if (num % i == 0) {
					break;
				}
			}
			if (index < num) {
				System.out.printf("%d 는 소수임\n", num);
			} else {
				System.out.printf("%d 는 소수임\n", num);
			}
		}
	}
}
