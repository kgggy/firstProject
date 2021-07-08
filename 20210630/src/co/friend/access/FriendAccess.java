package co.friend.access;

import java.util.List;

import co.friend.model.Friend;

public interface FriendAccess {
	// 동일한 이름의 친구는 없다고 가정.
	// 입력기능, 수정기능, 삭제기능, 전체리스트, 이름조회, 전화번호조회
	public void insert(Friend friend);

	public void update(Friend friend);

	public void delete(String name);

	//public Friend[] selectAll(); // Friend배열 타입을 리턴해줌.
	public List<Friend> selectAll();
	
	public Friend selectOne(String name); //한 건만 조회.(만약 동일한 이름이 있다면 배열로 리턴해야함)
	
	public Friend findTel(String tel);
}
