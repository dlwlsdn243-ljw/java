package genericsProduct;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
		// Product class => generic으로 생성
		// main menu
		// 1.메뉴추가|2.메뉴보기|3.제품주문|4.주문내역보기|5.종료
		
		Scanner scan = new Scanner(System.in);
		ProductController pc = new ProductController();
		
		pc.addMenu();
		
		int menu = 0;
		while(true) {
			System.out.println("1.메뉴추가|2.메뉴보기|"
					+ "3.제품주문|4.주문내역보기|5.종료");
			System.out.println("선택>");
			
			try {
				menu = scan.nextInt();
				
				if(menu == 5) {
					System.out.println("종료");
					break;
				}
				
				switch(menu) {
				case 1: pc.insertMenu(scan); break;
				case 2: pc.print(); break;
				case 3: pc.orderPick(scan); break;
				case 4: pc.orderPrint(); break;
				case 5:  break;
				default: System.out.println("잘못된 메뉴입니다.");
				}
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("입력값이 잘못되었습니다.");
				scan.nextLine();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("다시입력해주세요.");
				scan.nextLine();
			}
			
			
		}
		
		scan.close();

	}

}

