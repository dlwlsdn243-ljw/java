package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지의 랜덤수 하나를 컴퓨터가 생성 => user 모름
		// 유저가 맞추는 게임
		// ex) 컴퓨터가 랜덤수를 생성했습니다. (23)
		// 입력> 10 up!
		// 입력> 20 up!
		// 입력> 30 down!
		// 입력> 25 down!
		// 입력> 23 정답!
		
		Scanner scan = new Scanner (System.in);
		
//		System.out.println("컴퓨터가 랜덤수를 생성했습니다.");
//		System.out.println("숫자를 적어주세요");
//		
//		int com = ((int)(Math.random()*50) + 1);
//		int user = scan.nextInt();
//		
//		while (true) {
//			if (user > com) {
//				System.out.println("down");
//			} else if (user < com) {
//				System.out.println("up");
//			}
//			
//			if (com != user) {
//				System.out.println("숫자를 다시 입력하세요.");
//				user = scan.nextInt();
//			}
//			if (com == user) {
//				System.out.println("정답입니다.");
//				break;
//			}
//		}
		
//		/////////////////////////////////////////////////////////////////////////////////////////
		
//		int random1 = ((int)(Math.random()*50) + 1);
//		int userNumber1 = 0;
//		while (random1 != userNumber1) {
//			System.out.println("입력>");
//			userNumber = scan.nextInt();
//			if (random1 > userNumber1) {
//				System.out.println("up");
//			} else if (random1 < userNumber1) {
//				System.out.println("down");
//			} else {
//				System.out.println("정답입니다.");
//			}
//		}
//		System.out.println("게임종료!!");
//		System.out.println("정답은 : " + random1);
		
//		/////////////////////////////////////////////////////////////////////////////////////////////
		
		// 횟수 제한 : 5회
		int random = ((int)(Math.random()*50) + 1);
		int userNumber = 0;
		int userCount = 0;
		
		while (true) {
			System.out.println("입력>");
			userNumber = scan.nextInt(); // 사용자 입력 라인
			
			userCount++;
			if (userCount == 5) {
				break;
			}
			if (random > userNumber) {
				System.out.println("up");
			} else if (random < userNumber) {
				System.out.println("down");
			} else {
				System.out.println("정답입니다.");
				break;	
			}
		}
		System.out.println("게임종료!!");
		System.out.println("정답은 : " + random);

		scan.close();
		
	}

}
