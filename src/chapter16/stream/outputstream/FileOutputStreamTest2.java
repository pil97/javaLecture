package chapter16.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		
		// true: output.txt 파일명이 존재하면, 파일 기존 내용에 추가된다.
		try (FileOutputStream fos = new FileOutputStream("output2.txt", true)) {

			byte[] bs = new byte[26]; // 알파벳 문자: 26개
			byte data = 65;
			
			for(int i = 0; i <bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			fos.write(bs);
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("출력 완료");
	}
}
