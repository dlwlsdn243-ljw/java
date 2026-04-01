package day12;

public class Interface01 {

	public static void main(String[] args) {
		/* Interface (인터페이스)
		 * 추상메서드와 상수(final)로만 이루어진 것
		 * 추상 메서드 : 미완성 메서드
		 * 			  선언부만 있고 구현이 없는 메서드
		 * 추상클래스 : 추상메서드를 포함하고 있는 클래스 
		 * 추상클래스 / 인터페이스 : 추상메서드를 포함하고 있기 때문에
		 * 						객체를 생성할 수 없음
		 * 반드시 구현해야만 객체를 생성할 수 있음
		 * 
		 * 인터페이스 interface
		 * - 기능요약서 : 메뉴얼 화
		 * - 자체적으로 사용할 수 없고 인터페이스를 구형한 클래스로 활용
		 * - 구현 : implements
		 * - 인터페이스는 맴버변수가 없음
		 * - 이 부분을 염두에 두고 메서드 정리를 해야 함.
		 * 
		 * - 상속 : 다중상속 불가능. (단일 상속 원칙)
		 * - 구현 : 다중 구현이 가능
		 * - 상속 + 구현 : 동시에 가능
		 * */

		/*  추상 클래스 : 미완성 클래스
		 *  추상 메서드 : 메서드의 선언부만 있고 구현은 없는 메서드
		 *  추상 클래스 : 일반 메서드 + 추상메서드를 같이 포함하는 클래스
		 *  추상 클래스 : 추상메서드 + 일반메서드 + 맴버변수 + 상수(final)
		 *  
		 *  - 미완성 클래스이기 때문에 객체를 생성할 수 없음
		 *  키워드 : abstract
		 *  abstract 클래스명 / abstract 메서드명
		 *  
		 *  abstract 리턴타입 메서드명(매개변수); => 추상메서드
		 *  - 상속을 하기위한 부모클래스를 만들기 위해 사용
		 *  - 추상 클래스를 상속받는다면 반드시 추상메서드를 구현해야 함.
		 *  - 만약 구현하지 않는다면 내 클래스도 추상클래스가 됨
		 *  
		 *  인터페이스 : 추상메서드만 있음, abstract 키워드를 안써도 됨
		 * */
		
		TV tv = new TV();
		tv.trunOn();
		tv.trunOff();
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		
		
	}

}

// interface 인터페이스명 {  }
interface Power{
	abstract void trunOn();
	abstract void trunOff();
	
//	void trunOn();
//	void trunOff();
}

interface Remocon{
	void volUp();
	void volDown();
}

// class 클래스명 implements 인터페이스명, 인터페이스명 {// 다중구현 가능
// class 클래스명 extends 상속클래스명 implements 인터페이스명 {// 상속+구현 같이

class TV implements Power, Remocon {
	private boolean power;
	private int vol;
	
	@Override
	public void trunOn() {
		power = true;
		System.out.println("TV가 켜졌습니다.");
		
	}

	@Override
	public void trunOff() {
		power = false;
		System.out.println("TV가 꺼졌습니다.");
		
	}

	@Override
	public void volUp() {
		vol++;
		System.out.println("vol : " + vol);
		
	}

	@Override
	public void volDown() {
		vol--;
		System.out.println("vol : " + vol);
		
	}
	
}












