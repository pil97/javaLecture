package chapter14.collection.hashset;

public class MemberHashSetMain {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member member1 = new Member(1001,"park");
		Member member2 = new Member(1002,"kim");
		Member member3 = new Member(1003,"lee");
		Member member4 = new Member(1004,"choi");
		
		memberHashSet.addMember(member1);
		memberHashSet.addMember(member2);
		memberHashSet.addMember(member3);
		memberHashSet.addMember(member4);
		
		memberHashSet.showAllMember();
		
		Member member44 = new Member(1003, "lee");
		memberHashSet.addMember(member44);
		
		memberHashSet.showAllMember();
		
	}
}
