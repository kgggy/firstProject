package co.yedam.generic;

import java.util.TreeSet;

class Member implements Comparable<Member> { //Comparable 인터페이스에서는 compareTo 메소드를 반드시 구현해야함.
	int memberNo;
	String memberName;
	
	public Member(int memberNo, String memberName) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
	}

	@Override
	public int compareTo(Member o) {
		// a < b < c 오름차순으로! (a-b가 음의값이면 오름차순)
	//	return this.memberNo - o.memberNo; //오름차순
	//	return o.memberNo - this.memberNo; //내림차순
		
//		if(this.memberNo > o.memberNo)
//			return -1; //오름차순
//		else if(this.memberNo == o.memberNo)
//			return 0;
//		else
//			return 1; //내림차순
		if(this.memberName.compareTo(o.memberName) == 0) { //이름같으면 번호로 정렬.
			return this.memberNo - o.memberNo;
		}
		return this.memberName.compareTo(o.memberName); //이름순으로 오름차순 정렬.
	}
}

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Member> members = new TreeSet<Member>();
		members.add(new Member(1001, "Hong"));
		members.add(new Member(1002, "Kwon"));
		members.add(new Member(1003, "Kim"));
		members.add(new Member(1004, "Kim"));
		while(!members.isEmpty()) { //비어있을때까지 반복해서 출력.
			Member mem = members.pollFirst(); // 컬렉션에서 요소를 하나씩 가져옴.
			System.out.println(mem.memberNo + ", " + mem.memberName); 
		}
		
		//System.out.println("String.compareTo : " + "Him".compareTo("Hong"));
		//알파벳 순으로 비교해줌.(-값 리턴 => 오름차순)
		
		
		
//		TreeSet<Integer> set = new TreeSet<>();
//		set.add(10); //Integer, new Integer(10)
//		set.add(5);
//		set.add(13);
//		
//		set.first(); //가장 작은값 가져옴.
//		set.last();
//		
//		while(!set.isEmpty()) {
//			Integer v = set.pollFirst(); 
//			System.out.println(v);
//		}
//		System.out.println("End.");
	}
}
