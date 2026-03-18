package day02;

public class Exam01 {

	public static void main(String[] args) {
		// 카페에 제출
		/* 국어, 영어, 수학 점수를 변수로 선언 => 값을 저장
		 * 합계와 평균을 출력
		 * 평균에 소수점은 표시
		 * 조건 선택 연산자를 이용하여
		 * 평균이 80점 이상이면 합격, 아니면 불합격 출력
		 * */
		int kor = 0;
		int eng = 0;
		int math = 0;
		System.out.println("합계 : " + (kor + eng + math));
		System.out.println("평균 : " + (double)(kor + eng + math)/3);
		int ave = (kor + eng + math)/3;
		System.out.println(ave >= 80 ? "합격" : "불합격");
		
		if (ave >= 80) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println("----------------------------------");
		// 평균이 80이상이면 합격, 60이상이면 통과, 60미만이면 불합격
		
		if (ave >= 80) {
			System.out.println("합격");
		} else if (ave >= 60) {
			System.out.println("통과");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println("-------------------------------------");
		
		// 평균 100 <= ave <= 0
		// 평균이 100보다 크거나, 0보다 작으면 오류
		if (ave > 100 || ave < 0) {
			System.out.println("오류");
		} else if (ave >= 80) {
			System.out.println("합격");
		} else if (ave >= 60) {
			System.out.println("통과");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println("-------------------------------------");
		
		if (ave > 100 || ave < 0) {
			System.out.println("오류"); 
		} else {
			if (ave >= 80) {
				System.out.println("합격");
			} else if (ave >= 60) {
				System.out.println("통과");
			} else {
				System.out.println("불합격");
			}
		}
	}
}
