package day18;

import java.io.File;

public class File05 {

	public static void main(String[] args) {
		// File 객체 : 드라이브부터 + 경로 + 파일명 + 확장자 => 내용
		// "D:\\java_260403_ljw\\memo\\scores.txt"
		// 파일 구분자 => 운영체제마다 다름 (윈도우, 맥, linux, unix)
		// / \ => File.separator : 파일 구분자 역할
		
		// File 객체를 생성할 때
		File file = new File("D:\\java_260403_ljw");
		file = new File(file, "memo");
		file = new File(file,"scores.txt");
		System.out.println(file.toString());
		System.out.println(file.separator); // 파일 구분자 확인
		
		String driver = "D";
		String folder = "memo";
		String file1 = driver + file.separator + folder;
		System.out.println(file1);
		
		System.out.println(file.getPath()); // 전체 경로
		System.out.println(file.getParent()); // 상위경로만
		System.out.println(file.getName()); // 파일명
	}

}
