package bank;

import java.util.Scanner;

public class Controller {
	
	private int money;

	
	public Controller() {}
	public Controller (int money) {
		this.money = money;
		
		
	}
	
	public void saveMoney(Scanner scan) {
		System.out.println("입금할 금액을 적어주세요.");
		int i = scan.nextInt();
		this.money += i;
		System.out.println("입금 : " + i + "/ 잔액 : " + this.money);
	}
	
	public void minusMoney(Scanner scan) {
		System.out.println("출금할 금액을 적어주세요.");
		int i = scan.nextInt();
		if (i > this.money) {
			System.out.println("출금할 금액이 없습니다.");
			return;
		}
		this.money -= i;
		System.out.println("출금 : " + i + "/ 잔액 : " + this.money);
	}
	
	
	public void sendMoney(Scanner scan) {
		System.out.println("송금할 사람 계좌번호를 입력해 주세요.");
		String k = scan.next();
		
		System.out.println("송금할 금액을 적어주세요.");
		int i = scan.nextInt();
		
		if(i > this.money) {
			System.out.println("송금할 금액이 없습니다.");
			return;
		}
		
		
	

	}
	
	public void balance()  {
		System.out.println("계좌 확인");

		
		
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Controller [money=" + money + "]";
	}
	

}
