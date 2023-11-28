package com.callor.hello.method;

public class MethodE {
	// 컵라면 사오기 못푼거
	public static int buy(int money) {
		int cup = 1500;
		return money - cup ;
	}
	
	public static void main(String[] args) {
		int myMoney = 2000; 
		int change = buy(myMoney);
		System.out.printf("전달한 값 %d, 잔액 : %d\n ", myMoney, change);
		
	}

}
