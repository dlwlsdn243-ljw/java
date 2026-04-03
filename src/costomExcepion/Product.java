package costomExcepion;

public class Product {
	// 이름, 가격, 재고 
	private String name;
	private int price;
	private int stock; //재고
	
	public Product() {}
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	// 메서드 
	/* - 메서드로 throw new 발생
		주문 량에 따라 재고가 부족하면 throw new 발생
		OutOfStockException("재고부족") 안내
		 매개변수 : 주문수량
		 리턴타입 : void
	 * */
	public void decreaseStock(int count) throws Exception {
		if(count > stock) {  // 재고보다 주문량이 많다면...
			throw new OutOfStockException("재고부족");
		}
		stock -= count;
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
