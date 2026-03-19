package day04;

public class For05 {

	public static void main(String[] args) {
		// 공약수 : 두 수의 약수중 공통된 약수
		/* 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 * 공약수 : 1 2 3 6
		 * 공약수중 가장큰수 : 최대공약수 => 6
		 * 
		 * */
		int num1 = 6; // num1 % i == 0
		int num2 = 12; // num2 % i == 0

		for (int i = 1; i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("-----------------------------------");
		
		// 최대 공약수 출력
		num1 = 6; // num1 % i == 0
		num2 = 12; // num2 % i == 0
		int gcd = 0;
		
		for (int i = 1; i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				gcd = i;
			}
		}
		System.out.println("최대공약수 : " + gcd);
		
		System.out.println("-----------------------------------");
		
		// num1부터 1씩 감소/ 첫 조건에 맞으면 출력 => break
		num1 = 6; // num1 % i == 0
		num2 = 12; // num2 % i == 0
		for (int i = num2; i <= num2; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("최대공약수 : " + i);
				break;
			}
		}
		
	}

}
