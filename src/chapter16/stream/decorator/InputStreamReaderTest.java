package chapter16.stream.decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {

		// 바이트 기반의 입력스트림 객체 생성
//		FileInputStream fis = new FileInputStream("reader.txt");

		// 작업

		// 문자 기반의 입력스트림 객체 생성, 바이트 기반의 객체를 문자 기반의 객체로 변환하는 작업
		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {

			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
