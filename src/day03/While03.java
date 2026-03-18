package day03;

public class While03 {

	public static void main(String[] args) {
		// 1~50까지 짝수만 출력
		// 2 4 6 8 10
		// 12 14 16 18 20
		// 22 24 26 28 30
		// 32 34 36 38 40
		// 42 44 46 48 50
		
		int i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			if (i % 10 == 0) {
				System.out.println();
			} 
			i++;
		}
		
		System.out.println("------------------------------------------");
		
		i = 1;
		int count = 0;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				count++;
			}
			if (count == 5) {
				System.out.println();
				count = 0;
			} 
			i++;
		}
		
	}

}
