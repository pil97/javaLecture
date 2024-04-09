package chapter15.exception2;

// AutoCloseable 인터페이스 

public class AutoCloseObj implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("리스소가 close() 되었습니다.");
		
	}
	
}
