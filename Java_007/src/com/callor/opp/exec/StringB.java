package com.callor.opp.exec;

public class StringB {
	// 다음과 같은 문자열 변수 선언
	// String nums = "50,88,70,100,98"
	// nums 문자열 변수에 저장된 값을 , 를 기준으로 잘라서 문자열 배열에 저장
	// 문자열 배열에 있는 숫자를 정수로 변환
	// 정수들의 합을 계산하여 출력
	
	public static void main(String[] args) {
		String nums = "50,88,70,100,98";
		String[] result = nums.split(",");
		
		int sum = 0;
		
		for(int i = 0 ; i < result.length ; i++) {
			sum += Integer.valueOf(result[i]); // 이거 못했음
			System.out.println(result[i]); // 나눠서 나열하기
		}
		System.out.println(sum);
	}
}
