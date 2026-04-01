package day12;

public class Abstract01 {

	public static void main(String[] args) {
		Dog d = new Dog("뽀삐", "개과");
		d.prontInfo();
		d.howl();
		d.eating("고기");
		
		Cat c = new Cat("나비", "고양이과");
		c.prontInfo();
		c.howl();
		c.eating("생선");
		
		//Animal a = new Animal(); // 추상클래스는 객체 생성 불가능

	}

}

class Cat extends Animal{
	private String eat;
	
	// 생성자
	public Cat (String name, String category) {
		// 상속받은 맴버변수의 젭근제어자가 protected일 경우 this.맴버변수 사용가능
		this.name = name;
		super.category = category;
	}

	@Override
	void howl() {
		System.out.println("--" + name + "의 울음소리 야옹~!!");
		
	}

	@Override
	void eating(String eat) {
		this.eat = eat;
		System.out.println("--" + name + "은 " + eat + "를 좋아해요");
		
	}
	
}

class Dog extends Animal{

	private String eat;
	
	// 생성자
	public Dog (String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	void howl() {
		// TODO Auto-generated method stub
		System.out.println("--" + name + "의 울음소리 멍멍~!!");
	}

	@Override
	void eating(String eat) {
		// TODO Auto-generated method stub
		this.eat = eat;
		System.out.println("--" + name + "은 " + eat + "를 좋아해요");
	}
	
}

// abstract => 상속 용도로 사용
abstract class Animal{
	protected String name;
	protected String category;
	
	public void prontInfo() {
		System.out.println("이름:" + name + "(" + category + ")");
	}
	
	// 추상메서드
	abstract void howl();
	abstract void eating(String eat);
}
