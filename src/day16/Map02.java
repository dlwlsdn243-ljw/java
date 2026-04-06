package day16;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 과목, 점수를 입력받아 map 저장 
		// 종료 키워드가 나올 때까지 반복 (1=계속, 0=종료)
		// 과목: 점수  / 합계 / 평균
		HashMap<String, Integer> map = new HashMap<>();
		
		Scanner scan =  new Scanner(System.in);
		
		int num = 1;
		int sum = 0;
		
		while(num != 0) {
			System.out.println("과목 / 점수 >");
			
			try {
				
				String subject = scan.next();
				int score = scan.nextInt();
				
				map.put(subject, score); // map에 추가
				
				System.out.println("1=계속 / 0=종료");
				num = scan.nextInt();
				
			} catch (Exception e) {
				System.out.println("입력값이 잘못되었습니다.");
				scan.nextLine();  //입력버퍼 비우기
			}

		}
		
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
			sum += map.get(key);
		}
		
		System.out.println("합계:"+sum+" / "
				+ "평균:"+(sum / (double)map.size()));
		
		scan.close();

	}

}