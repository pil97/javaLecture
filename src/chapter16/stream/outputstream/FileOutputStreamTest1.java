package chapter16.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) {
		
		// true: output.txt 파일명이 존재하면, 파일 기존 내용에 추가된다.
		try (FileOutputStream fos = new FileOutputStream("output.txt", true)) {

			fos.write(65); // A
			fos.write(66); // B
			fos.write(67); // C

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("출력 완료");
	}
}
