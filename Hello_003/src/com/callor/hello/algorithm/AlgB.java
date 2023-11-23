package com.callor.hello.algorithm;

public class AlgB {
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 40;
		boolean bYes = false;
		
		bYes = num1 == num2; //f
		bYes = num1 >= num2; //f
		bYes = num1 <= num2; //t
		bYes = num1 != num2; //t
		
		bYes = num1 > num2; //f
		bYes = num1 < num2; //f
		// =================
		
		num1 = 30;
		num2 = 30;		
		bYes = num1 == num2; //t
		bYes = num1 >= num2; //t
		bYes = num1 <= num2; //t
		bYes = num1 != num2; //f
		
		bYes = num1 > num2; //f
		bYes = num1 < num2; //f
		
	}

}
