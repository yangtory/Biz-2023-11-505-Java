package com.callor.hello.var;

public class VarCB {

	public static void main(String[] args) {
		// 이렇게 할수 있는데 좋은 코드는 아님

		// 선언하는 곳
		int scoreKor = 90;
		int scoreEng = 80;
		int scoreMath = 70;

		int total = scoreKor + scoreEng + scoreMath;
		int avg = total / 3;

		// 출력하는 부분
		System.out.println("===========");
		System.out.println("성적표");
		System.out.println("===========");
		System.out.println("국어 : " + scoreKor);
		System.out.println("영어 : " + scoreEng);
		System.out.println("수학 : " + scoreMath);
		System.out.println("-----------");
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("===========");

	}

}
