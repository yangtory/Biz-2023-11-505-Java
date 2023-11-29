package com.callor.arrays;

public class ArraysC {
	
	public static void main(String[] args) {
		
		System.out.println("=".repeat(50));
		System.out.println("샛별반 국어 점수");
		System.out.println("-".repeat(50));
		
		// 10명의 학생 만들기
		int STUDENT_LENGTH = 10;
		int[]scoreKors = new int [STUDENT_LENGTH];
		
		// 학생들 점수 만들기
		for(int i = 0; i < scoreKors.length; i++) {
			int rndScor = (int)(Math.random() *50)+51;
			scoreKors[i]= rndScor;
			System.out.printf("%2d 번 : %2d\n", i+1, scoreKors[i]);
		}
		
		//총점
		int sum = 0;
		for(int i = 0 ; i < scoreKors.length ; i++) {
			sum += scoreKors[i];
		}
		
		// 평균 실수로 선언하기
		float avg = 0;
		for(int i = 0 ; i < STUDENT_LENGTH ; i++) {
			avg= (float)sum / scoreKors.length;
		}
		
		// 평균 2자리 까지
		System.out.println("-".repeat(50));
		System.out.printf(" 총점 : %d , 평균 : %.2f\n", sum, avg);
		System.out.println("=".repeat(50));
	}
}
