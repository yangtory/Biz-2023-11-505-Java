package com.callor.hello.prime;

public class PrimeC {
	public static void main(String[] args) {
		int num = 9;
		System.out.println("=======================");
		System.out.println(num + " 는 Prime Number 인가?");
		System.out.println("-----------------------");
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				System.out.printf("%d MOD %d = %d, ", num, index, num % index);
				System.out.println(num + " 는 소수가 아님");
			} else {
				System.out.println(num + " 는 소수임");
				break;
			}
		}
		System.out.println("=======================");
	}

}
