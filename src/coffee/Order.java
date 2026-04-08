package coffee;

public class Order {
	private Coffee coffee;
	private int count;
	private Size size;
	private Option option;
	
	public Order(Coffee coffee, int count, Size size, Option option) {
		this.coffee = coffee;
		this.count = count;
		this.size = size;
		this.option = option;
	}
	
	// 가격 계산 메서드
	public int getTotalPrice() {
		return (coffee.getPrice() + size.getSize() + option.getOption()) * count;
	}
	
	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}

	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
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
		return coffee + " / "  +  size + " / " + option + " / " +  count + "개" + " => "+ getTotalPrice();
	}

}