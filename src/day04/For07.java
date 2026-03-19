package day04;

public class For07 {

	public static void main(String[] args) {
		// 소수 : 1과 자기자신만을 약수로 가지는 수
		// 2 3 5 7 11 13...
		
		// 2~100까지 중 소수를 출력 (2중 for문 사용)
		// 2~100까지 루프
		// 2~자기자신(i) 전까지 루프
		// 나누어 떨어지는 수가 없으면 출력
		for (int i = 2; i <= 100 ; i++) {
			int count = 0;
			for (int j = 2; j < i ; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
		
		
		// num = 3 num가 소수인지 아닌지 판별
		int num = 4;
		int count = 0;
		for (int i = 2; 1 < num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
	
	}

}
