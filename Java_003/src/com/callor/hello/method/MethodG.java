package com.callor.hello.method;

public class MethodG {
//내가한거 출력을 못했음
// main 에서 boolean 변수 선언을 못함
	public static boolean isPrime(int num) {
		boolean noPrime = false;
		num = (int) (Math.random() * 100) + 2;
		int index = 0;
		for (index = 2; index < num; index++) {
			if (num % index == 0) {
				noPrime = true;
				break;
			}
		}
		if (noPrime) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 2;
		isPrime(num);
		System.out.printf("%d 는 소수임", isPrime(num));

	}

}
