package com.callor.hello.arrays;

public class ArraysE {
	
	public static void main(String[] args) {
		//10개 선
		int[]nums = new int[10];
		
		// 랜덤수 10개 만들기 
		for(int i = 0 ; i < 10 ; i++) {
			nums[i] = (int)(Math.random() * 50) + 51 ; 
		}
		
		// 80 이상의 수 출력 
		for(int i = 0 ; i < 10 ; i++) {
			if(nums[i] > 80) {
				System.out.printf("index %d 번 요소의 값 : %d\n", 
								i+1, nums[i]);
			}
		}
		
	}
}
