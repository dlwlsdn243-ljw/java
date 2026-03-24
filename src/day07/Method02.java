package day07;

public class Method02 {

	// 메서드 생성위치
	/* 두 정수가 주어지면 두수의 합을 리턴하는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : int
	 * 메서드명 : sum
	 * */
	public int sum(int num1, int num2) {
		// 변수를 선언 메서드의 일반변수
		return num1 + num2;
	}
	
	/* 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	 * 매개변수 : 두 정수 => int num1, int num2
	 * 리턴타입 : 없음 => void
	 * 메서드명 : sum2
	 * */
	public void sum2(int num1, int num2) {
	// 메서드 내에서 다른 메서드를 호출할 수 있다 (메서드명으로 호출)
		int hap = num1 + num2;
		int hap2 = sum(num1, num2);
		System.out.println(hap);
		System.out.println(hap+hap2);
		System.out.println(hap2);
		System.out.println(num1 + num2);
	}
	/* 매개변수가 없는 케이스 / 리턴이 있는 케이스
	 * 합을 출력
	 * */
	public int sum3() {
		// 메서드 내부에서 새로운 값을 생성 후 리턴
		int num1 = 100;
		int num2 = 200;
		return num1 + num2;
	}
	/* 매개변수가 없는 케이스 / 리턴이 없는 케이스
	 * 합을 출력
	 * */
	public void sum4() {
		int num1 = 1000;
		int num2 = 2000;
		System.out.println(num1 + num2);
	}
	
	
	public static void main(String[] args) {
		// 메서드 호출 -> 출력
		Method02 me02 = new Method02(); // 객체변수 (참조변수) me02
		int num1= 10; // 지역변수 (일반변수) num1
		int num2 = 20; // 지역변수 (일반변수) num2
		int sum = me02.sum(num1, num2); // (매개변수) 일반변수를 매개변수로 전달
		System.out.println(sum);
		
		System.out.println("---------");
		
		me02.sum2(num1, num2); // 내부 메서드에서 출력 완료
		
		System.out.println("---------");
	}

}
