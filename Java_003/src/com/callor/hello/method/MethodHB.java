package com.callor.hello.method;

public class MethodHB {
	
	/*
	 * 정수 1개를 매개변수를 통하여 전달받고
	 * 정수가 prime 인지 검사한다
	 * 만약 prime 이면 정수 0을 return 하고
	 * 아니면 index 값을 return 한다
	 */
	
	public static int isPrime(int num) {
		for(int index = 2 ; index < num ; index++) {
			if ( num % index == 0) {
				return index; // 소수가 아님
			}
		}
		return 0; //소수
	}

	public static void main(String[] args) {
		
		System.out.println("==================");
		System.out.println("소수 판별하기");
		System.out.println("------------------");
		for (int i = 0 ; i < 5 ; i++) {
			int num = (int)(Math.random()*100)+2;
			int index = isPrime(num);
			if(index > 0) {
				System.out.printf("%d MOD %d = %d",
							num, index, num % index);
				System.out.printf("%3d 는 소수가 아님\n", num);
			} else {
				System.out.printf("%3d 는 소수다\n", num);
			}
		}
		System.out.println("==================");
	}
}
