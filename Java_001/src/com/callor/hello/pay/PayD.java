package com.callor.hello.pay;

public class PayD {
	public static void main(String[] args) {
		
		int pay = 3587960;
		
		int note50000 = pay / 50000;
		pay = pay % 50000;
		
		int note10000 = pay / 10000;
		pay = pay % 10000;
		
		int note5000 = pay / 5000;
		pay = pay % 5000;
		
		System.out.println("==================");
		System.out.println("5 만원권 : " + note50000);
		System.out.println("1 만원권 : " + note10000);
		System.out.println("5 천원권 : " + note5000);
	}

}
