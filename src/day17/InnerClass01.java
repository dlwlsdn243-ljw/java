package day17;

public class InnerClass01 {

	public static void main(String[] args) {
		// innerClass : 내부 클래스
		/* 클래스 내부에 선언한 클래스
		 * - 외부클래스가 쓰려고 직접 선언하는 경우가 많고, 다른 클래스에
		 * 해당 클래스를 사용할 일이 없고, 외부 클래스만이 사용하려고 할 때
		 * - 중첩 클래스 라고도 함. 
		 * 
		 * 내부적으로 사용할 용이기 때문에 클래스에 private으로 선언하고 
		 * 사용하는 것을 권장
		 * 내부클래스는 외부 클래스가 생성 된 후 생성됨.
		 * private이 아닌 내부클래스는 외부에서 접근이 가능함.
		 * */
		Test outclass = new Test();
		// 내부 클래스의 메서드 호출
		outclass.usingClass();
		
		System.out.println();
		outclass.getInClass().innerTest();
		
		// innerClass에 직접 접근
		Test.TestInner inclass = outclass.new TestInner();
		inclass.innerNum = 1000; // 직접 inClass 접근 가능

	}

}

class Test{
	private int num = 10;
	private static int sNum = 20;
	private TestInner inClass;  // 내부 클래스 객체
	
	public Test() {  // test 클래스의 생성자
		// 내부클래스의 객체를 생성
		inClass = new TestInner();
	}
	
	class TestInner{
		// 가능. 내부 클래스
		int innerNum = 100;
		//static int innerSNum = 200;  // 생성 불가능.
		
		void innerTest() {
			System.out.println("testClass num : "+num);
			System.out.println("testClass sNum : "+sNum);
			System.out.println("innerTestClass innerNum : "+innerNum);
			
			// 메서드는 내부에 메서드를 가질 수 없음. 
	//		void test2() {
	//			
	//		}
		}
		
	}
	
	// TestInner 클래스의 내부 메서드를 호출 메서드
	public void usingClass() {
		inClass.innerTest();
	}
	
	// getter/setter

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static int getsNum() {
		return sNum;
	}

	public static void setsNum(int sNum) {
		Test.sNum = sNum;
	}

	public TestInner getInClass() {
		return inClass;
	}

	public void setInClass(TestInner inClass) {
		this.inClass = inClass;
	}
	
	
}