package day11;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		/* 상품(Product) class: 상품, 가격(판매금액)
		 * 주문(Order) class: 상품, 개수, 가격(판매금액), 금액(개수*가격)
		 * 
		 * 주문출력 (하나의 주문에 대한 출력)
		 * 마지막에 총 지불금액 출력
		 * */
		
		/* 1. 전체 상품 보여주기
		 * 2. 주문 > 상품, 수량 받기
		 * 3. 반복주문 가능 => 종료 키워드를 생성하여 반복 주문 가능하도록
		 * 4. 주문이 완료되었습니다. => 전체 주문내역/ 총지불금액 출력
		 * 
		 * ex) 
		 * 김밥   2 	 3000  =>  6000 
		 * 라면   2 	 1500  =>  3000
		 * 사이다  2 	  500  =>  1000
		 * ----------------------
		 * 총 지불금액 		   10000
		 * 
		 * */
		
		// 1. 판매할 상품 등록 Product[]
		Scanner scan = new Scanner(System.in);
		
		Product[]menu = new Product[5];
		menu[0] = new Product("김밥", 3000);

		// 객체 생성후 => insertProduct 호출 => 배열에 등록
		Product p =  new Product();
		p.insertProduct("라면", 1500);
		menu[1] = p;
		
//		// 생성자를 활용 바로 객체 생성 => 배열에 등록
//		Product p1 =  new Product("제품", 100);
//		
//		// 객체 생성후 => insertProduct 호출 => 배열에 등록
//		Product p2 =  new Product();
//		p2.setName("제품");
//		p2.setPrice(500);
		
		menu[2] = new Product("떡볶이", 3000);
		menu[3] = new Product("볶음밥", 3000);
		menu[4] = new Product("사이다", 3000);
		
		
		

		Order[] order = new Order[5];
		int cnt=0;
		
		char ok = 'y';
//		String ok = "y"; (!ok.equals("n")) // String 일경우
		
		
		while (ok != 'n') {
			System.out.println("주문 (y/n)");
			ok = scan.next().charAt(0);
			
			if (ok == 'n') {
				System.out.println("주문종료");
				break;
			} 
			if (ok == 'y') {
				for(int i=0; i<menu.length; i++) {
					System.out.println((i+1) + "." + menu[i]);
				}
				System.out.println("메뉴 선택");
				// name, price
				int menuNo = scan.nextInt();
				
				System.out.println("수량");
				//count
				int count = scan.nextInt();
				
				String menuName = menu[menuNo-1].getName();
				int price = menu[menuNo -1].getPrice();
				
				// 주문 객체 생성
				Order o = new Order(menuName, price, count);
				// 주문배열에 객체 넣기
				
				// 배열이 꽉차서 넣을 공간이 없을 경우
				// 배열복사
				if (order.length == cnt) {
					// 새배열 생성
					Order[] tmp = new Order[order.length+3];
					//복사
					System.arraycopy(order, 0, tmp , 0, order.length);
					//주소변경
					order = tmp;
				}
				order[cnt] = o;
				cnt++;
				
			} else {
				System.out.println("y/n 선택");
			}
		}
		System.out.println("주문 내역 출력");
		// 총 지불금액
		int sum = 0;
		for (int i=0; i<cnt; i++) {
			System.out.println(order[i]);
			sum += order[i].getTotal();
		}
		if (cnt == 0) {
			System.out.println("주문내역이 없습니다.");
		}
		
		System.out.println("---------");
		System.out.println("총 지불금액 : " + sum);
		

		scan.close();

	}

}
