package studentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/*  1. 학생 등록
			2. 학생 리스트 출력
			3. 학생 검색(학생정보, 수강정보)
			4. 수강신청 (한 학생에 대한)
			5. 수강철회 (한 학생에 대한)
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		StudentContraller sc = new StudentContraller();
		Student sc2 = new Student();
		             
		// 샘플 데이터 호출할 위치
		sc.addStudent();
		sc.addSubject();
		
//		sc.printSubList();
		
		int menu = 0;
		do {
			System.out.println("--선택--");
			System.out.println("1.학생등록|2.학생리스트|3.학생조회");
			System.out.println("4.수강신청|5.수강철회|6.종료");
			System.out.println("선택>");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sc.insertStudent(scan); break;
			case 2: sc.printStudentList(); break;
			case 3: sc.searchStudent(scan); break;
			case 4: sc.insertSubject(scan); break;
			case 5: sc.deleteSubject(scan); break;
			case 6: System.out.println("종료합니다."); break;
			default: System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu != 6);
		
		
		
//		sc2.printInfo();
		
		
		scan.close();

	}

}

