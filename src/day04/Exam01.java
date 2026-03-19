package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 과제
		 * 정수2개와 연산자 1개를 입력받아 두 정수의 연산의 결과를 출력
		 * ex) 2 3 + => 2 + 3 = 5
		 * ex) 2 3 - => 2 - 3 = -1
		 * ex) 2 3 ! => 잘못된 연산자
		 * 연산자는 + - * / % 만 가능
		 * String 문자열 == "+" => 불가능
		 * equals()
		 * 
		 * char == '+' => 가능
		 * scan.next() : 한단어 => String
		 * char = scan.next().charAt(index) : 한글자 추출 => char
		 * 
		 *  / 연산은 0으로 나눌때 exception발생
		 *  % 피연산자가 0이면 0으로 나눌 수 없다.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력");
		int num1 = scan.nextInt();
		System.out.println("정수를 입력");
		int num2 = scan.nextInt();
		
		System.out.println("연산자를 입력");
		String str = scan.next();
			
			int ifResult = 0; 	
			if (str.equals("+")) {
				ifResult = num1 + num2;
				System.out.println(num1 + "+" + num2 + "=" + ifResult);
			} else if (str.equals("-")) {
				ifResult = num1 - num2;
				System.out.println(num1 + "-" + num2 + "=" + ifResult);
			} else if (str.equals("*")) {
				ifResult = num1 * num2;
				System.out.println(num1 + "*" + num2 + "=" + ifResult);
			} else if (str.equals("/")) {
				 if (num2 == 0) {
					 System.out.println("0으로 나눌수 없습니다.");
				} else {
					ifResult = num1 / num2;
					System.out.println(num1 + "/" + num2 + "=" + ifResult);
				}
			} else if (str.equals("%")) {
				  if (num2 == 0) {
					  System.out.println("0으로 나눌수 없습니다.");
				} else {
					ifResult = num1 % num2;
					System.out.println(num1 + "%" + num2 + "=" + ifResult);
				}
			} else {
				System.out.println("잘못된 연산자");
				
			}
			
			
			System.out.println("정수 2개와 연산자를 순서대로 입력>");
			int n1 = scan.nextInt();
			int n2 = scan.nextInt();
			String op = scan.next();
			
			switch (op) {
			case "+" :
				System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
				break;
			case "-" :
				System.out.println(n1 + "-" + n2 + "=" + (n1 - n2));
				break;
			case "*" :
				System.out.println(n1 + "*" + n2 + "=" + (n1 * n2));
				break;
			case "/" :
				if (n2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				} else {
					System.out.println(n1 + "/" + n2 + "=" + (n1 / n2));
				}
				break;
			case "%" :
				if (n2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				} else {
					System.out.println(n1 + "%" + n2 + "=" + (n1 % n2));
				}
				break;
			default :
				System.out.println("다시 입력하세요.");
			}
			
			System.out.println("-----------------------------------------------------------------------");
			// 미리 안되는 케이스를 빼기
			int result = 0;
			if ((op.equals("/") || op.equals("%")) && num2 == 0) {
				System.out.println("0으로 나룰 수 없습니다.");
				return;
			}
			switch (op) {
			case "+" : result = n1 + n2; break;
			case "-" : result = n1 - n2; break;
			case "*" : result = n1 * n2; break;
			case "/" : result = n1 / n2; break;
			case "%" : result = n1 % n2; break;
			default : System.out.println("다시 입력하세요.");
			}
			if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%")) {
				System.out.println(n1+op+n2+"="+result);		
			}

		scan.close();

	}

}
