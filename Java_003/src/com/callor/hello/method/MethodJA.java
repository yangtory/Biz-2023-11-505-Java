package com.callor.hello.method;

public class MethodJA {
	
	public static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		int num = (int)(Math.random() * 100) +2;
		boolean isEven = isEven(30);
		if(isEven) {
			System.out.println(num + "는 짝수");
		} else {
			System.out.println(num + "는 짝수가 아님");
		}
	}

}
