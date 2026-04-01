package day07;

import java.util.Scanner;

public class MathodEx01_1 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * -- menu --
		 * 1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료
		 * 메뉴선택> 1
		 * 숫자입력 (두 정수)> 1 3
		 * >> 결과 : 1 + 3 = 4
		 * 
		 * 덧셈... 메서드는 Method03에서 호출하여 사용
		 * */
		
		Method03 m3 = new Method03();
		Scanner scan = new Scanner(System.in);
		// 메서드 호출   객체명.메서드명(매개변수)
		
		int menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료");
			System.out.println("선택>");
			menu = scan.nextInt();
			
			int num1=0, num2 =0;
			
			if(menu < 6 && menu > 0) {
				System.out.println("연산할 두 수를 입력>");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
			}
			
			switch(menu) {
			case 1: 
				int sum = m3.sum(num1, num2);
				m3.print(num1, "+", num2, sum);
				System.out.println(m3.toPrint(num1, "+", num2, sum));
				// System.out.println(num1+"+"+num2+"="+sum); // 메서드로 분리
				break;
			case 2: m3.print(num1, "-", num2, m3.sub(num1, num2));
				break;
			case 3: m3.print(num1, "*", num2, m3.mul(num1, num2));
				break;
			case 4: m3.print(num1, "/", num2, m3.div(num1, num2)); 
				break;
			case 5: m3.print(num1, "%", num2, m3.mod(num1, num2));
				break;
			case 6: System.out.println("종료합니다.!!"); break;
			default: System.out.println("잘못된 메뉴!!");
			}
			
		}while(menu != 6);
		
		scan.close();

	}

}
