package chapter16.stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {
	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				) {
			
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("Test");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("data.txt");
				DataInputStream dos = new DataInputStream(fis);
				) {
			
			System.out.println(dos.readByte());
			System.out.println(dos.readChar());
			System.out.println(dos.readInt());
			System.out.println(dos.readFloat());
			System.out.println(dos.readUTF());
			
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		
		
	}

}
