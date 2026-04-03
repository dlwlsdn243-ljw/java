package studentManager.copy;

public class Subject {
	// 과목정보 클래스  => 과목 1개
	// 과목정보 : 과목코드, 과목명, 시수, 강사명, 강의장
	// 멤버변수 -> 생성자 -> getter/setter -> toString
	
	private String subjectCode;
	private String subjectName;
	private String subjectTime;
	private String subjectProfessor;
	private String subjectRoom;
	
	public Subject() {}

	public Subject(String subjectCode, String subjectName, String subjectTime, String subjectProfessor,String subjectRoom) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectTime = subjectTime;
		this.subjectProfessor = subjectProfessor;
		this.subjectRoom = subjectRoom;
	}
	
	public Subject(String subjectCode, String subjectName) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectTime = "3";
		this.subjectProfessor = "홍길동";
		this.subjectRoom = "A강의장";
	}
	
	// 출력 메서드
	public void printSubject() {
		System.out.println(subjectName+"("+subjectCode+")"+"/"+subjectRoom);
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectTime() {
		return subjectTime;
	}

	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}

	public String getSubjectProfessor() {
		return subjectProfessor;
	}

	public void setSubjectProfessor(String subjectProfessor) {
		this.subjectProfessor = subjectProfessor;
	}

	public String getSubjectRoom() {
		return subjectRoom;
	}

	public void setSubjectRoom(String subjectRoom) {
		this.subjectRoom = subjectRoom;
	}

	@Override
	public String toString() {
		return "Subject [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectTime=" + subjectTime
				+ ", subjectProfessor=" + subjectProfessor + ", subjectRoom=" + subjectRoom + "]";
	}
	
}
