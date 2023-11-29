package com.callor.arrays;
/*
 * 매직스트링(코드에서)
 * 어떤 값을(숫자, 문자열등)을 literal 방식으로 바로 코딩하는 것
 * 예를 들어 int[]nums = new int[10]; 이라는 코드에서
 * 10 이라는 값을 매직 스트링 이라고 한다
 * 매직스트링이 코드에서 2번 이상 등장하면 변수로 선언하여
 * 사용하는 것이 좋다
 * 매직스트링이 있는 코드는 코드를 변경(업그레이드, 기능수정)할 때
 * 오류를 일으킬 확률이 매우 높다
 * 좋은 코드는 매직스트링 가급적 안쓰는 것
 */

public class ArraysAC {
	public static void main(String[] args) {
		
		// 매직스트링 대신 변수를 선언하여 사용하기
		int arrayLength = 10;
		int searchVar = 80;

		int[] nums = new int[arrayLength];
		
		/*
		 * Java 에서 배열을 생성(new..) 하면 자동으로 .length 라는
		 * 변수가 배열 내부에 부착된다
		 * 배열.length 라는 변수를 활용하여 배열의 전체 개수를 알수 있다
		 */
		for (int i = 0; i < nums.length; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			nums[i] = rndNum;
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > searchVar) {
				System.out.printf(" index %d번째 요소 값 : %d\n ", i, nums[i]);
				break;
			}
		}
	}
}
