package com.callor.hello.method;

public class MethodH {

	public static boolean isPrime(int num) {
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("===========================");
		System.out.println("소수 판별하기");
		System.out.println("---------------------------");
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.random() * 200) + 2;
			boolean isPrime = isPrime(num);
			if (isPrime) {
				System.out.printf(" %3d 는 소수임\n", num);
			} else {
				System.out.printf(" %3d 는 소수가 아님\n", num);
			}
		}
		System.out.println("===========================");
	}

}
