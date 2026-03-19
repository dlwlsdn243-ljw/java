package day04;

public class For08 {

	public static void main(String[] args) {
		// 구구단 2~9단까지 출력
		// 구구단 출력 2단
//		int dan = 2;
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d %n", dan, i, (dan*i));
//		}
		
		// 2*1=2 2*2=4 ...2*9=18
		// 3*1=3 3*2=6 ...3*9=27
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "   ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
		/* 2*1=2  3*1=3  ...
		 * 2*2=4  3*2=6  ...
		 * 2*3=6  3*3=9  ...
		 * ...
		 * */
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (i * j) + "   ");
			}
			System.out.println();
		}
		
		// 이중  for문
		// i = 1 j = 2~9
		// i = 2 j = 2~9
		// i = 3 j = 2~9
		// i = 4 j = 2~9
		// ...
		// i = 9 j = 2~9

	}

}
