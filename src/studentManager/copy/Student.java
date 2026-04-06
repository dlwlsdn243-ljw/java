package studentManager.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
	// 학생정보 클래스 => 학생 1명
	// 학번, 이름, 나이, 전화번호, 주소, 수강과목[5]
	// 멤버변수에 배열이 존재하면 index 역할을 하는 변수가 필요
	private String studentNumber;
	private String studentName;
	private int studentAge;
	private String studentPhone;
	private String studentAddress;
	// 학생 1명당 본인이 수강신청한 과목의 목록
	private List<Subject> subjectList = new ArrayList<Subject>();
	//private int cnt; // index
	
	// 생성자
	public Student() {}
	
	// equals 용 생성자
	public Student(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Student(String studentNumber, String studentName, int studentAge, String studentPhone,
			String studentAddress) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentPhone = studentPhone;
		this.studentAddress = studentAddress;
	}
	
	public Student(String studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAge = 20;
		this.studentPhone = "010-1111-1111";
		this.studentAddress = "서울시";
	}
	
	// 수강과목이 존재하는지 확인하는 메서드
	public boolean nullCheck(Subject sub) {
		if(sub == null) {
			return false;
		}
		if(sub.getSubjectCode().isBlank()) {
			System.out.println("수강정보가 없습니다.");
			return false;
		}
		return true;
	}
	
	// 수강과목 객체가 들어오면 내 수강배열에 추가
	// 1. 해당 배열에 이미 동일과목이 있는경우 => 이미 추가한 과목입니다.
	
	public void insertSubject(Subject sub) {
		// nullCheck 메서드로 분리
		if(!nullCheck(sub)) {
			return;
		}
		
		
		// list에 해당 sub 객체가 있는지 확인 있으면 true / false
		//boolean check = subjectList.contains(sub);
		if(subjectList.contains(sub)) {
			System.out.println("이미 추가한 과목입니다.");
			return;
		}
		
		subjectList.add(sub);
		System.out.println("수강신청 완료!!");
	}
	
	// 수강과목 객체가 들어오면 내 수강배열에서 삭제 
	// list method => remove(index) / remove(object) 
	public void deleteSubject(Subject sub) { // 코드만 있는 Subject 객체
	
		// nullCheck 메서드로 분리
		if(!nullCheck(sub)) {
			return;
		}
		
		if(subjectList.remove(sub)) { // 삭제가 되면 true / false
			System.out.println("수강철회 완료!!");
			return;
		}
		System.out.println("찾는 과목이 없습니다.");	
		
	}
	
	
	
	// 출력 메서드
	// 개인정보를 출력하는 메서드
	public void printInfo() {
		System.out.println(studentName+"("+studentNumber+") / "+studentAge);
		System.out.println(studentPhone+" / "+ studentAddress);
	}
	
	// 수강정보 확인 후 있으면 출력하는 메서드
	public void printSubjectList() {
		if(subjectList.size() == 0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		for(int i=0; i<subjectList.size(); i++) {
			System.out.print(i+1+". ");
			subjectList.get(i).printSubject();
			//System.out.println(subjectList[i]); // toString
		}
		System.out.println("---------------");
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentPhone=" + studentPhone + ", studentAddress=" + studentAddress + ", subjectList="
				+ subjectList + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentNumber, other.studentNumber);
	}
	
	
}