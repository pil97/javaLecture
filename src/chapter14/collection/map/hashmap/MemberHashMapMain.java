package chapter14.collection.map.hashmap;

public class MemberHashMapMain {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member member1 = new Member(1001,"park");
		Member member2 = new Member(1002,"kim");
		Member member3 = new Member(1003,"lee");
		Member member4 = new Member(1004,"choi");
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		
		memberHashMap.showAllMember();
		
		Member member44 = new Member(1003, "lee");
		memberHashMap.addMember(member44);
		
		memberHashMap.showAllMember();
		
	}
}
