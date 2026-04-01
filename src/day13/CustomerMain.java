package day13;

public class CustomerMain {

	public static void main(String[] args) {
		// 백화점 고객
		/* - 일반고객(적립) / Gold고객(할인 + 적립) / VIP고객(할인 + 적립)
		 * 		부모		  			자식					자식
		 * 고객 => Customer (부모)
		 *    - 맴버변수 : 고객ID, 고객명, 등급, 보너스포인트(적립), 적립비율
		 *    
		 *    - 기본등급 : Silver
		 *    - 기본 적립비율 : 구매금액의 1% 적립
		 * 
		 * 등급
		 * Silver(기본) / Gold / VIP
		 *     - Silver : 제품 구입시 할인 0% / 보너스 포인트 적립 1%
		 *     - Gold : 제품 구입시 할인 5% / 보너스 포인트 적립 3%
		 *     - VIP : 제품 구입시 할인 10% / 보너스 포인트 적립 5%
		 *     - VIP 등급은 전달 상담사 맴버변수를 추가 (agentName, agentNum)
		 *     
		 * 1. 보너스 적립 계산 메서드
		 * 	- 구매금액의 적립 보너스 계산 => 누적 적립
		 * 	- 보너스 적립, 할인여부도 체크하여 구매금액을 리턴
		 * 2. 출력
		 * 	- 홍길동님은 VIP고객이며, 현재 보너스 포인트는 5000점 입니다.
		 * 	- 전담 상담사는 짱구이고 번호는 1111입니다. <- VIP만
		 * */
		Customer[] customer = new Customer[5];
		
		Customer c = new Customer();
		c.print();
	}

}

class Customer{
	//고객ID, 고객명, 등급, 보너스포인트(적립), 적립비율
	private String nameId;
	private String name;
	private String grade;
	private int bonusPoint;
	private double total;//적립비율
	
	public Customer() {}
	public Customer(String nameId, String name) {
		this.nameId = nameId;
		this.name = name;
		this.grade = "silver";
		this.bonusPoint = 0;
		this.total = 0.01;
	}
	
//	 * 등급
//	 * Silver(기본) / Gold / VIP
//	 *     - Silver : 제품 구입시 할인 0% / 보너스 포인트 적립 1%

	public int Bonus(int price) {
		this.bonusPoint += (int)(price * total);
		return price;
	}
	
	public void print() {
		System.out.println(name + "님은 " + grade + "고객이며, 현재 보너스 포인트는 " + bonusPoint + "점입니다.");
	}
	
	
	public String getNameId() {
		return nameId;
	}
	public void setNameId(String nameId) {
		this.nameId = nameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		grade = grade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		bonusPoint = bonusPoint;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Customer [nameId=" + nameId + ", name=" + name + ", grade=" + grade + ", bonusPoint=" + bonusPoint
				+ ", total=" + total + "]";
	}


}
//*     - Gold : 제품 구입시 할인 5% / 보너스 포인트 적립 3%
//*     - VIP : 제품 구입시 할인 10% / 보너스 포인트 적립 5%
//*     - VIP 등급은 전달 상담사 맴버변수를 추가 (agentName, agentNum)+
class GoldCustomer extends Customer{
	
	private String grade;
	private int bonusPoint;
	private double total;//적립비율
	private double total2; //할인율
	
	public GoldCustomer() {}
	public GoldCustomer(String nameId, String name) {
		super.setNameId(nameId);
		super.setName(name);
		this.grade = "Gold";
		this.bonusPoint = 0;
		this.total = 0.03; 
	}
//	public int Bonus(int price) {
//		this.bonusPoint += int(price*total);
//		
//	}
}
