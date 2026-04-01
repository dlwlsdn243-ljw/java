package day08;

public class Mathod05 {
	
	/* 최대 공약수
	 * 매개변수 : num1, num2
	 * 리턴타입 : int
	 * 메서드명 : max
	 * */
	public int max(int num1, int num2) {
		int a = 0;
		for (int i=1; i<=num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				a = i;
			}
		} 
		return a;
	}
		
	
	

	/* 최소 공배수
	 * 매개변수 : num1 num2
	 * 리턴타입 : int
	 * 메서드명 : min
	 * */
	public int min(int num1, int num2) {
		for (int i=num1 ; ; i=i+num1) {
			if (i % num1 == 0 && i % num2 == 0) {
				return i;
			}
		}
		
	}
	

	public static void main(String[] args) {
		// 최대 공약수, 최대 공배수 출력메서드
		
		int num1 = 16;
		int num2 = 20;
		
		Mathod05 me05 = new Mathod05();
		int max = me05.max(num1,num2);
		System.out.println(max);
		
		int min = me05.min(num1,num2);
		System.out.println(min);
		

	}

}
