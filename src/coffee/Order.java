package coffee;

import java.util.List;

public class Order {
	
	private Coffee coffee;
	private Size size;
	private List<Option> options;
	private int quantity; // 수량
	
	public Order(Coffee coffee, Size size, List<Option>options, int quantity) {
		this.coffee = coffee;
		this.size = size;
		this.options = options;
		this.quantity = quantity;
	}
	
	
	// 출력 메서드
	public void printOrder() {
		System.out.println("커피:"+coffee);
		System.out.println("사이즈:"+size);
		System.out.println("옵션:"+options);
		System.out.println("수량:"+quantity);
		System.out.println("총금액:"+ getTotalPrice()+"원");
		System.out.println("---------------");
	}
	

	public int getTotalPrice() {
		// 총금액 계산
		int base = coffee.getPrice();
		int sizePrice = size.getExtraprice();
		int optionPrice = options.stream()
				.mapToInt(Option::getOptionPrice)
				.sum();
		
		return (base+sizePrice+optionPrice)*quantity;
	}



	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
