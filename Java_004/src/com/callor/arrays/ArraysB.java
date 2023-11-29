package com.callor.arrays;

public class ArraysB {
	
	public static void main(String[] args) {
	
		int arrayLength = 10;
		
		//10명 국어점수 저장 할 배열
		int[]scoreKors = new int[arrayLength];
		
		// 51~100까지 범위의 임의 점수 10개 생성
		for(int i = 0 ; i <scoreKors.length ; i++) {
			int rndScor = (int)(Math.random() *50) + 51;
			scoreKors[i] = rndScor;
//			System.out.println(rndScor);
		}
		
		// 배열에 저장된 전체 요소의 총점과 평균 출력
		int sum  = 0;
		for(int i = 0 ; i < scoreKors.length ; i++) {
			sum += scoreKors[i];
		}
		
		int avg = 0; //float으로 해야댐
		for(int i = 0 ; i < scoreKors.length ; i++) {
			sum += scoreKors[i];
			avg = sum / arrayLength;
		}
		
		System.out.println("=====================================");
		System.out.printf(" 국어 점수 총점 : %d, 평균 : %.2f\n", sum, (double)avg); 
		System.out.println("=====================================");
	}

}
