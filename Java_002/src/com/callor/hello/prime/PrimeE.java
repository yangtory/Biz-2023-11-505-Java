package com.callor.hello.prime;

public class PrimeE {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {  // 5번 반복
			int num = (int) (Math.random() * 100) + 1; // 변수 선언을 5번 반복 안에서 해야됨
			int index = 0;
			boolean noPrime = false;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					noPrime = true;
					break;
				}
			}
			if (noPrime) {
				System.out.printf("  %d MOD %d = %d,", num, index, num % index);
				System.out.printf("  %d 는 소수가 아님\n", num);
			} else {
				System.out.printf("  %d 는 소수임\n", num);
			}
		}
		System.out.println("=======================");

	}

}