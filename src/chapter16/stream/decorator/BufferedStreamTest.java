package chapter16.stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamTest {
	public static void main(String[] args) {

		long milisecond = 0; // 시간 체크용 변수

		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");

				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);

		) {

			milisecond = System.currentTimeMillis();

			int i;
			while ((i = fis.read()) != -1) {
				bos.write(i);
			}

			milisecond = System.currentTimeMillis() - milisecond;

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사 시간: " + milisecond + "ms 소요됨");

	}
}
