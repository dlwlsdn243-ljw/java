package studentManager.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentContraller implements StudentProgram {
	
	// 학생 배열을 생성 
	private List<Student> student = new ArrayList<>();
	
	// 수강 신청을 위한 과목 목록 배열 : 수강 신청이 가능한 모든 과목 목록
	private List<Subject> subList = new ArrayList<>();
	

	
	// 학생 미리 등록
	public void addStudent() {
		// add 값을 추가할 때 꼭 object를 생성해서 (new) 추가
		// 하나의 객체로 공유
		// Student s = new Student();
//		s.setStudentNumber("1");
//		student.add(s);
//		s.setStudentNumber("2");
//		student.add(s);
		student.add(new Student("1", "이순신", 21, "010-1111-1111", "서울시"));
		student.add(new Student("2", "박철수", 20, "010-1111-1111", "부산시"));
		student.add(new Student("3", "이순이", 20, "010-1111-1111", "광주시"));
		
	}
	
	// 수강과목 미리 등록
	public void addSubject() {
		// (String subjectCode, String subjectName, String subjectTime, String subjectProfessor,
		//String subjectRoom)
		subList.add(new Subject("111", "C언어", "3", "홍길동", "A강의장"));
		subList.add(new Subject("222", "JAVA", "2", "김길동", "B강의장"));
		subList.add(new Subject("333", "javaScript", "3", "최길동", "C강의장"));
		subList.add(new Subject("444", "python", "2", "홍길동", "D강의장"));
		subList.add(new Subject("555", "react", "3", "박길동", "E강의장"));
	}
	
	public String studentNumInput(Scanner scan) {
		System.out.println("학번>");
		return scan.next();
	}
	
	// 수강 신청시 신청가능한 목록을 출력하는 메서드
	public void printSubList() {
		int i=1;
		System.out.println("--수강신청목록--");
		for(Subject s : subList) {
			System.out.print(i+".");
			s.printSubject();
			i++;
		}
		System.out.println("----------------");	
	}

	@Override
	public void insertStudent(Scanner scan) {
		// indexSearch 메서드 사용 후
		// 학번 중복불가 처리
		String num = studentNumInput(scan);
		
		if(student.indexOf(new Student(num)) != -1) {
			System.out.println("학번이 중복됩니다.");
			return;
		}
		
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("나이>");
		int age = scan.nextInt();
		System.out.println("전화번호>");
		String phone = scan.next();
		// 전화번호에서 입력 후 enter가 스캐너 버퍼에 남아있음. 
		scan.nextLine(); // 버퍼에 남아있는 공백을 버림.
		
		System.out.println("주소>");
		 // 한단어로 입력받기 힘들때	
		String address = scan.nextLine(); // 공백 포함 (enter 포함)
		
		// 학생 객체 생성
		Student s = new Student(num, name, age, phone, address);
		student.add(s);
	}


	@Override
	public void printStudentList() {
		// 전체 학생 목록 출력 (수강정보X)
		System.out.println("-- 학생명단 출력 --");
		// 학생 명단이 배열에 다 차있지 않다면 향상된 for문은 못 씀.
		for(int i=0; i<student.size(); i++) {
			student.get(i).printInfo(); // 출력 메서드가 있을 경우
//			System.out.println(student[i]); // toString
		}
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 학생 검색 (학생정보 + 수강정보)
		// 학생의 학번을 입력받아 그 학생의 정보를 출력
		System.out.println("검색할 학생의 학번을 입력>");
		String num = scan.next();
		
		int index = student.indexOf(new Student(num));
		
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		student.get(index).printInfo();
		student.get(index).printSubjectList();
	}

	@Override
	public void insertSubject(Scanner scan) {
		// 수강 신청은 개인별로 한다.
		// 수강신청할 학생의 학번을 입력받아 수강과목 리스트를 출력
		// 수강할 과목 선택 후 => 
		// 해당 과목의 객체를 Student 클래스의 insertSubject로 전달
		System.out.println("학번>");
		String num = scan.next();
		int index = student.indexOf(new Student(num));
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		
		printSubList(); // 과목목록 출력 메서드 호출
		System.out.println("수강과목 선택(번호로 선택)>");
		int subIndex = scan.nextInt(); 
		// 번지 = subList[subIndex-1];
		if(subIndex <= 0 || subIndex > subList.size()) {
			System.out.println("없는과목입니다.");
			return;
		}
				
		// subList[subIndex-1]; => 선택한 과목 객체
		// 학생 클래스에서 과목추가 메서드를 호출
		student.get(index).insertSubject(subList.get(subIndex-1));
		return;

	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강 철회도 개인별로 한다.
		// 철회할 학번을 입력받아 해당 과목이 있는지 체크
		// 과목 번호를 받아 해당 객체를 Student => deleteSubject() 전달
		System.out.println("학번>");
		String num = scan.next();
		
		int index = student.indexOf(new Student(num));
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
		}
		
		// 내가 신청한 수강신청 리스트를 출력
		System.out.println("-- 내수강과목 --");
		student.get(index).printSubjectList();
		System.out.println("철회할 과목코드 (번호로 입력)>");
		int subNum = scan.nextInt();
		
		// 수강과목 print 할 때 번호를 붙여 출력한 경우
		Subject s = student.get(index).getSubjectList().get(subNum-1);
		student.get(index).deleteSubject(s);
				
	}

}