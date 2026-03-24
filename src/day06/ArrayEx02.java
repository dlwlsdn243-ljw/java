package day06;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => jpg, png
		
		String [] fileName = {
				"이것이 자바다.java", "java의 정석.java", "array.txt",
				"array.java", "String.txt", "StringMethod.jpg",
				"ArrayMethod.png", "method.jpg", "javaMethod.png"
		};
		boolean check = false;
		
		// 파일의 확장자만 추출
		for (int i = 0; i < fileName.length; i++) {
			String suffix = fileName[i].substring(
					fileName[i].lastIndexOf(".") + 1);
//			System.out.println(suffix);
			if (suffix.toLowerCase().equals("jpg") || 
					suffix.toLowerCase().equals("png")) {
				System.out.println(fileName[i]);
				check = true;
			}
		}
		
		// 아직까지 check = false => if 구문을 한번도 못탔다는 의미
		
		if (! check) {
			System.out.println("그림파일이 없습니다.");
		}
		

		
	}

}
