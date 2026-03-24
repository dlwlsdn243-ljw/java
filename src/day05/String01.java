package day05;

public class String01 {

	public static void main(String[] args) {
		// String class : 문자열을 다르기 위한 클래스 => 참조 자료형
		/* class : 여러가지 기능을 가지고 있는 정의서
		 * 클래스타입 객체명 = new 클래스타입(생성자);
		 * Strin str = new String(); => 가능은 하지만 쓰지않음
		 * 
		 * */
		
		String str = "abc c def c";
		System.out.println(str);
		
		// length : 전체 글자수(공백도 1글자)
		System.out.println("---length---");
		System.out.println(str.length());
		
		// charAt(index) : index 번지에 있는 문자를 반환 => char
		System.out.println("---charAt()---");
		System.out.println(str.charAt(1));
		
		// substring : 필요한 문자열 추출
		System.out.println("---substring()---");
		System.out.println(str.substring(4)); // 4부터 끝까지 c def c
		System.out.println(str.substring(0,3)); // 0부터 3전까지 abc
		
		// equals() : 두 문자가 같은지 비고(대소문자 구분) 
		// 참조 자료형에서 == 로 비교하면 주소가 같은지 비교
		// 같으면 true / false
		System.out.println("---equals()---");
		System.out.println(str.equals("abc"));
		System.out.println(str.equals("abc c def c"));
		System.out.println(str.equals("abc C def c"));
		
		// indexOf() : 문자의 위치(index)를 찾아주는 기능
		// 한 문자열에 같은 단어가 여러개면 처음 일치하는 값만 리턴
		// 찾는 문자열이 없으면 -1 리턴
		// 시작위치를 지정할 수 있음
		System.out.println("---indexOf()---");
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf("c" , 3));
		
		// lastIndexOf() : 뒤에서 부터 찾기
		System.out.println("---lastIndexOf()---");
		System.out.println(str.lastIndexOf("c"));
		
		// ex) email에서 id만 추출
		System.out.println("---email에서 id만 추출---");
		String email = "abc123456@naver.com";
		
		int i = email.indexOf("@");
		String id = email.substring(0, i);
		System.out.println(id);
		
		String id2 = email.substring(0, email.indexOf("@"));
		System.out.println(id2);
		
		// ex) email에서 @ 주소만 추출
		System.out.println("---email에서 @ 주소 추출---");
		String e = email.substring(email.indexOf("@") + 1);
		System.out.println(e);
		
		// str.compareTo(str2) : str(기준), str2 비교하여
		// 사전순으로 기준값이 비교값보다 앞에있으면 -, 같으면 0, 뒤면 +값으로 리턴
		// 문자 정렬시 사용
		System.out.println("---compareTo---");
		System.out.println("a".compareTo("e")); // e 기준으로 a가 뒤로 4칸
		System.out.println("e".compareTo("a")); // e 기준으로 a가 앞으로 4칸
		
		
		
		// concat : 이어붙이기 ( + 연결연산자와 같은 의미 )
		System.out.println("---concat---");
		System.out.println("abc".concat("def"));
		System.out.println("abc"+ "def");

	}

}
