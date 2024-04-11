package chapter16.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest1 {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("/Users/apple/Desktop/java/eclipse/LectureJava/bin/chapter16/stream/inputstream/input.txt");
			// fis = new FileInputStream("input.txt"); -- 파일명만 입력시, 파일은 프로젝트(LectureJava) 하위에 있어야함.

			System.out.println((char) fis.read()); // a
			System.out.println((char) fis.read()); // b
			System.out.println((char) fis.read()); // c

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
}
