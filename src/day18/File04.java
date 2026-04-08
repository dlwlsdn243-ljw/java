package day18;

import java.io.FileWriter;
import java.io.IOException;

public class File04 {

	public static void main(String[] args) throws IOException {
		// 경로를 안적으면 상대경로 (내 프로젝트 내부 생성)
		// 경로로 생성 => D:\java_260403_ljw\memo
		
		String fileName = "D:\\java_260403_ljw\\memo\\test1.txt";
		// 파일 이름 => 드라이브로부터의 경로 + 파일명 + 확장자
		
		FileWriter fw = new FileWriter(fileName);
		
		for (int i=1; i<=10; i++) {
			String data = i+". test\n";
			fw.write(data);
		}
		
		fw.close();

	}

}
