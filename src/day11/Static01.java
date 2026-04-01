package day11;

public class Static01 {

	public static void main(String[] args) {
		/* static : 전역변수 / 전역메서드 (클래스변수 / 클래스메서드)
		 * 전 모든 객체에 공통으로 사용이 가능.
		 * 프로그램이 실행되면서 바로 메모리레 올라가서 ~ 프로그램이 종료될때 같이 소멸
		 * - 객체 생성없이 클래스가 만들어지면서 생성
		 * - 객체 생성없이 클래스 만으로 호출 가능
		 * - 클래스명, 변수명 / 클래스명, 메서드명 => 사용방법
		 * - 객체 생성후 사용해도 무관하나 굳이 그렇게 사용하지 않음. (노란밑줄)
		 * - 클래스의 맴버변수, 메서드는 하나의 맴버변수가 모든 객체에 공유되어야 할 때 사용
		 * 
		 * static이 안붙은 메서드/맴버변수는 객체(인스턴스)의 메서드/ 객체의 맴버변수라고 불림
		 * - 갹 객체를 통새 생성되고 사용된다.
		 * - 객체를 생성하지 않으면 (new) 생성되지 않고 사용될 수 없다.
		 * - 객체명. 변수명/ 객체명.클래스명 => 사용방법
		 * - 각 객체마다 독립적으로 존대
		 * 
		 * 클래스의 맴버와 객체의 맴버는 생성되는 시점이 달라서 메서드와 맴버변수의 사용 시점이 다르다.
		 * 객체의 맴버는 클래스가 생성되고 객체 생성 후 사용이 가능
		 * 클래스의 맴버는 클래스가 생성되면 바로 사용 가능.
		 * 
		 * - 클래스 멤버는 클레스 멤버변수 / 클래스 멤버메서드 둘다 사용 가능.
		 * - 객체 멤버는 클래스 멤버에서 사용이 불가능.
		 * - static이 붙은 메서드에서 일반메서드를 호출 불가능.)객체 생성 후 사용 가능
		 * */
		
		// static의 메서드 호출 가능
//		ProductMain.main(args); // 클래스명. 메서드명();
		
		TV t = new TV();
		t.pringBrand();
		t.printBrand2(); // 잘 안씀(가능은 한데...)
		
		TV.printBrand2(); // 클래스에서 바로 호출
	}

}

class TV{
	private boolean power;
	static final String BRAND = "LG";
	
	public void pringBrand() {
		// 객체의 메서드안 => static(클래스 변수를 호출)
		System.out.println("Brand : " + BRAND); // static
		System.out.println(power); // 일반 멤버변수
	}
	
	// static메서드 생성시점에 power변수는 생성되지 않았음
	public static void printBrand2() {
		// static (클래스메서드안) => 객체변수 호출
		System.out.println("Brand : " + BRAND); // static
//		System.out.println(power); // 일반 멤버변수 => 호출 불가능
		
	}
}
