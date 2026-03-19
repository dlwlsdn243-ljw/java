package day04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 생년을 숫자로 입력받아 어린이(13), 청소년(19), 어른으로 구분
		// 입장료 -어린이 5000원, 청소년 7000원, 어른 10000원 입장료 출력
		
		// ex) 2017 입력 => 9세 어린이 입니다. 입장료는 5000원 입니다.
		// 생년을 기준으로 2026 - 2017 
		
		// 생년의 기준은 1900 ~ 2026 유효한 값
		// 이 기준을 넘어간 데이터는 다시 입력하라고 요청
		// 생년이 유효하지 않습니다. 다시 입력해 주세요 (1900 ~ 2026) 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		
		int num = 2026;
		int num2 = scan.nextInt();
		
		while (true) {
			if (num - num2 > 1900 && num - num2 < 2026) {
				System.out.println("생년이 유효하지 않습니다. 다시 입력해 주세요");	
				num2 = scan.nextInt();
			} else {
				
				if (num - num2 <= 13) {
					System.out.println(num - num2 + "살 " + "어린이 5000원");
					break;
				} else if (num - num2 <= 19) {
					System.out.println(num - num2 + "살 " + "청소년 7000원");
					break;
				} else {
					System.out.println(num - num2 + "살 " + "어른 10000원");
					break;
				} 
			}
		}
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("생년을 입력 (1900~2026) >");
		int birth1 = scan.nextInt();
		int today = 2026;
		
		while (birth1 < 1900 || birth1 > today) {
			System.out.println("유효하지 않은 연도입니다.");
			System.out.println("다시 입력하세요 >");
			birth1 = scan.nextInt();
		}
		
		int age = today - birth1;
		
		if (age <= 13) {
			System.out.println(age + "살 " + "어린이 5000원");
		} else if (age <= 19) {
			System.out.println(age + "살 " + "청소년 7000원");
		} else {
			System.out.println(age + "살 " + "어른 10000원");
		}
		scan.close();

	}

}
