package chapter14.collection.map.treemap; 

import java.util.Iterator;
import java.util.TreeMap;


// 대소비교를 통한 정렬구조로 관리하기 때문 반드시 Comparable or Comparator 인터페이스를 구현해야 한다.
public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}

	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {

		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}

		return false;
	}

	public void showAllMember() {

		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			// key로 저장된 데이터가 Member 
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}

}