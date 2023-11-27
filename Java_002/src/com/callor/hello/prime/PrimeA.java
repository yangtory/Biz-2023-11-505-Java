package com.callor.hello.prime;

public class PrimeA {
	public static void main(String[] args) {
		// 내가 한거
		int prime = 9;
		System.out.println("=======================");
		System.out.println(prime + " 는 Prime Number 인가?");
		System.out.println("-----------------------");
		
		// int i = 1로 하지 않고 2부터 시작하면 num은 안만들어도 됨
		for(int i = 1 ; i < (prime-1) ; i++) {
			int num = (i+1);
		// printf 사용하기, %는 MOD 로 적으면 사용할수 있음
			System.out.println(prime +" MOD "+ num + " = " + (prime % num));
		}
		
		System.out.println("=======================");
	}

}
