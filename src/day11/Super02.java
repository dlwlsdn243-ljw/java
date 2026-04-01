package day11;

public class Super02 {

	public static void main(String[] args) {
		Dog d = new Dog("뽀삐", "개과");
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("치즈냥이", "고양이과");
		c.printInfo();
		c.howl();
		
		Tiger t = new Tiger ("호랑이", "고양이과");
		t.printInfo();
		t.howl();
	}

}

class Tiger extends Animal{
	public Tiger(String name, String category) {
		super (name, category);
	}
	public void howl() {
		super.howl();
		System.out.println("어흥");
	}
}

class Cat extends Animal{
	public Cat(String  name, String category) {
		super(name, category);
	}
	public void howl() {
		super.howl();
		System.out.println("야옹~!!");
	}
}


class Dog extends Animal{
	
	public Dog(String  name, String category) {
		// 부모 생성자를 호출 super()
		super(name, category);
		
//		super.setName(name);
//		super.setCategory(category);
	}
	

	@Override
	public void howl() {
		// 부모의 메서드 내용
		super.howl();
		System.out.println("멍멍~!!");
	}
	
}



class Animal{ // 부모 클레스
	private String  name; // 이름
	private String category; // 종
	
	//생성자 => 상속 안됨
	public Animal() {}
	public Animal(String  name, String category) {
		this.name = name ;
		this.category = category;
	}
	
	// 출력메서드
	public void printInfo() {
		System.out.println("이름 " + name + "(" + category + ")");
	}
	
	// 울음소리 출력메서드
	public void howl() {
		System.out.println("--" + name + "의 울음소리");
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
	
	