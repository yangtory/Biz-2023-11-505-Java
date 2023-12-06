//package com.project.blackjack.service;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import com.project.blackjack.model.BlackjackDto;
//
//public class BlackjackService {
//
//	private Scanner scan = null;
//	private List<BlackjackDto> cards = null;
//
//	public BlackjackService() {
//		String dataFile = "src/com/project/blackjack/service/pattern.txt";
//		InputStream is = null;
//		
//		try {
//			is = new FileInputStream(dataFile);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		
//		scan = new Scanner(is);
//		cards = new ArrayList<>();
//	} // end 생성자
	
//	public void loadCard() {
//		while(scan.hasNext()) {
//			String line = scan.nextLine();
//			String[] lines = line.split(",");
//			BlackjackDto blackjackDto = new BlackjackDto();
//				blackjackDto.cardA = lines[0];
//				blackjackDto.card2 = lines[1];
//				blackjackDto.card3 = lines[2];
//				blackjackDto.card4 = lines[3];
//				blackjackDto.card5 = lines[4];
//				blackjackDto.card6 = lines[5];
//				blackjackDto.card7 = lines[6];
//				blackjackDto.card8 = lines[7];
//				blackjackDto.card9 = lines[8];
//				blackjackDto.card10 = lines[9];
//				blackjackDto.cardJ = lines[10];
//				blackjackDto.cardQ = lines[11];
//				blackjackDto.cardK = lines[12];
//			cards.add(blackjackDto);
//		}// end while
//	}// end loadCard
	
//	public void printBlackjack() {
//		for(int i = 0; i < cards.size(); i++) {
//			BlackjackDto blackjackDto = cards.get(i);
//			System.out.printf("%s ", blackjackDto.cardA);
//			System.out.printf("%s ", blackjackDto.card2);
//			System.out.printf("%s ", blackjackDto.card3);
//			System.out.printf("%s ", blackjackDto.card4);
//			System.out.printf("%s ", blackjackDto.card5);
//			System.out.printf("%s ", blackjackDto.card6);
//			System.out.printf("%s ", blackjackDto.card7);
//			System.out.printf("%s ", blackjackDto.card8);
//			System.out.printf("%s ", blackjackDto.card9);
//			System.out.printf("%s ", blackjackDto.card10);
//			System.out.printf("%s ", blackjackDto.cardJ);
//			System.out.printf("%s ", blackjackDto.cardQ);
//			System.out.printf("%s\n", blackjackDto.cardK);
//		}
//	}
//}
