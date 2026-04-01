package superProduct;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		/* 1. 전체 상품 보여주기
		 * 2. 주문 > 상품, 수량 받기
		 * 3. 반복주문 가능 => 종료 키워드를 생성하여 반복 주문가능하도록
		 * 4. 주문이 완료되었습니다. => 전체 주문내역 / 총지불금액 출력 
		 * 
		 * ex) 
		 * 김밥  2  3000 =>  6000
		 * 라면  2  1500 =>  3000
		 * 사이다 2  500  =>  1000
		 * ------------------------
		 *  총 지불금액 		10000
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		Product[] menu = new Product[5]; // 판매제품을 담는 배열
		menu[0] = new Product("떡볶이", 3000);
		menu[1] = new Product("김밥", 4000);
		menu[2] = new Product("라면", 5000);
		menu[3] = new Product("사이다", 1000);
		menu[4] = new Product("콜라", 1000);
		
		Order[] order = new Order[5];  // 주문내역을 담는 배열
		
		int cnt=0; // index 역할
		
		// 주문하시겠습니까? (y/n)
		String ok = "y";
		while(!ok.equals("n")) {
			// ok.equals("y") 사용하지 않는 이유 : 다른 키워드가 왔을 때 반복 처리
			System.out.println("주문하시겠습니까? (y/n)");
			ok = scan.next();
			
			if(ok.toLowerCase().equals("y")){
				for(int i=0; i<menu.length; i++) {
					System.out.println((i+1)+"."+menu[i]); // toString
				}
				
				System.out.println("메뉴를 선택해주세요>");
				int menuNo = scan.nextInt();
				
				System.out.println("수량>");
				int count = scan.nextInt();
				
				Order o = new Order(menu[menuNo-1].getName(), 
						menu[menuNo-1].getPrice(), count);
				
				// 배열에 추가하기 전에 배열이 꽉찼는지 확인!!
				if(order.length == cnt) {
					// 배열을 늘려주기 (배열복사)
					Order[] tmp = new Order[order.length+3];
					// 기존의 주문내역(order)을 tmp 배열에 복사
					System.arraycopy(order, 0, tmp, 0, order.length);
					
					// 배열 바꾸기 (주소이동)
					order = tmp;
				}
				order[cnt] = o;
				cnt++;
				
			}else if(ok.toLowerCase().equals("n")) {
				System.out.println("주문을 종료합니다.");
				break;
			}else {
				System.out.println("y/n을 선택해주세요.");
			}
			
		}
		
		System.out.println("--주문내역 출력--");
		int sum = 0; // 총 지불금액 
		
		for(int i=0; i<cnt; i++) {
			System.out.println(order[i]);
			sum += order[i].getTotal();
		}
		System.out.println("총 지불금액 : "+sum);
		
		scan.close();

	}

}
