package com.callor.student.exec;
// 배열 복습
public class ArraysA {
	
	public static void main(String[] args) {
		String[] nation =  new String [3];
		
		nation[0] = "대한민국";
		nation[1] = "Korea";
		nation[2] = "Republic of Korea";
		
		// 배열의 요소에 저장될 값이 정해져 있을때
		// 배열 요소를 지정하여 배열 생성하기
		String[] nation2 = {"대한민국","우리나라","Korea"};
		String[] nation3 = new String[] {"A","B","C"};
		
		int[] age = {10,20,30,40,50,60,70};
		System.out.println(age.length);
		
	}

}
