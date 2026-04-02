package costomExcepion;

public class Order extends Product{
	
//	order - 구매 클래스
//	이름, 몇개
	
	private int count; // 주문수량
	
	public Order () {}
	public Order (String name, int count) {
		super.setName(name);
		this.count = count;
	}
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Order [count=" + count + "]";
	}

}
