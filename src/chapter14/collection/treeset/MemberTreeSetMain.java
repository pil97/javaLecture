package chapter14.collection.treeset;

public class MemberTreeSetMain {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		// 아래 객체가 TreeSet 클래스 메모리에 저장될 때, 대소비교가 가능하게 할려면
		// Member2 클래스 반드시 Comparable 인터페이스 또는 Comparator 인터페이스를 구현한다.
		Member member1 = new Member(1001,"park");
		Member member2 = new Member(1005,"kim");
		Member member3 = new Member(1003,"lee");
		Member member4 = new Member(1004,"choi");
		
		memberTreeSet.addMember(member1);
		memberTreeSet.addMember(member2);
		memberTreeSet.addMember(member3);
		memberTreeSet.addMember(member4);
		
		memberTreeSet.showAllMember();
		
//		Member member44 = new Member(1003, "lee");
//		memberTreeSet.addMember(member44);
		
//		memberTreeSet.showAllMember();
		
	}
}
