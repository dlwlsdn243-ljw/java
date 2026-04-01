package day11;

public class Product {
	// 상품(Product) class: 상품, 가격(판매금액) (부모)
	
	// 맴버변수
	private String name;
	private int price;
	
	// 생성자
	public Product() {}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 상품 추가하는 메서드 (편리성을 위해 추가-없어도 됨)
	// 객체 생성 이후에 값을 추가해야 할 경우
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}


	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + name + ":" + price + "]";
	}

}
