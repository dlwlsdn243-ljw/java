package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/* 과제
		 * 정수2개와 연산자 1개를 입력받아 두 정수의 연산의 결과를 출력
		 * ex) 2 3 + => 2 + 3 = 5
		 * ex) 2 3 - => 2 - 3 = -1
		 * ex) 2 3 ! => 잘못된 연산자
		 * 연산자는 + - * / % 만 가능
		 * String 문자열 == "+" => 불가능
		 * char == '+' => 가능
		 * scan.next() : 한단어 => String
		 * charAt(index) : 한글자 추출 => char
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		// 1. switch 이용

		System.out.println("두 정수를 띄어쓰기 하여 입력 >");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
//		System.out.println("첫번째 숫자 >");
//		int num1 = scan.nextInt();
//		
//		System.out.println("두번째 숫자 >");
//		int num2 = scan.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(">>>");
		char op = scan.next().charAt(0); 
		System.out.println(op);
		
		// 1. switch 이용
//		switch (op) {
//		case '+' System.out.println("" + num1 + op +  num2 + "=" + (num1 + num2); break;
//		case '-' System.out.println("" + num1 + op +  num2 + "=" + (num1 - num2); break;
//		case '*' System.out.println("" + num1 + op +  num2 + "=" + (num1 * num2); break;
//		case '/' System.out.println("" + num1 + op +  num2 + "=" + (num1 / num2); break;
//		case '%' System.out.println("" + num1 + op +  num2 + "=" + (num1 % num2); break;
//		default : System.out.println("잘못된 연산자");
//		}
		
//		// 2. switch 이용 변수 result이용
//		int result = 0;
//		switch (op) {
//		case '+' result = num1 + num2; break;
//		case '-' result = num1 - num2; break;
//		case '*' result = num1 * num2; break;
//		case '/' result = num1 / num2; break;
//		case '%' result = num1 % num2; break;
//		default : System.out.println("잘못된 연산자");
//		}
//		if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
//		System.out.println("" + num1 + op + num2 + "=" +result);
//		}
//		
		// 3. if문 사용 (char)
		int ifResult = 0;
		if (op == '+') {
			ifResult = num1 + num2;
		} else if (op == '-') {
			ifResult = num1 + num2;
		} else if (op == '*') {
			ifResult = num1 + num2;
		} else if (op == '/') {
			ifResult = num1 + num2;
		} else if (op == '%') {
			ifResult = num1 + num2;
		} else {
			System.out.println("잘못된 연산자");
		}
		
		if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
		System.out.println("" + num1 + op + num2 + "=" + ifResult);
		}

//		// String 형태로 입력받기
		System.out.println(">>>");
		String opStr = scan.next(); 
		System.out.println(opStr);
		
		// 4. if문 사용 (String)
		ifResult = 0; // 앞에서 쓴 ifResult 초기화
		if (opStr.equals("+")) {
			ifResult = num1 + num2;
		} else if (opStr.equals("-")) {
			ifResult = num1 - num2;
		} else if (opStr.equals("*")) {
			ifResult = num1 * num2;
		} else if (opStr.equals("/")) {
			ifResult = num1 / num2;
		} else if (opStr.equals("%")) {
			ifResult = num1 % num2;
		} else {
			System.out.println("잘못된 연산자");
		}
		if (opStr == "+" || opStr == "-" || opStr == "*" || opStr == "/" || opStr == "%") {
			System.out.println("" + num1 + opStr + num2 + "=" +ifResult);
			}
		
//		System.out.println("첫번째 숫자 입력 >");
//		int num1 = scan.nextInt();
//		System.out.println("내가 입력한 값 : " + num1);
//		
//		System.out.println("두번째 숫자 입력 >");
//		int num2 = scan.nextInt();
//		System.out.println("내가 입력한 값 : " + num2);
//		
//		System.out.println("연산자 입력 >");
//		String opStr = scan.next();
//		System.out.println("내가 입력한 값 : " + opStr);
		
		switch (opStr) {
		case "+" :
			System.out.printf("%d + %d = %d", num1, num2, num1 + num2 );
			break;
		case "-" :
			System.out.printf("%d - %d = %d", num1, num2, num1 - num2 );
			break;
		case "*" :
			System.out.printf("%d * %d = %d", num1, num2, num1 * num2 );
			break;
		case "/" :
			System.out.printf("%d / %d = %d", (double)num1, (double)num2, (double)num1 / num2 );
			break;	
		case "%" :
			System.out.printf("%d  mod  %d = %d", num1, num2, num1 % num2 );
			break;	
		default :
			System.out.println("다시 입력하세요.");
		}

		scan.close();
	}
}
