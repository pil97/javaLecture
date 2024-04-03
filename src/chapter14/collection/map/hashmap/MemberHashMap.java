package chapter14.collection.map.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}

	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {

		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}

		return false;
	}

	public void showAllMember() {

		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			// key로 저장된 데이터가 Member 
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}

}