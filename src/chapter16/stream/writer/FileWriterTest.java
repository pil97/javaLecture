package chapter16.stream.writer;

import java.io.FileWriter;
import java.io.Writer;

public class FileWriterTest {
	public static void main(String[] args) {
		try(Writer fw = new FileWriter("writer.txt", true)) {
			
			fw.write('A');
			
			char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
			fw.write(buf);
			
			
			fw.write("\n 동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("출력 완료");

	}
}
