package chapter14.collection.treeset;

import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		
		// 아래 데이터 추가시, 대소비교하여 이진분류로 좌, 우측으로 정렬배치하면서 데이터를 저장한다.
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		System.out.println(treeSet);
		
		// 데이터가 정렬된 상태로 출력된 것을 확인할 수가 있다. 강감찬, 이순신, 홍길동
		for (String str : treeSet) {
			System.out.println(str);
		}
		
		TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
		
		treeSet2.add(10);
		treeSet2.add(2);
		treeSet2.add(20);
		
		for (Integer num : treeSet2) {
			System.out.println(num);
		}
	}

}
