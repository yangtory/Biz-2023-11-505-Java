package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import com.callor.score.model.ScoreDto;
import com.callor.score.utils.Line;

public class ScoreServiceB {
	
	// 클래스 영역에 있는 변수들은 private를 한다, Dto에 있는 친구들은 public,private 도 씀
	private Scanner scan = null;
	private List<ScoreDto>scores = null; // 자바에서 제공하는 배열이랑 닮은 도구, list 타입의 ScoreDto이다
//	private List<Integer> nums = null; //int ㄴㄴ Integer, long ㄴㄴ L , float ㄴㄴ F
	/*
	 * ScoreServiceB 클래스의 생성자 method
	 * 어떤 도구들을 (미리)준비하는 일을 수행한다
	 * 파일을 매개변수로 , 파일을 전달 받겟다
	 */
	public ScoreServiceB(String dataFile) { // 비어있는 부분에 ctrl+space 누름 자동으로 생성자 method 만들어줌
//		String dataFile = "";
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		scan = new Scanner(is);
		/*
		 * item(요소) 개수가 0인 상태의 List 가 준비된다
		 */
		scores = new ArrayList<>(); // <> 안에는 Integer가 생략돼잇다, 필요에 따라 도구를 바꿀수 있다
//		scores = new LinkedList<>();
//		scores = new Vector<>();
	}// end 생성자
	
	public void loadScores() {
		while(scan.hasNext()) {
			String line = scan.nextLine();
//			System.out.println(line);
			
			String[]lines = line.split(",");
			ScoreDto scoreDto = new ScoreDto();
			
			try { // 데이터 오류가 있을 경우
				scoreDto.stdNum = lines[0];
				
				scoreDto.kor = Integer.valueOf(lines[1]);
				scoreDto.eng = Integer.valueOf(lines[2]);
				scoreDto.math = Integer.valueOf(lines[3]);
				scoreDto.music = Integer.valueOf(lines[4]);
				scoreDto.art = Integer.valueOf(lines[5]);
				scoreDto.sw = Integer.valueOf(lines[6]);
				scoreDto.db = Integer.valueOf(lines[7]);				
			} catch (Exception e) { 
				System.out.println("데이터 읽는 중 오류 발생");
				System.out.println(line);
				break;
			}
			
			// List type 의 데이터 목록에
			// ScoreDto 요소를 추가하기
			// List type 의 데이터 맨 끝에 추가된다. Dto 요소가 하나씩 추가된다
			scores.add(scoreDto); 
			
		} // end while 
		
	}// end loadScore()
	
	public void countScore() {
		System.out.println(scores.size()); // list의 length 역할 - size()
	}
	
	public void printScore() {
		Line.dLine(100);
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		Line.sLine(100);
		for(int i = 0 ; i < scores.size() ; i++) { // list의 length 는 size()
			ScoreDto scoreDto = scores.get(i); // 너가 가지고 있는 요소중 i번째 줘
			System.out.printf("%s\t", scoreDto.stdNum);
			System.out.printf("%d\t", scoreDto.kor);
			System.out.printf("%d\t", scoreDto.eng);
			System.out.printf("%d\t", scoreDto.math);
			
			System.out.printf("%d\t", scoreDto.getTotal());
			System.out.printf("%5.2f\n", scoreDto.getAvg());
		}
	}
}
