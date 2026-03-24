package day07;

public class Method03 {
	/* 메서드 정의 => 기능을 정의하는 역할(함수)
	 * 접근제어자 리턴타입 메서드명(매개변수){
	 * 구현;
	 * }
	 * 
	 * - public : 누구나 접근가능
	 * - 리턴타입 : 기능을 구현 후 결과로 반환할 값의 타입
	 * - 매개변수 : 기능을 구현하기 위해 왜부에서 받아와야 하는 값
	 * - 매서드명 : 의미있게 소문자로 작성
	 * */
	//두 정수를 주고 + - * / %  기능을 하고 값을 리턴하는 메서드를 작성
	
	// +
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	// -
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	// *
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	
	// /(나누기) => return double
	public double div(int num1, int num2) {
		if (num2 == 0) {
			return -99999999;
		}
		return num1 / (double)num2;
	}
	
	public int mod(int num1, int num2) {
		if (num2 == 0) {
			return -99999999;
		}
		return num1 % num2;
	}
	public static void main(String[] args) {
		// 메서드 실행
		// 1. 클래스로 객체를정의  클래스명 객체명 = new 클래스명();
		// 2. 객체명으로 메서드 호출
		
		
		// 두 수의 + - * / % 의 결과를 메서드로 호출하여 출력
		
		int num1 = 10;
		int num2 = 0;
		
		Method03 me03 = new Method03();
		
		int sum = me03.sum(num1, num2);
		System.out.println(sum);
		
		int sub = me03.sub(num1, num2);
		System.out.println(sub);
		
		int mul = me03.mul(num1, num2);
		System.out.println(mul);
		
		// div, mod는 num2 == 0일 때 처리
		
		double div = me03.div(num1, num2);
		int mod = me03.mod(num1, num2);
		
		if (div == -99999999 || mod == -99999999) {
			System.out.println("0으로 나눌수 없습니다.");
		} else {
			System.out.println(div);
			System.out.println(mod);
		}


	}

}
