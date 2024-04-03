package chapter14.collection.map.treemap;

public class MemberTreeMapMain {
	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member member1 = new Member(1001,"park");
		Member member2 = new Member(1005,"kim");
		Member member3 = new Member(1003,"lee");
		Member member4 = new Member(1004,"choi");
		
		memberTreeMap.addMember(member1);
		memberTreeMap.addMember(member2);
		memberTreeMap.addMember(member3);
		memberTreeMap.addMember(member4);
		
		memberTreeMap.showAllMember();
		
		Member member44 = new Member(1003, "lee");
		memberTreeMap.addMember(member44);
		
		memberTreeMap.showAllMember();
		
	}
}
