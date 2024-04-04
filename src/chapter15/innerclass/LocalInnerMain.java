package chapter15.innerclass;

// 지역 내부 클래스
class Outer {
	
	// 전역변수
	int outNum = 100;
	static int sNum = 200;
	
	// 메서드
	Runnable getRunnable(int i) {
		int num = 100; // 지역변수
		
		class MyRunnable implements Runnable {
			int localNum = 10;

			@Override
			public void run() {
			
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("loclNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("OutClass.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
				
			}
		}
			return new MyRunnable();
			
		
	}
	
	void methodA() {
		
		// 지역 내부 클래스
		class A {}
		
		// 객체 생성
		A a = new A();
	}
	
}


public class LocalInnerMain {
	public LocalInnerMain() {
		// TODO Auto-generated constructor stub
	}
}
