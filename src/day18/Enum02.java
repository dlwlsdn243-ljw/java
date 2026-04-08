package day18;

enum Category {
	// 상품 카테고리 (부가세)
	FOOD(0.1), // 식품 : 10%
	CLOTHING(0.08),  // 의류 : 8%
	ELECTRONICS(0.15); // 전자제품 : 15%
	
	// 부가세 변수
	private final double vatRate;
	
	Category(double vatRate) {
		this.vatRate = vatRate;
	}

	public double getVatRate() {
		return vatRate;
	}
	
}

// 상품 클래스 : name, Category, price(원가) + 부가세 = 가격책정
class Product{
	private String name;
	private Category category;
	private int price;
	
	public Product() {}
	public Product(String name, Category category, int price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
	// 부가세 포함 가격 계산
	public int getPriceWithVAT() {
		double vat = price * category.getVatRate();
		return (int)(price + vat);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
}

public class Enum02 {

	public static void main(String[] args) {
		// 물건 객체를 생성하고 물건의 정보를 출력
		Product p = new Product("맥북프로", Category.ELECTRONICS,2000000);
		System.out.println(p);
		System.out.println("지불가격 : " + p.getPriceWithVAT());
		
		Product p2 = new Product("봄 자켓", Category.CLOTHING,1000000);
		System.out.println(p2);
		System.out.println("지불가격 : " + p2.getPriceWithVAT());
		
		Product p3 = new Product("음식", Category.FOOD,200000);
		System.out.println(p3);
		System.out.println("지불가격 : " + p3.getPriceWithVAT());

	}
	

}
