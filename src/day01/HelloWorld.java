package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// 실행 메서드
		// 주석 : (코드 제외되는 공간) 한줄주석
		/*  여러줄 주석
		 * 
		 *  console : 출력공간
		 *  String : 문자열을 처리하는 클래스 => "문자열"
		 * 
		 * */ 
		
		System.out.println("hello world ~~!!!!"); // 출력방법
		System.out.println("abcdef"); // java의 끝은 ; 마무리
		
		int b = 30; // int -> 기본값
		System.out.println(b);
		long lo = 12345678945L; // 접미사 l/L
		System.out.println(lo);
		
		double a = 3.14123123123; // double -> 기본값
		System.out.println(a);
		float f = 1.1f;
		System.out.println(f);// 접미사 f/F
		
		// 반드시 작은따옴표(' ')를 사용하여 묶어줘야 함
		char ch = 'a';
		System.out.println(ch);
		
		//원래 클래스는 정의한느 방법이 다르지만, 
		// String만은 예외로 자료형처럼 정의 가능
		String str = "Hello World";
		System.out.println(str);
		
		int aCount = 100;
		int ACOUNT = 200; // 대문자로 시작하는 변수는 상수
		System.out.println(aCount + ACOUNT);

	}

}
