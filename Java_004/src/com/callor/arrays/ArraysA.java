package com.callor.arrays;

public class ArraysA {
	public static void main(String[] args) {
		
		// 변수 10개 생성
		int[] nums = new int[10];

		// 랜덤수 10개 생성
		for (int index = 0; index < 10; index++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			nums[index] = rndNum;
		}

		// 80보다 큰값이 최초로 나타나는 index와 배열 찾기
		for (int i = 0; i < 10; i++) {
			if (nums[i] > 80) {
				System.out.printf(" index %d 번째 요소의 값 : %d", i, nums[i]);
				break;
			}
		}
	}
}
