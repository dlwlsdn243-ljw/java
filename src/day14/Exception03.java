package day14;

import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
		// Scanner 객체는 메인 에서 받고
		// 메서드 호출하여 결과 출력
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("첫번째 숫자");
			int num1 = scan.nextInt();
			
			System.out.println("사칙연산");
			char op = scan.next().charAt(0);
			
			System.out.println("두번째 숫자");
			int num2 = scan.nextInt();
			
			Exception03 ex3 = new Exception03();
			double i = ex3.calc(num1, num2, op);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println("입력값이 잘못되었습니다.");
		}
		
		
		
		scan.close();
		
//		try {
//			System.out.println(ex3.calc2(5, 0, '+'));
//			System.out.println(ex3.calc2(5, 0, '-'));
//			System.out.println(ex3.calc2(5, 0, '*'));
//			System.out.println(ex3.calc2(5, 0, '/'));
//			System.out.println(ex3.calc2(5, 0, '%'));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		
	}
	
	// 예외 떠넘기기 : throws
	// method 자체에서 예외처리를 하지 않고 나를 호출하는 대상에게 예외처르를 넘기는 상태
	// 예외 발생시키기 : throw new
	public double calc2 (int num1, int num2, char op) throws RuntimeException {
		double result = 0;
		
		if(op == '/' || op == '%' && num2 == 0) {
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		
		switch (op) {
		case  '+' : result = num1 + num2; break;
		case  '-' : result = num1 - num2; break;
		case  '*' : result = num1 * num2; break;
		case  '/' : result = num1 / num2; break;
		case  '%' : result = num1 % num2; break;
		default:
			throw new RuntimeException("산출연산자가 아닙니다..");
		
		}
		
		return result;
	}
	
	// method
	// 두 정수와 연산자를 입력받아 char
	// + - * / % 연산의 결과를 리턴하는 메서드
	// / % 연산자 일 경우 피연산자 0이면 Exception 오류 처리
	
	// 메서드에서 직접 예회를 처리한 케이스
	public double calc(int num1, int num2, char op) {
		double result = 0;
			switch (op) {
			case  '+' : result = num1 + num2; break;
			case  '-' : result = num1 - num2; break;
			case  '*' : result = num1 * num2; break;
			
			case  '/' : 
				try {
					result = num1 / num2; 
				} catch (Exception e) {
					System.out.println("0으로 나눌수 없습니다.");
				}
				break;
				
			case  '%' : 
				try {
					result = num1 % num2; 					
				} catch (Exception e) {
					System.out.println("0으로 나눌수 없습니다.");
				}
				break;
			default:
				System.out.println("잘못된 값입니다.");
			}
			return result;
	}
}
