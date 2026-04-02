package costomExcepion;

public class Product {
//	Product - 판매 물품 클래스
//	이름, 가격, 재고 
//	- 메서드로 throw new 발생
//	주문 량에 따라 재고가 부족하면 throw new 발생
//	OutOfStockException("재고부족")
//	 안내
	private String name; // 이름
	private int price; // 가격
	private int stock; // 재고
	
	public Product() {}
	public Product(String name) {
		this.name = name;
		this.price = 1000;
		this.stock = 10;
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
	

}
