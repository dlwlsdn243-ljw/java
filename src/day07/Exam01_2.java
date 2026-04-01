package day07;

import java.util.Scanner;

public class Exam01_2 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		 * 12345 => 1+2+3+4+5  합계 평균
		 * 123456789 => 1+2+3+4+5+6+7+8+9 합계 평균
		 * 반복 (0 또는 음수를 입력하면 종료)
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력(12345 0 또는 음수면 종료) >");
			String number = scan.next();
			
			if(Integer.parseInt(number) <=0 ) {
				System.out.println("종료!!");
				break;
			}
			
//			if(number.equals("0") || number.charAt(0) == '-') {
//				System.out.println("종료!!");
//				break;
//			}
			
			String[] str = number.split("");
			int[] num = new int[str.length];
			
			int sum = 0;
			
			for(int i=0; i<num.length; i++) {
				num[i] = Integer.parseInt(str[i]);
				sum += num[i];
			}
//			num[num.length-1] = Integer.parseInt(str[num.length-1]);
//			System.out.println(num[num.length-1]);
//			sum += num[num.length-1];
			
			// 출력
			for(int i=0; i<num.length-1; i++) {
				System.out.print(num[i]+"+");
			}
			System.out.println(num[num.length-1]);
//			System.out.println();
			
			System.out.println("합계:"+sum+" "
					+ "/ 평균:"+sum/(double)num.length);
			
			
		}while(true);
		
		scan.close();
	}

}
