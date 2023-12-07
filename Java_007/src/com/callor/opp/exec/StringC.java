package com.callor.opp.exec;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import com.callor.opp.service.ScoreService;
import com.callor.opp.utils.Line;

public class StringC {
	
	public static void main(String[] args) {
		
		String dataFile ="src/com/callor/opp/exec/data.txt";
		Scanner scan = null; //선언만하기
		InputStream is = null;
		
		/*
		 * ...data.txt 파일을 읽어서 무언가 처리를 하려고 한다
		 * Java 에서 파일을 읽어서 무언가 처리를 하려면
		 * 먼저 파일을 open 해야 한다
		 * 이때 파일을 open 하는 도구 중에 FileInputStream() 이라는
		 * 도구를 사용할 것이다
		 * 
		 * 그런데, 파일을 open 하는 과정에서 어떠한 이유로든지
		 * open 하고자 하는 파일이 없을 수 있다. 갑자기 사라질수 있다.
		 * 때문에 Java 에서는 파일을 open 하는 명령(도구)를 사용하는
		 * 코드에서는 반드시 try...catch 를 사용하여
		 * exception 예방을 하도록 강제 하고 있다. 
		 */
		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //fileinputstream 을 이용해서 데이터 파일을 연다, 밑줄생기는데 익셉션 잡으라는뜻, 반드시 trycatch 해야댐
		
		// open 한 data.txt 파일에 대한 정보(연결)을 Scanner 와
		// 연결 해주기
		scan = new Scanner(is);
		while(scan.hasNext()) { // 또 읽을거 잇냐고 묻는거
			String line = scan.nextLine();
			String[]result = line.split(",");
			for(int i = 1 ; i < result.length ; i++) {
				System.out.println(result[i]);
			}
			
			int[] sum = new int[result.length]; 
			int i = 0;
			for(i = 1 ; i < result.length ; i++) {
				sum[i] += Integer.valueOf(result[i]);
			}
			System.out.println(sum[i]);
//			System.out.println(line); // 한줄 실행할때 마다 데이터를 가져옴
		}// end while
		scan.close(); //파일에서는 클로즈 해주는것이 좋다.
	}

}
