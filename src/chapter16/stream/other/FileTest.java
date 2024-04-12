package chapter16.stream.other;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("file.txt");
		
		try {
			
			file.createNewFile(); // 경로에 newFile.txt 생성
			
			System.out.println(file.isFile()); // 파일인지 확인
			System.out.println(file.isDirectory()); // 폴더인지 확인
			System.out.println(file.getName()); // 파일명 확인
			System.out.println(file.getAbsolutePath()); // 파일의 절대경로
			System.out.println(file.getPath()); // 파일경로
			System.out.println(file.canRead()); // 파일 읽기 상태
			System.out.println(file.canWrite()); // 파일 쓰기 상태			
			
			file.delete(); // 파일 삭제
			
			File dir = new File("newFolder");
			
			dir.mkdirs(); // 폴더생성
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
