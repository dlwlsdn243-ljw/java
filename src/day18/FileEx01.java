package day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FileEx01 {

	public static void main(String[] args){
		// D:\java_260403_ljw\memo\scores.txt
		// 파일을 읽어들여 map저장
		// 명단 출력 / 합계 / 평균 출력
		// 점수가 80점 이상인 학생의 명단 출력 => 인원수 출력
		
		Map<String, Integer> map = new HashMap<>();
		
		final String fileName = "D:\\java_260403_ljw\\memo\\scores.txt";
		
		try {
			BufferedReader br = 
					new BufferedReader(new FileReader(fileName));
			
			while(true) {
				String line = br.readLine(); // 한 라인으로 읽어오기
				if (line == null) {
					break;
				}
				
				String[] strArr = line.split(" "); // 배열로 리턴
				String name = strArr[0];
				int score = Integer.parseInt(strArr[1]);
				
				map.put(name, score);

			}
			
			int sum = 0;
			for(String key : map.keySet()) {
				sum += map.get(key);  // value를 합계
				System.out.println(key+":"+map.get(key));
			}
			
			System.out.println("합계:"+sum+" / "
					+ "평균:"+(sum / (double)map.size()));
			br.close();
			
			System.out.println("--성적우수자--");
			int count = 0;
			for (String key:map.keySet()) {
				if (map.get(key)>=80) {
					count++;
					System.out.println(key+";"+map.get(key));
				}
			}
			System.out.println("성적우수인원 : " + count);
			
		} catch (FileNotFoundException e) { // 파일이 없을경우
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) { // 읽을 값이 없을 경우
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	

}
