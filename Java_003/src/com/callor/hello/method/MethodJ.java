package com.callor.hello.method;

public class MethodJ {
	
	public static boolean isEven(int num) {
			if(num % 2 == 0) {
				return true;
			}
		return false;
	}
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 5 ; i++) {
			int num = (int)(Math.random() * 100) + 2;
			boolean result = isEven(num); // isEven이 boolean인데 내가 int 썻었음
			if(result == true) {
				System.out.printf("%3d는 짝수이다\n", num);
			}else {
				System.out.printf("%3d는 짝수가 아니다\n", num);
			}
		}
	}
}
