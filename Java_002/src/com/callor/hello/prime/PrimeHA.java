package com.callor.hello.prime;

public class PrimeHA {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			int num = i + 1; // i 값은 1~99 까지 인데,
								// 2~100 까지로 변환
			int index = 0;
			for (index = 2; index < num; index++) {
				if (num % index == 0) {
					break;
				}
			} // end 소수 검사
			if (index < num) {
				// prime이 아니다
			} else {
//				System.out.println(num + "는 소수");
				sum += num;
			}
		} // end for 전체
		System.out.printf("2 ~ 100 까지 수 중 소수들의 합 : %d \n",sum);
		// 불안정한 코드
		/*
		 * if(index == num ) { System.out.println(num + "는 소수"); } 
		 * 이게 더 안전 if(index
		 * >= num){ system.out.prinln(num+"는소수");
		 */
	}

}
