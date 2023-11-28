package com.callor.hello.prime;

public class PrimeGA {

	public static void main(String[] args) {
// 선생님이 한거
		for (int i = 1; i < 100; i++) {
			int index = 0;
			int num = i + 1; //for문에 +1 하는것보다 변수만들어서 하는게 안전함
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			}
			if (index >= num) {
				System.out.printf("%d 는 소수임\n", num);
			}
		}

	}
}
