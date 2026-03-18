package day03;

public class While01 {

	public static void main(String[] args) {
		// while 문
		/* for : 반복 횟수가 정해져 있는 경우 사용
		 * while : 실행 횟수가 정해져 있지 않는 경우 사용
		 * while(조건식) {
		 * 		실행문;
		 * }
		 * */
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("------------------------------------------");
		
		int count = 1;
		while(true) {
			System.out.print(count + " ");
			// 반복 변수가 종료되기 위한 조건을 포함해야 함
			count++;
			
			// 종료 조건
			if (count == 5) {
				break; // 반복문을 빠져나가기
			}
		}
		System.out.println();
		
		System.out.println("------------------------------------------");
		
		count = 1;
		while (count <= 10) {
			System.out.print(count + " ");
			count++;
		}
		System.out.println();
		
		System.out.println("------------------------------------------");
		
		// while로 짝수만 출력
		count = 1;
		while (count < 10) {
			if (count % 2 == 0) {
				System.out.print(count + " ");
			}
			count++;
		}	
		System.out.println();
		
		System.out.println("------------------------------------------");
		
		count = 1;
		while (true) {
			if (count % 2 == 0) {
				System.out.print(count + " ");
			}
			if (count > 10) {
				break;
			}
			count++;
		}
		System.out.println();
	}

}
