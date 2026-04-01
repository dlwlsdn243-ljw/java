package day10;

import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// 성적표
		/* 성적산출인원 > 3(입력)
		 * 이름	국어	영어	수학	합계	평균	등수 \t
		 * hoog	89	85	78	00	00	00
		 * kim	89	85	78	00	00	00
		 * lee	89	85	78	00	00	00
		 * 
		 * 이름, 국어, 영어, 수학을 입력받아 합계, 평균, 등수
		 * */
		// 객체의 값을 입력받아 객체 생성 후 배열에 저장
		// 등수 구한 후 => 출력
		
		// Report[] => 여러학생의 점수를 보관 => 등수 => 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적산출인원>");
		int count = scan.nextInt();
		
		Report[] report = new Report[count];
		
//		Report r = new Report("홍길동", 78, 58, 96);
//		report[0] = new Report("홍길동", 78, 58, 96);
//		report[1] = new Report("김영희", 78, 58, 96);
//		report[2] = new Report("박철수", 78, 58, 96);
		
		for (int i=0; i<count; i++) {
			System.out.println((i+1) + ") 이름, 국어, 영어, 수학 순으로 입력");
			String name = scan.next();
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			Report r = new Report(name, kor, eng, math); // sum, avg
			report[i] = r;
		}
		
		// 순위
		for (int i=0; i<count; i++) {
			int rank = 1;
			for (int j=0; j<count; j++) {
				if (report[i].getAvg() < report[j].getAvg()) {
					rank++;
				}
			}
		}
		
		// 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("-------------------------------------");
		for (Report r : report) {
			System.out.println(r); //  toString  호출
		}
		
		Report re = new Report();
		
		
		
		
		scan.close();
	}

}
