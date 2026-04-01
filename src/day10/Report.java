package day10;

import java.text.DecimalFormat;

public class Report {
	
	// 한 사람의 성적표
	
	// 멤버변수 : 이름	 국어  영어  수학  합계  평균  등수
	// 생성자 (이름, 국어, 영어, 수학)
	// 합계, 평균 계산
	// 출력 
	// 평균은 소수점 2자리 DecimalFormat("##.00")
	// getter/setter
	
	private String name; 
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;
	
	//생성자
	public Report() {}
	
	
	public Report(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total(); // 계산 
	}
	
	// 합계 평균 계산 메서드
	public void total() {
		this.sum = kor + eng + math;
		this.avg = sum / (double)3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.00");
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + 
				sum + "\t" + df.format(avg) + "\t" + rank;
	}
	
}