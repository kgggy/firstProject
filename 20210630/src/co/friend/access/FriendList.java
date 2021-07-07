package co.friend.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import co.friend.model.Friend;

//FriendAccess(인터페이스)를 구현하는 객체.(상속과 같은 역할)
//파일에 저장하도록 함.
public class FriendList implements FriendAccess {

	String path = "c:/tmp/friendList.txt";
	Friend[] friends;

	public void open() { // 이전에 저장해놓은 작업들 불러와서 배열에 담는 역할.
		File file = new File(path);

		if (!file.exists()) { // path에 해당파일이 없으면 디렉토리,파일 생성해주는 작업.
			File dir = new File("c:/tmp/");
			dir.mkdir(); // c:/tmp 디렉토리 생성.
			try {
				file.createNewFile(); // 파일 생성 메소드.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			Scanner scn = new Scanner(file); // 키보드로 입력 => System.in //file => file에 있는 내용 읽어들임.
			while (true) {
				if (!scn.hasNext()) { // 읽어올 값이 있는지를 알려주는 메소드.
					break;
				}
				String readStr = scn.next(); // 엔터 기준으로 하나씩 읽어들임.
				String[] arr = readStr.split(",");

				Friend friend = new Friend(arr[0], arr[1], arr[2]);

				// 배열의 빈 공간에 한 건씩 저장.
				for (int i = 0; i < friends.length; i++) {
					if (friends[i] == null) {
						friends[i] = friend;
						break;
					}
				}
			}
			scn.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void save() {
		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter(path)); // BufferedWriter => 한바이트씩보다는 한번에 모아서 불러오기.
			for (int i = 0; i < friends.length; i++) {
				if (friends[i] != null) {
					br.write(String.format("%s,%s,%s\n", friends[i].getGubun(), friends[i].getName(),
							friends[i].getTel())); // "%s,%s,%s,\n" => 문자열,문자열,문자열,엔터 형식으로 friends배열의 내용을 문자열을 만듦.
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public FriendList() {
		friends = new Friend[10];
		open();
	}

	@Override
	public void insert(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		save();
	}

	
	public static void noNamed(Friend noN) {
		if (noN == null) {
			System.out.println("찾는 이름이 없습니다.");
		} else {
			System.out.println(noN);
		}
	}
	
	@Override
	public void update(Friend friend) {
		boolean run = false;
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(friend.getName())) { // 배열의 요소중에서 값이 있는 요소만 가져와서 이름끼리
																						// 비교.
				friends[i].setTel(friend.getTel());
				run = true;
				break;
			}
		}
		if (!run) {
			if (friends != null) {
				System.out.println("찾는 이름이 없습니다.");
			} else {
				System.out.println("비어있습니다.");
			}
		}
		
		save();

	}

	@Override
	public void delete(String name) {
		boolean run = true; // boolean이 true일때만 출력해줌.
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				run = false;
				break;
			}
		}
		if (run) {
			if (friends != null) {
				System.out.println("찾는 이름이 없습니다.");
			} else {
				System.out.println("비어있습니다.");
			}
		}

		save();
	}

	@Override
	public Friend[] selectAll() {
		return friends;
	}

	@Override
	public Friend selectOne(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				return friends[i];
			}
		}
		return null;
	}

	@Override
	public Friend findTel(String tel) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getTel().equals(tel)) {
				return friends[i];
			}
		}
		return null;
	}

}
