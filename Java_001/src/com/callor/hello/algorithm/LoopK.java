package com.callor.hello.algorithm;

public class LoopK {
	public static void main(String[] args) {
		
		int sum = 0;
		int range = 35;
		for(int i = 0 ; i < range ; i++) {
			sum += (i+1);
		}
		System.out.println("============================");
		System.out.printf(" 1 ~ %d 까지 덧셈 결과 : %d", range, sum);
		
	}

}
