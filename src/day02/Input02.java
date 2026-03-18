package day02;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 입력받아 
		// 합계와 평균 pass 여부를 출력
		// pass 여부는 평균이 80이상이면 합격, 불합격
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("국어점수를 입력해 주세요.");
		int kor = scan.nextInt();
		if (kor < 0 || kor > 100) {
			System.out.println("잘못된 값입니다.");
			return;
		}
		System.out.println("영어점수를 입력해 주세요.");
		int eng = scan.nextInt();
		if (eng < 0 || eng > 100) {
			System.out.println("잘못된 값입니다.");
			return;
		}
		System.out.println("수학점수를 입력해 주세요.");
		int math = scan.nextInt();
		if (math < 0 || math > 100) {
			System.out.println("잘못된 값입니다.");
			return;
		}
		
		int sum = kor + eng + math;
		double ave = sum / (double)3;
		
		// 국어, 영어, 수학의 값이 0보다 작거나, 100보다 크면
		// 잘못된 점수입니다.
		
//		if ((kor < 0 || kor > 100) || (eng < 0 || eng > 100) || math < 0 || math > 100)
//			System.out.println("잘못된 점수입니다.");
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ave);

		if (ave >= 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		scan.close();
	}
}
