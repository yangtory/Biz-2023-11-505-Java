package com.callor.hello.algorith;

public class AlgB {
	// 3의 배수, 5의 배수의 합
	// 3의 배수와 5의 배수의 합을 4칙연산하여 출력
	// i+1 도 num으로 선언해주기 !
	// 위에 내가 한거
	public static void main(String[] args) {
		int sum3 = 0;
		int sum5 = 0;
		for (int i = 0; i < 100; i++) {
			if ((i + 1) % 3 == 0) {
				sum3 += (i + 1);
			}
			if ((i + 1) % 5 == 0) {
				sum5 += (i + 1);
			}
		}
		System.out.println("3의 배수 + 5의 배수 : " + (sum3 + sum5));
		System.out.println("3의 배수 - 5의 배수 : " + (sum3 - sum5));
		System.out.println("3의 배수 / 5의 배수 : " + (sum3 / sum5));
		System.out.println("3의 배수 * 5의 배수 : " + (sum3 * sum5));

		// 선생님이 한거
		//int sum3 = 0;
		//int sum5 = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1;
			if (num % 3 == 0) {
				sum3 += num;
			}
			if (num % 5 == 0) {
				sum5 += num;
			}
		}
		System.out.printf("%d + %d = %d\n", 
				sum3, sum5, sum3 + sum5);
		System.out.printf("%d x %d = %d\n", 
				sum3, sum5, sum3 * sum5);
		System.out.printf("%d - %d = %d\n", 
				sum3, sum5, sum3 - sum5);
		System.out.printf("%d ÷ %d = %d\n", 
				sum3, sum5, sum3 / sum5);

	}

}
