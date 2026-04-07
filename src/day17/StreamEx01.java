package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx01 {

	public static void main(String[] args) {
		// class 생성 Student(이름, 점수)
		
		// Student List 생성 객체 추가 (10명)
		// 출력 => forEach()
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 78));
		list.add(new Student("김순이", 95));
		list.add(new Student("이영이", 89));
		list.add(new Student("박찬호", 68));
		list.add(new Student("최순길", 96));
		list.add(new Student("김순자", 56));
		list.add(new Student("이호영", 45));
		
		list.stream()
		.forEach(n -> System.out.println(n));
		System.out.println("--------");
		// toString 말고 모양내서 출력
		list.stream().forEach(n -> {
			String name = n.getName();
			int score = n.getScore();
			System.out.println("이름:"+name+ " / "+score);
		});
		
		// 점수 합계
		int sum = list.stream()
				.mapToInt(n -> n.getScore())
				.sum();
		System.out.println(sum);
		
		// 전체 인원수
		long count = list.stream()
				.count();
		System.out.println(count);
		
		// 점수가 80점 이상인 학생의 인원수
		long count80 = list.stream()
				.filter(n -> n.getScore() >= 80)
				.count();
		System.out.println(count80);
		System.out.println("------------");
		
		// 이름순으로 정렬
		list.stream()
			.sorted(new Comparator<Student>() {

				@Override
				public int compare(Student o1, Student o2) {
					// 이름 기준 => String => compareTo
					return o1.getName().compareTo(o2.getName());
				}
			})
			.forEach(n -> System.out.println(n));
		
		// 점수가 높은순으로 정렬
		System.out.println("-----------");
		Comparator<Student> byScore = 
				Comparator
				.comparingInt((Student n) -> n.getScore())
				.reversed()
				.thenComparing((Student n) -> n.getName());
		
		Comparator<Student> byScore2 = 
				Comparator
				.comparingInt(Student :: getScore)
				.reversed()
				.thenComparing(Student :: getName);
		
		
		list.stream().sorted(byScore).forEach(n -> System.out.println(n));
		
		// 클래스에 직접 implement => comparable
		System.out.println("클래스에서 직접 구현");
		list.stream().sorted().forEach(n -> System.out.println(n));
		
	}

}
class Student implements Comparable<Student>{
	private String name;
	private int score;
	
	public Student() {}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + ":" + score;
	}

	@Override
	public int compareTo(Student o) {
		// 내림차순
		return o.getScore() - this.score;
	}
	
}