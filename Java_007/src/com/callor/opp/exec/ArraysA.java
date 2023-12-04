package com.callor.opp.exec;

public class ArraysA {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}

		/*
		 * forEach(확장 for 반복문) nums 배열을 쫙 펼쳐 놓고, 0번 index의 값부터 순서대로 num 변수에 할당하고, {} 내부의
		 * 코드를 실행한다.
		 */
		for (int num : nums) {
			System.out.printf("%d  ", num);
		}
		
		// 오름차순으로 정렬하기 
		for (int i = 0; i < nums.length; i++) {
			// i 가 0일때 j: 1 ~ length
			// i 가 1일때 j: 2 ~ length
			// i 가 2일때 j: 3 ~ length
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					// 배열 i 번째 값과 j 번째 값을 비교하여
					// i 번째 값이 크면 서로 교환하기
					int _temp = nums[i];
					nums[i] = nums[j];
					nums[j] = _temp;
				}
			}
		} // end for i
		// 이렇게도 쓸수있다
		for (int i = 0 ; i < nums.length ; i++) {
			for(int j = 0; j < nums.length ; j++) {
				if(nums[i] > nums[j]) {
					// 숫자 배열의 저장된 요소를 서로 교환하기
					nums[i] = nums[i] + nums[j];
					nums[j] = nums[i] - nums[j];
					nums[i] = nums[i] - nums[j];
				}
			}
		}
		System.out.println();
		for(int num : nums) {
			System.out.printf("%d ", num);
		}
	}
}
