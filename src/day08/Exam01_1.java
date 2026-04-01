package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01_1 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		 * 12345 => 1+2+3+4+5  합계 평균
		 * 123456789 => 1+2+3+4+5+6+7+8+9 합계 평균
		 * 반복 (0 또는 음수를 입력하면 종료)
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0, sum = 0, count = 0;
		
		// 배열로 저장
		int [] numbers = new int [5];
		
		while(true) {
			System.out.println("숫자입력");
			num = scan.nextInt();
			
			if (num <= 0) {
				System.out.println("종료");
				break;
			}
			// 배열에 값 넣기 (배열에 공간이 남아있는지 확인)
			if (numbers.length == count) {
				// 새 배열 생성 => arraycopy
				int [] newArray = new int [numbers.length + 3];
				System.arraycopy(numbers, 0 , newArray, 0, numbers.length);
				numbers = newArray;
			}
			numbers[count] = num;
			sum += num;
			count++;
			
		}

		System.out.println(Arrays.toString(numbers));
//		count : 내가 넣은 숫자의 개수
		if (count == 0) {
			System.out.println("입력한 숫자x");
		} else {
			System.out.println("계산식");
			for(int i=0; i<count-1; i++) {
				System.out.print(numbers[i] + "+");
			}
		}	System.out.println(numbers[count-1]);
		System.out.println("합계:"+sum+" "
				+ "/ 평균:"+sum/(double)count);
		
		scan.close();

	}

}
