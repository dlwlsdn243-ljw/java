package day08;

public class Mathod04 {

	/* 정수 하나를 매개변수로 입력받아 해당 저우의 구구단을 출력
	 * 매개변수 : 정수 1개 int dan
	 * 리턴타입 : void
	 * 메서드명 : multi
	 * */
	
	public void multi(int dan) {
		// 1~9까지 반복해서 곱셈 출력
		for (int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}

	public static void main(String[] args) {
		// 구구단 출력 메서드 연습
		int num = 9;
		Mathod04 me04 = new Mathod04();
		me04.multi(num);
		
		System.out.println("=======");
		
		for (int i=2; i<=9; i++) {
			System.out.println("--" + i + "단--");
			me04.multi(i);
		}

	}

}
