package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassMain {

	public static void main(String[] args) throws ClassNotFoundException {
		// String.class 의 구성요소 확인이 가능해짐.
		Class strClass = Class.forName("java.lang.String"); // java.lang.String.class

		// String 클래스의 생성자 정보를 확인
		Constructor[] cons = strClass.getConstructors();

		for (Constructor c : cons) {
			System.out.println(c);
		}

		System.out.println();

		// String.class 의 필드정보를 확인
		Field[] fields = strClass.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println();
		
		// String.class 의 메서드 정보를 확인
		Method[] methods = strClass.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
	}

}
