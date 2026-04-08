package day18;

public class Order {
	private Coffee coffee;
	private int count;
	
	public Order(Coffee coffee, int count) {
		this.coffee = coffee;
		this.count = count;
	}
	
	// 가격 계산 메서드
	public int getTotalPrice() {
		return coffee.getPrice() * count;
	}

	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return coffee + " * " + count + " => "+ getTotalPrice();
	}

}