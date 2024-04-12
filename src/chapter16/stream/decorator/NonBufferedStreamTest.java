package chapter16.stream.decorator;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class NonBufferedStreamTest {
	public static void main(String[] args) {

		long milisecond = 0; // 시간 체크용 변수

		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");

		) {

			milisecond = System.currentTimeMillis();

			int i;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}

			milisecond = System.currentTimeMillis() - milisecond;

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사 시간: " + milisecond + "ms 소요됨");

	}
}
