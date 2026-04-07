package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx02 {

	public static void main(String[] args) {
		// 여행 비용 구하기
		/* Customer 클래스 생성
		 * 이름, 나이, 비용
		 * 
		 * 여행비용이 15세 이상은 100만원, 15세 미만은 80만원 계산
		 * 고객 5명이 패키지 여행을 떠난다고 가능했을 경우
		 * 1. 비용을 계산 => 출력
		 * 2. 고객명단 출력 => 이름 순으로 정렬
		 * 3. 20세 이상인 성인 고객 명단 출력 => 나이순으로 정렬
		 * 
		 * 예)
		 * 이름 : 신형만  나이 : 40  비용 : 100
		 * 이름 : 봉미선  나이 : 38  비용 : 100
		 * 이름 : 짱구    나이 : 7   비용 : 80
		 * 이름 : 짱아    나이 : 3   비용 : 80
		 * 이름 : 흰둥이  나이 : 10  비용 : 80
		 * */
		List <Customer> list = new ArrayList<>();
		
		list.add(new Customer("신형만", 40, 100));
		list.add(new Customer("봉미선", 38, 100));
		list.add(new Customer("짱구", 7, 80));
		list.add(new Customer("짱아", 3, 80));
		list.add(new Customer("흰둥이", 10, 80));
		
		list.stream().forEach(n -> System.out.println(n));
		
		// 1. 비용 합계
		int sum = list.stream()
				.mapToInt(n->n.getCost())
				.sum();
		System.out.println("총 비용 : " + sum);
		
		// 2. 고객명단출력 이름순으로 정렬
		// 이름순으로 정렬
		list.stream()
			.sorted(new Comparator<Customer>() {

				@Override
				public int compare(Customer o1, Customer o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName()); 
				}
			})
			.forEach(n -> System.out.println(n.getName()));
		
		
		// 3. 20세 이상인 성인 고객 명단 출력 => 나이순으로 정렬
		list.stream()
			.sorted(new Comparator<Customer>() {

				@Override
				public int compare(Customer o1, Customer o2) {
					// TODO Auto-generated method stub
					return o1.getName().compareTo(o2.getName()); 
				}
			})
			.forEach(n -> System.out.println(n.getName()));
		
		
		
		
		
		
		
		
	}

}

class Customer{
	private String name;
	private int age;
	private int cost;
	
	public Customer() {}
	public Customer(String name, int age, int cost) {
		this.name = name;
		this.age = age;
		this.cost = cost;	
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "이름 : " + name + " " + "나이 : " + age+ " " + "비용 : " + cost;
	}
}




















