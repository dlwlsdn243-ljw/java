package superProduct;

public class Order extends Product{
	// 주문 클래스 : {재품명, 가격}, 수량, 금액
	// 제품명과 가격 이미 생겨남 => Product 클래스에 맴버변수를 사용가
	// 부모의 맴버를 사용할 때 : super.메서드명 / super.맴버변수명
	
	// 맴버변수 
	private int count; // 주문수량
	private int total; // 한 주문에 대한 주문 금액
	
	// 생성자 
	public Order() {}
	public Order(String name, int price, int count) {
		super.setName(name);
		super.setPrice(price);
		this.count = count;
		this.total = super.getPrice() * this.count;
	}
	
	// total 계산 메서드
	public void totalCalc() {
		this.total = super.getPrice() * this.count;
	}

	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		// 이름 가격 수량 금액
		return " [" + super.getName()+ "  " +  super.getPrice() + "  " + count + "  " + total + "]";
	}
	
	
	
}
