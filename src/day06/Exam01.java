package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 야구 게임
		 * 컴퓨터가 랜덤으로 3자리의 숫자를 생성 (0~9)
		 * (각 자리수는 0~9까지 랜덤 생성 => 중복 불가능)
		 * -> 배열로 저장
		 * 유저가 3자리를 맞추는 게임.
		 * 
		 * 자리와 숫자가 일치하면 strike
		 * 자리는 불일치 하지만 숫자가 다른 위치에 있다면 ball 
		 * 자리도 숫자도 없으면 out
		 * 
		 * ex) com : 1 2 3
		 * user : 1 5 9 => 1s
		 * user : 6 5 8 => out
		 * user : 1 7 4 => 1s
		 * user : 1 3 2 => 1s 2b
		 * user : 1 2 3 => 정답!!
		 * */
		//1. 중복 불가능(com/user)
		int comNum[]=new int[3];
		int userNum[]=new int[3];
		
		Scanner scan = new Scanner (System.in);
		
		//comNum을 중복 없이 생성
		for (int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*10);
			for (int j=0; j<i; j++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(comNum));
		
		// userNum String으로 받아서 배열로 split "" -> 한글자씩 잘라 배열로 리턴
		// 숫자로 변환
		
		while(true) {
			System.out.println("숫자입력>");
			String myNum = scan.next();
			
			// 한글자씩 나누어 배열로 리턴
			String []  myNumStr = myNum.split("");
//			System.out.println(Arrays.toString(myNumStr));
			for (int i=0; i<myNumStr.length; i++) {
				userNum[i] = Integer.parseInt(myNumStr[i]);
			}
			int stk = 0, ball = 0;
			
			for (int i = 0; i<comNum.length; i++) {
				for (int j = 0; j<userNum.length; j++) {
					if (comNum[i] == userNum[j] && i == j) {
						stk++;
					}else if (comNum[i] == userNum[j] && i != j) {
						ball++;
					}
				}
			}
			if (stk == 0 && ball == 0) {
				System.out.println("=> out");
				
			}else {
				System.out.println(" => " + stk + "s " + ball + "b");
			}
			if (stk==3) {
				System.out.println("정답");
				break;
			}
		}
		
		
		
		scan.close();

	}

}
