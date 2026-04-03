package costomExcepion;

public class Order {
	// 이름(product 객체를 멤버변수로...), 수량
	private Product product;
	private int count;
	
	public Order() {}
	public Order(Product product, int count) {
		this.product = product;
		this.count = count;
	}
	
	// 멤버변수로 저장하지 않고 계산 결과만 리턴
	public int getTotalPrice() {
		return product.getPrice() * count;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Order [product=" + product + ", count=" + count + "]";
	}
	
}
