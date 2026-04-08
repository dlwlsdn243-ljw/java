package day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileEx01_1 {

	public static void main(String[] args) throws IOException {
		// D:\web_260316_omr\memo\scores.txt
		// 파일을 읽어들여 map 저장
		// 명단 출력 / 합계 / 평균 출력
		// 점수가 80점 이상인 학생의 명단 출력 => 인원수 출력
		final String FILENAME = "D:\\web_260316_omr\\memo\\scores.txt";
		
		BufferedReader br = new BufferedReader(
				new FileReader(FILENAME));
		
		Map<String, Integer> map = new HashMap<>();
		
		int sum = 0;
		while(true) {
			String line = br.readLine();
			
			if( line == null) {
				break;
			}
			
			// String => substring
//			String name = line.substring(0, line.indexOf(" "));
//			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
//			map.put(name, score);
			
			// split(" ") => 배열로 리턴
			
			String[] str = line.split(" ");
			map.put(str[0], Integer.parseInt(str[1]));
			sum += Integer.parseInt(str[1]);
			
		}
		
		System.out.println("--성적표--");
		for(String key : map.keySet()) {
			System.out.println(key+":"+ map.get(key));
		}
		
		System.out.println("---forEach 사용--");
		map.forEach((k, v) -> System.out.println(k+":"+v));
		
		System.out.println("합계:"+sum +" / 평균:"+((double)sum/map.size()));
		
		System.out.println("--성적우수자--");
		// 80이상인 학생만 출력
		int count = 0;
		for(String key : map.keySet()) {
			if(map.get(key)>=80) {
				count++;
				System.out.println(key+":"+map.get(key));
			}
		}
		
		System.out.println("성적우수인원:"+count);
		
	}

}