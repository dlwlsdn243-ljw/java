package day04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/* -- menu--
		 * \1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * 두 수를 입력해 주세요 > 2 3
		 * menu 1 => 2+3=5
		 * menu 2 => 2-3=-1
		 * menu 3 => 2*3=6
		 * menu 4 => 2/0= => num2를 다시 입력해주세요.
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int menu = 0;
		
		do {
			System.out.println("--memu--");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("menu > ");
			menu = scan.nextInt();
			if (menu == 6) {
				System.out.println("종료합니다.");
				break;
			} 
			
			System.out.println("첫번째 숫자를 입력해 주세요.");
			num1 = scan.nextInt();
			System.out.println("두번째 숫자를 입력해 주세요.");
			num2 = scan.nextInt();
			
			// 실제 기능 처리 구현 구문
			switch(menu) {
			case 1: 
				System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
				break;
			case 2: 
				System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
				break;
			case 3: 
				System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
				break;
			case 4: 
				if (num2 == 0) {
					 System.out.println("num2를 다시 입력해주세요.");
				} else {
					System.out.println(num1 + "/" + num2 + "=" + (double)(num1/num2));		
				}
				break;
			case 5: 
				if (num2 == 0) {
					 System.out.println("num2를 다시 입력해주세요.");
				} else {
					System.out.println(num1 + "%" + num2 + "=" + (num1%num2));		
				}
				break;	
		
			default : 
				System.out.println("잘못된 입력 입니다.");
			}
			
		} while (menu != 6);
		
		scan.close();


	}

}
