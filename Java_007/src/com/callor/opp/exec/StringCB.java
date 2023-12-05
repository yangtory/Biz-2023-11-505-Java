package com.callor.opp.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class StringCB {
	
	public static void main(String[] args) {
	// 선생님이 한거
		String dataFile = "src/com/callor/opp/exec/data.txt";
		InputStream is = null; //선언만 할때는 null 값을 넣는다, trycatch 가 들어가면 애매해져서
		Scanner scan = null;
		
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(dataFile + " 파일을 찾을 수 없습니다");
		}
		scan = new Scanner(is); // is 연결해주기
//		while(true) { // 원래 이렇게 만들어야 함
//			if(scan.hasNext()) {
//				scan.nextLine(); // 한줄씩 출력				
//			}
//		}
		while(scan.hasNext()) {
			String line = scan.nextLine();
//			System.out.println(line);
			String[] scores = line.split(",");
			int scoreTotal = 0;
			for(int index = 1 ; index < scores.length ; index++) {
				scoreTotal += Integer.valueOf(scores[index]);
			}
			System.out.printf("%s 번 총점 : %d\n", scores[0],scoreTotal);
 		}
		
		
	}

}
