package com.callor.oop.input;

public class InputA {
	
	public static void main(String[] args) {
		
		// String nation = "";
		String nation1 = new String();
		
		// String nation2 = "대한민국";
		
		/*
		 * String class 에 정의된(선언된) substring() 이라는 method 를 
		 * 사용하기 위하여 String class 사용하여 nation2 라는 객체(object) 를
		 * 생성하고 nation2 객체를 통하여(.) substring() method 를 호출하였다
		 */
		String nation2 = new String("대한민국");
		String result = nation2.substring(1,2);
		System.out.println(result);
		
		String subStr = "우리나라만세 대한민국".substring(3,4); // 스트링은 이렇게도 쓸수 있음
		
		//여러기능을 추가한 클래스(대문자로하면 클래스 됨)
		int num1 = 30;
		Integer num2 = 30;
		
		long num3 = 0;
		Long num4 = 0l;
		
		float num5 = 0;
		Float num6 = 0f;
		
		double num7 = 0;
		Double num8 = 0d;
		
		String strNum2 = num2.toString();
		
	}

}
