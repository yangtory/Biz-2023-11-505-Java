package com.callor.hello.arrays;

public class ArraysD {
	
	public static void main(String[] args) {
		// 상자 10개 만들
		int nums[] = new int[10];
		
		// 랜덤 수 10개 생성 후 어레이에 할당 
		for (int index = 0; index < 10 ; index++) {
			nums[index] = (int)(Math.random() * 50) + 51;
		}
		
		// 짝수는요?
		for(int i = 0 ; i < 10 ; i++) {
				if(nums[i] % 2 == 0) {
					System.out.printf("index %d 번 요소 값 : %d\n",
							i+1, nums[i]);
				}
			}
		// 합계는요?
		int sum = 0;
		for(int i = 0; i < 10 ; i++) {
			if(nums[i] % 2 == 0) {
			sum += nums[i];
			}
		}
		System.out.println(sum);				
	} 
}

		
