package com.callor.hello.method;

public class MethodI {
//내가한거
	public static int isPrime(int num) {
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				return 0; // 소수가 아니다
			}
		}
		return num; // 소수이다
	}

	public static void main(String[] args) {
		int num = 0;
		int sum =+ num;
		for (int i = 0; i < 5; i++) {
			num = (int) (Math.random() * 100) + 1;
			int index = isPrime(num);
			if (index > 0) {
				System.out.printf("%3d 는 소수임\n", num);
			} else {
				System.out.printf("%3d 는 소수가 아님\n", num);
			}
		}
		System.out.printf("소수의 합 : %d\n", sum);
	}

}
