package day04;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// 반복문
		// do {실행문 :} while (조건);
		// 실행문을 먼저 실행하고 조건식을 나중에 비교하는 구분
		
		/*한글자를 입력받아 그 한글자 출력
		 * char
		 * 'y' 면 종료
		 * */

		Scanner scan = new Scanner(System.in);
		
		char ch;
		
		do {
			System.out.println("한글자 입력 >");
			// do 안에서 선언 변수를 while 조건에서 인지 못함
			ch = scan.next().charAt(0); 
			System.out.println(ch);
			
		} while(ch != 'y');
		
		System.out.println("종료"); 
		
		scan.close();
				
				
	}

}
