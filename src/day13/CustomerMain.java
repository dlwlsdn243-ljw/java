package day13;

import java.util.zip.CheckedOutputStream;

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
		Customer[] customer = new Customer[10];
		customer[0] = new Customer("1", "홍길동");
		customer[1] = new GoldCustomer("2", "최순자");
		customer[2] = new VIPCustomer("3", "박순철", "영이", "1001");
		customer[3] = new Customer("4", "최길동");
		customer[4] = new GoldCustomer("5", "김길동");
		customer[5] = new VIPCustomer("6", "황길동",  "영이", "1001");
		customer[6] = new Customer("7", "고길동");
		customer[7] = new GoldCustomer("8", "이길동");
		customer[8] = new VIPCustomer("9", "김순신",  "영이", "1001");
		customer[9] = new VIPCustomer("10", "김순신",  "순이", "1002");
		
		System.out.println("-- 할인율과 포인트 계산 출력 --");
		
		int price = 100000;
		for (int i=0; i<customer.length; i++) {
			int salePrice = customer[i].calcPrice(price); // 보너스 계산 끝
			customer[i].printInfo();
			System.out.println("지불금액 : " + salePrice);
		}
		
		price = 150000;
		for (int i=0; i<customer.length; i++) {
			int salePrice = customer[i].calcPrice(price); // 보너스 계산 끝
			customer[i].printInfo();
			System.out.println("지불금액 : " + salePrice);
		}
		// 다운캐스팅 사용예시
		// 상담사 영이 (1001) => 철이(1003)
		for (int i=0; i<customer.length; i++) {
			if(customer[i] instanceof VIPCustomer) {
				VIPCustomer vip = (VIPCustomer)customer[i];
				if(vip.getAgentName().equals("영이")) {
					vip.setAgentName("철이");
					vip.setAgentNum("1003");
				}
			}
		}
		
		// vip고객 리스트
		System.out.println("--VIP 고객정보 리스트--");
		for (int i=0; i<customer.length; i++) {
			if(customer[i] instanceof VIPCustomer) {
				customer[i].printInfo();
			}
//			if (customer[i].getCustomerGrade().equals("VIP")) {
//		}
		}
	}
}

	class Customer {
		// 멤버변수 : 고객ID, 고객명, 등급, 보너스포인트(적립), 적립비율
		
		/* 등급 
		 * Silver(기본) / Gold / VIP
		 * - Silver : 제품 구입시 할인 0% / 보너스 포인트 적립 1%
		 * - Gold : 제품 구입시 할인 5% / 보너스 포인트 적립 3%
		 * - VIP : 제품 구입시 할인 10% / 보너스 포인트 적립 5%
		 * - VIP 등급은 전담 상담사 멤버변수를 추가(agentName, agentNum)
		 * */
		private String customerID;
		private String customerName;
		private String customerGrade; // 등급
		private int bonusPoint; 
		private double bonusRatio; // 적립비율
		
		// 생성자, getter/setter, toString
		public Customer() {
			
		}
		public Customer(String customerID, String customerName) {
			this.customerID = customerID;
			this.customerName = customerName;
			this.customerGrade = "Silver";
			this.bonusRatio = 0.01;
		}
		
		// 메서드
		// 구매금액 보너스 포인트 누적 => 결제 금액 리턴
		// 매개변수 : 구매금액 => int price
		// 리턴타입 : 결제금액 리턴 => int
		public int calcPrice(int price) {
			int point = (int)(price * bonusRatio);
			this.bonusPoint += point;
			// 실버등급은 할인율이 없음. 
			return price;
		}
		
		// 출력메서드
		// - 홍길동님은 VIP고객이며, 현재 보너스포인트는 5000점입니다.
		public void printInfo() {
			System.out.print(customerName+"님은 "+customerGrade+"고객이며, ");
			System.out.println("현재 보너스포인트는 "+ bonusPoint+"점입니다.");
		}
		
		public String getCustomerID() {
			return customerID;
		}
		public void setCustomerID(String customerID) {
			this.customerID = customerID;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerGrade() {
			return customerGrade;
		}
		public void setCustomerGrade(String customerGrade) {
			this.customerGrade = customerGrade;
		}
		public int getBonusPoint() {
			return bonusPoint;
		}
		public void setBonusPoint(int bonusPoint) {
			this.bonusPoint = bonusPoint;
		}
		public double getBonusRatio() {
			return bonusRatio;
		}
		public void setBonusRatio(double bonusRatio) {
			this.bonusRatio = bonusRatio;
		}
		@Override
		public String toString() {
			return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
					+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
		}
		
	}

class GoldCustomer extends Customer {
	// 상속받은 Customer에 없는 멤버변수만 선언
	// gold / vip => 할인율 존재
	private double saleRatio;
	
	public GoldCustomer() {}
	public GoldCustomer(String id, String name) {
		super(id, name); // 부모의 생성자 호출
		super.setCustomerGrade("Gold");
		super.setBonusRatio(0.03);
		this.saleRatio = 0.05;
	}
	
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price); // 부모의 메서드를 호출해서 가격을 주고 보너스 적립 가격을 리턴
//		this.bonusPoint += (int)(price * bonusRatio);
		return price - (int)(price * saleRatio);
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	@Override
	public String toString() {
		return "GoldCustomer [saleRatio=" + saleRatio + "]";
	}
	
}
class VIPCustomer extends Customer {
	/* - VIP : 제품 구입시 할인 10% / 보너스 포인트 적립 5%
	 * - VIP 등급은 전담 상담사 멤버변수를 추가(agentName, agentNum)*/
	private double saleRatio;
	private String agentName;
	private String agentNum;
	
	public VIPCustomer() {}
	public VIPCustomer(String id, String name, String agentName, String agentNum) {
		super(id, name); // 부모 생성자 호출
		super.setCustomerGrade("VIP");
		super.setBonusRatio(0.05);
		this.saleRatio = 0.1;
		this.agentName = agentName;
		this.agentNum = agentNum;
	}
	
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		return  price - (int)(price * saleRatio);
	}
	
	@Override
	public void printInfo() {
		// 기존 출력 내용은 유지
		// - 전담 상담사는 짱구이고, 번호는 1111입니다. <- VIP만
		super.printInfo();
		System.out.println("전담 상담사는 "+agentName+"이고, 번호는 "+agentNum+"입니다.");
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentNum() {
		return agentNum;
	}
	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}
	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentName=" + agentName + ", agentNum=" + agentNum + "]";
	}
	
	
}