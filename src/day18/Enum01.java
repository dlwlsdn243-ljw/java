package day18;

public class Enum01 {

	enum Company {
		SK, LG, KT, 알뜰폰
	}
	
	public static void main(String[] args) {
		// eunm (Eunmeration) : 열거형
		/* 프로그램에서 서로 관련있는 상수들의 집합을 나타내는 자료형
		 * 코드 가독성을 높이고 안정성을 높이기 위해 사용
		 * - 특성값의 집합을 명명된 형태로 정의하여 해당 값들로만 변수를 제한
		 * */
		
		Enum01 en = new Enum01();
		en.testCompany(Company.KT);

	}
	
	public void testCompany(Company Company) {
		switch(Company) {
		case SK: System.out.println("통신사 : " + Company); break;
		case LG: System.out.println("통신사 : " + Company); break;
		case KT: System.out.println("통신사 : " + Company); break;
		case 알뜰폰 :System.out.println("통신사 : " + Company); break;
		}
	}

}
