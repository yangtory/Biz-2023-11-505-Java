package com.callor.hello.method;

public class MethodHA {
	//선생님이 한거
	public static boolean isPrime(int num) {
		for(int i = 2 ; i < num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("=============================");
		System.out.println("소수 판별하기");
		System.out.println("-----------------------------");
		for(int i = 0 ; i < 5 ; i ++) {
			int num = (int)(Math.random()*100)+2;
			boolean isPrime = isPrime(num); //왼쪽은 함수, 오른쪽은 메서드 자바에선 같은 이름 써도됨
			if(isPrime) {
				System.out.println(num + " 는 소수");
			} else {
				System.out.println(num + " 는 소수가 아님");
			}
		}
		System.out.println("=============================");
	}

}
