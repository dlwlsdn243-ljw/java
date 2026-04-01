package day07;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		 * 12345 => 1+2+3+4+5  합계 평균
		 * 123456789 => 1+2+3+4+5+6+7+8+9 합계 평균
		 * 반복 (0 또는 음수를 입력하면 종료)
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		String str = scan.next();

		String[] strArr = str.split("");
		
		int [] numArr = new int[str.length()];

		for (int i=0; i<strArr.length; i++) {
			numArr[i] = Integer.parseInt(strArr[i]);
			if (numArr[i] <= 0) {
				System.out.println("계산을 종료합니다.");
			}
		}
		
		int sum = 0;
		int avg = 0;
		
		for (int i=0; i<numArr.length; i++) {
		}
		
		for (int i=0; i<numArr.length; i++) {
			sum = sum + numArr[i];
		}
		System.out.println("합계 : " + sum);
		
		for (int i=0; i<numArr.length; i++) {
			avg = sum / str.length();
		}
		System.out.println("평균 : " + avg);
		

		
		scan.close();
	}

}
