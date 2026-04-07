package word;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
				// map을 활용한 단어장 프로그램 작성
				/* 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
				 * map => 단어 : 뜻
				 * 
				 * main => 어떤 기능을 할지 메뉴 출력
				 * WordController 구현
				 * */
		WordController wc = new WordController();
				
				// 단어 미리 등록
				wc.addWord();
				
				Scanner scan = new Scanner(System.in);
				
				int menu = 0;
				do {
					
					System.out.println("1.단어등록|2.단어검색|3.단어수정|\n4.단어출력|5.단어삭제|6.종료");
					System.out.println("선택>");
					try {
						menu = scan.nextInt();
						
						switch(menu) {
						case 1: wc.insertWord(scan); break;
						case 2: wc.searchWord(scan); break;
						case 3: wc.modifyWord(scan); break;
						case 4: wc.printWord(); break;
						case 5: wc.removeWord(scan); break;
						case 6: System.out.println("종료"); break;
						default: System.out.println("잘못된 메뉴입니다.");
						}	
						
					} catch (InputMismatchException e) {
						System.out.println("입력값이 잘못되었습니다.");
						scan.nextLine(); // 입력버퍼 지우기.
						
					} catch (Exception e) {
						System.out.println("다시 입력해주세요.");
						scan.nextLine();
					}
					
				}while(menu != 6);

				scan.close();


	}

}
