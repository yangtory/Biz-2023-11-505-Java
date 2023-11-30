package com.callor.oop.input;

import java.io.InputStream;
import java.util.Scanner;

public class InputB {
	
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in); //혼자 작동 못함 ()안에 연결해줘야댐
		
		InputStream in = System.in; //인풋 스트림은 키보드, system.in 은 키보드를 나타내는 변수
		Scanner scan2 = new Scanner(in);
		
		/*
		 * Scanner.nextLine()
		 * 키보드로 부터 문자열 + Enter 가 입력될때까지 마냥 기다리는 method()
		 * Scanner.nextLine() 명령이 실행되면 코드는 Blocking 상태가 된다
		 * 마냥 Waiting 하는 상태가 된다
		 * 
		 * Scanner.nextLine() 코드 이전에 반드시
		 * 사용자에게 prompt 를 보여주어야 한다.
		 */
		
		System.out.print("문자열을 입력 >> "); // 프롬프트를 보여주자
		String str = scan1.nextLine(); //키보드로 무언가를 입력하고 엔터를 누를때까지 기다리는 상태 =blocking,waiting
		System.out.println("nextLine() 이 return 한 문자열 : " + str); // 그래야 다음 코드 실행됨
		
	}

}
