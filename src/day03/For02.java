package day03;

public class For02 {

	public static void main(String[] args) {
		// 1~100까지의 합계 출력
		
		// 지역변수 -> 반드시 초기화 해주어야 사용가능.
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i; //sum += i
		}
		System.out.println(sum);
		
		System.out.println("-------------------------------------------------------");
		
//		// 초기화 않된 경우
//		int sum1 ;
//		for (int i = 1; i <= 100; i++) {
//			sum1 = i;
//			sum1 = sum1 + i; //sum += i
//		}
//		System.out.println(sum1); // 에러
		
		System.out.println("-------------------------------------------------------");
		
		
		
	}

}
