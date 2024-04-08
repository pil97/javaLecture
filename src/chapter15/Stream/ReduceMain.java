package chapter15.stream;

import java.util.Arrays;

public class ReduceMain {
	public static void main(String[] args) {

		String[] greetings = { "안녕하세요~~", "hello", "Good Moring", "반갑습니다." };

		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {

			System.out.println("s1: " + s1);
			System.out.println("s1 길이: " + s1.getBytes().length);

			System.out.println("s2: " + s2);
			System.out.println("s2 길이: " + s2.getBytes().length);

			System.out.println();

			if (s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		}));

	}
}
