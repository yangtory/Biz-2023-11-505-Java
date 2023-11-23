package com.callor.hello.algorithm;

public class AlgF {
	public static void main(String[] args) {
		
		/*
		 * 우리나라 화폐는
		 * 5만, 1만, 5천, 1천, 5백, 1백, 50, 10원 단위이다
		 * 아래 pay 에 저장된 값에서
		 * 각각 화폐단위만큼 몇개씩이 포함되는지 
		 * 출력하시오
		 */
		
		int pay = 3587960;
		int pay1, pay5, pay10, pay50, pay100, pay500, pay1000, pay5000 = 0;
		int box = 0;
		
		pay5000 = pay / 50000;
		box = pay - (pay5000*50000);
		
		pay1000 = box / 10000;
		box = box - (pay1000*10000);
		
		pay500 = box / 5000;
		box = box - (pay500*5000);
		
		pay100 = box / 1000;
		box = box - (pay100*1000);
		
		pay50 = box / 500;
		box = box - (pay50*500);
		
		pay10 = box / 100;
		box = box - (pay50*100);
		
		pay5 = box / 50;
		box = box - (pay5*50);
		
		pay1 = box / 10;
		box = box - (pay1*10);
				
		System.out.println("50,000원권: " + pay5000 + "장");
		System.out.println("10,000원권: " + pay1000 + "장");
		System.out.println("5,000원권: " + pay500 + "장");
		System.out.println("1,000원권: " + pay100 + "장");
		System.out.println("500원: " + pay50 + "개");
		System.out.println("100원: " + pay10 + "개");
		System.out.println("50원: " + pay5 + "개");
		System.out.println("10원: " + pay1 + "개");
	}

}
