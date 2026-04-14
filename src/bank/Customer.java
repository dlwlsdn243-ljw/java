package bank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
//	은행입출금 프로그램
//	1.입금 | 2.출금 | 3.송금 | 4.계좌확인 | 5.종료
//	- 우리은행 / 신한은행 -> 은행설정
//	- 고객등록 -> 은행당 3명씩
//	- 본인계좌 설정
//	- 입금, 출금, 송금시 본인계좌 파일로 기록
//	- 파일이름은 본인이름_은행이름
	
	
	private String customerName; // 고객 이름
	private String customerBank; // 고객 은행
	private String number; // 고객 계좌번호
	private int money;

	List<Customer>list = new ArrayList<>();
	
	public Customer() {}
	public Customer(String customerName, String customerBank, String number) {
		this.customerName = customerName;
		this.customerBank = customerBank;
		this.number = number;
		this.money = money;
	}
	

	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerBank() {
		return customerBank;
	}
	public void setCustomerBank(String customerBank) {
		this.customerBank = customerBank;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerBank=" + customerBank + ", number=" + number + "]";
	}
	
}
