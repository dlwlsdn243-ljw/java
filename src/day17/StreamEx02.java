package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx02 {

	public static void main(String[] args) {
		// 여행 비용구하기
		/* Customer 클래스 생성
		 * 이름, 나이, 비용
		 * 
		 * 여행비용이 15세 이상은 100만원, 15세 미만은 80만원 계산
		 * 고객 5명이 패키지 여행을 떠난다고 가능했을 경우
		 * 1. 비용을 계산 => 출력
		 * 2. 고객명단 출력 => 이름 순으로 정렬
		 * 3. 20세 이상인 성명 고객 명단 출력 => 나이순으로 정렬
		 * 
		 * 예)
		 * 이름 : 신형만	나이:40	비용:100
		 * 이름 : 봉미선	나이:38	비용:100
		 * 이름 : 짱구	나이:7	비용:80
		 * 이름 : 짱아	나이:3	비용:80
		 * 이름 : 흰둥이	나이:10	비용:80
		 * 
		 * 총여행경비 : 000
		 * */
		
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("신형만", 40));
		list.add(new Customer("봉미선", 38));
		list.add(new Customer("짱구", 7));
		list.add(new Customer("짱아", 3));
		list.add(new Customer("흰둥이", 10));
		
		// 1. 비용을 계산 => 출력
		list.stream().forEach(System.out::println);
		int sum = list.stream()
				.mapToInt(Customer::getPrice)
				.sum();
		System.out.println("총 여행경비:"+sum+"만원");
		
		System.out.println("--------------");
		// 2. 고객명단 출력 => 이름 순으로 정렬
		list.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("-------------");
		// 3. 20세 이상인 성명 고객 명단 출력 => 나이순으로 정렬
		list.stream()
		.filter(n-> n.getAge() >= 20)
		.sorted(new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				// TODO Auto-generated method stub
				return o2.getAge() - o1.getAge();
			}
		})
		.forEach(System.out::println);

	}

}


class Customer implements Comparable<Customer>{
	private String name;
	private int age;
	private int price;
	
	public Customer() {}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = age >= 15 ? 100 : 80;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
}