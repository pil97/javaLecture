package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		
		String fileAddress = "/Users/apple/Desktop/java/eclipse/LectureJava/bin/chapter16/stream/inputstream/input.txt";
		
		// try(): 객체를 생성하면, 자동으로 close() 메서드가 내부적으로 호출된다.
		// 단, 사용클래스는 Closeable 인터페이스를 상속받아야한다.
		try(FileInputStream fis = new FileInputStream(fileAddress)) {
			
			int i;
			while ((i = fis.read()) != -1){
				System.out.println((char) i);
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
