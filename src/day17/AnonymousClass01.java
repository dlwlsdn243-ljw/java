package day17;

public class AnonymousClass01 {

	public static void main(String[] args) {
		// 익명클래스(Anonymous class) : 내부 클래스의 일종
		/* 이름이 없는 클래스
		 * 다시 객체를 생성할 일이 없고, 한번 쓰면 버려지는 객체 (일회용 객체)
		 * 
		 * - 인터페이스를 사용하여 객체를 생성할 경우
		 * - 구현 메서드가 적고,
		 * - 인터페이스 구현 외의 다른 구현이 없고,
		 * - 해당 객체를 한번만 사용하는 경우
		 * 
		 * - 일반적으로 메서드의 매개변수로 객체가 사용되는 케이스에서 주로 사용
		 * */
		AnonymousClass01 ac = new AnonymousClass01();
		
//		TV tv = new TV();
//		tv.trunOn();
//		tv.trunOff();
//		ac.tvPower(tv);
		
		System.out.println("-----------");
		// 익명클래스를 사용하는 경우
		ac.tvPower(new Power() {

			@Override
			public void trunOn() {
				// TODO Auto-generated method stub
				System.out.println("TV가 켜집니다.");
			}

			@Override
			public void trunOff() {
				// TODO Auto-generated method stub
				System.out.println("TV가 꺼집니다.");
			}
			
		});
		
		System.out.println("-----------");

	}
	
	public void tvPower(Power p) {
		p.trunOn();
		System.out.println("TV 정상 작동 중...");
		p.trunOff();
	}

}

interface Power{
	void trunOn();
	void trunOff();
}

//class TV implements Power{
//
//	@Override
//	public void trunOn() {
//		// TODO Auto-generated method stub
//		System.out.println("전원이 켜집니다.");
//	}
//
//	@Override
//	public void trunOff() {
//		// TODO Auto-generated method stub
//		System.out.println("전원이 꺼집니다.");
//	}
//	
//}
