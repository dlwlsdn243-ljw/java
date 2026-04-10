package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Controller c = new Controller();
		
		List<Customer>list = new ArrayList<>();
		
		list.add(new Customer("홍길동", "우리은행", "111-11111-11111"));
		list.add(new Customer("철수", "신한은행", "2222-22222-222221"));
		list.add(new Customer("유리", "우리은행", "333-33311-1133331"));
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("은행을 선택해 주세요.");
		String bank = scan.next();
		
		System.out.println("계좌번호를 만들어 주세요.");
		String me = scan.next();
		
		
		
		
		
		int menu = 0;
		do {
			System.out.println("은행 입출금 프로그램");
			System.out.println("1.입금|2.출금|3.송금|4.계좌확인|5.종료");
			System.out.println("선택");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1 : c.saveMoney(scan); break;
			case 2 : c.minusMoney(scan); break;
			case 3 : 	break;
			case 4 : 	break;
			case 5 :System.out.println("종료합니다."); break;
			default: System.out.println("잘못된 메뉴입니다.");
			}
			
		} while (menu != 5);
		
		scan.close();

	}

}