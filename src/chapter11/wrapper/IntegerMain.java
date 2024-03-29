package chapter11.wrapper;

public class IntegerMain {
	public static void main(String[] args) {
		
		Integer num1 = 100; // 100 데이터가 힙영역에 기억장소를 생성 후, 들어가는 과정을 Boxing 형변환이 진행된다.
		int iNum = num1.intValue(); // Integer 클래스에서 정수 값만 가져옴.
		
		int sum = num1 + num1;
		int sum2 = iNum + iNum;
		System.out.println(sum2);
		System.out.println(sum2 == sum);
		System.out.println(iNum == num1);
		System.out.println(sum);
		System.out.println(num1 + 1);
		System.out.println(iNum);
		
	}
}
