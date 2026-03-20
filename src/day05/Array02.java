package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// 5명의 점수를 입력받기 => 배열로 생성
		/* 1. 배열을 생성 5개
		 * 2. 점수를 입력받는다. (1~100)
		 * 3. 점수를 출력한다.
		 * 4. 점수의 합계와 평균을 출력
		 * */

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("점수를 입력해 주세요.");
//		
//		int arr1[] = new int [5];
//
//		for (int i = 0; i < arr1.length; i++) {
//			int num1 = scan.nextInt(); 
//
//			if (num1 > 100 || num1 < 0) {
//				System.out.println("잘못된 값 입니다.");
//			} 
//			arr1[i] = num1; 
//			System.out.println(arr1[i]);
//		} 
		
		int arr2[] = new int [5];
		int sum = 0;
		double avg = 0;
		
		System.out.println("학생 성적 5명을 입력해 주세요.");
		
		for (int i = 0; i < arr2.length; i++) {
			int num1 = scan.nextInt();
			while (num1 > 100 || num1 < 0) {
				System.out.println("잘못된 값 입니다.");
				System.out.println("다시 입력해 주세요.");
				num1 = scan.nextInt();
			}
			System.out.println("점수입력완료");
			arr2[i] = num1;
			sum = sum + arr2[i];
		}
		System.out.println(Arrays.toString(arr2));
		avg = sum / (double)arr2.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		scan.close();
		

	}

}
