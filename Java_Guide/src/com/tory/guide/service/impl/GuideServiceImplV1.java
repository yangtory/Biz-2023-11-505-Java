package com.tory.guide.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tory.guide.model.GuideDto;
import com.tory.guide.service.GuideService;
import com.tory.guide.utils.Line;

public class GuideServiceImplV1 implements GuideService {

	List<GuideDto> guideList = null;
	String dataFile = "";

	public GuideServiceImplV1() {
		guideList = new ArrayList<GuideDto>();
		dataFile = "src/guide.txt";
	}

	@Override
	public void loadGuide() {
		Scanner fileRead = null;
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileRead = new Scanner(is);
		while (fileRead.hasNext()) {
			String line = fileRead.nextLine();
			String[] lines = line.split(",");
			GuideDto dto = new GuideDto();
			dto.id = lines[0];
			dto.list = lines[1];
			dto.num = lines[2];
			dto.guide = lines[3];
			guideList.add(dto);
		} // end while
		fileRead.close();
	}

	@Override
	public void printGuideList() {
//		this.loadGuide();
		Line.dLine(100);
		System.out.println("id\t종목명\t\t\t\t순서\t\t방법");
		for(int i = 1 ; i < guideList.size() ; i++) {
			if(!guideList.get(i-1).id.equals(guideList.get(i).id)) {
				Line.sLine(100);
			}
			GuideDto dto = guideList.get(i);
			System.out.printf("%s\t", dto.id);
			System.out.printf("%s\t\t\t", dto.list);
			System.out.printf("%s 회\t\t", dto.num);
			System.out.printf("%s\n", dto.guide);
		}//end for
		Line.dLine(100);
	}
}
