package superProduct;

public class Product {
	
	// 클래스 생성시 필여한 사항 : 맴버변수, 생성자, getter/setter, toString, 매서드(필요시 사용)
	
	// 판매할 물건 객체 : 이름, 가격
	// 맴버변수 
	private String name;
	private int price;
	
	// 생성자 => new 키워드 뒤에서 딱 한번만 실행
	public Product() {}
	public Product (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 이름과 가격을 다시 등록하는 메서드(set을 사용해도 상관없다.)
	public void insertProduct (String name, int price) {
		this.name= name;
		this.price = price;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) { // 값을 지정
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) { // 값을 지정
		this.price = price;
	}
	@Override
	public String toString() {
		return name + ":" + price;
	}
	
	
	
	
	
	
	
	
}
