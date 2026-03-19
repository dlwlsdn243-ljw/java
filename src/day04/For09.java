package day04;

public class For09 {

	public static void main(String[] args) {
		// 이중for문
		
				// 이중  for문
				// i = 1 j = 2~9
				// i = 2 j = 2~9
				// i = 3 j = 2~9
				// i = 4 j = 2~9
				// ...
				// i = 9 j = 2~9
		
		
		/* *****  > 한줄에 5개 5줄
		 * *****
		 * *****
		 * *****
		 * *****
		 * */
		
		for (int i = 1; i <= 5; i++) { // 줄
			for (int j = 1; j <= 5; j++) { // 별 개수
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------------------------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
		

}
