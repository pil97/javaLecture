package chapter14.collection.map.treemap;

//import java.util.Comparator;

// TreeSet 클래스에서 이 클래스가 객체 생성하며, 데이터로 사용하기 위하여,
// 아래 인터페이스를 반드시 구현해야 한다.
public class Member implements Comparable<Member>{
	private int memberId;
	private String memberName;

	

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
	
	// 객체 비교로 사용되는 메서드 재정의
	@Override
	public int hashCode() {
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(this.memberId == member.memberId && this.memberName.equals(member.memberName)) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}

	// 객체가 대소비교에 사용되는 추상메서드 구현용도
//	@Override
//	public int compare(Member o1, Member o2) {
//		
//		System.out.println("compare 호출");
//		// Member 클래스를 대소비교 할 때, 기준을 잡아야 한다.
//		// memberId를 대소비교로 대상으로 기준을 잡음.
//		return o1.getMemberId() - o2.getMemberId();
//	}

	@Override
	public int compareTo(Member o) {
		
		System.out.println("compare 호출");
		System.out.println(memberId - o.getMemberId());
		// 오름차순
//		return memberId - o.getMemberId();
		// 내림차순
		 return (memberId - o.getMemberId()) * (-1);
	}
	
	
}
