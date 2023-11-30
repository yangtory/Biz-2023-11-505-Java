package com.callor.oop.var;

public class StringA {
	
	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 30;
		System.out.println(num1 == num2);
		
		String str1 = "대한민국";
		String str2 = "대한민국";
		System.out.println(str1 == str2);
		
		String str3 = new String("우리나라");
		String str4 = new String("우리나라");
		System.out.println(str3 == str4); //문자열은 ==로 같냐고 물어보면 안댐
		
		System.out.println(str3.equals(str4)); //문자열이 같은지 비교하는 함수 (비밀번호
		System.out.println(str3.equalsIgnoreCase(str4)); // 비교는 하는데 대소문자 구분 ㄴㄴ (아이디
	}

}
