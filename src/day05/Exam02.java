package day05;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 가위바위보
				/* 컴퓨터와 유저가 가위바위보 게임을 진행
				 * 가위 = 0, 바위 = 1, 보 = 2
				 * 컴퓨터는 랜덤으로 0 1 2 중 선택
				 * 유저도 input 0 1 2 중 선택 
				 * ex) com = 0 / me = 0
				 * com(가위) / me(가위) => 무승부 
				 * com = 0 / me = 2
				 * com(가위) / me(보) => me 패배!!
				 * */
				
				String[] choice = {"가위", "바위", "보", "종료"};
				//System.out.println(choice[2]); : "보"
				
				Scanner scan = new Scanner(System.in);
				
				// 0~2 사이의 값만 가능
				System.out.println("가위바위보 게임 시작>");
				
				while (true) {
					
					int comNum = (int)(Math.random()*3); // 0부터 3개의 숫자를 랜덤으로 출력
					System.out.println("컴퓨터 결정 완료!!");
					
					System.out.println("가위(0)바위(1)보(2) 종료(3) 중 (0 1 2 3) 선택>");
					int myNum = scan.nextInt();
					//System.out.println("유저 결정 완료!!");
					
					// 종료조건 확인
					if (myNum == 3) {
						System.out.println("종료 되었습니다.");
						break;
					}
					
					// 승패 비교
					if(myNum <0 || myNum > 3){
						System.out.println("입력오류입니다.");
						continue;
					}
//					while (myNum <0 || myNum > 3){
//					System.out.println("입력오류입니다.");
//					myNum = scan.nextInt();
						
						String result = "";
						
						if(comNum == myNum) {
							result = "무승부!!";
						}else {
							if(myNum == 0) { 
								// 가위
								result = (comNum == 2) ? "유저 승!!!" : "유저 패!";
								
							}else if(myNum == 1) {
								// 바위
								result = (comNum == 0) ? "유저 승!!!" : "유저 패!";
								
							}else  {
								//myNum == 2 보
								result = (comNum == 1) ? "유저 승!!!" : "유저 패!";

							}
						}
						
						// 출력
						System.out.println("Com("+choice[comNum]+") "
								+ "/ User("+choice[myNum] +") => "+result);
				}
				
				
				
				scan.close();
						
	}

}
