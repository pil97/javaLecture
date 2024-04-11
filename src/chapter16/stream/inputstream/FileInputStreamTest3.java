package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {
	public static void main(String[] args) {
		
		String fileAddress = "/Users/apple/Desktop/java/eclipse/LectureJava/bin/chapter16/stream/inputstream/input.txt";
		
		try(FileInputStream fis = new FileInputStream(fileAddress)) {
			
			byte[] bs = new byte[10];
			
			int i;
			
			while((i = fis.read(bs)) != -1) {
				for(int k = 0; k < i; k++) {
					System.out.println((char)bs[k]);
				}
				System.out.println(": " + i + "바이트를 읽음");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
