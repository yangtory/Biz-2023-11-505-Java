package com.callor.hello.prime;

public class PrimeGA {

	public static void main(String[] args) {
// 선생님이 한거
		for (int num = 2; num < 100; num++) {
			int index = 0;
			for (index = 2; index < num + 1; index++) {
				if ((num + 1) % index == 0) {
					break;
				}
			}
			if(index >= num) {
			System.out.printf("%d 는 소수임\n", num);
		}
		}
		
	}
}
