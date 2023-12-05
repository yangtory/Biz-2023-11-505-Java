package com.callor.score.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.StudentDto;
import com.callor.score.utils.Line;

public class StudentService {

	private Scanner scan = null;
	private List<StudentDto> students = null;

	public StudentService() {
		String dataFile = "src/com/callor/score/service/student.txt";
		InputStream is = null;

		try {
			is = new FileInputStream(dataFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		scan = new Scanner(is);
		students = new ArrayList<>();

	}// end 생성자

	public void loadStudents() {
		while (scan.hasNext()) {
			String line = scan.nextLine();
			String[] lines = line.split(",");
			StudentDto studentDto = new StudentDto();

			studentDto.num = lines[0];
			studentDto.name = lines[1];
			studentDto.dept = lines[2];
			studentDto.grade = lines[3];
			studentDto.prof = lines[4];
			studentDto.tel = lines[5];
			studentDto.addr = lines[6];
			students.add(studentDto);
		} // end while
	} // end StudentService

	public void printStudents() {
		Line.dLine(100);
		System.out.println("학번\t이름\t\t학과\t\t학년\t교수\t\t번호\t\t주소");
		Line.sLine(100);

		for (int i = 0; i < students.size(); i++) {
			StudentDto studentDto = students.get(i);
			System.out.printf("%5s\t", studentDto.num);
			System.out.printf("%5s\t", studentDto.name);
			System.out.printf("%5s\t", studentDto.dept);
			System.out.printf("%5s\t", studentDto.grade);
			System.out.printf("%5s\t", studentDto.prof);
			System.out.printf("%5s\t", studentDto.tel);
			System.out.printf("%5s\n", studentDto.addr);
		}
	}

}
