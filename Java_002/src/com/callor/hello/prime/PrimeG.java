package com.callor.hello.prime;

public class PrimeG {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			int num = i + 1;
			int index = 0;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			}
			if (index >= num) {
				System.out.printf("%d 는 소수이다\n",num);
			}
		}
	}
}
