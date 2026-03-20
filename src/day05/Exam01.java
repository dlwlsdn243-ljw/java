package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 가위 바위 보
		/* 컴퓨터와 유저가 가위바위보 게임을 진행
		 * 가위 = 0, 바위 = 1, 보 = 2
		 * 컴퓨터는 랜덤으로 0,1,2중 선택
		 * 유저도 input 0 1 2 중 선택
		 * ex) com = 0 / me = 0
		 * 	   com(가위) / me(가위) => 무승부
		 * ex) com = 0 / me = 2
		 * 	   com(가위) / me(보) => 패배
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위 바위 보");
		
		int com = (int)(Math.random()*3);
		int me = scan.nextInt();

		switch (me) {
		case 0:
			if (com == 0) {
				System.out.println();
				System.out.println("com 은 가위 입니다.");
				System.out.println("무승부 입니다.");
			} else if (com == 1) {
				System.out.println("com 은 바위 입니다.");
				System.out.println("패배 입니다.");
			} else if (com == 2) {
				System.out.println("com 은 바위 입니다.");
				System.out.println("승리 입니다.");
			}
			break;
		case 1:
			if (com == 0) {
				System.out.println("com 은 가위 입니다.");
				System.out.println("승리 입니다.");
			} else if (com == 1) {
				System.out.println("com 은 바위 입니다.");
				System.out.println("무승부 입니다.");
			} else if (com == 2) {
				System.out.println("com 은 바위 입니다.");
				System.out.println("패배 입니다.");
			}
			break;
		case 2:
			if (com == 0) {
				System.out.println("com 은 가위 입니다.");
				System.out.println("패배 입니다.");
			} else if (com == 1) {
				System.out.println("com 은 바위 입니다.");
				System.out.println("승리 입니다.");
			} else if (com == 2) {
				System.out.println("com 은 바위 입니다.");
				System.out.println("무승부 입니다.");
			}
			break;
		default:
			System.out.println("잘못된 값입니다.");
		}

		scan.close();

	}

}
