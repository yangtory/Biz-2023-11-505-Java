package com.callor.hello.algorithm;

public class LoopH {
	public static void main(String[] args) {
		
		for(int i = 0 ; i < 30 ; i++) {
			if(i % 2 == 0) {
				System.out.print(i+2 +" ");
			}
		}
		// 선생님이 하신거
		for(int i = 0 ; i < 30 ; i++) {
			int num = i+1;
			if(num % 2 == 0) {
				System.out.printf("%d ",num);
			}
			
		}
	
	}

}
