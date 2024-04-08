package chapter15.strean2;

import java.util.ArrayList;

public class TravelMain {
	public static void main(String[] args) {

		// 객체 이름

		// customerLee "이순신", 40, 100
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);

		// customerKim "김유신", 20, 100
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 80);

		// customerHong "홍길동", 13, 50
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

		System.out.println(customerLee);
		System.out.println(customerKim);
		System.out.println(customerHong);

		System.out.println();

		// List 컬렉션 ArrayList customerList 이름으로 위의 객체를 3개 추가 작성
		ArrayList<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);

		System.out.println("--- 고객 명단이 추가된 순서대로 출력 ---");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		
		System.out.println("--- 고객 나이를 추가된 순서대로 출력 ---");
		customerList.stream().map(c -> c.getAge()).forEach(s -> System.out.println(s));
		
		System.out.println("--- 고객 여행비용을 추가된 순서대로 출력 ---");
		customerList.stream().map(c -> c.getPrice()).forEach(s -> System.out.println(s));
		
		// 총 여행비용
		System.out.println("--- 고객 총 여행비용을 출력 ---");
		int totalPirce = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행비용: " + totalPirce);

		System.out.println("--- 나이가 20세 이상인 고객명단을 정렬하여 출력 ---");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
		
		
		System.out.println();

		for (int i = 0; i < customerList.size(); i++) {
			System.out.println(customerList.get(i));
		}

	}
}
