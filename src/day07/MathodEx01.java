package day07;

import java.util.Scanner;

public class MathodEx01 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * -- menu --
		 * 1.덧셈|2.뺄샘|3.곱셈|4.나눗샘|5.나머지|6.종료
		 * 
		 * 메뉴선텍> 1
		 * 숫자입력 (두 정수) > 1 3
		 * >> 결과 : 1 + 3 = 4
		 * 
		 * 덧셈... 메서드는 Method03에서 호출하여 사용
		 * */
		
		Method03 m3 = new Method03();
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		do {
			System.out.println("---menu---");
			System.out.println("1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료");
			System.out.println("menu>");
			menu = scan.nextInt();
			
			if(menu == 6) {
				System.out.println("종료합니다.");
				break;

			}
				
			
				System.out.println("두 숫자를 입력해주세요 (2 3)>");
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				
				switch (menu) {
				case 1:
					int sum = m3.sum(num1, num2);
					System.out.println(num1 + "+" + num2 + "=" + sum);
					break;
				case 2:
					int sub = m3.sum(num1, num2);
					System.out.println(sub);
					break;
				case 3:
					int mul = m3.sum(num1, num2);
					System.out.println(mul);
					break;	
				case 4:
					double div = m3.div(num1, num2);
					if (div == -99999999) {
						System.out.println("0으로 나눌수 없습니다.");
					}else {
						System.out.println(div);
					}
					break;	
				case 5:
					int mod = m3.mod(num1, num2);
					if (mod == -99999999) {
						System.out.println("0으로 나눌수 없습니다.");
					} else {
						System.out.println(mod);
					}
					break;			
				}
		}while(menu == 6);
		System.out.println("프로그램 종료");
		scan.close();
		
	}
}
